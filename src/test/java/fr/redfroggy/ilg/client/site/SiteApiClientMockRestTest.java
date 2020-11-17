package fr.redfroggy.ilg.client.site;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.SearchRequest;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.SiteApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class SiteApiClientMockRestTest {

    @Autowired
    private SiteApiClient apiClient;

    @Autowired
    private RestTemplate ilgRestTemplate;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    private MockRestServiceServer mockApiServer;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void init() throws URISyntaxException, JsonProcessingException {
        mockAuthorizedServer = MockRestServiceServer.createServer(simpleRestTemplate);
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockAuthorizedServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/login_json")))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(jwt))
                );

        mockApiServer = MockRestServiceServer.createServer(ilgRestTemplate);
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/sites")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

        ResponseEntity<SitesProjection> sitesResponse = apiClient.getSites("fr", "428785042");
        assertThat(sitesResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SitesTest.amazonSites());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithPageable() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

        SiteRequest requestParams = SiteRequest.builder()
                .page(PageRequest.of(2, 10))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSortable() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/sites?column=name&order=desc")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

        SiteRequest requestParams = SiteRequest.builder()
                .sort(Sorting.by("name", Sorting.Direction.DESC))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithFilterable() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                    new URI("http://ilg.fr/companies/fr/428785042/sites?" +
                            "filters[]=$.eventCode,1100&filters[]=$.eventCode,999")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

        SiteRequest requestParams = SiteRequest.builder()
                .filters(FiltersRequest.of("$.eventCode,1100","$.eventCode,999"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSearchable() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI("http://ilg.fr/companies/fr/428785042/sites?" +
                                "search=amazon&in=$.name&in=$.tradings")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

        SiteRequest requestParams = SiteRequest.builder()
                .search(SearchRequest.of("amazon","$.name","$.tradings"))
                .build();

        apiClient.getSites("fr", "428785042", requestParams);

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazonWithSearchableAndPageable() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10&" +
                                "search=amazon&in=$.name&in=$.tradings")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

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
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI("http://ilg.fr/companies/fr/428785042/sites?page=2&number=10&" +
                                "search=amazon&in=$.name&in=$.tradings")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SitesTest.amazonSitesJson())
                );

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
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI("http://ilg.fr/companies/fr/428785042/sites/42878504200048")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(SiteTest.amazon00048SiteJson())
                );

        ResponseEntity<SiteProjection> siteResponse = apiClient.getSite("fr", "428785042", "42878504200048");
        assertThat(siteResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteTest.amazon00048Site());
        mockApiServer.verify();
    }

}
