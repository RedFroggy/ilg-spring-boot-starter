package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;

public class PostalAddressMailFormatTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetObjectFromDefaultJson() throws IOException {
        String defaultJson = defaultJson();
        PostalAddressMailFormat defaultObject = defaultObject();
        UnitTestUtils.assertThatJsonIsEqualToResource(defaultJson, defaultObject,PostalAddressMailFormat.class);

        JSONAssert.assertEquals(json.writeValueAsString(defaultObject), defaultJson, false);
    }

    public static String defaultJson() {
        return "{\n" +
                "                \"@context\": \"http://wspreprod.infolegale.fr/v2/schema/xsd/generics.xsd\",\n" +
                "                \"@type\": \"PostalAddressMailFormat\",\n" +
                "                \"addressL1\": \"INFOLEGALE\",\n" +
                "                \"addressL2\": \"INFOLEGALE ET MARKETING\",\n" +
                "                \"addressL3\": \"IMMEUBLE LE BRITANIA ALLEE C\",\n" +
                "                \"addressL4\": \"20 BD EUGENE DERUELLE\",\n" +
                "                \"addressL5\": \"CS 83755\",\n" +
                "                \"addressL6\": \"69003 LYON 3EME\",\n" +
                "                \"addressL7\": \"FRANCE\"\n" +
                "            }";
    }

    public static PostalAddressMailFormat defaultObject() {
        return PostalAddressMailFormat.builder()
                .addressL1("INFOLEGALE")
                .addressL2("INFOLEGALE ET MARKETING")
                .addressL3("IMMEUBLE LE BRITANIA ALLEE C")
                .addressL4("20 BD EUGENE DERUELLE")
                .addressL5("CS 83755")
                .addressL6("69003 LYON 3EME")
                .addressL7("FRANCE")
                .build();
    }
}
