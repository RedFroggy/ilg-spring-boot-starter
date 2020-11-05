package fr.redfroggy.ilg.spring.boot.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException
    {
        if (!log.isDebugEnabled())
        {
            return execution.execute(request, body);
        }
        logRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        logResponse(response);

        return response;
    }

    private void logRequest(HttpRequest request, byte[] body) throws IOException
    {
        log.debug(
                "=================request begin=================\n" +
                        "URI         : {}", request.getURI() + "\n" +
                        "Method      : {}", request.getMethod() + "\n" +
                        "Headers     : {}", request.getHeaders() + "\n" +
                        "Request body: {}", new String(body, "UTF-8")+ "\n" +
                        "=================request end================="
        );
    }

    private void logResponse(ClientHttpResponse response) throws IOException
    {
        log.debug(
                "=================response begin=================" + "\n" +
                        "Status code  : {}", response.getStatusCode()+ "\n" +
                        "Status text  : {}", response.getStatusText()+ "\n" +
                        "Headers      : {}", response.getHeaders()+ "\n" +
                        "Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset())+ "\n" +
                        "=================response end================="
        );
    }
}
