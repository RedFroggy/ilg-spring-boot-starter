package fr.redfroggy.ilg.client.authentication;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.benmanes.caffeine.cache.LoadingCache;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false",
"ilg.username=test-username","ilg.password=test-password"})
public class AuthenticationServiceMockRestTest {

    @Autowired
    private AuthenticationApiClient authService;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockServer;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void init() {
        LoadingCache<String, AuthenticationJwt> tokens = (LoadingCache<String, AuthenticationJwt>) ReflectionTestUtils.getField(authService,"tokens");
        tokens.invalidateAll();
        mockServer = MockRestServiceServer.createServer(simpleRestTemplate);
    }

    @Test
    public void shouldGetTokensWhenCredentialsIsOK() throws URISyntaxException, JsonProcessingException {
        Credentials credentials = new Credentials("test-username", "test-password");
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockServer.expect(ExpectedCount.once(),
            requestTo(new URI("http://ilg.fr/login_json")))
            .andExpect(method(HttpMethod.POST))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content()
                .string(mapper.writeValueAsString(credentials))
            )
            .andRespond(withStatus(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(mapper.writeValueAsString(jwt))
            );

        AuthenticationJwt tokens = authService.getTokens();
        mockServer.verify();
        assertThat(tokens)
                .hasFieldOrPropertyWithValue ("token", "test-token");
    }

    @Test
    public void shouldNoGetTokensWhenReturnStatus401() throws URISyntaxException, JsonProcessingException {
        authService.invalidateTokens();

        Credentials credentials = new Credentials("test-username", "test-password");
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockServer.expect(ExpectedCount.once(),
            requestTo(new URI("http://ilg.fr/login_json")))
            .andExpect(method(HttpMethod.POST))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content()
                .string(mapper.writeValueAsString(credentials))
            )
            .andRespond(withStatus(HttpStatus.UNAUTHORIZED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(mapper.writeValueAsString(jwt))
            );

        assertThatThrownBy(() -> authService.getTokens())
            .isInstanceOf(HttpClientErrorException.class)
            .hasFieldOrPropertyWithValue("statusCode", HttpStatus.UNAUTHORIZED);

        mockServer.verify();
    }

    @Test
    public void shouldReturnUnsupportedWhenCheckLogin() throws URISyntaxException, JsonProcessingException {
        assertThatThrownBy(() -> authService.loginCheck("john","pass"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    public void shouldReturnUnsupportedWhenRefresh() throws URISyntaxException, JsonProcessingException {
        assertThatThrownBy(() -> authService.refresh("myJwt","theRefreshToken"))
                .isInstanceOf(UnsupportedOperationException.class);
    }
}
