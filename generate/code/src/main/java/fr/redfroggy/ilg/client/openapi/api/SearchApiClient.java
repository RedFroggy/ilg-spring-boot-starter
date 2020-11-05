package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${search.name:search}", url="${search.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface SearchApiClient extends SearchApi {
}
