package fr.redfroggy.ilg.client.kyc;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class KycComplianceApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private KycComplianceApi apiClient;

    @Test
    public void shouldGetIlgUboWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/kyc/ubo", KycUboTest.ilg503207896UboJson());

        ResponseEntity<KycUboProjection> response = apiClient.getKycUbo("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(KycUboTest.ilg503207896Ubo());

        mockApiServer.verify();
    }

}
