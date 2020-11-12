package fr.redfroggy.ilg.client.company;


import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.InterfaceTestUtils;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class IdentityTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048IdentityFromJson() throws IOException {
        Identity amazonIdentityFromJson = json.readValue(amazon00048IdentityJson(), Identity.class);

        assertThat(amazonIdentityFromJson)
                .usingRecursiveComparison()
                .isEqualTo(amazon00048Identity());

        Map<String, Object> jsonAsMap = json.readValue(amazon00048IdentityJson(), Map.class);
        InterfaceTestUtils.verifyInterfaceGetter(jsonAsMap, IdentityProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"));
    }

    public static String amazon00048IdentityJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-identity.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }

    }

    public static Identity amazon00048Identity() {
        return Identity.builder()
                .id("428785042")
                .registrationId("428785042")
                .vatnumber("FR17428785042")
                .acronym("")
                .name("AMAZON FRANCE LOGISTIQUE SAS")
                .tradings("")
                .address(Address.builder()
                        .country("FRANCE")
                        .countryCode("FR")
                        .region(null)
                        .street("67 BD DU GENERAL LECLERC")
                        .streetDetail(new Street("67","", "BOULEVARD", "DU GENERAL LECLERC"))
                        .postalCode("92110")
                        .postalBoxNumber("")
                        .locality("CLICHY")
                        .mailFormatted(PostalAddressMailFormat.builder()
                                .addressL1("AMAZON FRANCE LOGISTIQUE SAS")
                                .addressL2("")
                                .addressL3("")
                                .addressL4("67 BD DU GENERAL LECLERC")
                                .addressL5("")
                                .addressL6("92110 CLICHY")
                                .addressL7("FRANCE")
                                .build()
                        )
                        .build())
                .headquarter(Site.builder()
                        .id("42878504200105")
                        .companyId("428785042")
                        .registrationId("42878504200105")
                        .siteNumber("00105")
                        .name("AMAZON FRANCE LOGISTIQUE SAS")
                        .commercialName("")
                        .tradings("")
                        .status(true)
                        .isHeadquarter(true)
                        .origine("Création")
                        .build()
                )
                .workforce(WorkforceTest.amazon00048IdentityWorkforce())
                .contact(ContactTest.amazon00048IdentityContact())
                .legalForm(new LegalFormModel("5710", "5710","Société par actions simplifiée (SAS)"))
                .activity(new ActivityModel(    "5210B","Entreposage et stockage non frigorifique"))
                .declaredActivity("exploitation de centres de distribution et de logistique.")
                .secondaryActivities(null)
                .creationDate(LocalDate.of(1999, Month.DECEMBER, 29))
                .status(1)
                .capital("38113.00")
                .rcs("NANTERRE B 428 785 042")
                .cotation(new Cotation(null,null, Collections.emptyList()))
                .tags(Collections.singletonList(new MarketInformationModel("ETI", "Entreprise de Taille Intermédiaire")))
                .build();
    }

}
