package fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache;

import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class JwtCacheTest {

    private final JwtCache jwtCache = new JwtCache();

    @Test
    void should_get_new_jwt_if_not_present_in_cache() {
        String token = JWTFixture.anAccessToken(Date.from(Instant.now().plusSeconds(360)));
        assertThat(jwtCache.get("myKey", () -> getNewJwt(token)))
        .usingRecursiveComparison().isEqualTo(getNewJwt(token));
    }

    @Test
    void should_get_jwt_present_in_cache(){
        String token = JWTFixture.anAccessToken(Date.from(Instant.now().plusSeconds(360)));

        AuthenticationJwt jwt = jwtCache.putAndGet("myKey", () -> getNewJwt(token));
        assertThat(jwtCache.get("myKey", () -> null))
                .isEqualTo(jwt);
    }

    @Test
    void should_throw_exception_when_parse_error(){
        assertThatThrownBy(() -> jwtCache.putAndGet("parseError", () -> getNewJwt("parseError")))
                .isExactlyInstanceOf(ParseRunTimeException.class);
    }

    private AuthenticationJwt getNewJwt(String token) {
        return new AuthenticationJwt(token, "refreshToken");
    }
}