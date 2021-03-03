package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import fr.redfroggy.ilg.client.model.Availability;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.CompanyApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@EnabledIfEnvironmentVariable(named = "ILG_URL", matches = ".*")
@SpringBootTest(classes = TestApplication.class)
public class CompanyApiClientIntTest extends ApiClientIntTest {

    @Autowired
    private CompanyApiClient apiClient;

    @Test
    public void shouldGetAmazonAvailabilityWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {

        ResponseEntity<Availability> response = apiClient.getAvailability("fr", "428785042");
        assertThat(response.getStatusCode())
                .isEqualTo(HttpStatus.OK);
    }

    @Test
    public void shouldGetAmazonCompanyWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {

        ResponseEntity<CompanyProjection> response = apiClient.getCompany("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .ignoringFields("groupInfo","groupStructure","score.covidImpact","score.delaiReglementFournisseurSecteur",
                        "score.history","financial.balances")
                .isEqualTo(CompanyTest.amazon00048Company());

    }

    @Test
    public void shouldGetAmazonIdentityWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {

        ResponseEntity<IdentityProjection> response = apiClient.getIdentity("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(IdentityTest.amazon00048Identity());

    }

    @Test
    public void shouldGetAmazonIdentityContactWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<ContactProjection> response = apiClient.getIdentityContact("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ContactTest.amazon00048IdentityContact());
    }

    @Test
    public void shouldGetAmazonMandataireWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<ExecutiveProjection> response = apiClient.getMandataire("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048Mandataire());
    }

    @Test
    public void shouldGetAmazonIdentityWorkforceWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<WorkforceProjection> response = apiClient.getIdentityWorkforce("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(WorkforceTest.amazon00048IdentityWorkforce());
    }

    @Test
    public void shouldGetAmazonRiskWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<RiskProjection> response = apiClient.getRisk("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(RiskTest.amazon00048Risk());
    }

    @Test
    public void shouldGetAmazonScoreWhenRequestIsAmazon() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<ScoreProjection> response = apiClient.getScore("fr", "428785042");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .ignoringFields("covidImpact","delaiReglementFournisseurSecteur",
                        "history")
                .isEqualTo(ScoreTest.amazon00048Score());
    }

    @Test
    public void shouldGetIlgTermsWhenRequestIsIlgCompany() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<ExecutiveTermsProjection> response = apiClient.getTerms("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTermsTest.ilgTerms());
    }

}
