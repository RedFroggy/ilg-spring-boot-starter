package fr.redfroggy.ilg.client.monitoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PageableRequestTest {

    @Test
    public void shouldBuildPageableRequest() {
        assertThat(PageableRequest.of(1,2, "my-column", MonitoringSorting.Direction.ASC))
                .hasFieldOrPropertyWithValue("page.page", 1)
                .hasFieldOrPropertyWithValue("page.number", 2)
                .hasFieldOrPropertyWithValue("sort.sort", "my-column")
                .hasFieldOrPropertyWithValue("sort.order", MonitoringSorting.Direction.ASC);
    }

    @Test
    public void shouldBuildNextPageableRequest() {
        assertThat(PageableRequest.of(1,2, "my-column", MonitoringSorting.Direction.ASC).next())
                .hasFieldOrPropertyWithValue("page.page", 2)
                .hasFieldOrPropertyWithValue("page.number", 2)
                .hasFieldOrPropertyWithValue("sort.sort", "my-column")
                .hasFieldOrPropertyWithValue("sort.order", MonitoringSorting.Direction.ASC);
    }

    @Test
    public void shouldBuildPreviousPageableRequest() {
        assertThat(PageableRequest.of(10,2, "my-column", MonitoringSorting.Direction.ASC).previous())
                .hasFieldOrPropertyWithValue("page.page", 9)
                .hasFieldOrPropertyWithValue("page.number", 2)
                .hasFieldOrPropertyWithValue("sort.sort", "my-column")
                .hasFieldOrPropertyWithValue("sort.order", MonitoringSorting.Direction.ASC);
    }

    @Test
    public void shouldGetFirstPageableRequestWhenPreviousOnFirstPage() {
        assertThat(PageableRequest.of(1,2, "my-column", MonitoringSorting.Direction.ASC).previous())
                .hasFieldOrPropertyWithValue("page.page", 1)
                .hasFieldOrPropertyWithValue("page.number", 2)
                .hasFieldOrPropertyWithValue("sort.sort", "my-column")
                .hasFieldOrPropertyWithValue("sort.order", MonitoringSorting.Direction.ASC);
    }

    @Test
    public void shouldBuildFirstPageableRequest() {
        assertThat(PageableRequest.of(10,2, "my-column", MonitoringSorting.Direction.ASC).first())
                .hasFieldOrPropertyWithValue("page.page", 1)
                .hasFieldOrPropertyWithValue("page.number", 2)
                .hasFieldOrPropertyWithValue("sort.sort", "my-column")
                .hasFieldOrPropertyWithValue("sort.order", MonitoringSorting.Direction.ASC);
    }
}