package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype.AlertEventType;
import org.springframework.context.ApplicationEventPublisher;

public class ApplicationMonitoringAlertPublisher implements MonitoringAlertPublisher {

    private final ApplicationEventPublisher publisher;

    public ApplicationMonitoringAlertPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publishEvent(AlertEventType event) {
        publisher.publishEvent(event);
    }
}
