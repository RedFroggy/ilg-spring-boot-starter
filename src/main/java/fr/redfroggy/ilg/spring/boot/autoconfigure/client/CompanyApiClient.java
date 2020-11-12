package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.company.*;
import fr.redfroggy.ilg.client.model.*;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CompanyApiClient implements CompanyApi {

    private final IlgRestTemplate client;

    public CompanyApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<Availability> getAvailability(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/availability");

        return client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Availability.class);
    }

    @Override
    public ResponseEntity<CompanyProjection> getCompany(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Company.class);
    }

    @Override
    public ResponseEntity<ContactProjection> getIdentityContact(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/identity/contact");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Contact.class);
    }

    @Override
    public ResponseEntity<IdentityProjection> getIdentity(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/identity");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Identity.class);
    }

    @Override
    public ResponseEntity<ExecutiveProjection> getMandataire(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/mandataire");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Executive.class);
    }

    @Override
    public ResponseEntity<WorkforceProjection> getIdentityWorkforce(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/identity/workforce");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Workforce.class);
    }

    @Override
    public ResponseEntity<RiskProjection> getRisk(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/risk");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Risk.class);
    }

    @Override
    public ResponseEntity<ScoreProjection> getScore(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/score");

        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Score.class);
    }

    @Override
    public ResponseEntity<ExecutiveTermsProjection> getTerms(String country, String id) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/terms");

        return client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), ExecutiveTermsProjection.class);
    }

    @Override
    public ResponseEntity<ExecutiveTermsProjection> getTerms(String country, String id, TermRequest requestParam) {
        assertCountryAndId(country, id);

        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/companies/{country}/{id}/terms");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }
        return client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), ExecutiveTermsProjection.class);
    }

    private void assertCountryAndId(String country, String id) {
        Assert.hasText(country, "Cannot execute without country");
        Assert.hasText(id, "Cannot execute without id");
    }
}
