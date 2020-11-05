package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.model.Site;
import fr.redfroggy.ilg.client.model.Sites;
import fr.redfroggy.ilg.client.site.SiteApi;
import fr.redfroggy.ilg.client.site.SiteProjection;
import fr.redfroggy.ilg.client.site.SiteRequest;
import fr.redfroggy.ilg.client.site.SitesProjection;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SiteApiClient implements SiteApi {

    private final IlgRestTemplate client;

    public SiteApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<SitesProjection> getSites(String country, String id, SiteRequest requestParam) {
        Assert.hasText(country, "Get sites cannot execute without country");
        Assert.hasText(id, "Get sites cannot execute without id");

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/sites");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Sites.class);
    }

    @Override
    public ResponseEntity<SitesProjection> getSites(String country, String id) {
        return getSites(country, id, null);
    }

    @Override
    public ResponseEntity<SiteProjection> getSite(String country, String id, String sid) {
        Assert.hasText(country, "Get site cannot execute without country");
        Assert.hasText(id, "Get site cannot execute without id");
        Assert.hasText(sid, "Get site cannot execute without sid");

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/sites/{sid}");

        return (ResponseEntity)client.getForEntity(uriBuilder.buildAndExpand(country, id, sid).toUri(), Site.class);
    }
}
