package fr.redfroggy.ilg.client.monitoring;

import fr.redfroggy.ilg.client.Sorting;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MonitoringSortingTest {


    @Test
    public void shouldThrowIfDirectionIsWrong() {
        assertThatThrownBy(() -> MonitoringSorting.by("$.name", MonitoringSorting.Direction.fromString("wrongDirection")))
                .hasMessage("Invalid value 'wrongDirection' for orders given! Has to be either 'desc' or 'asc' (case insensitive).");
    }

    @Test
    public void shouldSortByNameDirectionAsc() {
        MonitoringSorting sort = MonitoringSorting.by("$.name", MonitoringSorting.Direction.fromString("asc"));

        assertThat(sort)
                .hasFieldOrPropertyWithValue("sort", "$.name")
                .extracting(Sorting::getOrder,
                        order -> order.getOrder().isAscending(),
                        order -> order.getOrder().isDescending())
                .containsExactly(MonitoringSorting.Direction.ASC, true, false);

        assertThat(sort.toQueryParams())
                .containsEntry("sort", Collections.singletonList("$.name"))
                .containsEntry("order", Collections.singletonList("ASC"));
    }

    @Test
    public void shouldSortByName() {
        MonitoringSorting sort = MonitoringSorting.by("$.name");

        assertThat(sort)
                .hasFieldOrPropertyWithValue("sort", "$.name");


        assertThat(sort.toQueryParams())
                .containsEntry("sort", Collections.singletonList("$.name"))
                .doesNotContainKeys("order");
    }

    @Test
    public void shouldSortByNameWithEmptyDirection() {
        MonitoringSorting sort = MonitoringSorting.by("$.name", MonitoringSorting.Direction.fromString(""));

        assertThat(sort)
                .hasFieldOrPropertyWithValue("sort", "$.name");


        assertThat(sort.toQueryParams())
                .containsEntry("sort", Collections.singletonList("$.name"))
                .doesNotContainKeys("order");
    }

    @Test
    public void shouldSortByDefaultValue() {
        MonitoringSorting sort = new MonitoringSorting(null, "asc");

        assertThat(sort)
                .hasFieldOrPropertyWithValue("order", MonitoringSorting.Direction.ASC);


        assertThat(sort.toQueryParams())
                .containsEntry("order", Collections.singletonList("ASC"))
                .doesNotContainKeys("sort");
    }
}
