package fr.redfroggy.ilg.client.authentication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache.JWTFixture;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache.JwtCache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;


@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false",
        "ilg.username=test-username","ilg.password=test-password"})
public class AuthenticationServiceMockRestTest {

    @Autowired
    private AuthenticationApiClient authService;

    @Autowired
    private RestTemplate simpleRestTemplate;

    @Autowired
    private JwtCache jwtCache;

    private MockRestServiceServer mockServer;

    private ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
    public void init() {
        jwtCache.invalidate("tokens");
        mockServer = MockRestServiceServer.createServer(simpleRestTemplate);
    }

    @Test
    public void shouldGetTokensWhenCredentialsIsOK() throws Exception {
        Credentials credentials = new Credentials("test-username", "test-password");
        String accessToken = JWTFixture.anAccessToken();
        AuthenticationJwt jwt = new AuthenticationJwt(accessToken, "test-refreshToken");
        mockServer.expect(ExpectedCount.once(),
                        requestTo(new URI("http://ilg.fr/login_json")))
                .andExpect(method(HttpMethod.POST))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
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
                .hasFieldOrPropertyWithValue ("token", accessToken);
    }

    @Test
    public void shouldNoGetTokensWhenReturnStatus401() throws URISyntaxException, JsonProcessingException {
        authService.invalidateTokens();

        Credentials credentials = new Credentials("test-username", "test-password");
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockServer.expect(ExpectedCount.once(),
                        requestTo(new URI("http://ilg.fr/login_json")))
                .andExpect(method(HttpMethod.POST))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
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
