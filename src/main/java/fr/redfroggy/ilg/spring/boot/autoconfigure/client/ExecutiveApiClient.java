package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.executive.ExecutiveApi;
import fr.redfroggy.ilg.client.executive.ExecutiveRequest;
import fr.redfroggy.ilg.client.executive.ExecutivesProjection2;
import fr.redfroggy.ilg.client.model.Executives;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ExecutiveApiClient implements ExecutiveApi {

    private final IlgRestTemplate client;

    public ExecutiveApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    private void assertCountryAndId(String country, String id) {
        Assert.hasText(country, "Cannot execute without country");
        Assert.hasText(id, "Cannot execute without id");
    }

    @Override
    public ResponseEntity<ExecutivesProjection2> getExecutivesTerms(String country, String id,
                                                                    ExecutiveRequest requestParam) {
        assertCountryAndId(country, id);
        UriComponentsBuilder uriBuilder = client.absoluteCompanyUriBuilder("/executives/terms");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Executives.class);
    }

    @Override
    public ResponseEntity<ExecutivesProjection2> getExecutivesTerms(String country, String id) {
        return getExecutivesTerms(country, id, null);
    }
}
