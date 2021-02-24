package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.PageRequest;
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

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class MonitoringPortfolioSirenApiClientMockRestTest extends ApiClientMockRestTest {
    @Autowired
    private MonitoringApi apiClient;

    @Test
    public void shouldGetPortfoliosBySirenWithoutPage() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/siren/303731590",
                PortfoliosTest.portfoliosJsonForSiren303731590());

        ResponseEntity<PortfoliosProjection2> response = apiClient.getPortfolioSiren(303731590, null);
        mockApiServer.verify();

        PortfoliosProjection2 body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfoliosTest.portfoliosForSiren303731590());
    }

    @Test
    public void shouldGetPortfoliosBySirenWithPage() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/siren/303731590?page=0&number=10",
                PortfoliosTest.portfoliosJsonForSiren303731590());

        ResponseEntity<PortfoliosProjection2> response = apiClient.getPortfolioSiren(303731590, PageRequest.of(0,10));
        mockApiServer.verify();

        PortfoliosProjection2 body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfoliosTest.portfoliosForSiren303731590());
    }

    @Test
    public void shouldListPortfoliosBySiren() throws URISyntaxException,
            JsonProcessingException {

        SirensRequestBody content = new SirensRequestBody(Collections.singletonList("503207896"));

        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/monitoring/portfolio/siren")))
                .andExpect(method(HttpMethod.POST))
                .andExpect(header("authorization", "Bearer test-token"))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().string(mapper.writeValueAsString(content)))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(new SirensResponseBody(Collections.singletonList("258899555"))))
                );

        ResponseEntity<SirensResponseBody> response = apiClient.listPortfolioSirens(content);
        SirensResponseBody body = response.getBody();
        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(new SirensResponseBody(Collections.singletonList("258899555")));

        mockApiServer.verify();
    }
}
