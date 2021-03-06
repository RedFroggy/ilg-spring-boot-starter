package fr.redfroggy.ilg.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

public abstract class ApiClientMockRestTest {
    protected MockRestServiceServer mockApiServer;

    @Autowired
    private RestTemplate ilgRestTemplate;
    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    protected ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
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

    protected void mockPostData(String uri, String body, String formDataKey, String formDataValue) throws URISyntaxException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(
                        new URI(uri)))
                .andExpect(method(HttpMethod.POST))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(header(HttpHeaders.CONTENT_TYPE, startsWith("multipart/form-data")))
                .andExpect(content().string(StringContains.containsString("Content-Disposition: form-data; " +
                        formDataKey) ))
                .andExpect(content().string(StringContains.containsString(formDataValue) ))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .body(body)
                );
    }
}
