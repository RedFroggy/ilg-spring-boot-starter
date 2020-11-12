package fr.redfroggy.ilg.client.executive;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assume.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class ExecutiveApiClientIntTest {

    @Autowired
    private ExecutiveApi apiClient;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void ping() throws IOException {
        assumeFalse("No ILG_URL define, no int tests run", ObjectUtils.isEmpty(System.getenv("ILG_URL")));
    }

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
