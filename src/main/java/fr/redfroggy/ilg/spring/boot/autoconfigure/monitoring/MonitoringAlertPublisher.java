package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype.AlertEventType;

public interface MonitoringAlertPublisher {

    void publishEvent(AlertEventType event);

}
