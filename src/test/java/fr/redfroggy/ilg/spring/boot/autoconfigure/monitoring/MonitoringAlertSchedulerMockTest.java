package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;

import java.net.URISyntaxException;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

@SpringBootTest(classes = {TestApplication.class, TestMonitoringConfiguration.class},
        properties = {
        "ilg.url=http://ilg.fr",
        "ilg.debugging=false",
        "ilg.monitoring-alert.enabled=true",
        "ilg.monitoring-alert.portfolioId=999999",
})
class MonitoringAlertSchedulerMockTest extends ApiClientMockRestTest {

    @Autowired
    MonitoringAlertScheduler scheduler;

    @MockBean
    ApplicationEventPublisher publisher;

    @Test
    public void shouldPublishAlerts() throws URISyntaxException {
        LocalDate yesterday = LocalDate.now().minusDays(1L);

        mockApi("http://ilg.fr/monitoring/alert/portfolio/999999?" +
                        "alertMinDate="+yesterday+"&alertMaxDate="+yesterday+"&source[]=JAL&page=1&number=50&sort=adId&order=ASC",
                UnitTestUtils.getJsonFromContractFile("/monitoring/scheduled-monitoring-alert.json"));

        mockApiEventDetails();

        scheduler.publishAlerts();

        ArgumentCaptor<AlertEventType> alertEventCaptor = ArgumentCaptor.forClass(AlertEventType.class);
        verify(publisher, timeout(6000).times(10))
                .publishEvent(alertEventCaptor.capture());

        assertThat(alertEventCaptor.getAllValues())
                .extracting("class")
                .containsExactly(
                        RegistrationAlertEventType.class,
                        ModificationAlertEventType.class,
                        CessationAlertEventType.class,
                        TransferAlertEventType.class,
                        LegalProceedingsAlertEventType.class,
                        CollectiveProceedingAlertEventType.class,
                        RiskAlertEventType.class,
                        LegalProceedingsAlertEventType.class,
                        MiscAlertEventTypeType.class,
                        NewsAlertEventType.class
                        );
    }

    private void mockApiEventDetails() throws URISyntaxException {
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030580",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-registration-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030638",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-modification-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030639",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-cessation-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030640",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-transfer-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030641",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-first-legal-proceedings-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030642",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-collective-proceeding-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030643",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-risk-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030644",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-second-legal-proceedings-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030645",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-misc-eventDetail.json"));
        mockApi("http://ilg.fr/event/RCS-C_BXC20210030646",
                UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-news-eventDetail.json"));
    }

}