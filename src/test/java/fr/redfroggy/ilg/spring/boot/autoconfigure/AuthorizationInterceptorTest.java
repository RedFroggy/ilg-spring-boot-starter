package fr.redfroggy.ilg.spring.boot.autoconfigure;

import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.AuthenticationApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthorizationInterceptorTest {

    @Mock
    AuthenticationApiClient authClient;

    @InjectMocks
    AuthorizationInterceptor interceptor;

    @Mock
    HttpRequest request;

    @Mock
    ClientHttpRequestExecution execution;

    @Mock
    ClientHttpResponse response;

    @Mock
    HttpHeaders headers;

    @Test
    public void shouldResponseOkWhenTokenIsValid() throws IOException {
        when(authClient.getTokens())
                .thenReturn(new AuthenticationJwt("token", "refreshToken"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(),any()))
                .thenReturn(response);
        when(response.getStatusCode())
                .thenReturn(HttpStatus.OK);

        interceptor.intercept(request, null, execution);

        verify(response,times(1)).getStatusCode();
        verify(headers).add(HttpHeaders.AUTHORIZATION,
                AuthorizationInterceptor.BEARER_TYPE +" token");
        verify(execution,times(1)).execute(any(),any());

        verify(authClient,never()).invalidateTokens();
    }

    @Test
    public void shouldReloadTokenWhenStatusIs401() throws IOException {
        when(authClient.getTokens())
                .thenReturn(new AuthenticationJwt("token", "refreshToken"))
                .thenReturn(new AuthenticationJwt("token2", "refreshToken2"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(),any()))
                .thenReturn(response);
        when(response.getStatusCode())
                .thenReturn(HttpStatus.UNAUTHORIZED);

        interceptor.intercept(request, null, execution);

        verify(response,times(1)).getStatusCode();
        verify(headers).add(HttpHeaders.AUTHORIZATION,
                AuthorizationInterceptor.BEARER_TYPE +" token");
        verify(headers).add(HttpHeaders.AUTHORIZATION,
                AuthorizationInterceptor.BEARER_TYPE +" token2");
        verify(execution,times(2)).execute(any(),any());

        verify(authClient).invalidateTokens();
    }

}