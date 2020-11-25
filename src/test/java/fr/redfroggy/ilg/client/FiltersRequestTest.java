package fr.redfroggy.ilg.client;


import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Collections;

public class FiltersRequestTest {

    @Test
    public void shouldGetFiltersOfEventCodeIsEqualTo100() {
        FiltersRequest filters = FiltersRequest.of("$.eventCode,1100");

        assertThat(filters.getFilters())
                .contains("$.eventCode,1100");

        assertThat(filters.toQueryParams())
                .containsEntry("filters[]", Collections.singletonList("$.eventCode,1100"));
    }
}
