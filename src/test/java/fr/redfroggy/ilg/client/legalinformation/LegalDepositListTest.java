package fr.redfroggy.ilg.client.legalinformation;

import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.CodeLabelPair;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;

public class LegalDepositListTest {

    @Test
    public void shouldGetIlgLegalDepositListFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(ilgLegalDepositListJson(), ilgLegalDepositList(), LegalDepositList.class);
    }

    public static String ilgLegalDepositListJson() {
        return UnitTestUtils.getJsonFromContractFile("/legalinformation/FR-503207896-legal-deposits.json");
    }

    public static LegalDepositList ilgLegalDepositList() {
        return new LegalDepositList(Collections.singletonList(ilgLegalDeposit12()));
    }

    public static LegalDeposit ilgLegalDeposit12() {
        return LegalDeposit.builder()
                .number(12)
                .date(LocalDate.of(2017,8,17))
                .acts(Collections.singletonList(ilgLegalAct1()))
                .availability(true)
                .build();
    }

    public static LegalAct ilgLegalAct1() {
        return LegalAct.builder()
                .id("6901-08-B-01696-12-01")
                .date(LocalDate.of(2017,5,10))
                .number(1)
                .type(new CodeLabelPair("PG","PROCES-VERBAL D'ASSEMBLEE GENERALE ORDINAIRE"))
                .pages(5)
                .decisions(Collections
                        .singletonList(new LegalActDecision("type", "label")))
                .downloadable(false)
                .available(true)
                .build();
    }

}