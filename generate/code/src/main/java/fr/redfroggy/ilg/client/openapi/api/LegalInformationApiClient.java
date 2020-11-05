package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${legalInformation.name:legalInformation}", url="${legalInformation.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface LegalInformationApiClient extends LegalInformationApi {
}
