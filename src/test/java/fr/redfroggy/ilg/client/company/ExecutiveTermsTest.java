package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExecutiveTermsTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetExecutiveTermsFromJson() throws IOException {
        String jsonResource = ilgTermsJson();
        UnitTestUtils.assertThatJsonIsEqualToResource(jsonResource, ilgTerms(), ExecutiveTerms.class);

        Map<String, Object> jsonAsMap = json.readValue(jsonResource, Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, ExecutiveTermsProjection.class, Arrays.asList(
                "@Pagination"));
    }

    public static ExecutiveTerms ilgTerms() {
        return new ExecutiveTerms(Collections.singletonList(
                Mandat.builder()
                        .siren("527737738")
                        .raisonSociale("OFA")
                        .adresse(Address.builder()
                                .country("FRANCE")
                                .countryCode("FR")
                                .region(null)
                                .street("20 BD EUGENE DERUELLE")
                                .streetDetail(
                                    new Street("20","", "BOULEVARD", "EUGENE DERUELLE")
                                )
                                .postalCode("69003")
                                .postalBoxNumber("")
                                .locality("LYON 3EME")
                                .build())
                        .regroupings(buildIlgTermsRegroupings())
                        .score(8)
                        .riskLabel("Risque élevé")
                        .build()
        ));
    }

    private static List<Regrouping> buildIlgTermsRegroupings() {
        return Collections.singletonList(
                new Regrouping(101, Collections.singletonList(
                        Term.builder()
                                .id("566a2a3a-b4c1-4b9f-9b6d-3e39a68602b9")
                                .siren(527737738)
                                .fonction(ExecutiveFonction.builder()
                                        .code("53")
                                        .label("Membre du Conseil de Surveillance")
                                        .build())
                                .startCode(ExecutiveMouvement.builder()
                                        .code(2)
                                        .label("Modification")
                                        .build())
                                .startDate(LocalDate.of(2011, Month.AUGUST, 25))
                                .endCode(ExecutiveMouvement.builder()
                                        .code(7)
                                        .label("Départ")
                                        .build())
                                .endDate(LocalDate.of(2014, Month.JUNE, 20))
                                .lastMovementCode(ExecutiveMouvement.builder()
                                        .code(null)
                                        .label(null)
                                        .build())
                                .lastMovementDate(null)
                                .principal(0)
                                .build()
                ))
        );
    }


    public static String ilgTermsJson() {
        return UnitTestUtils.getJsonFromContractFile("/company/FR-503207896-company-terms.json");
    }
}
