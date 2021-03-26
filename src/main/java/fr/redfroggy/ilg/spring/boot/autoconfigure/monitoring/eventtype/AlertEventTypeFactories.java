package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.events.EventsApi;
import fr.redfroggy.ilg.client.model.Evenement;
import fr.redfroggy.ilg.client.monitoring.Alert;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AlertEventTypeFactories {

    private static final Logger log = LoggerFactory.getLogger(AlertEventTypeFactories.class);

    private final List<AlertEventTypeFactory> factories;

    private final EventsApi eventsClient;

    public AlertEventTypeFactories(List<AlertEventTypeFactory> factories,
                                   EventsApi eventsClient) {
        this.factories = factories;
        this.eventsClient = eventsClient;
    }

    public AlertEventType createEvent(Alert alert) {
        EventDetailProjection eventDetail = eventsClient.getEvent(alert.getAdId()).getBody();
        if (Objects.isNull(eventDetail.getEvenements())) {
            return buildUnknownAlertEvent(alert, eventDetail, null);
        }

        List<Evenement> events = ObjectUtils.defaultIfNull(eventDetail.getEvenements().getEvenement(), Collections.emptyList());
        return factories.stream()
                .filter(factory -> factory.support(events))
                    .findFirst()
                    .map(factory -> buildAlertEvent(alert, eventDetail, events, factory))
                .orElseGet(() -> buildUnknownAlertEvent(alert, eventDetail, events));
    }

    private AlertEventType buildAlertEvent(Alert alert, EventDetailProjection eventDetail,List<Evenement> events, AlertEventTypeFactory factory) {
        log.info("Ilg alert is {} and first event code is {}", alert.getAdId(), events.get(0).getCodeEvenement());

        return factory.createEvent(alert, eventDetail);
    }

    private UnknownAlertEventType buildUnknownAlertEvent(Alert alert, EventDetailProjection eventDetail, List<Evenement> events) {
        if (ObjectUtils.isEmpty(events)) {
            log.info("Ilg event is unknown because events is empty");
        } else {
            log.info("Ilg event code '{}' is unknown", events.get(0).getCodeEvenement());
        }

        return new UnknownAlertEventType(alert, eventDetail);
    }
}
