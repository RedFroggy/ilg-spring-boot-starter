package fr.redfroggy.ilg.client;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class ApiClientMockRestTest {
    protected MockRestServiceServer mockApiServer;

    @Autowired
    private RestTemplate ilgRestTemplate;
    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
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

    protected void mockApi(String uri, String body) throws URISyntaxException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI(uri)))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization", "Bearer test-token"))
                .andExpect(header("accept", MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(body)
                );
    }
}
