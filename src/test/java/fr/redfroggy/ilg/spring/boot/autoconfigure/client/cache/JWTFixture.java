package fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.time.Instant;
import java.util.Date;

public class JWTFixture {

    public static String anAccessToken() {
        return anAccessToken(Date.from(Instant.now().plusSeconds(360)));
    }

    public static String anAccessToken(Date expiresAt) {
        KeyPairGenerator kpg;
        try {
            kpg = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        kpg.initialize(2048);

        KeyPair kp = kpg.genKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) kp.getPrivate();

        JWTClaimsSet claimsSetOne = new JWTClaimsSet.Builder()
            .subject("cygogn")
            .expirationTime(expiresAt)
            .issuer("https://cygogn.com")
            .claim("scope", "openid")
            .build();

        JWSSigner signer = new RSASSASigner(privateKey);
        SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.RS256), claimsSetOne);
        try {
            signedJWT.sign(signer);
        } catch (JOSEException e) {
            return null;
        }
        return signedJWT.serialize();
    }
}
