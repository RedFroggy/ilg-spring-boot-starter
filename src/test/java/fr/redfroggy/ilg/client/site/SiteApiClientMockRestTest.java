package fr.redfroggy.ilg.client.site;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.*;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.SiteApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=true",
        "logging.level.fr.redfroggy.ilg.spring.boot.autoconfigure.RequestResponseLoggingInterceptor=INFO"})
public class SiteApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private SiteApiClient apiClient;

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites", SitesTest.amazonSitesJson());

        ResponseEntity<SitesProjection> sitesResponse = apiClient.getSites("fr", "428785042");
        assertThat(sitesResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SitesTest.amazonSites());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithPageable() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10", SitesTest.amazonSitesJson());
        SiteRequest requestParams = SiteRequest.builder()
                .page(PageRequest.of(2, 10))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSortable() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?column=name&order=desc", SitesTest.amazonSitesJson());

        SiteRequest requestParams = SiteRequest.builder()
                .sort(Sorting.by("name", Sorting.Direction.DESC))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithFilterable() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?" +
                "filters[]=$.eventCode,1100&filters[]=$.eventCode,999", SitesTest.amazonSitesJson());

        SiteRequest requestParams = SiteRequest.builder()
                .filters(FiltersRequest.of("$.eventCode,1100","$.eventCode,999"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSearchable() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?" +
                "search=amazon&in=$.name&in=$.tradings", SitesTest.amazonSitesJson());

        SiteRequest requestParams = SiteRequest.builder()
                .search(SearchRequest.of("amazon","$.name","$.tradings"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSearchableAndPageable() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10&" +
                "search=amazon&in=$.name&in=$.tradings", SitesTest.amazonSitesJson());

        SiteRequest requestParams = SiteRequest.builder()
                .page(PageRequest.of(2, 10))
                .search(SearchRequest.of("amazon","$.name","$.tradings"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSiteWhenGet428785042() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10&" +
                "search=amazon&in=$.name&in=$.tradings", SitesTest.amazonSitesJson());

        SiteRequest requestParams = SiteRequest.builder()
                .page(PageRequest.of(2, 10))
                .search(SearchRequest.of("amazon","$.name","$.tradings"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSiteWhenGet42878504200048() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/sites/42878504200048", SiteTest.amazon00048SiteJson());

        ResponseEntity<SiteProjection> siteResponse = apiClient.getSite("fr", "428785042", "42878504200048");
        assertThat(siteResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteTest.amazon00048Site());
        mockApiServer.verify();
    }

}
