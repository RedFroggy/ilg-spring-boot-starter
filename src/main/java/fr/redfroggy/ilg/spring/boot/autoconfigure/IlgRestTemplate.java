package fr.redfroggy.ilg.spring.boot.autoconfigure;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

@Service
public class IlgRestTemplate extends RestTemplate {

    public final String COMPANY_URI = "/companies/{country}/{id}";

    private final IlgProperties properties;
    private final ObjectMapper mapper;

    public IlgRestTemplate(AuthorizationInterceptor authorizationInterceptor, IlgProperties properties) {
        super();

        getInterceptors().add(authorizationInterceptor);
        if (properties.isDebugging()) {
            getInterceptors().add(new RequestResponseLoggingInterceptor());
        }

        this.properties = properties;

        MappingJackson2HttpMessageConverter httpMessageConverter = (MappingJackson2HttpMessageConverter)
                this.getMessageConverters()
                .stream()
                .filter(converter -> converter instanceof MappingJackson2HttpMessageConverter)
                .findFirst()
                .orElse(new MappingJackson2HttpMessageConverter());

        this.mapper = httpMessageConverter.getObjectMapper()
                .enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        httpMessageConverter.setObjectMapper(this.mapper);
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

    public void assertCountryAndId(String country, String id) {
        Assert.hasText(country, "Cannot execute without country");
        Assert.hasText(id, "Cannot execute without id");
    }

    public <T> ResponseEntity<T> getForCompanyEntity(String country, String id, String uri, Class<T> responseType) {
        assertCountryAndId(country, id);
        UriComponentsBuilder uriBuilder = this.absoluteCompanyUriBuilder(uri);

        return this.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), responseType);
    }

    @Override
    protected <T> T doExecute(URI url, HttpMethod method, RequestCallback requestCallback, ResponseExtractor<T> responseExtractor) throws RestClientException {
        try {
            return super.doExecute(url, method, requestCallback, responseExtractor);
        } catch (HttpClientErrorException.NotFound e) {
            if (!properties.isDecode404()) {
                throw e;
            }
            if (responseExtractor instanceof HttpMessageConverterExtractor) {
                return null;
            }
            return (T) ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).build();
        }
    }
}
