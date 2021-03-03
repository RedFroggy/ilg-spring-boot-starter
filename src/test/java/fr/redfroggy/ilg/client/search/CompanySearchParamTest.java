package fr.redfroggy.ilg.client.search;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CompanySearchParamTest {

    @Test
    public void shouldGetRequestWithAllParams() {
        CompanySearchRequestParam request = CompanySearchRequestParam.builder()
            .vatNumber("503207896")
            .eirl(BigDecimal.TEN)
            .siege(1)
            .actif(1)
            .societeNom("INFOLEGALE")
            .societeNaf("NAF")
            .societeCodePostal("69003")
            .societeNumVoie("20")
            .societeRue("BD EUGENE DERUELLE")
            .societeVille("LYON")
            .societeRegion("RHONE-ALPE")
            .societeDepartement("69")
            .simpleSearch("INFOLEGALE")
            .build();

        assertThat(request)
                .hasFieldOrPropertyWithValue("vatNumber", "503207896")
                .hasFieldOrPropertyWithValue("eirl",BigDecimal.TEN)
                .hasFieldOrPropertyWithValue("siege", 1)
                .hasFieldOrPropertyWithValue("actif", 1)
                .hasFieldOrPropertyWithValue("societeNom", "INFOLEGALE")
                .hasFieldOrPropertyWithValue("societeNaf", "NAF")
                .hasFieldOrPropertyWithValue("societeCodePostal", "69003")
                .hasFieldOrPropertyWithValue("societeNumVoie", "20")
                .hasFieldOrPropertyWithValue("societeRue", "BD EUGENE DERUELLE")
                .hasFieldOrPropertyWithValue("societeVille", "LYON")
                .hasFieldOrPropertyWithValue("societeRegion", "RHONE-ALPE")
                .hasFieldOrPropertyWithValue("societeDepartement", "69")
                .hasFieldOrPropertyWithValue("simpleSearch", "INFOLEGALE");
    }
}
