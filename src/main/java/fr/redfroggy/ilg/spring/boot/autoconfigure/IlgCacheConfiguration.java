package fr.redfroggy.ilg.spring.boot.autoconfigure;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleCacheResolver;
import org.springframework.cache.support.NoOpCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

@Configuration
@ConditionalOnClass(CaffeineCacheManager.class)
public class IlgCacheConfiguration {

    private final IlgProperties properties;

    public IlgCacheConfiguration(IlgProperties properties) {
        this.properties = properties;
    }

    @ConditionalOnMissingBean
    @Bean(name = "ilgCacheResolver")
    public CacheResolver ilgCacheResolver() {
        return new SimpleCacheResolver(cacheManager());
    }

    @Bean(name = "methodKeyGenerator")
    public KeyGenerator methodKeyGenerator() {
        return new MethodKeyGenerator();
    }

    private CacheManager cacheManager() {
        IlgProperties.ApiCache apiCache = properties.getApiCache();
        if (!apiCache.getEnabled()) {
            return new NoOpCacheManager();
        }
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();

        String specification = apiCache.getSpec();
        if (StringUtils.hasText(specification)) {
            cacheManager.setCacheSpecification(specification);
            return cacheManager;
        }

        cacheManager.setCaffeine(Caffeine.newBuilder()
                .expireAfterWrite(5, TimeUnit.MINUTES)
                .initialCapacity(50)
                .maximumSize(200));
        return cacheManager;
    }

}
