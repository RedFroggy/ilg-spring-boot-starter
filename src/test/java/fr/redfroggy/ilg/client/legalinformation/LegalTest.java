package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.search.SiteSearch;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;

public class LegalTest {

    @Test
    public void shouldGetIlgLegalFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(ilgLegalJson(), ilgLegal(), Legal.class);
    }

    public static String ilgLegalJson() {
        return UnitTestUtils.getJsonFromContractFile("/legalinformation/FR-503207896-legal.json");
    }

    public static Legal ilgLegal() {
        return new Legal(LegalDepositListTest.ilgLegalDepositList(), ilgLegalStatus());
    }

    public static LegalStatus ilgLegalStatus() {
        return LegalStatus.builder()
                .registrationId("503207896")
                .date(LocalDate.of(2021,2,11))
                .dateAct(LocalDate.of(2018,6,11))
                .availability(false)
                .build();
    }
}