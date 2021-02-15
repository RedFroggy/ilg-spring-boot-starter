package fr.redfroggy.ilg.client.executive;

import fr.redfroggy.ilg.client.Sorting;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecutiveRequestTest {

    @Test
    public void shouldGetExecutiveRequestEmpty() {
        ExecutiveRequest requestParam = ExecutiveRequest.builder()
                .build();

        assertThat(requestParam.toQueryParams())
                .isEmpty();
    }

    @Test
    public void shouldGetExecutiveRequestWithAllParams() {
        ExecutiveRequest requestParam = ExecutiveRequest.builder()
                .blockId(666)
                .active(true)
                .positionRole(ExecutiveRequest.PositionRole.CAC)
                .ordersName(Sorting.Direction.ASC)
                .ordersTermPositionCode(Sorting.Direction.ASC)
                .ordersTermStartDate(Sorting.Direction.DESC)
                .build();

        assertThat(requestParam)
                .hasFieldOrPropertyWithValue("blockId", 666)
                .hasFieldOrPropertyWithValue("active", true)
                .hasFieldOrPropertyWithValue("positionRole", ExecutiveRequest.PositionRole.CAC)
                .hasFieldOrPropertyWithValue("ordersName", Sorting.Direction.ASC)
                .hasFieldOrPropertyWithValue("ordersTermPositionCode", Sorting.Direction.ASC)
                .hasFieldOrPropertyWithValue("ordersTermStartDate", Sorting.Direction.DESC);

        assertThat(requestParam.toQueryParams())
                .containsEntry("blockId", Collections.singletonList("666"))
                .containsEntry("active", Collections.singletonList("true"))
                .containsEntry("positionRole", Collections.singletonList("CAC"))
                .containsEntry("orders[name]", Collections.singletonList("asc"))
                .containsEntry("orders[term.position_code]", Collections.singletonList("asc"))
                .containsEntry("orders[term.start_date]", Collections.singletonList("desc"));
    }

}
