package fr.redfroggy.ilg.client.search;

import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@EnabledIfEnvironmentVariable(named = "ILG_URL", matches = ".*")
@SpringBootTest(classes = TestApplication.class)
public class SearchApiClientIntTest extends ApiClientIntTest {

    @Autowired
    private SearchApi apiClient;

    @Test
    public void shouldFindIlgSiteWhenSearchOn50320789600021RegistrationId() {
        ResponseEntity<SiteSearch> searchResponse = apiClient.searchSites("fr", SiteSearchRequest.builder()
                .registrationNumber("50320789600021")
                .companyRegistrationNumber("503207896")
                .city("LYON")
                .zipCode("69003")
                .name("INFOLEGALE")
                .street("CS 83755 20 BD EUGENE DERUELLE")
                .build(), 1
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteSearchTest.ilgSites());
    }

}
