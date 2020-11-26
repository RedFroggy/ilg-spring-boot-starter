package fr.redfroggy.ilg.client;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Collections;

public class PageRequestTest {
    @Test
    public void shouldGetQueryParamsWhenPageIs1AndNUmberIs10() {
        PageRequest page = PageRequest.of(1,10);

        assertThat(page)
                .hasFieldOrPropertyWithValue("page", 1)
                .hasFieldOrPropertyWithValue("number",10);

        assertThat(page.toQueryParams())
                .containsEntry("page", Collections.singletonList("1"))
                .containsEntry("number", Collections.singletonList("10"));

    }

    @Test
    public void shouldGetQueryParamsWithOnlyPageIs2() {
        PageRequest page = PageRequest.ofPage(2);

        assertThat(page)
                .hasFieldOrPropertyWithValue("page", 2);

        assertThat(page.toQueryParams())
                .containsEntry("page", Collections.singletonList("2"))
                .doesNotContainKey("number");

    }

    @Test
    public void shouldGetQueryParamsWithOnlyNUmberIs20() {
        PageRequest page = PageRequest.ofNumber(20);

        assertThat(page)
                .hasFieldOrPropertyWithValue("number", 20);

        assertThat(page.toQueryParams())
                .containsEntry("number", Collections.singletonList("20"))
                .doesNotContainKey("page");

    }

}
