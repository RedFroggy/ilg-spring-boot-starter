package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Workforce;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WorkforceTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(amazon00048IdentityWorkforceJson(), amazon00048IdentityWorkforce(), Workforce.class,
                WorkforceProjection.class);
    }

    public static Workforce amazon00048IdentityWorkforce() {
        return new Workforce("5700","5000-9999", 5000, 9999);
    }


    public static String amazon00048IdentityWorkforceJson() {
        return UnitTestUtils.getJsonFromContractFile("/company/FR-428785042-company-identity-workforce.json");
    }
}
