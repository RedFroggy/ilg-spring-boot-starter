package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${kycCompliance.name:kycCompliance}", url="${kycCompliance.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface KycComplianceApiClient extends KycComplianceApi {
}
