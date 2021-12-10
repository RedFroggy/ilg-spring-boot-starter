package fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache;

import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class JwtCacheTest {

    private final JwtCache jwtCache = new JwtCache();

    @Test
    void should_get_null_if_not_present_in_cache() {
        String token = JWTFixture.anAccessToken(Date.from(Instant.now().plusSeconds(360)));
        assertThat(jwtCache.get("myKey", () -> getJwt(token)))
        .usingRecursiveComparison().isEqualTo(getJwt(token));
    }

    @Test
    void should_get_if_present_in_cache(){
        String token = JWTFixture.anAccessToken(Date.from(Instant.now().plusSeconds(360)));

        AuthenticationJwt jwt = jwtCache.putAndGet("myKey", () -> getJwt(token));
        assertThat(jwtCache.get("myKey", () -> null))
                .isEqualTo(jwt);
    }

    private AuthenticationJwt getJwt(String token) {
        return new AuthenticationJwt(token, "refreshToken");
    }
}