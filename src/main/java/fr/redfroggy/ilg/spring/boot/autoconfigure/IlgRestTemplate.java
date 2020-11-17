package fr.redfroggy.ilg.spring.boot.autoconfigure;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

@Service
public class IlgRestTemplate extends RestTemplate {

    public final String COMPANY_URI = "/companies/{country}/{id}";

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final IlgProperties properties;
    private final ObjectMapper mapper;

    public IlgRestTemplate(AuthorizationInterceptor authorizationInterceptor, IlgProperties properties, ObjectMapper mapper) {
        super();
        setRequestFactory(new BufferingClientHttpRequestFactory(getRequestFactory()));

        getInterceptors().add(authorizationInterceptor);
        if (properties.isDebugging()) {
            getInterceptors().add(new RequestResponseLoggingInterceptor());
        }

        this.properties = properties;
        this.mapper = mapper;
    }

    public String getBaseUrl() {
        return properties.getUrl();
    }

    /**
     * Build Uri with base url + company uri + custom uri
     * Example: http://ilg.fr/companies/{country}/{id}/uri
     * @param uri custom uri
     * @return uri builer
     */
    public UriComponentsBuilder absoluteCompanyUriBuilder(String uri) {
        return absoluteUriBuilder(COMPANY_URI+uri);
    }

    public UriComponentsBuilder absoluteUriBuilder(String uri) {
        return UriComponentsBuilder
                .fromUriString(properties.getUrl()+uri);
    }

    public <T> ResponseEntity<T> postFormData(URI url,  Object formData, Class<T> responseType) {
        LinkedMultiValueMap mapFormData = new LinkedMultiValueMap();
        mapFormData.setAll(mapper.convertValue(formData, Map.class));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));

        HttpEntity request = new HttpEntity(mapFormData, headers);

        return this.postForEntity(url, request, responseType);
    }
}
