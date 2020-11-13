package fr.redfroggy.ilg.client.company;


import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.assertj.core.util.Maps;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class CompanyTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048IdentityFromJson() throws IOException {
        Company amazonCompanyFromJson = json.readValue(amazon00048CompanyJson(), Company.class);

        assertThat(amazonCompanyFromJson)
                .usingRecursiveComparison()
                .ignoringFields("financial.balances")
                .isEqualTo(amazon00048Company());

        assertThat((Map)amazonCompanyFromJson.getFinancial().getBalances())
                .containsKeys("@context", "@id", "@link", "@type");

        Map<String, Object> jsonAsMap = json.readValue(amazon00048CompanyJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, CompanyProjection.class, Arrays.asList("@context","@type",
                "@link", "@id"), Maps.newHashMap("getRiskClass", "getClass"));
    }

    public static String amazon00048CompanyJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static Company amazon00048Company() {
        return Company.builder()
                .identity(amazon00048Identity())
                .risk(RiskTest.amazon00048Risk())
                .score(ScoreTest.amazon00048Score())
                .links(new Links(new LinksCounts(1, 0, 0),
                        new Shareholders("https://webservice.infolegale.fr/v2/companies/fr/428785042/links/shareholders",
                                null, null, null),
                        new Subsidiaries("https://webservice.infolegale.fr/v2/companies/fr/428785042/links/subsidiaries",
                                null, null, null)))
                .financial(buildFinancial())
                .groupStructure(buildGroupMember())
                .groupInfo(new GroupInfo("0000236410",null,"AMAZON EU SÀRL",5700,576589985))
                .mandataire(ExecutiveTest.amazon00048Mandataire())
                .build();
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
                .workforce(new Workforce("5700","5000-9999", 5000, 9999))
                .contact(Contact.builder().phone("+33146171000").webSite("https://www.amazon.fr/").build())
                .legalForm(new LegalFormModel("5710", "5710","Société par actions simplifiée (SAS)"))
                .activity(new ActivityModel(    "5210B","Entreposage et stockage non frigorifique"))
                .declaredActivity("exploitation de centres de distribution et de logistique.")
                .secondaryActivities(Collections.emptyList())
                .creationDate(LocalDate.of(1999, Month.DECEMBER, 29))
                .status(1)
                .capital("38113.00")
                .rcs("NANTERRE B 428 785 042")
                .cotation(new Cotation(null,null, Collections.emptyList()))
                .tags(Collections.singletonList(new MarketInformationModel("ETI", "Entreprise de Taille Intermédiaire")))
                .build();
    }

    private static Financial buildFinancial() {
        return Financial.builder()
                .turnover("576589985")
                .currency("€")
                .netIncome("18896318")
                .operatingIncome("56380651")
                .equity("124482535")
                .closingDate(LocalDate.of(2019,Month.DECEMBER,31))
                .lastUpdate(LocalDate.of(2019,Month.DECEMBER,31))
                .workforce(new Workforce("5700", "5000-9999", 5000, 9999))
                .balances(Collections.emptyMap())
                .build();
    }

    private static GroupMember buildGroupMember() {
        return GroupMember.builder()
                .nodePath("236410/236427")
                .entityId(236410)
                .entityName("AMAZON EU SÀRL")
                .countryCodeIso3("LUX")
                .countryCode("LU")
                .country("Luxembourg")
                .address(Address.builder()
                        .country("Luxembourg")
                        .countryCode("LU")
                        .street("38 avenue John F. Kennedy")
                        .streetDetail(new Street("38", "", "AVENUE", "JOHN F. KENNEDY"))
                        .postalCode("L-1855")
                        .locality("Luxembourg")
                        .mailFormatted(PostalAddressMailFormat.builder()
                                .addressL4("38 avenue John F. Kennedy")
                                .addressL6("L-1855 Luxembourg")
                                .addressL7("Luxembourg")
                                .build()
                        )
                        .build())
                .build();
    }

    public static Availability amazon00048Availability() {
        return Availability.builder()
                .identity(true)
                .sites(true)
                .risk(true)
                .score(true)
                .financial(true)
                .links(true)
                .groupStructure(true)
                .groupInfo(true)
                .mandataire(true)
                .lastAds(null)
                .events(true)
                .executives(true)
                .mandats(false)
                .legal(null)
                .kyc(true)
                .build();
    }

    public static String amazon00048AvailabilityJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/company/FR-428785042-company-availability.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }
}
