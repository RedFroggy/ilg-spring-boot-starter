package fr.redfroggy.ilg.client.company;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.InterfaceTestUtils;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.client.model.Contact;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

public class ContactTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ContactFromJson() throws IOException {
        Contact amazonFromJson = json.readValue(amazon00048IdentityContactJson(), Contact.class);

        assertThat(amazonFromJson)
                .usingRecursiveComparison()
                .isEqualTo(amazon00048IdentityContact());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048IdentityContactJson(), Map.class);
        InterfaceTestUtils.verifyInterfaceGetter(jsonAsMap, ContactProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"));
    }

    public static Contact amazon00048IdentityContact() {
        return Contact.builder().phone("+33146171000").webSite("https://www.amazon.fr/").build();
    }


    public static String amazon00048IdentityContactJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-identity-contact.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }
}
