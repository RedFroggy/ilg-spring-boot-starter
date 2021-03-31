package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.client.monitoring.Alert;
import fr.redfroggy.ilg.client.monitoring.AlertPortfolioRequest;
import fr.redfroggy.ilg.client.monitoring.MonitoringApi;
import fr.redfroggy.ilg.client.monitoring.PageableRequest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype.AlertEventTypeFactories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.util.function.Consumer;

public class MonitoringAlertScheduler {

    private static final Logger log = LoggerFactory.getLogger(MonitoringAlertScheduler.class);

    private final MonitoringAlertProperties properties;

    private final MonitoringApi monitoringClient;
    
    private final AlertEventTypeFactories alertEventTypeFactories;

    private final MonitoringAlertPublisher publisher;

    public MonitoringAlertScheduler(MonitoringAlertProperties properties,
                                    MonitoringApi monitoringClient,
                                    AlertEventTypeFactories alertEventTypeFactories,
                                    MonitoringAlertPublisher publisher) {
        this.properties = properties;
        this.monitoringClient = monitoringClient;
        this.alertEventTypeFactories = alertEventTypeFactories;
        this.publisher = publisher;
    }

    @Async
    @Scheduled(cron = "${ilg.monitoring-alert.cron}")
    void publishAlerts() {
        log.info("Starting publishing alerts");
        LocalDate yesterday = LocalDate.now().minusDays(1L);
        MonitoringAlertProperties.Request alertRequest = properties.getAlertRequest();

        AlertPortfolioRequest request = AlertPortfolioRequest.builder()
                .alertMinDate(yesterday)
                .alertMaxDate(yesterday)
                .source(alertRequest.getSource())
                .pageable(PageableRequest.of(1, alertRequest.getPageNumber(), alertRequest.getSort(), alertRequest.getOrder()))
                .build();

        AlertsPageIterator iteratorPage = new AlertsPageIterator(monitoringClient, request, properties.getPortfolioId());
        while (iteratorPage.hasNext()) {
            iteratorPage.next().getAlertes().forEach(publishAlertEvent());
        }
    }

    private Consumer<Alert> publishAlertEvent() {
        return alert -> {
            publisher.publishEvent(alertEventTypeFactories.createEvent(alert));
        };
    }
}
