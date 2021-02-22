package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.Availability;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.CompanyApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class CompanyApiClientMockRestTest  extends ApiClientMockRestTest {

    @Autowired
    private CompanyApiClient apiClient;

    @Test
    public void shouldGetAmazonAvailabilityWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/availability", CompanyTest.amazon00048AvailabilityJson());

        ResponseEntity<Availability> response = apiClient.getAvailability("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(CompanyTest.amazon00048Availability());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonCompanyWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042", CompanyTest.amazon00048CompanyJson());

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
        mockApi("http://ilg.fr/companies/fr/428785042/identity", IdentityTest.amazon00048IdentityJson());

        ResponseEntity<IdentityProjection> response = apiClient.getIdentity("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(IdentityTest.amazon00048Identity());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonIdentityContactWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/identity/contact", ContactTest.amazon00048IdentityContactJson());

        ResponseEntity<ContactProjection> response = apiClient.getIdentityContact("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ContactTest.amazon00048IdentityContact());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonMandataireWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/mandataire", ExecutiveTest.amazon00048MandataireJson());

        ResponseEntity<ExecutiveProjection> response = apiClient.getMandataire("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048Mandataire());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonIdentityWorkforceWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/identity/workforce", WorkforceTest.amazon00048IdentityWorkforceJson());

        ResponseEntity<WorkforceProjection> response = apiClient.getIdentityWorkforce("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(WorkforceTest.amazon00048IdentityWorkforce());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonRiskWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/risk", RiskTest.amazon00048RiskJson());

        ResponseEntity<RiskProjection> response = apiClient.getRisk("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(RiskTest.amazon00048Risk());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonScoreWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/score", ScoreTest.amazon00048ScoreJson());

        ResponseEntity<ScoreProjection> response = apiClient.getScore("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ScoreTest.amazon00048Score());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgTermsWhenRequestIsIlgCompany() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/terms", ExecutiveTermsTest.ilgTermsJson());

        ResponseEntity<ExecutiveTermsProjection> response = apiClient.getTerms("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTermsTest.ilgTerms());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgTermsWhenRequestIsIlgCompanyWithParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/terms?blockId=666&positionRole=O&principal=true&termsState=true&orders[start_date]=asc",
                ExecutiveTermsTest.ilgTermsJson());

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
