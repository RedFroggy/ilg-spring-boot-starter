package fr.redfroggy.ilg.client.executive;


import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExecutiveTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ExecutiveTermsFromJson() throws IOException {
        Executives fromJson = json.readValue(amazon00048ExecutiveTermsJson(), Executives.class);

        assertThat(fromJson.getCount())
                .isNull();

        assertThat(fromJson.getExecutives().get(12))
                .usingRecursiveComparison()
                .isEqualTo(amazon00048ExecutiveBoleTerm());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048ExecutiveTermsJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, ExecutivesProjection2.class, Arrays.asList("@context","@type",
                "@link", "@id"));
    }

    public static String amazon00048ExecutiveTermsJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/executive/FR-428785042-executive-terms.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }

    }


    public static Executive amazon00048ExecutiveBoleTerm() {
        return Executive.builder()
                .execId(16022818)
                .civilite("M")
                .name("BOLE")
                .firstname("Ronan")
                .type(null)
                .maidenName(null)
                .siren(null)
                .fonction(null)
                .address(Address.builder()
                        .countryCode("FRA")
                        .street("67 Boulevard du Général Leclerc")
                        .streetDetail(null)
                        .postalCode("92110")
                        .locality("Clichy")
                        .build())
                .birthday(LocalDate.of(1972, Month.OCTOBER, 8))
                .birthPlace(Address.builder()
                        .country(null)
                        .countryCode("FRA")
                        .streetDetail(null)
                        .postalCode("56066")
                        .locality("GOURIN")
                        .build())
                .nationalityCode("FRA")
                .terms(buildTerms())
                .build();
    }

    private static List<Term> buildTerms() {
        return Collections.singletonList(Term.builder()
                .id("1b9f2925-24ac-420d-9890-2847b555aaab")
                .siren(428785042)
                .fonction(ExecutiveFonction.builder()
                        .code("5")
                        .label("Président")
                        .role("M")
                        .block(Block.builder()
                                .id(1)
                                .build())
                        .showOrder(8)
                        .build())
                .startCode(ExecutiveMouvement.builder()
                        .code( 1)
                        .label("Nomination")
                        .build())
                .startDate(LocalDate.of(2016, Month.JULY, 13))
                .endCode(ExecutiveMouvement.builder().build())
                .lastMovementCode(ExecutiveMouvement.builder()
                        .code(9)
                        .label("Sans précision")
                        .build())
                .lastMovementDate(LocalDate.of(2017, Month.FEBRUARY, 28))
                .principal(1)
                .build());
    }

    public static Executive amazon00048ExecutiveBOLE() {
        return Executive.builder()
                .execId(16022818)
                .civilite("M")
                .name("BOLE")
                .firstname("Ronan")
                .type("person")
                .maidenName(null)
                .siren(null)
                .fonction(buildExecutiveBOLEFonction())
                .address(Address.builder()
                        .countryCode("FRA")
                        .street("67 Boulevard du Général Leclerc")
                        .streetDetail(new Street(null))
                        .postalCode("92110")
                        .locality("Clichy")
                        .build())
                .birthday(LocalDate.of(1972, Month.OCTOBER, 8))
                .email(null)
                .enPoste(1)
                .mouvement(ExecutiveMouvement.builder()
                        .code(1)
                        .label("Nomination")
                        .dateMouvement(LocalDate.of(2016,Month.JULY,13))
                        .source(null)
                        .eventDetail(null)
                        .build())
                .birthPlace(Address.builder()
                        .country("France")
                        .countryCode("FR")
                        .streetDetail(new Street(null))
                        .postalCode("56066")
                        .locality("GOURIN")
                        .build())
                .nationality("France")
                .nationalityCode("FR")
                .build();
    }

    private static ExecutiveFonction buildExecutiveBOLEFonction() {
        return ExecutiveFonction.builder()
                .code("5")
                .label("Président")
                .priority(null)
                .build();
    }


}
