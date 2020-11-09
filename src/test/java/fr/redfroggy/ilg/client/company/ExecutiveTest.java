package fr.redfroggy.ilg.client.company;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.InterfaceTestUtils;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.client.model.Executive;
import fr.redfroggy.ilg.client.model.ExecutiveFonction;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

public class ExecutiveTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ExecutiveFromJson() throws IOException {
        Executive amazonFromJson = json.readValue(amazon00048MandataireJson(), Executive.class);

        assertThat(amazonFromJson)
                .usingRecursiveComparison()
                .isEqualTo(amazon00048Mandataire());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048MandataireJson(), Map.class);
        InterfaceTestUtils.verifyInterfaceGetter(jsonAsMap, ExecutiveProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"));
    }


    public static Executive amazon00048Mandataire() {
        return Executive.builder()
                .civilite("M")
                .name("BOLE")
                .firstname("Ronan")
                .type("person")
                .phone("+33146171000")
                .fonction(
                        ExecutiveFonction.builder()
                                .code("5")
                                .label("Président")
                                .build())
                .build();
    }

    public static String amazon00048MandataireJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-mandataire.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }
}
