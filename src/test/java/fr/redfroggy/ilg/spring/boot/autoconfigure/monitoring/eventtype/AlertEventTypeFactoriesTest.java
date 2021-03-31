package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.events.EventDetailTest;
import fr.redfroggy.ilg.client.events.EventsApi;
import fr.redfroggy.ilg.client.model.*;
import fr.redfroggy.ilg.client.monitoring.Alert;
import fr.redfroggy.ilg.client.monitoring.AlertsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class AlertEventTypeFactoriesTest {

    @Mock
    protected EventsApi eventsClient;

    protected List<AlertEventTypeFactory> factoryList =
            Arrays.asList(
                    new SimpleAlertEventTypeFactory(RegistrationAlertEventType.class, 1100, 1299)
                    , new SimpleAlertEventTypeFactory(ModificationAlertEventType.class, 2110, 2199)
            );

    protected AlertEventTypeFactories factories;

    protected EventDetailProjection eventDetail = EventDetailTest.ilg503207896EventDetail();

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        factories = new AlertEventTypeFactories(factoryList, eventsClient);

        when(eventsClient.getEvent(any()))
                .thenReturn(ResponseEntity.ok(eventDetail));
    }

    @Test
    public void shouldCreateUnknownAlertEvent() {
        Alert alert = AlertsTest.alerts().getAlertes().get(0);
        assertThat(factories.createEvent(alert))
                .isInstanceOf(UnknownAlertEventType.class)
                .hasFieldOrPropertyWithValue("alert", alert)
                .hasFieldOrPropertyWithValue("eventDetail", eventDetail)
                .hasFieldOrPropertyWithValue("siren", 344401575)
                .hasFieldOrPropertyWithValue("events", eventDetail.getEvenements().getEvenement());
    }

    @Test
    public void shouldCreateUnknownAlertEventWhenEvenementsIsNull() {
        EventDetail eventDetail = eventDetailWithEvenementsNull();
        when(eventsClient.getEvent(any()))
                .thenReturn(ResponseEntity.ok(eventDetail));
        Alert alert = AlertsTest.alerts().getAlertes().get(0);
        assertThat(factories.createEvent(alert))
                .isInstanceOf(UnknownAlertEventType.class)
                .hasFieldOrPropertyWithValue("alert", alert)
                .hasFieldOrPropertyWithValue("eventDetail", eventDetail)
                .hasFieldOrPropertyWithValue("siren", 344401575);
    }

    @Test
    public void shouldCreateUnknownAlertEventWhenEvenementsIsEmpty() {
        EventDetail eventDetail = eventDetailWithEvenementsEmpty();
        when(eventsClient.getEvent(any()))
                .thenReturn(ResponseEntity.ok(eventDetail));
        Alert alert = AlertsTest.alerts().getAlertes().get(0);
        assertThat(factories.createEvent(alert))
                .isInstanceOf(UnknownAlertEventType.class)
                .hasFieldOrPropertyWithValue("alert", alert)
                .hasFieldOrPropertyWithValue("eventDetail", eventDetail)
                .hasFieldOrPropertyWithValue("siren", 344401575)
                .hasFieldOrPropertyWithValue("events", Collections.emptyList());
    }

    @Test
    public void shouldCreateRegistrationAlertEvent() {
        EventDetail eventDetail = registrationEventDetail();
        when(eventsClient.getEvent(any()))
                .thenReturn(ResponseEntity.ok(eventDetail));

        Alert alert = AlertsTest.alerts().getAlertes().get(0);
        assertThat(factories.createEvent(alert))
                .isInstanceOf(RegistrationAlertEventType.class)
                .hasFieldOrPropertyWithValue("alert", alert)
                .hasFieldOrPropertyWithValue("eventDetail",eventDetail)
                .hasFieldOrPropertyWithValue("siren", 344401575)
                .hasFieldOrPropertyWithValue("events", eventDetail.getEvenements().getEvenement());
    }

    public static EventDetail registrationEventDetail() {
        return EventDetail.builder()
                .annonceInfo(EventDetailTest.buildAnnonceInfo())
                .personnes(EventDetailTest.buildPersonnes())
                .evenements(new Evenements(Collections.singletonList(Evenement.builder()
                        .codeEvenement(1100)
                        .labelEvenement("Cotation Banque de France : 3")
                        .codeEvenementInsee("SU")
                        .dateDecision(LocalDate.of(2020, Month.OCTOBER, 8))
                        .build())))
                .acteursCession(new ActeursCession(Collections.emptyList()))
                .acteursContentieux(EventDetailTest.buildActeursContentieux())
                .etablissementsCession(new EtablissementsCession(Collections.emptyList()))
                .actes(null)
                .build();

    }

    public static EventDetail eventDetailWithEvenementsNull() {
        return EventDetail.builder()
                .annonceInfo(EventDetailTest.buildAnnonceInfo())
                .personnes(EventDetailTest.buildPersonnes())
                .acteursCession(new ActeursCession(Collections.emptyList()))
                .acteursContentieux(EventDetailTest.buildActeursContentieux())
                .etablissementsCession(new EtablissementsCession(Collections.emptyList()))
                .actes(null)
                .build();

    }

    public static EventDetail eventDetailWithEvenementsEmpty() {
        return EventDetail.builder()
                .annonceInfo(EventDetailTest.buildAnnonceInfo())
                .personnes(EventDetailTest.buildPersonnes())
                .evenements(new Evenements(Collections.emptyList()))
                .acteursCession(new ActeursCession(Collections.emptyList()))
                .acteursContentieux(EventDetailTest.buildActeursContentieux())
                .etablissementsCession(new EtablissementsCession(Collections.emptyList()))
                .actes(null)
                .build();

    }
}