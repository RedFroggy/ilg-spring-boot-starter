package fr.redfroggy.ilg.client.monitoring;

import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PortfolioItemRequestTest {

    @Test
    public void shouldConvertAllNotNullPropertiesIntoMap() {
        assertThat(defaultRequestParams().toQueryParams())
                .isEqualTo(defaultMapParams());
    }

    @Test
    public void shouldEmptyMapWhenAllPropertiesAreNull() {
        assertThat(PortfolioItemRequest.builder().build().toQueryParams())
                .isEmpty();
    }

    public static PortfolioItemRequest defaultRequestParams() {
        return PortfolioItemRequest.builder()
                .pageable(PageableRequest.of(0,10))
                .customCode(123)
                .eventCode(456)
                .siren(802070748)
                .cname("FROGGY")
                .ilgScoreOrigin(9)
                .customCreditMin(7)
                .customCreditMax(10)
                .portfolio(1)
                .userEmail("contact@redfroggy.fr")
                .monitoringStartDateMin(LocalDate.of(2021, 1,1))
                .monitoringStartDateMax(LocalDate.of(2021, 1,2))
                .creationDateMin(LocalDate.of(2021, 1,3))
                .creationDateMax(LocalDate.of(2021, 1,4))
                .build();
    }

    public static MultiValueMap<String, String> defaultMapParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        queryParams.add("page", String.valueOf(0));
        queryParams.add("number", String.valueOf(10));

        queryParams.add("customCode", String.valueOf(123));
        queryParams.add("eventCode", String.valueOf(456));
        queryParams.add("siren", String.valueOf(802070748));
        queryParams.add("cname", String.valueOf("FROGGY"));
        queryParams.add("ilgScoreOrigin", String.valueOf(9));
        queryParams.add("customCredit[min]", String.valueOf(7));
        queryParams.add("customCredit[max]", String.valueOf(10));
        queryParams.add("userEmail", "contact@redfroggy.fr");
        queryParams.add("portfolio", "1");
        queryParams.add("monitoringStartDate[min]", "2021-01-01");
        queryParams.add("monitoringStartDate[max]", "2021-01-02");
        queryParams.add("creationDate[min]", "2021-01-03");
        queryParams.add("creationDate[max]", "2021-01-04");
        return queryParams;
    }


}