package fr.redfroggy.ilg.client.site;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Map;

public class SitesTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazonSitesFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(amazonSitesJson(), amazonSites(), Sites.class);

        Map<String, Object> jsonAsMap = json.readValue(amazonSitesJson(), Map.class);
        UnitTestUtils.verifyInterfaceGetter(jsonAsMap, SitesProjection.class, Arrays.asList("@context","@type",
                "@link", "@id","@search"));
    }

    public static String amazonSitesJson() {
        return UnitTestUtils.getJsonFromContractFile("/site/FR-428785042-sites.json");
    }

    public static Sites amazonSites() {
        Pagination pagination = Pagination.builder()
                .start(0)
                .page(1)
                .count(2)
                .total(13)
                .build();

        return new Sites(pagination, new Sorting(null, "ASC"), Arrays.asList(amazon00048Site(),amazon00055Site()));
    }

    public static Site amazon00048Site() {
        return Site.builder()
                .registrationId("42878504200048")
                .siteNumber("00048")
                .tradings("")
                .status(true)
                .creationDate(LocalDate.of(2007, Month.OCTOBER, 01))
                .closingDate(null)
                .isHeadquarter(false)
                .address(Address.builder()
                    .street("1401 RUE DU CHAMP ROUGE")
                    .streetDetail(new Street("1401","", "RUE", "DU CHAMP ROUGE"))
                    .postalCode("45770")
                    .locality("SARAN")
                    .build())
                .workforce(new Workforce("1000","1000-1999", 1000, 1999))
                .build();
    }

    public static Site amazon00055Site() {
        return Site.builder()
                .registrationId("42878504200055")
                .siteNumber("00055")
                .tradings("")
                .status(true)
                .creationDate(LocalDate.of(2010, Month.AUGUST, 16))
                .closingDate(null)
                .isHeadquarter(false)
                .address(Address.builder()
                        .street("ZAC DES PORTES DE PROVENCE")
                        .streetDetail(new Street("","", "", "ZAC DES PORTES DE PROVENCE"))
                        .postalCode("26200")
                        .locality("MONTELIMAR")
                        .build())
                .workforce(new Workforce("500","500-999", 500, 999))
                .build();
    }
}
