package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${site.name:site}", url="${site.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface SiteApiClient extends SiteApi {
}
