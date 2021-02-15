package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.Sorting;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class TermRequestTest {

    @Test
    public void shouldGetEmptyTermRequest() {
        TermRequest request = TermRequest.builder().build();

        assertThat(request.toQueryParams())
                .isEmpty();
    }

    @Test
    public void shouldGetTermRequestWithAllParams() {
        TermRequest request = TermRequest.builder()
                .principal(true)
                .positionRole(TermRequest.PositionRole.O)
                .ordersStartDate(Sorting.Direction.ASC)
                .blockId(7)
                .termsState(true)
                .build();

        assertThat(request)
                .hasFieldOrPropertyWithValue("principal", true)
                .hasFieldOrPropertyWithValue("positionRole", TermRequest.PositionRole.O)
                .hasFieldOrPropertyWithValue("ordersStartDate", Sorting.Direction.ASC)
                .hasFieldOrPropertyWithValue("blockId", 7)
                .hasFieldOrPropertyWithValue("termsState", true);

        assertThat(request.toQueryParams())
                .containsEntry("principal", Collections.singletonList("true"))
                .containsEntry("positionRole", Collections.singletonList("O"))
                .containsEntry("orders[start_date]", Collections.singletonList("asc"))
                .containsEntry("blockId", Collections.singletonList("7"))
                .containsEntry("termsState", Collections.singletonList("true"));
    }
}
