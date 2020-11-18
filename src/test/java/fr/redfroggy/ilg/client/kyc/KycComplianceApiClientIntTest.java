package fr.redfroggy.ilg.client.kyc;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class KycComplianceApiClientIntTest extends ApiClientIntTest {

    @Autowired
    private KycComplianceApi apiClient;

    @Test
    public void shouldGetIlgUboWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<KycUboProjection> response = apiClient.getKycUbo("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(KycUboTest.ilg503207896UboIntFixture());
    }
}
