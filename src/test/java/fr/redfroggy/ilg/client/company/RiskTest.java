package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Risk;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class RiskTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(amazon00048RiskJson(), amazon00048Risk(), Risk.class);

        Map<String, Object> jsonAsMap = json.readValue(amazon00048RiskJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, RiskProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"), Maps.newHashMap("getRiskClass", "getClass"));
    }


    public static String amazon00048RiskJson() {
        return UnitTestUtils.getJsonFromContractFile("/company/FR-428785042-company-risk.json");
    }

    public static Risk amazon00048Risk() {
        return new Risk("17-20","Risque très faible","active", null);
    }
}
