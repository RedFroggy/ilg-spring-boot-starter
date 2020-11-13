package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.relation.*;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class OwnershipRelationsApiClient implements OwnershipRelationsApi {

    private final IlgRestTemplate client;

    public OwnershipRelationsApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<LinksProjection> getLinks(String country, String id) {
        return client.getForCompanyEntity(country, id, "/links", LinksProjection.class);
    }

    @Override
    public ResponseEntity<ShareholdersProjection> getLinksShareholders(String country, String id) {
        return client.getForCompanyEntity(country, id, "/links/shareholders", ShareholdersProjection.class);
    }

    @Override
    public ResponseEntity<SubsidiariesProjection> getLinksSubsidiaries(String country, String id) {
        return client.getForCompanyEntity(country, id, "/links/subsidiaries", SubsidiariesProjection.class);
    }

    @Override
    public ResponseEntity<GroupProjection> getGroups(String id) {
        Assert.hasText(id, "Cannot execute without id");
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/groups/{id}");
        return client.getForEntity(uriBuilder.buildAndExpand(id).toUri(), GroupProjection.class);
    }
}
