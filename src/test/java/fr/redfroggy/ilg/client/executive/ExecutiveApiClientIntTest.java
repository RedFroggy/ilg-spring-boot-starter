package fr.redfroggy.ilg.client.executive;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assume.*;

@EnabledIfEnvironmentVariable(named = "ILG_URL", matches = ".*")
@SpringBootTest(classes = TestApplication.class)
public class ExecutiveApiClientIntTest extends ApiClientIntTest {

    @Autowired
    private ExecutiveApi apiClient;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldGetAmazonExecutiveTermsWithFilters() throws URISyntaxException,
            JsonProcessingException {
        ExecutiveRequest requestParam = ExecutiveRequest.builder()
                .blockId(1)
                .positionRole(ExecutiveRequest.PositionRole.M)
                .build();

        ResponseEntity<ExecutivesProjection2> response = apiClient.getExecutivesTerms("fr", "428785042", requestParam);
        assertThat(response.getBody().getExecutives().get(1))
                .usingRecursiveComparison()
                .isEqualTo(ExecutiveTest.amazon00048ExecutiveBoleTerm());
    }
}
