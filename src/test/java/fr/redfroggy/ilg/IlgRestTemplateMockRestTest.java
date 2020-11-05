package fr.redfroggy.ilg;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class IlgRestTemplateMockRestTest {

    @Autowired
    private IlgRestTemplate apiClient;

    @Autowired
    private RestTemplate ilgRestTemplate;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    private MockRestServiceServer mockApiServer;

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

    @Test
    public void shouldGetResponseWhenRequestHasAuthorizationHeader() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/site")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body("red froggy")
                );

        assertThat(apiClient.getForObject("http://ilg.fr/site", String.class)).isEqualTo("red froggy");
        mockApiServer.verify();
    }

    @Test
    public void shouldPostFormDataWithSearchRequestObject() throws URISyntaxException,
            JsonProcessingException {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("search", "red froggy");

        mockApiServer
                .expect(ExpectedCount.once(), requestTo(new URI("http://ilg.fr/search")))
                    .andExpect(method(HttpMethod.POST))
                    .andExpect(header("authorization","Bearer test-token"))
                    .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect(header(HttpHeaders.CONTENT_TYPE, startsWith("multipart/form-data")))
                .andRespond(withStatus(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("result is red froggy")
                );

        assertThat(
            apiClient.postFormData(
                URI.create("http://ilg.fr/search"),
                    formData, String.class).getBody()
        ).isEqualTo("result is red froggy");

        mockApiServer.verify();
    }
}
