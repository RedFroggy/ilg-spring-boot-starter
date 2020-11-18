package fr.redfroggy.ilg.client.kyc;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class KycUboTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetIlgUboFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(ilg503207896UboJson(), ilg503207896Ubo(), KycUbo.class, KycUboProjection.class);
    }

    public static String ilg503207896UboJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/kyc/FR-503207896-kyc-ubo.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }

    }

    public static KycUbo ilg503207896Ubo() {
        return KycUbo.builder()
                .maxDate("2020-03-06")
                .minDate("2018-10-11")
                .totalCapitalDetentionMembers(2)
                .totalLegalRepresentativeMembers(0)
                .totalMembers(2)
                .members(ilg503207896UboMembers())
                .steps(ilg503207896UboSteps())
                .build();
    }

    public static List<GroupMember> ilg503207896UboMembers() {
        return Arrays.asList(GroupMember.builder()
                .entityId(455198)
                .entityName("M Frédéric JULIEN")
                .registrationNumber(null)
                .countryCode("FR")
                .country("France")
                .share(BigDecimal.valueOf(28.99))
                .type("person")
                .methodUsed("Capital detention")
                .qualite("Actionnaire")
                .distance(1)
                .address(Address.builder()
                        .country("France")
                        .countryCode("FR")
                        .street("54 Quai Clemenceau")
                        .streetDetail(new Street(null))
                        .postalCode("69300")
                        .locality("CALUIRE ET CUIRE")
                        .build()
                )
                .fonction(null)
                .birthday(LocalDate.of(1965,Month.OCTOBER,26))
                .birthCity("LYON")
                .birthCountry("France")
                .birthCountryCode("FR")
                .nationality(null)
                .nationalityCode(null)
                .name("JULIEN")
                .firstname("Frédéric")
                .maidenName(null)
                .title("M")
                .maxDate("2020-03-06")
                .minDate("2018-10-11")
                        .build()
                ,GroupMember.builder()
                        .entityId(455199)
                        .entityName("M Bertrand LAFFAY")
                        .registrationNumber(null)
                        .countryCode("FR")
                        .country("France")
                        .share(BigDecimal.valueOf(28.99))
                        .type("person")
                        .methodUsed("Capital detention")
                        .qualite("Actionnaire")
                        .distance(1)
                        .address(Address.builder()
                                .country("France")
                                .countryCode("FR")
                                .street("23 cours Aristide Briand")
                                .streetDetail(new Street(null))
                                .postalCode("69300")
                                .locality("CALUIRE ET CUIRE")
                                .build()
                        )
                        .fonction(null)
                        .birthday(LocalDate.of(1969,Month.JANUARY,07))
                        .birthCity("LYON")
                        .birthCountry("France")
                        .birthCountryCode("FR")
                        .nationality(null)
                        .nationalityCode(null)
                        .name("LAFFAY")
                        .firstname("Bertrand")
                        .maidenName(null)
                        .title("M")
                        .maxDate("2020-03-06")
                        .minDate("2018-10-11")
                        .build()
        );
    }

    public static List<UboInvestigationStep> ilg503207896UboSteps() {
        return Arrays.asList(new UboInvestigationStep("Legal status","Civil or commercial company",
                new CodeLabelPair("DECISION_CHECK_SHARE","Check capital detention")
                )
                ,new UboInvestigationStep("Capital detention","Ultimate beneficial owner found",
                        new CodeLabelPair("DECISION_STOP","End of preliminary investigation")
                )
        );
    }

    public static KycUbo ilg503207896UboIntFixture() {
        return KycUbo.builder()
                .maxDate("2020-11-17")
                .minDate("2018-10-11")
                .totalCapitalDetentionMembers(2)
                .totalLegalRepresentativeMembers(0)
                .totalMembers(2)
                .members(ilg503207896UboMembersIntFixture())
                .steps(ilg503207896UboSteps())
                .build();
    }

    public static List<GroupMember> ilg503207896UboMembersIntFixture() {
        return Arrays.asList(GroupMember.builder()
                        .entityId(455198)
                        .entityName("M Frédéric JULIEN")
                        .registrationNumber(null)
                        .countryCode("FR")
                        .country("France")
                        .share(BigDecimal.valueOf(28.99))
                        .type("person")
                        .methodUsed("Capital detention")
                        .qualite("Actionnaire")
                        .distance(1)
                        .address(Address.builder()
                                .country("France")
                                .countryCode("FR")
                                .street("54 Quai Clemenceau")
                                .streetDetail(new Street(null))
                                .postalCode("69300")
                                .locality("CALUIRE ET CUIRE")
                                .build()
                        )
                        .fonction(null)
                        .birthday(LocalDate.of(1965,Month.OCTOBER,26))
                        .birthCity("LYON")
                        .birthCountry("France")
                        .birthCountryCode("FR")
                        .nationality(null)
                        .nationalityCode(null)
                        .name("JULIEN")
                        .firstname("Frédéric")
                        .maidenName(null)
                        .title("M")
                        .maxDate("2020-03-06")
                        .minDate("2018-10-11")
                        .build()
                ,GroupMember.builder()
                        .entityId(455199)
                        .entityName("M Bertrand LAFFAY")
                        .registrationNumber(null)
                        .countryCode("FR")
                        .country("France")
                        .share(BigDecimal.valueOf(28.99))
                        .type("person")
                        .methodUsed("Capital detention")
                        .qualite("Actionnaire")
                        .distance(1)
                        .address(Address.builder()
                                .country("France")
                                .countryCode("FR")
                                .street("23 cours Aristide Briand")
                                .streetDetail(new Street(null))
                                .postalCode("69300")
                                .locality("CALUIRE ET CUIRE")
                                .build()
                        )
                        .fonction(null)
                        .birthday(LocalDate.of(1969,Month.JANUARY,07))
                        .birthCity("LYON")
                        .birthCountry("France")
                        .birthCountryCode("FR")
                        .nationality(null)
                        .nationalityCode(null)
                        .name("LAFFAY")
                        .firstname("Bertrand")
                        .maidenName(null)
                        .title("M")
                        .maxDate("2020-11-17")
                        .minDate("2018-10-11")
                        .build()
        );
    }

}
