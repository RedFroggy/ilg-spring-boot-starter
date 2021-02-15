package fr.redfroggy.ilg.client.monitoring;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.PageRequest;
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
public class MonitoringAlertApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private MonitoringApi apiClient;

    @Test
    public void shouldGetAlerts() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlert(AlertRequest.builder().build());
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetAlertsWhenRequestIsNull() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlert(null);
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetAlertsWithParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert" +
                        "?alertMinDate=2021-02-01&alertMaxDate=2021-02-12&source=BOD" +
                        "&page=1&number=2" +
                        "&sort=my-column&order=ASC" +
                        "&entityId=777&userEmail=tes@test.fr&isPerso=1",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlert(
                AlertRequest.builder()
                        .entityId(777)
                        .userEmail("tes@test.fr")
                        .isPerso(1)
                        .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 01))
                        .source(AlertSource.BOD)
                        .page(PageRequest.of(1,2))
                        .sort(MonitoringSorting.by("my-column", MonitoringSorting.Direction.ASC))
                        .build());
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetAlertsByPortfolio999999() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert/portfolio/999999",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlertPortfolio(999999,
                AlertPortfolioRequest.builder().build());
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetAlertsByPortfolio999999WhenRequestIsNull() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert/portfolio/999999",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlertPortfolio(999999,null);
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetAlertsByPortfolio999999WithParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/alert/portfolio/999999" +
                        "?alertMinDate=2021-02-01&alertMaxDate=2021-02-12&source=BOD" +
                        "&page=1&number=2",
                AlertsTest.alertsJson());

        ResponseEntity<Alerts> response = apiClient.getMonitoringAlertPortfolio(999999,
                AlertPortfolioRequest.builder()
                        .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 01))
                        .source(AlertSource.BOD)
                        .page(PageRequest.of(1,2))
                        .build());
        mockApiServer.verify();

        Alerts body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(AlertsTest.alerts());
    }

    @Test
    public void shouldGetMonitoringNumbers() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/numbers?portfolioId=999999", MonitoringNumbersTest.monitoringNumbersJson());

        ResponseEntity<MonitoringNumbers> response = apiClient.getMonitoringNumbers(999999);
        mockApiServer.verify();

        MonitoringNumbers body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(MonitoringNumbersTest.monitoringNumbers());
    }

    @Test
    public void shouldGetMonitoringNumbersWhenRequestIsNull() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/monitoring/numbers", MonitoringNumbersTest.monitoringNumbersJson());

        ResponseEntity<MonitoringNumbers> response = apiClient.getMonitoringNumbers(null);
        mockApiServer.verify();

        MonitoringNumbers body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(MonitoringNumbersTest.monitoringNumbers());
    }
}
