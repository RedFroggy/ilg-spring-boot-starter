package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Address;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class CompanySearchGenericTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetIlgCompanySearchFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(
                ilgCompanySearchJson(), ilgCompanySearch(),  CompanySearchGeneric.class);
    }

    public static String ilgCompanySearchJson() {
        return UnitTestUtils.getJsonFromContractFile("/search/FR-50320789600021-search-companies.json");
    }

    public static CompanySearchGeneric ilgCompanySearch() {
        return new CompanySearchGeneric(Collections.singletonList(ilgCompanySearchResult()),1,1);
    }

    public static CompanySearchResult ilgCompanySearchResult() {
        return CompanySearchResult.builder()
                .id("50320789600021")
                .companyId("503207896")
                .registrationId("50320789600021")
                .name("INFOLEGALE")
                .tradings("INFOLEGALE ET MARKETING")
                .address(Address.builder()
                        .country("FRANCE")
                        .countryCode(null)
                        .street("20 BD EUGENE DERUELLE")
                        .streetDetail(null)
                        .postalCode("69003")
                        .postalBoxNumber("")
                        .locality("LYON 3EME")
                        .build())
                .activity("Activités des agences de recouvrement de factures et des sociétés d'information " +
                "financière sur la clientèle")
                .siege(1)
                .actif(1)
                .nbEtabs(1)
                .representantLegal("")
                .matchedExecutive(null)
                .mandataire(null)
                .build();
    }

}
