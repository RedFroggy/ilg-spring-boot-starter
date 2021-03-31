package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.model.Evenement;
import fr.redfroggy.ilg.client.monitoring.Alert;
import org.springframework.util.Assert;

import java.util.List;

public abstract class AlertEventType {

    private final Alert alert;

    private final EventDetailProjection eventDetail;

    public AlertEventType(Alert alert, EventDetailProjection eventDetail) {
        Assert.notNull(alert, "Cannot build alert type if alert is null");
        Assert.notNull(eventDetail, "Cannot build alert type if event detail is null");
        this.alert = alert;
        this.eventDetail = eventDetail;
    }

    public Integer getSiren() {
        return alert.getSiren();
    }

    public Alert getAlert() {
        return alert;
    }

    public EventDetailProjection getEventDetail() {
        return eventDetail;
    }

    public List<Evenement> getEvents() {
        return eventDetail.getEvenements().getEvenement();
    }
}
