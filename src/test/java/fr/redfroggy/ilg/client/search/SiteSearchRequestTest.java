package fr.redfroggy.ilg.client.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SiteSearchRequestTest {

    @Test
    public void shouldGetSearchRequestWithAllParams() {
        SiteSearchRequest request = SiteSearchRequest.builder()
                .registrationNumber("50320789600021")
                .companyRegistrationNumber("503207896")
                .city("LYON")
                .zipCode("69003")
                .name("INFOLEGALE")
                .street("CS 83755 20 BD EUGENE DERUELLE")
                .phone("+33606060606")
                .limit(2)
                .build();

        assertThat(request)
                .hasFieldOrPropertyWithValue("registrationNumber", "50320789600021")
                .hasFieldOrPropertyWithValue("companyRegistrationNumber","503207896")
                .hasFieldOrPropertyWithValue("city", "LYON")
                .hasFieldOrPropertyWithValue("name", "INFOLEGALE")
                .hasFieldOrPropertyWithValue("zipCode", "69003")
                .hasFieldOrPropertyWithValue("street", "CS 83755 20 BD EUGENE DERUELLE")
                .hasFieldOrPropertyWithValue("phone", "+33606060606")
                .hasFieldOrPropertyWithValue("limit", 2);
    }
}
