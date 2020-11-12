package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.TestUtils;
import fr.redfroggy.ilg.client.model.Workforce;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class WorkforceTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        TestUtils.assertThatJsonIsEqualToResource(amazon00048IdentityWorkforceJson(), amazon00048IdentityWorkforce(), Workforce.class,
                WorkforceProjection.class);
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
