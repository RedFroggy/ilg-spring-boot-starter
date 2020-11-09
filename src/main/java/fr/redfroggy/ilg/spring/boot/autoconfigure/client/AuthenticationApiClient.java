package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import fr.redfroggy.ilg.client.authentication.AuthenticationApi;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.client.authentication.Credentials;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgProperties;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

public class AuthenticationApiClient implements AuthenticationApi {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationApiClient.class);

    private final Credentials credentials;
    private final RestTemplate client;
    private final LoadingCache<String, AuthenticationJwt> tokens;

    private final String baseUrl;

    public AuthenticationApiClient(IlgProperties properties, RestTemplate client) {
        Assert.notNull(properties, "Can't build token service without properties");

        baseUrl = properties.getUrl();
        credentials = new Credentials(properties.getUsername(),
                properties.getPassword());

        this.client = client;

        tokens = Caffeine.from(properties.getTokenCacheSpec())
                .build(key -> getNewTokens());
    }

    public AuthenticationJwt getTokens() {
        return tokens.get("tokens");
    }

    public AuthenticationJwt getNewTokens() {
        log.info("New ilg tokens requested");
        return login(credentials).getBody();
    }

    public void invalidateTokens() {
        log.info("Evict requested tokens");
        tokens.invalidate("tokens");
    }

    @Override
    public ResponseEntity<AuthenticationJwt> loginCheck(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<AuthenticationJwt> login(@Valid Credentials credentials) {
        return client.postForEntity(baseUrl + "/login_json", credentials,
                AuthenticationJwt.class);
    }

    @Override
    public ResponseEntity<AuthenticationJwt> refresh(String authorization, String refreshToken) {
        throw new UnsupportedOperationException();
    }
}
