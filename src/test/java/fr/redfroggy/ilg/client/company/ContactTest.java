package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Contact;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ContactTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(amazon00048IdentityContactJson(), amazon00048IdentityContact(),
                Contact.class, ContactProjection.class);
    }

    public static Contact amazon00048IdentityContact() {
        return Contact.builder().phone("+33146171000").webSite("https://www.amazon.fr/").build();
    }


    public static String amazon00048IdentityContactJson() {
        return UnitTestUtils.getJsonFromContractFile("/company/FR-428785042-company-identity-contact.json");
    }
}
