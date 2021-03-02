package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.monitoring.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class LegalInformationApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private LegalInformationApi apiClient;

    @Test
    public void shouldGetLegal() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/legal",
                LegalTest.ilgLegalJson());

        ResponseEntity<Legal> response = apiClient.getLegal("fr", "503207896", null);
        mockApiServer.verify();

        Legal body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(LegalTest.ilgLegal());
    }

    @Test
    public void shouldGetLegalWithSorting() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/legal?column=dateAct&order=asc",
                LegalTest.ilgLegalJson());

        ResponseEntity<Legal> response = apiClient.getLegal("fr", "503207896",
                Sorting.by("dateAct", Sorting.Direction.ASC));
        mockApiServer.verify();

        Legal body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(LegalTest.ilgLegal());
    }

    @Test
    public void shouldGetLegalDeposits() throws URISyntaxException {
        mockApi("http://ilg.fr/companies/fr/503207896/legal/deposits",
                LegalDepositListTest.ilgLegalDepositListJson());

        ResponseEntity<LegalDepositList> response = apiClient.getLegalDeposits("fr", "503207896");
        mockApiServer.verify();

        LegalDepositList body = response.getBody();

        assertThat(body)
                .usingRecursiveComparison()
                .isEqualTo(LegalDepositListTest.ilgLegalDepositList());
    }

    @Test
    public void shouldNotYetImplementWhenDownloadLegalDeposit() {
        assertThat(apiClient.downloadLegalDeposit("fr", "503207896", "aa"))
        .hasFieldOrPropertyWithValue("status", HttpStatus.NOT_IMPLEMENTED);
    }

    @Test
    public void shouldNotYetImplementWhenDownloadLegalStatus() {
        assertThat(apiClient.downloadLegalStatus("fr", "503207896", LocalDate.MIN))
                .hasFieldOrPropertyWithValue("status", HttpStatus.NOT_IMPLEMENTED);
    }
}
