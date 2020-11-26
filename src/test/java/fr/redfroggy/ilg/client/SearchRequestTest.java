package fr.redfroggy.ilg.client;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Collections;

public class SearchRequestTest {

    @Test
    public void shouldGetSearchInfoLegaleInName() {
        SearchRequest search = SearchRequest.of("INFOLEGALE", "$.name");

        assertThat(search)
                .hasFieldOrPropertyWithValue("search", "INFOLEGALE")
                .hasFieldOrPropertyWithValue("in", Collections.singletonList("$.name"));


        assertThat(search.toQueryParams())
                .containsEntry("search", Collections.singletonList("INFOLEGALE"))
                .containsEntry("in", Collections.singletonList("$.name"));
    }

    @Test
    public void shouldGetSearchInfoLEgaleWithoutIn() {
        SearchRequest search = SearchRequest.of("INFOLEGALE");

        assertThat(search)
                .hasFieldOrPropertyWithValue("search", "INFOLEGALE");


        assertThat(search.toQueryParams())
                .containsEntry("search", Collections.singletonList("INFOLEGALE"))
                .doesNotContainKeys("in");
    }
}
