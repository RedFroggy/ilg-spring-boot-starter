package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.monitoring.Alert;

public class MiscAlertEventTypeType extends AlertEventType {

    public MiscAlertEventTypeType(Alert alert, EventDetailProjection eventDetail) {
        super(alert, eventDetail);
    }
}
