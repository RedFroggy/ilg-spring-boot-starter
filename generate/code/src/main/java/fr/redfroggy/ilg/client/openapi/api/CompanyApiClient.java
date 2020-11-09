package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${company.name:company}", url="${company.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface CompanyApiClient extends CompanyApi {
}
