package fr.redfroggy.ilg;

import static org.assertj.core.api.Assertions.*;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.*;

public class InterfaceTestUtils {

    public static void verifyInterfaceGetter(Map<String, Object> fixtures, Class interfaceToTest ) {
        verifyInterfaceGetter(fixtures, interfaceToTest, Collections.emptyList(), Collections.emptyMap());
    }

    public static void verifyInterfaceGetter(Map<String, Object> fixtures, Class interfaceToTest, List<String> ignoreFields ) {
        verifyInterfaceGetter(fixtures, interfaceToTest, ignoreFields, Collections.emptyMap());
    }

    public static void verifyInterfaceGetter(Map<String, Object> fixtures, Class interfaceToTest ,
                                             List<String> ignoreFields, Map<String,String> forceMethodMapping) {
        if (Objects.isNull(fixtures)){
            return;
        }

        for (Map.Entry<String, Object> entry : fixtures.entrySet()) {
            String attributKeyName = entry.getKey();
            if(ignoreFields.contains(attributKeyName)) {
                continue;
            }

            final String attributName = attributKeyName.replace("@","");
            String methodName = "get"+ StringUtils.remove(WordUtils.capitalizeFully(attributName, '_'), "_");

            Method method = Arrays.stream(interfaceToTest.getMethods())
                    .filter(m -> forceMethodMapping.getOrDefault(m.getName(), m.getName()).equalsIgnoreCase(methodName))
                    .findFirst().orElse(null);

            assertThat(method )
                    .withFailMessage(interfaceToTest.getSimpleName() +"."+ attributName)
                    .isNotNull();

            verifyReturnInterfaceType(entry.getValue(), method, ignoreFields, forceMethodMapping);
        }
    }

    private static void verifyReturnInterfaceType(
                                         Object fixtures, Method method,
                                         List<String> ignoreFields, Map<String,String> forceMethodMapping) {

        Class<?> returnType = method.getReturnType();
        if ( !returnType.isInterface() || Map.class.isAssignableFrom(returnType)) {
            return;
        }

        if (List.class.isAssignableFrom(returnType)){
            Type genericType = method.getGenericReturnType();
            if (! (genericType instanceof ParameterizedType) ) {
                return;
            }
            if (ObjectUtils.isEmpty(fixtures)) {
                return;
            }
            ParameterizedType paramType = (ParameterizedType) genericType;
            Type[] argTypes = paramType.getActualTypeArguments();
            Type typeClass = argTypes[0];
            if (typeClass instanceof WildcardType) {
                typeClass = (Class) ((WildcardType) typeClass).getUpperBounds()[0];
            }

            verifyInterfaceGetter((Map<String, Object>)((List)fixtures).get(0), (Class) typeClass, ignoreFields, forceMethodMapping);
            return;
        }
        verifyInterfaceGetter((Map<String, Object>)fixtures, returnType, ignoreFields, forceMethodMapping);
    }
}
