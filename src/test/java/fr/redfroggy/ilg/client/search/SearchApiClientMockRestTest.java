package fr.redfroggy.ilg.client.search;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.hamcrest.core.StringContains;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class SearchApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private SearchApi apiClient;

    @Test
    public void shouldFindIlgSiteWhenSearchOn50320789600021RegistrationId() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI("http://ilg.fr/companies/fr/sites/search")))
                .andExpect(method(HttpMethod.POST))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(header(HttpHeaders.CONTENT_TYPE, startsWith("multipart/form-data")))
                .andExpect(content().string(StringContains.containsString("Content-Disposition: form-data; " +
                        "name=\"registrationNumber\"") ))
                .andExpect(content().string(StringContains.containsString("50320789600021") ))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .body(SiteSearchTest.ilgSiteSearchJson())
                );

        ResponseEntity<SiteSearch> searchResponse = apiClient.searchSites("fr", SiteSearchRequest.builder()
                .registrationNumber("50320789600021")
                .build(), null
        );

        assertThat(searchResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteSearchTest.ilgSites());
        mockApiServer.verify();
    }
}
