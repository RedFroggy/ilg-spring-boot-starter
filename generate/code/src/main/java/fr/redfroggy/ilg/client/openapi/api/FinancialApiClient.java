package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${financial.name:financial}", url="${financial.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface FinancialApiClient extends FinancialApi {
}
