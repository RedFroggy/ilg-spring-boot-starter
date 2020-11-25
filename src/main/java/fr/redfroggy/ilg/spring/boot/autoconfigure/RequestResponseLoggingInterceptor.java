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
        response = new BufferingClientHttpResponse(response);
        logResponse(response);

        return response;
    }

    private void logRequest(HttpRequest request, byte[] body) throws IOException
    {
        log.debug(
                "=================request begin=================\n" +
                        "URI         : {}\n" +
                        "Method      : {}\n" +
                        "Headers     : {}\n" +
                        "Request body: {}\n" +
                        "=================request end================="
        ,request.getURI(), request.getMethod(), request.getHeaders(), new String(body, "UTF-8"));
    }

    private void logResponse(ClientHttpResponse response) throws IOException
    {
        log.debug(
                "=================response begin=================" + "\n" +
                        "Status code  : {}\n" +
                        "Status text  : {}\n" +
                        "Headers      : {}\n" +
                        "Response body: {}\n" +
                        "=================response end================="
                , response.getStatusCode(), response.getStatusText(), response.getHeaders()
                , StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
    }
}
