package fr.redfroggy.ilg.client.events;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.Event;
import fr.redfroggy.ilg.client.model.Events;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class EventsTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetEventsFromJson() throws IOException {
        String fromJson = ilg503207896EventsJson();
        UnitTestUtils.assertThatJsonIsEqualToResource(fromJson,  ilg503207896Events(), Events.class);

        Map<String, Object> jsonAsMap = json.readValue(fromJson, Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, EventsProjection.class, Arrays.asList("@context","@type",
                "@link", "@id", "@sorting"));
    }

    public static String ilg503207896EventsJson() {
        return UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-events.json");
    }

    public static Events ilg503207896Events() {
        Event event = Event.builder()
                .adId("6000574496")
                .source("RPC")
                .origine("Registre des Paiements et des Contentieux")
                .eventCode(6365)
                .categorie("Cotation Banque de France : 3")
                .dateParution(LocalDate.of(2020, Month.OCTOBER, 8))
                .dateEffet(LocalDate.of(2020, Month.OCTOBER, 8))
                .role("SO")
                .impact(null)
                .raisonSociale(null)
                .build();

        Pagination pagination = Pagination.builder()
                .count(1)
                .start(0)
                .page(1)
                .total(54)
                .build();

        Sorting sorting = new Sorting(null, "ASC");

        return new Events("https://webservice.infolegale.fr/v2/companies/fr/503207896/events",
                pagination, sorting, Collections.singletonList(event),54);
    }

    public static Events ilg503207896EventsIntTest() {
        Event event = Event.builder()
                .adId("6000574496")
                .source("RPC")
                .origine("Registre des Paiements et des Contentieux")
                .eventCode(6365)
                .categorie("Cotation Banque de France : 3")
                .dateParution(LocalDate.of(2020, Month.OCTOBER, 8))
                .dateEffet(null)
                .role("SO")
                .impact(null)
                .raisonSociale(null)
                .build();

        Pagination pagination = Pagination.builder()
                .count(20)
                .start(0)
                .page(1)
                .total(1)
                .build();

        Sorting sorting = new Sorting(null, "ASC");

        return new Events("https://webservice.infolegale.fr/v2/companies/fr/503207896/events",
                pagination, sorting, Collections.singletonList(event),1);
    }
}
