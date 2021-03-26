package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.events.EventDetailTest;
import fr.redfroggy.ilg.client.model.EventDetail;
import fr.redfroggy.ilg.client.monitoring.Alert;
import fr.redfroggy.ilg.client.monitoring.AlertsTest;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SimpleAlertEventTypeFactoryTest {

    @Test
    public void shouldNotSupportCreationWhenEventsIsEmpty() {
        SimpleAlertEventTypeFactory factory = new SimpleAlertEventTypeFactory(UnknownAlertEventType.class, 6366, 6367);
        assertThat(factory.support(Collections.emptyList()))
                .isFalse();
    }

    @Test
    public void shouldNotSupportCreationWhenCodeIsNotBetweenMinMax() {
        SimpleAlertEventTypeFactory factory = new SimpleAlertEventTypeFactory(UnknownAlertEventType.class, 6366, 6367);
        assertThat(factory.support(EventDetailTest.ilg503207896EventDetail().getEvenements().getEvenement()))
                .isFalse();
    }

    @Test
    public void shouldSupportCreationWhenCodeIsBetweenMinMax() {
        SimpleAlertEventTypeFactory factory = new SimpleAlertEventTypeFactory(UnknownAlertEventType.class, 6365, 6365);
        assertThat(factory.support(EventDetailTest.ilg503207896EventDetail().getEvenements().getEvenement()))
                .isTrue();
    }

    @Test
    public void shouldThrowExceptionWhenCreationCrash() {
        SimpleAlertEventTypeFactory factory = new SimpleAlertEventTypeFactory(CrashedAlertEventType.class, 6365, 6365);
        assertThatThrownBy(() -> factory.createEvent(AlertsTest.alerts().getAlertes().get(0),
                EventDetailTest.ilg503207896EventDetail() ))
                .isInstanceOf(AlertEventTypeConstructorException.class);
    }

    @Test
    public void shouldCreateUnknownAlertEventWhenCreationIsSupported() {
        Alert alert = AlertsTest.alerts().getAlertes().get(0);
        EventDetail eventDetail = EventDetailTest.ilg503207896EventDetail();

        SimpleAlertEventTypeFactory factory = new SimpleAlertEventTypeFactory(UnknownAlertEventType.class, 6365, 6365);
        assertThat(factory.createEvent(alert, eventDetail))
                .isInstanceOf(UnknownAlertEventType.class)
                .hasFieldOrPropertyWithValue("alert", alert)
                .hasFieldOrPropertyWithValue("eventDetail", eventDetail)
                .hasFieldOrPropertyWithValue("siren", 344401575)
                .hasFieldOrPropertyWithValue("events", eventDetail.getEvenements().getEvenement());
    }

    private class CrashedAlertEventType extends AlertEventType {

        public CrashedAlertEventType(Alert alert, EventDetailProjection eventDetail) {
            super(alert, eventDetail);
            throw new RuntimeException();
        }
    }
}