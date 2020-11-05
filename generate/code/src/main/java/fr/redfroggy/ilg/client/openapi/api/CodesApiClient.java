package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${codes.name:codes}", url="${codes.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface CodesApiClient extends CodesApi {
}
