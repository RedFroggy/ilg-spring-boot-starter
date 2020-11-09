package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${monitoring.name:monitoring}", url="${monitoring.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface MonitoringApiClient extends MonitoringApi {
}
