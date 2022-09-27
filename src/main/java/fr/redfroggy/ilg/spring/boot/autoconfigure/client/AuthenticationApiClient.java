package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.authentication.AuthenticationApi;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.client.authentication.Credentials;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgProperties;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache.JwtCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

public class AuthenticationApiClient implements AuthenticationApi {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationApiClient.class);

    private final Credentials credentials;
    private final RestTemplate client;

    private final JwtCache jwtCache;

    private final String baseUrl;

    public AuthenticationApiClient(IlgProperties properties, RestTemplate client,
                                   JwtCache jwtCache) {
        Assert.notNull(properties, "Can't build token service without properties");
        Assert.notNull(jwtCache, "Can't build token service without jwt cache");

        baseUrl = properties.getUrl();
        credentials = new Credentials(properties.getUsername(),
                properties.getPassword());
        this.client = client;
        this.jwtCache = jwtCache;
    }

    public AuthenticationJwt getTokens() {
        return jwtCache.get("tokens", () -> getNewTokens());
    }

    private AuthenticationJwt getNewTokens() {
        AuthenticationJwt jwt = login(credentials).getBody();
        log.info("New ilg tokens requested");
        return jwt;
    }

    public void invalidateTokens() {
        log.info("Evict requested tokens");
        jwtCache.invalidate("tokens");
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
