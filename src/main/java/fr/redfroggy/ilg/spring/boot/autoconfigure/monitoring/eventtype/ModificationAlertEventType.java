package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.monitoring.Alert;

public class ModificationAlertEventType extends AlertEventType {

    public ModificationAlertEventType(Alert alert, EventDetailProjection eventDetail) {
        super(alert, eventDetail);
    }
}
