package fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTParser;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;
import java.util.function.Supplier;

@Component
public class JwtCache {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationApiClient.class);

    private Cache<String, AuthenticationJwt> authorizedCache = Caffeine.newBuilder().build();

    private Duration durationCache = Duration.ZERO;

    public AuthenticationJwt get(String key, Supplier<AuthenticationJwt> getNewToken) {
        return Optional.ofNullable(authorizedCache.getIfPresent(key))
                .orElseGet(() -> putAndGet(key,getNewToken) );
    }

    public AuthenticationJwt putAndGet(String key, Supplier<AuthenticationJwt> getNewToken) {
        AuthenticationJwt jwt =  getNewToken.get();
        JWT accessToken;
        Date expirationTime;
        try {
            accessToken = JWTParser.parse(jwt.getToken());
            expirationTime = accessToken.getJWTClaimsSet().getExpirationTime();
        } catch (ParseException e) {
            log.error("Cannot parse authentication jwt.",e);
            throw new ParseRunTimeException(e);
        }
        Duration durationCache = Duration.between(Instant.now().plusSeconds(5), expirationTime.toInstant());
        if (!(durationCache.getSeconds() == this.durationCache.getSeconds())) {
            log.info("New duration for jwt cache {} s (previous is {} s)", durationCache.getSeconds(),
                    this.durationCache.getSeconds());
            this.durationCache = durationCache;
            authorizedCache = Caffeine.newBuilder().expireAfterWrite(durationCache).build();
        }
        authorizedCache.put(key, jwt);
        return jwt;
    }

    public void invalidate(String key) {
        authorizedCache.invalidate(key);
    }
}
