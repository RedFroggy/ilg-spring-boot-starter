package fr.redfroggy.ilg.client.events;

import static org.assertj.core.api.Assertions.*;

import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.Sorting;
import org.junit.Test;

import java.util.Collections;

public class EventRequestTest {

    @Test
    public void shouldGetFiltersOfEventCodeIsEqualTo100() {
        EventRequest request = EventRequest.builder()
                .filters(FiltersRequest.of("$.eventCode,1100"))
                .build();

        assertThat(request.getFilters().getFilters())
                .contains("$.eventCode,1100");

        assertThat(request.toQueryParams())
                .containsEntry("filters[]", Collections.singletonList("$.eventCode,1100"));
    }

    @Test
    public void shouldSortByNameDirectionAsc() {
        EventRequest request = EventRequest.builder()
                .sort(Sorting.by("$.name", Sorting.Direction.fromString("asc")))
                .build();

        Sorting sort = request.getSort();

        assertThat(sort)
                .hasFieldOrPropertyWithValue("column", "$.name")
                .hasFieldOrPropertyWithValue("order", Sorting.Direction.ASC);

        assertThat(sort.getOrder().isAscending()).isTrue();
        assertThat(sort.getOrder().isDescending()).isFalse();

        assertThat(request.toQueryParams())
                .containsEntry("column", Collections.singletonList("$.name"))
                .containsEntry("order", Collections.singletonList("asc"));
    }

    @Test
    public void shouldGetQueryParamsWhenPageIs1AndNUmberIs10() {
        EventRequest request = EventRequest.builder()
                .page(PageRequest.of(1,10))
                .build();

        PageRequest page = request.getPage();

        assertThat(page)
                .hasFieldOrPropertyWithValue("page", 1)
                .hasFieldOrPropertyWithValue("number",10);

        assertThat(request.toQueryParams())
                .containsEntry("page", Collections.singletonList("1"))
                .containsEntry("number", Collections.singletonList("10"));

    }
}
