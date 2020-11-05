package org.openapitools.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class ClientConfiguration {

  @Value("${webservices.security.bearer.key:}")
  private String bearerKey;

  @Bean
  @ConditionalOnProperty(name = "webservices.security.bearer.key")
  public ApiKeyRequestInterceptor bearerRequestInterceptor() {
    return new ApiKeyRequestInterceptor("header", "Authorization", this.bearerKey);
  }

}
