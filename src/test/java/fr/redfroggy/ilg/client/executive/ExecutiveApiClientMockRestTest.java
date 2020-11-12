package fr.redfroggy.ilg.client.executive;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.ExecutiveApiClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class ExecutiveApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private ExecutiveApiClient apiClient;

    @Test
    public void shouldGetAmazonExecutiveTerms() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/428785042/executives/terms", ExecutiveTest.amazon00048ExecutiveTermsJson());

        ResponseEntity<ExecutivesProjection2> response = apiClient.getExecutivesTerms("fr", "428785042");
        assertThat(response.getBody().getExecutives().get(12))
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048ExecutiveBoleTerm());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetAmazonExecutiveTermsWithFilters() throws URISyntaxException,
            JsonProcessingException {
        String params = "blockId=666&active=true&positionRole=CAC&orders[name]=asc" +
                "&orders[term.position_code]=asc&orders[term.start_date]=desc";

        mockApi("http://ilg.fr/companies/fr/428785042/executives/terms?" + params, ExecutiveTest.amazon00048ExecutiveTermsJson());

        ExecutiveRequest requestParam = ExecutiveRequest.builder()
                .blockId(666)
                .active(true)
                .positionRole(ExecutiveRequest.PositionRole.CAC)
                .ordersName(Sorting.Direction.ASC)
                .ordersTermPositionCode(Sorting.Direction.ASC)
                .ordersTermStartDate(Sorting.Direction.DESC)
                .build();

        ResponseEntity<ExecutivesProjection2> response = apiClient.getExecutivesTerms("fr", "428785042", requestParam);
        assertThat(response.getBody().getExecutives().get(12))
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048ExecutiveBoleTerm());

        mockApiServer.verify();
    }
}
