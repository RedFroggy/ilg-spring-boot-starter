package fr.redfroggy.ilg.client.site;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.TestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class SiteTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048SiteFromJson() throws IOException {
        TestUtils.assertThatJsonIsEqualToResource(amazon00048SiteJson(), amazon00048Site(), Site.class,
                SiteProjection.class);
    }

    public static String amazon00048SiteJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/site/FR-42878504200048-site.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }

    }

    public static Site amazon00048Site() {
        return Site.builder()
                .id("42878504200048")
                .registrationId("42878504200048")
                .siteNumber("00048")
                .companyId("428785042")
                .name("AMAZON FRANCE LOGISTIQUE SAS")
                .tradings("")
                .commercialName("")
                .status(true)
                .creationDate(LocalDate.of(2007, Month.OCTOBER, 01))
                .closingDate(null)
                .isHeadquarter(false)
                .origine("Création")
                .address(Address.builder()
                        .country("FRANCE")
                        .countryCode("FR")
                        .region( "Centre-Val de Loire")
                        .street("1401 RUE DU CHAMP ROUGE")
                        .streetDetail(new Street("1401","", "RUE", "DU CHAMP ROUGE"))
                        .postalCode("45770")
                        .postalBoxNumber("")
                        .locality("SARAN")
                        .mailFormatted(PostalAddressMailFormat.builder()
                                .addressL1("AMAZON FRANCE LOGISTIQUE SAS")
                                .addressL2("")
                                .addressL3("PARC D'ACTIVITES")
                                .addressL4("1401 RUE DU CHAMP ROUGE")
                                .addressL5("")
                                .addressL6("45770 SARAN")
                                .addressL7("FRANCE")
                                .build()
                        )
                    .build())
                .workforce(new Workforce("1000","1000-1999", 1000, 1999))
                .activity(new CodeLabelPair(    "5210B","Entreposage et stockage non frigorifique"))
                .events(buildEvents())
                .company(new Company(Identity.builder()
                        .id("428785042")
                        .registrationId("428785042")
                        .name("AMAZON FRANCE LOGISTIQUE SAS")
                        .legalForm(new LegalFormModel("5710","5710","Société par actions simplifiée (SAS)"))
                        .activity(new ActivityModel("5210B","Entreposage et stockage non frigorifique"))
                        .build()))
                .build();
    }

    private static List<SiteEvents> buildEvents() {
        return Arrays.asList(
                new SiteEvents("Modification entreprise", "2017-09-25"),
                new SiteEvents("Modification entreprise", "2017-02-28"),
                new SiteEvents("Réactivation établissement", "2017-02-28"),
                new SiteEvents("Fermeture siège (transfert)", "2017-02-28")
        );
    }

}
