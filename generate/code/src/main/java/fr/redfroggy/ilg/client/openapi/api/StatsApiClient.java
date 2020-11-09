package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${stats.name:stats}", url="${stats.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface StatsApiClient extends StatsApi {
}
