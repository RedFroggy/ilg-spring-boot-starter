package fr.redfroggy.ilg.spring.boot.autoconfigure;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

public class MethodKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        return new MethodKey(target.getClass(), method.getName(), params);
    }

    /**
     * Like {@link org.springframework.cache.interceptor.SimpleKey} but considers the method.
     */
    static final class MethodKey {

        private final Class<?> targetClass;
        private final String methodName;
        private final Object[] params;

        /**
         * Initialize a key.
         *
         * @param targetClass the receiver class
         * @param methodName the method name
         * @param params the method parameters
         */
        MethodKey(Class<?> targetClass, String methodName, Object[] params) {
            this.targetClass = targetClass;
            this.methodName = methodName;
            this.params = params;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            MethodKey methodKey = (MethodKey) o;

            return new EqualsBuilder()
                    .append(targetClass, methodKey.targetClass)
                    .append(methodName, methodKey.methodName)
                    .append(params, methodKey.params)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37)
                    .append(targetClass)
                    .append(methodName)
                    .append(params)
                    .toHashCode();
        }
    }
}
