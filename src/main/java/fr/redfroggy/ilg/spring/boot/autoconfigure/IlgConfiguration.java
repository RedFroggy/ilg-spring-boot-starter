package fr.redfroggy.ilg.spring.boot.autoconfigure;

import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache.JwtCache;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(IlgProperties.class)
@ComponentScan("fr.redfroggy.ilg.spring.boot.autoconfigure")
public class IlgConfiguration {

    @Bean
    @Qualifier("simpleRestTemplate")
    public RestTemplate simpleRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    @DependsOn("simpleRestTemplate")
    public AuthenticationApiClient authenticationService(IlgProperties properties,
                                                         RestTemplate simpleRestTemplate, JwtCache jwtCache) {
        return new AuthenticationApiClient(properties, simpleRestTemplate, jwtCache);
    }
}
