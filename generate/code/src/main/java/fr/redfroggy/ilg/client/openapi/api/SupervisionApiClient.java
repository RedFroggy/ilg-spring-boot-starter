package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${supervision.name:supervision}", url="${supervision.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface SupervisionApiClient extends SupervisionApi {
}
