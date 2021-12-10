package fr.redfroggy.ilg.spring.boot.autoconfigure;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache.JWTFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=true",
        "logging.level.fr.redfroggy.ilg.spring.boot.autoconfigure.RequestResponseLoggingInterceptor=DEBUG"})
public class IlgRestTemplateMockRestTest {

    @Autowired
    private IlgRestTemplate apiClient;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    private MockRestServiceServer mockApiServer;

    private ObjectMapper mapper = new ObjectMapper();

    private static final String ACCESS_TOKEN = JWTFixture.anAccessToken(Date.from(Instant.now().plusSeconds(360)));

    @BeforeEach
    public void init() throws URISyntaxException, JsonProcessingException {
        mockAuthorizedServer = MockRestServiceServer.createServer(simpleRestTemplate);
        AuthenticationJwt jwt = new AuthenticationJwt(ACCESS_TOKEN, "test-refreshToken");
        mockAuthorizedServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/login_json")))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(jwt))
                );

        mockApiServer = MockRestServiceServer.createServer(apiClient);
    }

    @Test
    public void shouldGetBaseUrl() throws URISyntaxException,
            JsonProcessingException {
        assertThat(apiClient.getBaseUrl())
                .isEqualTo("http://ilg.fr");
    }

    @Test
    public void shouldGetResponseWhenRequestHasAuthorizationHeader() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/site")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer "+ACCESS_TOKEN))
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
                    .andExpect(header("authorization","Bearer "+ACCESS_TOKEN))
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

    @Test
    public void shouldThrowExceptionWhenNotFoundResource() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/site")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.NOT_FOUND)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body("not found resource")
                );

        assertThatThrownBy(() -> apiClient.getForObject("http://ilg.fr/site", String.class))
                .isInstanceOf(HttpClientErrorException.NotFound.class);

        mockApiServer.verify();
    }

    @Test
    public void shouldReloadTokenWhenStatusIs401() throws URISyntaxException, JsonProcessingException {
        mockAuthorizedServer.expect(ExpectedCount.twice(),
                        requestTo(new URI("http://ilg.fr/login_json")))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(new AuthenticationJwt(ACCESS_TOKEN, "test-refreshToken")))
                );

        mockApiServer.expect(ExpectedCount.twice(),
                        requestTo(new URI("http://ilg.fr/site")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer "+ACCESS_TOKEN))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.UNAUTHORIZED)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body("not found resource")
                );

        assertThatThrownBy(() -> apiClient.getForObject("http://ilg.fr/site", String.class))
                .isInstanceOf(HttpClientErrorException.Unauthorized.class);

        mockApiServer.verify();
    }
}
