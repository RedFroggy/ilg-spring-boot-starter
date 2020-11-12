package fr.redfroggy.ilg.client.company;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.client.model.Availability;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.CompanyApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class CompanyApiClientMockRestTest {

    @Autowired
    private CompanyApiClient apiClient;

    @Autowired
    private RestTemplate ilgRestTemplate;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    private MockRestServiceServer mockApiServer;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void init() throws URISyntaxException, JsonProcessingException {
        mockAuthorizedServer = MockRestServiceServer.createServer(simpleRestTemplate);
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockAuthorizedServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/login_json")))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(jwt))
                );

        mockApiServer = MockRestServiceServer.createServer(ilgRestTemplate);
    }

    @Test
    public void shouldGetAmazonAvailabilityWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/availability")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(CompanyTest.amazon00048AvailabilityJson())
                );

        ResponseEntity<Availability> response = apiClient.getAvailability("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(CompanyTest.amazon00048Availability());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonCompanyWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(CompanyTest.amazon00048CompanyJson())
                );

        ResponseEntity<CompanyProjection> response = apiClient.getCompany("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .ignoringFields("financial.balances")
                .isEqualTo(CompanyTest.amazon00048Company());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonIdentityWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/identity")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(IdentityTest.amazon00048IdentityJson())
                );

        ResponseEntity<IdentityProjection> response = apiClient.getIdentity("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(IdentityTest.amazon00048Identity());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonIdentityContactWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/identity/contact")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(ContactTest.amazon00048IdentityContactJson())
                );

        ResponseEntity<ContactProjection> response = apiClient.getIdentityContact("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ContactTest.amazon00048IdentityContact());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonMandataireWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/mandataire")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(ExecutiveTest.amazon00048MandataireJson())
                );

        ResponseEntity<ExecutiveProjection> response = apiClient.getMandataire("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048Mandataire());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonIdentityWorkforceWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/identity/workforce")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(WorkforceTest.amazon00048IdentityWorkforceJson())
                );

        ResponseEntity<WorkforceProjection> response = apiClient.getIdentityWorkforce("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(WorkforceTest.amazon00048IdentityWorkforce());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonRiskWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/risk")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(RiskTest.amazon00048RiskJson())
                );

        ResponseEntity<RiskProjection> response = apiClient.getRisk("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(RiskTest.amazon00048Risk());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonScoreWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/428785042/score")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(ScoreTest.amazon00048ScoreJson())
                );

        ResponseEntity<ScoreProjection> response = apiClient.getScore("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ScoreTest.amazon00048Score());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgTermsWhenRequestIsIlgCompany() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/503207896/terms")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(ExecutiveTermsTest.ilgTermsJson())
                );

        ResponseEntity<ExecutiveTermsProjection> response = apiClient.getTerms("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTermsTest.ilgTerms());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgTermsWhenRequestIsIlgCompanyWithParams() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/503207896/terms?blockId=666&positionRole=O&principal=true&termsState=true&orders[start_date]=asc")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(ExecutiveTermsTest.ilgTermsJson())
                );

        TermRequest requestParams = TermRequest.builder()
                .blockId(666)
                .ordersStartDate(Sorting.Direction.ASC)
                .positionRole(TermRequest.PositionRole.O)
                .principal(true)
                .termsState(true)
                .build();

        ResponseEntity<ExecutiveTermsProjection> response = apiClient.getTerms("fr", "503207896", requestParams);
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTermsTest.ilgTerms());

        mockApiServer.verify();
    }
}
