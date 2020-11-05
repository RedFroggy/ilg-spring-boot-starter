package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${events.name:events}", url="${events.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface EventsApiClient extends EventsApi {
}
