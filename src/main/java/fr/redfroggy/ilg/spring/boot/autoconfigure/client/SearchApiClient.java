package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.search.SearchApi;
import fr.redfroggy.ilg.client.search.SiteSearch;
import fr.redfroggy.ilg.client.search.SiteSearchRequest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SearchApiClient implements SearchApi {

    private final IlgRestTemplate client;

    public SearchApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<SiteSearch> searchSites(String country, SiteSearchRequest search, Integer limit) {
        Assert.hasText(country, "Cannot search site without country");
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/sites/search");
        if (limit != null) {
            uriBuilder.queryParam("limit", limit);
        }
        return client.postFormData(
                uriBuilder.buildAndExpand(country).toUri()
                ,search
                , SiteSearch.class);
    }
}
