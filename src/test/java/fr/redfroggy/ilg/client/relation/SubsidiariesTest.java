package fr.redfroggy.ilg.client.relation;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.GroupMember;
import fr.redfroggy.ilg.client.model.Subsidiaries;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

public class SubsidiariesTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetIlg503207896SubsidiariesFromJson() throws IOException {
        Subsidiaries fromJson = json.readValue(ilg503207896SubsidiariesJson(), Subsidiaries.class);

        assertThat(fromJson)
                .usingRecursiveComparison()
                .ignoringFields("members")
                .isEqualTo(ilg503207896Subsidiaries());

        assertThat(fromJson.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(ilgMauriceMember());

        assertThat(fromJson.getMembers())
                .element(1)
                .usingRecursiveComparison()
                .isEqualTo(conformiteeMember());

        Map<String, Object> jsonAsMap = json.readValue(ilg503207896SubsidiariesJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, SubsidiariesProjection.class, Arrays.asList("@context","@type",
                "@id", "@link"));
    }

    public static String ilg503207896SubsidiariesJson() {
        return UnitTestUtils.getJsonFromContractFile("/relation/FR-503207896-links-subsidiaries.json");
    }

    /**
     *
     * @return Only Subsidiaries INFOLEGALE and CONFORMITEE in the list
     */
    public static Subsidiaries ilg503207896Subsidiaries() {
        String id = "https://webservice.infolegale.fr/v2/companies/FR/503207896/links/subsidiaries";

        Pagination pagination = Pagination.builder()
                .count(null)
                .start(0)
                .page(1)
                .total(5)
                .build();

        Sorting sorting = new Sorting(null, "ASC");

        return new Subsidiaries(id, pagination, sorting,
                Arrays.asList(ilgMauriceMember(), conformiteeMember())
        );
    }

    public static GroupMember ilgMauriceMember() {
        return GroupMember.builder()
                .entityId(443115)
                .entityName("INFOLEGALE (MAURICE) LTÉE")
                .registrationNumber(null)
                .countryCodeIso3("MUS")
                .countryCode("MU")
                .country("Maurice")
                .share(BigDecimal.valueOf(100.00).setScale(2))
                .score(null)
                .type("company")
                .build();
    }

    public static GroupMember conformiteeMember() {
        return GroupMember.builder()
                .entityId(1515596)
                .entityName("CONFORMITEE")
                .registrationNumber("848312708")
                .countryCodeIso3("FRA")
                .countryCode("FR")
                .country("France")
                .share(BigDecimal.valueOf(19.22).setScale(2))
                .score(6)
                .type("company")
                .build();
    }
}
