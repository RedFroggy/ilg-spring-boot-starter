package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.GroupMember;
import fr.redfroggy.ilg.client.model.Links;
import fr.redfroggy.ilg.client.model.Shareholders;
import fr.redfroggy.ilg.client.model.Subsidiaries;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LinksTest {

    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetIlg503207896FromJson() throws IOException {
        Links fromJson = json.readValue(ilg503207896LinksJson(), Links.class);

        assertThat(fromJson.getShareholders().getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(ilg503207896Links().getShareholders().getMembers().get(0));

        assertThat(fromJson.getSubsidiaries().getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(ilg503207896Links().getSubsidiaries().getMembers().get(0));

        Map<String, Object> jsonAsMap = json.readValue(ilg503207896LinksJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, LinksProjection.class, Arrays.asList("@context","@type",
                "@id", "@link"));
    }

    public static String ilg503207896LinksJson() {
        return UnitTestUtils.getJsonFromContractFile("/relation/FR-503207896-links.json");
    }

    public static Links ilg503207896Links() {
        Shareholders shareholders = new Shareholders("https://webservice.infolegale" +
                ".fr/v2/companies/FR/503207896/links/shareholders", null, null,
                Arrays.asList(fJulienMember())
        );

        Subsidiaries subsidiaries = new Subsidiaries("https://webservice.infolegale" +
                ".fr/v2/companies/FR/503207896/links/subsidiaries",
                null, null,
                Arrays.asList(SubsidiariesTest.ilgMauriceMember())
        );

        return new Links(null, shareholders, subsidiaries);
    }

    public static GroupMember fJulienMember() {
        return GroupMember.builder()
                .entityId(455198)
                .entityName("M Frédéric JULIEN")
                .registrationNumber(null)
                .countryCodeIso3("FRA")
                .countryCode("FR")
                .country("France")
                .share(BigDecimal.valueOf(28.99).setScale(2))
                .score(null)
                .type("person")
                .name("JULIEN")
                .firstname("Frédéric")
                .title("M")
                .build();
    }
}
