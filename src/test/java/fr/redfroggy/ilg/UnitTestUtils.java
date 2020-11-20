package fr.redfroggy.ilg;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.util.*;

public class UnitTestUtils {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)
            .enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);

    public static ObjectMapper getJsonMapper() {
        return json;
    }

    public static String getJsonFromContractFile(String path) {
        try {
            return Resources.toString(
                    Resources.getResource("contracts"+path),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

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


    public static void assertThatJsonIsEqualToResource(String jsonResource, Object resource, Class resourceClass) throws IOException {
        Object fromJson = json.readValue(jsonResource, resourceClass);

        assertThat(fromJson)
                .usingRecursiveComparison()
                .isEqualTo(resource);
    }

    public static void assertThatJsonIsEqualToResource(String jsonResource, Object resource, Class resourceClass,
                                                       Class projectionClass) throws IOException {
        assertThatJsonIsEqualToResource(jsonResource, resource, resourceClass);

        Map<String, Object> jsonAsMap = json.readValue(jsonResource, Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, projectionClass, Arrays.asList("@context","@type",
                "@id","@link"));
    }
}
