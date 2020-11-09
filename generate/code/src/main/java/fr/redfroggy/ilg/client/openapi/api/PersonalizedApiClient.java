package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${personalized.name:personalized}", url="${personalized.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface PersonalizedApiClient extends PersonalizedApi {
}
