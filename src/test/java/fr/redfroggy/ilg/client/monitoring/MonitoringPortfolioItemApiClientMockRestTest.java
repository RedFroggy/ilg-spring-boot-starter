package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.client.ExpectedCount;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class MonitoringPortfolioItemApiClientMockRestTest extends ApiClientMockRestTest {
    @Autowired
    private MonitoringApi apiClient;

    @Test
    public void shouldGetPortfolio999999Items() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/999999/item",
                PortfolioItemsTest.portfolio999999ItemsJson());

        ResponseEntity<PortfolioItems> response =
                apiClient.getPortfolioItems(999999, PortfolioItemRequest.builder().build());
        mockApiServer.verify();

        PortfolioItems body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfolioItemsTest.portfolio999999Items());
    }

    @Test
    public void shouldGetPortfolio999999ItemsWhenParamsIsNull() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/999999/item",
                PortfolioItemsTest.portfolio999999ItemsJson());

        ResponseEntity<PortfolioItems> response =
                apiClient.getPortfolioItems(999999, null);
        mockApiServer.verify();

        PortfolioItems body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfolioItemsTest.portfolio999999Items());
    }

    @Test
    public void shouldGetPortfolioItemsWithAllParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/999999/item" +
                        "?page=0&number=10" +
                        "&customCode=123&eventCode=456" +
                        "&siren=802070748&cname=FROGGY" +
                        "&ilgScoreOrigin=9" +
                        "&customCredit[min]=7&customCredit[max]=10" +
                        "&portfolio=1" +
                        "&userEmail=contact@redfroggy.fr" +
                        "&monitoringStartDate[min]=2021-01-01&monitoringStartDate[max]=2021-01-02" +
                        "&creationDate[min]=2021-01-03&creationDate[max]=2021-01-04" ,
                PortfolioItemsTest.portfolio999999ItemsJson());

        ResponseEntity<PortfolioItems> response = apiClient.getPortfolioItems(999999,
                PortfolioItemRequestTest.defaultRequestParams());
        mockApiServer.verify();

        PortfolioItems body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfolioItemsTest.portfolio999999Items());
    }

    @Test
    public void shouldAddPortfolioItem() throws URISyntaxException, JsonProcessingException {
        PortfolioItemSirenDetail detail = new PortfolioItemSirenDetail(802070748, "rf","100");

        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/monitoring/portfolio/999999/item")))
                .andExpect(method(HttpMethod.POST))
                .andExpect(header("authorization", "Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().string(mapper.writeValueAsString(detail)))
                .andRespond(withStatus(HttpStatus.CREATED)
                        .contentType(MediaType.APPLICATION_JSON)
                );

        apiClient.addPortfolioItem(999999, new PortfolioItemSirenDetail(802070748, "rf","100"));
        mockApiServer.verify();
    }

    @Test
    public void shouldUpdatePortfolioItem() throws URISyntaxException, JsonProcessingException {
        PortfolioItemDetail detail = new PortfolioItemDetail("rf",100);

        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/monitoring/portfolio/999999/item/6")))
                .andExpect(method(HttpMethod.PATCH))
                .andExpect(header("authorization", "Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().string(mapper.writeValueAsString(detail)))
                .andRespond(withStatus(HttpStatus.NO_CONTENT)
                        .contentType(MediaType.APPLICATION_JSON)
                );

        apiClient.updatePortfolioItem(999999,6, new PortfolioItemDetail( "rf",100));
        mockApiServer.verify();
    }

    @Test
    public void shouldDeletePortfolioItem() throws URISyntaxException, JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/monitoring/portfolio/999999/item/6")))
                .andExpect(method(HttpMethod.DELETE))
                .andExpect(header("authorization", "Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.NO_CONTENT)
                        .contentType(MediaType.APPLICATION_JSON)
                );

        apiClient.deletePortfolioItem(999999,6);
        mockApiServer.verify();
    }

    @Test
    public void shouldDeletePortfolioItems() throws URISyntaxException, JsonProcessingException {
        PortfolioItemIds ids = new PortfolioItemIds(Collections.singletonList("6"));
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/monitoring/portfolio/999999/items")))
                .andExpect(method(HttpMethod.DELETE))
                .andExpect(header("authorization", "Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().string(mapper.writeValueAsString(ids)))
                .andRespond(withStatus(HttpStatus.NO_CONTENT)
                        .contentType(MediaType.APPLICATION_JSON)
                );

        apiClient.deletePortfolioItems(999999, new PortfolioItemIds("6"));
        mockApiServer.verify();
    }

}
