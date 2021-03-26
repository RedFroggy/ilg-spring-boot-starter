package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.model.Evenement;
import fr.redfroggy.ilg.client.monitoring.Alert;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.util.Assert;

import java.util.LinkedList;
import java.util.List;

public interface AlertEventTypeFactory {

    /**
     * Evaluate if factory can create AlertEvent
     * By default, support creation if event's code between min/max codes
     *
     * @param events events list contains code to evaluate
     * @return true if factory can create AlertEvent
     */
    default boolean support(List<Evenement> events) {
        Assert.notEmpty(getSupportedEventCodes(), "Supported event codes cannot be empty");
        if (ObjectUtils.isEmpty(events)) {
            return false;
        }
        Integer eventCode = events.get(0).getCodeEvenement();

        return eventCode >= getSupportedEventCodes().getFirst() && eventCode <= getSupportedEventCodes().getLast();
    }

    AlertEventType createEvent(Alert alert, EventDetailProjection eventDetail);

    LinkedList<Integer> getSupportedEventCodes();
}
