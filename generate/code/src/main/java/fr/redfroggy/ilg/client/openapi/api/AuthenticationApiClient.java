package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${authentication.name:authentication}", url="${authentication.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface AuthenticationApiClient extends AuthenticationApi {
}
