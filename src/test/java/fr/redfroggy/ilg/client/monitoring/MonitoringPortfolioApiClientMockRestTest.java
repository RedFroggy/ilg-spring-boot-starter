package fr.redfroggy.ilg.client.monitoring;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.Month;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class MonitoringPortfolioApiClientMockRestTest extends ApiClientMockRestTest {
    @Autowired
    private MonitoringApi apiClient;

    @Test
    public void shouldGetPortfolios() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio",
                PortfoliosTest.portfoliosJson());

        ResponseEntity<Portfolios> response = apiClient.getMonitoringPortfolios(
                PortfolioRequest.builder()
                        .build());
        mockApiServer.verify();

        Portfolios body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfoliosTest.portfolios());
    }

    @Test
    public void shouldGetPortfoliosWhenParamsIsNull() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio",
                PortfoliosTest.portfoliosJson());

        ResponseEntity<Portfolios> response = apiClient.getMonitoringPortfolios(null);
        mockApiServer.verify();

        Portfolios body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfoliosTest.portfolios());
    }

    @Test
    public void shouldGetPortfoliosWithAllParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio?entityId=777" +
                        "&userEmail=tes@test.fr&isPerso=1&label=my-label" +
                        "&updateDate[min]=2021-02-12&updateDate[max]=2021-02-12" +
                        "&alertType[]=4" +
                        "&audit=1&editable=0" +
                        "&page=1&number=2" +
                        "&sort=my-col&order=ASC",
                PortfoliosTest.portfoliosJson());

        ResponseEntity<Portfolios> response = apiClient.getMonitoringPortfolios(
                PortfolioRequest.builder()
                        .entityId(777)
                        .userEmail("tes@test.fr")
                        .isPerso(1)
                        .alertType(AlertType.JURI)
                        .label("my-label")
                        .updateDateMax(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .updateDateMin(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .audit(1)
                        .editable(0)
                        .pageable(PageableRequest.of(1,2,"my-col", MonitoringSorting.Direction.ASC))
                        .build());
        mockApiServer.verify();

        Portfolios body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfoliosTest.portfolios());
    }

    @Test
    public void shouldGetPortfolioWhenIdIs999999() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/portfolio/999999",
                PortfolioTest.portfolio999999Json());

        ResponseEntity<PortfolioProjection> response = apiClient.getMonitoringPortfolio(999999);
        mockApiServer.verify();

        PortfolioProjection body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(PortfolioTest.portfolio999999());
    }


}
