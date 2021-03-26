package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.monitoring.Alert;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.springframework.util.Assert;

import java.util.LinkedList;

public class SimpleAlertEventTypeFactory implements AlertEventTypeFactory {

    private final Class<? extends AlertEventType> alertEventClass;

    private LinkedList<Integer> eventCodes = new LinkedList<>();

    public SimpleAlertEventTypeFactory(Class<? extends AlertEventType> alertEventClass, Integer firstCode, Integer lastCode) {
        Assert.notNull(firstCode, "First event code cannot be null");
        Assert.notNull(lastCode, "Last event code cannot be null");
        this.alertEventClass = alertEventClass;
        this.eventCodes.addFirst(firstCode);
        this.eventCodes.addLast(lastCode);
    }

    @Override
    public AlertEventType createEvent(Alert alert, EventDetailProjection eventDetail) {
        try {
            return ConstructorUtils.invokeConstructor(alertEventClass, alert, eventDetail);
        } catch (Exception e) {
            throw new AlertEventTypeConstructorException(e.getMessage(), e);
        }
    }

    @Override
    public LinkedList<Integer> getSupportedEventCodes() {
        return eventCodes;
    }
}
