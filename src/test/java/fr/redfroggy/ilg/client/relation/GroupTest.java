package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Group;
import fr.redfroggy.ilg.client.model.GroupMember;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetGroup455198FromJson() throws IOException {
        Group fromJson = json.readValue(group455198Json(), Group.class);

        assertThat(fromJson.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(group455198().getMembers().get(0));

        Map<String, Object> jsonAsMap = json.readValue(group455198Json(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, GroupProjection.class, Arrays.asList("@context","@type",
                "@id", "@link"));
    }

    public static String group455198Json() {
        return UnitTestUtils.getJsonFromContractFile("/relation/455198-groups.json");
    }

    /**
     *
     * @return Only INFOLEGALE in the list
     */
    public static Group group455198() {
        return new Group(Arrays.asList(ilgMember()));
    }

    public static GroupMember ilgMember() {
        return GroupMember.builder()
                .parentId(455198)
                .entityId(200397)
                .entityName("INFOLEGALE")
                .registrationNumber("503207896")
                .countryCodeIso3("FRA")
                .countryCode("FR")
                .country("France")
                .share(BigDecimal.valueOf(28.99).setScale(2))
                .score(19)
                .type("company")
                .build();
    }

}
