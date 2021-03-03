package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class SearchApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private SearchApi apiClient;

    @Test
    public void shouldFindIlgSiteWhenSearchOn50320789600021RegistrationId() throws URISyntaxException,
            JsonProcessingException {
        mockPostData("http://ilg.fr/companies/fr/sites/search", SiteSearchTest.ilgSiteSearchJson(),
                "name=\"registrationNumber\"", "50320789600021");

        ResponseEntity<SiteSearch> searchResponse = apiClient.searchSites("fr", SiteSearchRequest.builder()
                .registrationNumber("50320789600021")
                .build(), null
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteSearchTest.ilgSites());
        mockApiServer.verify();
    }

    @Test
    public void shouldFindIlgSiteWhenSearchOn50320789600021RegistrationIdWhitLimit1() throws URISyntaxException,
            JsonProcessingException {
        mockPostData("http://ilg.fr/companies/fr/sites/search?limit=1", SiteSearchTest.ilgSiteSearchJson(),
                "name=\"registrationNumber\"", "50320789600021");

        ResponseEntity<SiteSearch> searchResponse = apiClient.searchSites("fr", SiteSearchRequest.builder()
                .registrationNumber("50320789600021")
                .build(), 1
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteSearchTest.ilgSites());
        mockApiServer.verify();
    }

    @Test
    public void shouldFindIlgCompanyWhenSearchOn50320789600021RegistrationId() throws URISyntaxException,
            JsonProcessingException {
        mockPostData("http://ilg.fr/companies/fr/search/companies", CompanySearchGenericTest.ilgCompanySearchJson(),
                "name=\"simpleSearch\"", "50320789600021");

        ResponseEntity<CompanySearchGeneric> searchResponse = apiClient.searchCompanies("fr", CompanySearchRequestParam.builder()
                .simpleSearch("50320789600021")
                .build(), null
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(CompanySearchGenericTest.ilgCompanySearch());
        mockApiServer.verify();
    }

    @Test
    public void shouldFindIlgCompanyWhenSearchOn50320789600021RegistrationIdWithLimit1() throws URISyntaxException,
            JsonProcessingException {
        mockPostData("http://ilg.fr/companies/fr/search/companies?limit=1",
                CompanySearchGenericTest.ilgCompanySearchJson(),
                "name=\"simpleSearch\"", "50320789600021");


        ResponseEntity<CompanySearchGeneric> searchResponse = apiClient.searchCompanies("fr", CompanySearchRequestParam.builder()
                .simpleSearch("50320789600021")
                .build(), 1
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(CompanySearchGenericTest.ilgCompanySearch());
        mockApiServer.verify();
    }
}
