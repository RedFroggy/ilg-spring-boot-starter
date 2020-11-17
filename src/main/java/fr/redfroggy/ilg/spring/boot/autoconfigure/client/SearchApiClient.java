package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.search.*;
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
    public ResponseEntity<CompanySearchGeneric> searchCompanies(String country, CompanySearchRequestParam searchParam
            , Integer limit) {
        Assert.hasText(country, "Cannot search companies without country");
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/search/companies");
        if (limit != null) {
            uriBuilder.queryParam("limit", limit);
        }
        return client.postFormData(
                uriBuilder.buildAndExpand(country).toUri()
                ,searchParam
                , CompanySearchGeneric.class);
    }

    @Override
    public ResponseEntity<SiteSearch> searchSites(String country, SiteSearchRequest search, Integer limit) {
        Assert.hasText(country, "Cannot search sites without country");
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
