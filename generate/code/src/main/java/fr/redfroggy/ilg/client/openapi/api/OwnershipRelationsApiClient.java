package fr.redfroggy.ilg.client.openapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${ownershipRelations.name:ownershipRelations}", url="${ownershipRelations.url:http://localhost/v2}", configuration = ClientConfiguration.class)
public interface OwnershipRelationsApiClient extends OwnershipRelationsApi {
}
