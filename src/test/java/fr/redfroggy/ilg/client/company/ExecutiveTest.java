package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.TestUtils;
import fr.redfroggy.ilg.client.model.Executive;
import fr.redfroggy.ilg.client.model.ExecutiveFonction;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class ExecutiveTest {
    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ExecutiveFromJson() throws IOException {
        TestUtils.assertThatJsonIsEqualToResource(amazon00048MandataireJson(), amazon00048Mandataire(), Executive.class,
                ExecutiveProjection.class);
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
