package fr.redfroggy.ilg.spring.boot.autoconfigure;

import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;

@Component
public class AuthorizationInterceptor implements ClientHttpRequestInterceptor {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    static final String BEARER_TYPE = "Bearer";

    private final AuthenticationApiClient auth;

    public AuthorizationInterceptor(AuthenticationApiClient auth) {
        this.auth = auth;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException
    {
        ClientHttpResponse response = addAuthorizationHeader(request, body, execution);
        if (response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
            log.info("Reload tokens due to 401 status");
            auth.invalidateTokens();
            return addAuthorizationHeader(request, body, execution);
        }
        return response;
    }

    private ClientHttpResponse addAuthorizationHeader(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().setAccept(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
        request.getHeaders().add(HttpHeaders.AUTHORIZATION, BEARER_TYPE +" "+ auth.getTokens().getToken());
        return execution.execute(request, body);
    }
}
