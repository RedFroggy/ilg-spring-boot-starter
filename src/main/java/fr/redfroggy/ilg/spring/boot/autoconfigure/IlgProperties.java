package fr.redfroggy.ilg.spring.boot.autoconfigure;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * Properties to manage authentication to Ilg api
 *
 * @author djay
 */
@ConfigurationProperties(prefix = "ilg", ignoreUnknownFields = false)
@Validated
public class IlgProperties {

    private String url;

    private String username;

    private String password;

    private boolean debugging;

    private String tokenCacheSpec = "expireAfterWrite=14m";

    private final ApiCache apiCache = new ApiCache();

    @NotEmpty
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @NotEmpty
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotEmpty
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDebugging() {
        return debugging;
    }

    public void setDebugging(boolean debugging) {
        this.debugging = debugging;
    }

    @NotBlank
    public String getTokenCacheSpec() {
        return tokenCacheSpec;
    }

    public void setTokenCacheSpec(String tokenCacheSpec) {
        this.tokenCacheSpec = tokenCacheSpec;
    }

    public ApiCache getApiCache() {
        return apiCache;
    }

    /**
     * Caffeine specific cache properties.
     */
    public static class ApiCache {

        private Boolean enabled = false;

        /**
         * The spec to use to create caches. Check CaffeineSpec for more details on the
         * spec format.
         */
        private String spec;

        public String getSpec() {
            return this.spec;
        }

        public void setSpec(String spec) {
            this.spec = spec;
        }


        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }
}
