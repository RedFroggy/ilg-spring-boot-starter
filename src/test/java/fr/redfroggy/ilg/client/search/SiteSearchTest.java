package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;

public class SiteSearchTest {

    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetAmazonSiteSearchFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(ilgSiteSearchJson(), ilgSites(), SiteSearch.class);
    }

    public static String ilgSiteSearchJson() {
        return UnitTestUtils.getJsonFromContractFile("/search/FR-50320789600021-sites-search.json");
    }

    public static SiteSearch ilgSites() {
        return new SiteSearch(Collections.singletonList(ilgSite()),1,1);
    }

    public static Site ilgSite() {
        return Site.builder()
                .id("50320789600021")
                .companyId("503207896")
                .registrationId("50320789600021")
                .siteNumber("00021")
                .name("INFOLEGALE")
                .commercialName("INFOLEGALE ET MARKETING")
                .tradings("INFOLEGALE ET MARKETING")
                .status(true)
                .isHeadquarter(true)
                .address(Address.builder()
                    .country("FRANCE")
                    .countryCode("FR")
                    .street("CS 83755 20 BD EUGENE DERUELLE")
                    .streetDetail(new Street(Collections.emptyList()))
                    .postalCode("69003")
                    .locality("LYON 3EME")
                    .build())
                .company(new Company(Identity.builder().registrationId("503207896").build()))
                .build();
    }

}
