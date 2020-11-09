package fr.redfroggy.ilg.client.company;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.InterfaceTestUtils;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.client.model.Risk;
import org.assertj.core.util.Maps;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

public class RiskTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        Risk amazonFromJson = json.readValue(amazon00048RiskJson(), Risk.class);

        assertThat(amazonFromJson)
                .usingRecursiveComparison()
                .isEqualTo(amazon00048Risk());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048RiskJson(), Map.class);
        InterfaceTestUtils.verifyInterfaceGetter(jsonAsMap, RiskProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"), Maps.newHashMap("getRiskClass", "getClass"));
    }


    public static String amazon00048RiskJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-risk.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static Risk amazon00048Risk() {
        return new Risk("17-20","Risque très faible","active", null);
    }
}
