package fr.redfroggy.ilg.client.relation;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.Address;
import fr.redfroggy.ilg.client.model.GroupMember;
import fr.redfroggy.ilg.client.model.Shareholders;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class ShareholdersTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetIlg503207896ShareholdersFromJson() throws IOException {
        Shareholders fromJson = json.readValue(ilg503207896ShareholdersJson(), Shareholders.class);

        assertThat(fromJson)
                .usingRecursiveComparison()
                .ignoringFields("members")
                .isEqualTo(ilg503207896Shareholders());

        assertThat(fromJson.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(fJulienMember());

        Map<String, Object> jsonAsMap = json.readValue(ilg503207896ShareholdersJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, ShareholdersProjection.class, Arrays.asList("@context","@type",
                "@id", "@link"));
    }

    public static String ilg503207896ShareholdersJson() {
        return UnitTestUtils.getJsonFromContractFile("/relation/FR-503207896-links-shareholders.json");
    }

    /**
     *
     * @return Only Shareholder M Frédéric JULIEN in the list
     */
    public static Shareholders ilg503207896Shareholders() {
        String id = "https://webservice.infolegale.fr/v2/companies/FR/503207896/links/shareholders";

        Pagination pagination = Pagination.builder()
                .count(null)
                .start(0)
                .page(1)
                .total(8)
                .build();

        Sorting sorting = new Sorting(null, "ASC");

        return new Shareholders(id, pagination, sorting,
                Arrays.asList(fJulienMember())
        );
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
                .address(Address.builder()
                        .country("France")
                        .street("54 Quai Clemenceau")
                        .postalCode("69300")
                        .locality("CALUIRE ET CUIRE")
                        .build())
                .birthday(LocalDate.parse("1965-10-26"))
                .birthCity("LYON")
                .name("JULIEN")
                .firstname("Frédéric")
                .title("M")
                .build();
    }

}
