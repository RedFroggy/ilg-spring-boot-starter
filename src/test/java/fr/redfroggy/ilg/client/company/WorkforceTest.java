package fr.redfroggy.ilg.client.company;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.InterfaceTestUtils;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.client.model.Workforce;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

public class WorkforceTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        Workforce amazonFromJson = json.readValue(amazon00048IdentityWorkforceJson(), Workforce.class);

        assertThat(amazonFromJson)
                .usingRecursiveComparison()
                .isEqualTo(amazon00048IdentityWorkforce());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048IdentityWorkforceJson(), Map.class);
        InterfaceTestUtils.verifyInterfaceGetter(jsonAsMap, WorkforceProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"));
    }

    public static Workforce amazon00048IdentityWorkforce() {
        return new Workforce("5700","5000-9999", 5000, 9999);
    }


    public static String amazon00048IdentityWorkforceJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-identity-workforce.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }
}
