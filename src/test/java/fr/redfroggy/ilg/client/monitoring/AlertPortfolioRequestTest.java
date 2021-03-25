package fr.redfroggy.ilg.client.monitoring;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

class AlertPortfolioRequestTest {

    @Test
    public void shouldBuildAlertPortfolioRequest() {
        assertThat( AlertPortfolioRequest.builder()
                .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 01))
                .source(AlertSource.BOD)
                .pageable(PageableRequest.of(1,2))
                .build())
                .hasFieldOrPropertyWithValue("alertMaxDate", LocalDate.of(2021, Month.FEBRUARY, 12))
                .hasFieldOrPropertyWithValue("alertMinDate", LocalDate.of(2021, Month.FEBRUARY, 01))
                .hasFieldOrPropertyWithValue("source", AlertSource.BOD)
                .hasFieldOrPropertyWithValue("pageable.page.page", 1)
                .hasFieldOrPropertyWithValue("pageable.page.number", 2);
    }

    @Test
    public void shouldBuildNextAlertPortfolioRequest() {
        assertThat( AlertPortfolioRequest.builder()
                .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 01))
                .source(AlertSource.BOD)
                .pageable(PageableRequest.of(1,2))
                .build().nextPage())
                .hasFieldOrPropertyWithValue("alertMaxDate", LocalDate.of(2021, Month.FEBRUARY, 12))
                .hasFieldOrPropertyWithValue("alertMinDate", LocalDate.of(2021, Month.FEBRUARY, 01))
                .hasFieldOrPropertyWithValue("source", AlertSource.BOD)
                .hasFieldOrPropertyWithValue("pageable.page.page", 2)
                .hasFieldOrPropertyWithValue("pageable.page.number", 2);
    }
}