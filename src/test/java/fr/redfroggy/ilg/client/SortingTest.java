package fr.redfroggy.ilg.client;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SortingTest {


    @Test
    public void shouldThrowIfDirectionIsWrong() {
        assertThatThrownBy(() -> Sorting.by("$.name", Sorting.Direction.fromString("wrongDirection")))
                .hasMessage("Invalid value 'wrongDirection' for orders given! Has to be either 'desc' or 'asc' (case insensitive).");
    }

    @Test
    public void shouldSortByNameDirectionAsc() {
        Sorting sort = Sorting.by("$.name", Sorting.Direction.fromString("asc"));

        assertThat(sort)
                .hasFieldOrPropertyWithValue("column", "$.name")
                .hasFieldOrPropertyWithValue("order", Sorting.Direction.ASC);
        assertThat(sort.getOrder().isAscending()).isTrue();
        assertThat(sort.getOrder().isDescending()).isFalse();

        assertThat(sort.toQueryParams())
                .containsEntry("column", Collections.singletonList("$.name"))
                .containsEntry("order", Collections.singletonList("asc"));
    }

    @Test
    public void shouldSortByName() {
        Sorting sort = Sorting.by("$.name");

        assertThat(sort)
                .hasFieldOrPropertyWithValue("column", "$.name");


        assertThat(sort.toQueryParams())
                .containsEntry("column", Collections.singletonList("$.name"))
                .doesNotContainKeys("order");
    }

    @Test
    public void shouldSortByNameWithEmptyDirection() {
        Sorting sort = Sorting.by("$.name", Sorting.Direction.fromString(""));

        assertThat(sort)
                .hasFieldOrPropertyWithValue("column", "$.name");


        assertThat(sort.toQueryParams())
                .containsEntry("column", Collections.singletonList("$.name"))
                .doesNotContainKeys("order");
    }

    @Test
    public void shouldSortByDefaultValue() {
        Sorting sort = new Sorting(null, "asc");

        assertThat(sort)
                .hasFieldOrPropertyWithValue("order", Sorting.Direction.ASC);


        assertThat(sort.toQueryParams())
                .containsEntry("order", Collections.singletonList("asc"))
                .doesNotContainKeys("column");
    }
}
