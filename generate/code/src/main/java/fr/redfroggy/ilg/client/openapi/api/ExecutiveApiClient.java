package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${executive.name:executive}", url="${executive.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface ExecutiveApiClient extends ExecutiveApi {
}
