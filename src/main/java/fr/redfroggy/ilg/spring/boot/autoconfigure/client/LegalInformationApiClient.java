package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.legalinformation.Legal;
import fr.redfroggy.ilg.client.legalinformation.LegalDepositList;
import fr.redfroggy.ilg.client.legalinformation.LegalInformationApi;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;

@Service
public class LegalInformationApiClient implements LegalInformationApi {

    private final IlgRestTemplate client;

    public LegalInformationApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<Void> downloadLegalDeposit(String country, String id, String depositId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<LegalDepositList> getLegalDeposits(String country, String id) {
        assertCountryAndId(country, id);
        UriComponentsBuilder uriBuilder = client.absoluteCompanyUriBuilder("/legal/deposits");

        return client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), LegalDepositList.class);
    }

    @Override
    public ResponseEntity<Legal> getLegal(String country, String id, Sorting sorting) {
        assertCountryAndId(country, id);
        UriComponentsBuilder uriBuilder = client.absoluteCompanyUriBuilder("/legal");
        if (sorting != null) {
            uriBuilder.queryParams(sorting.toQueryParams());
        }
        return client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Legal.class);
    }

    @Override
    public ResponseEntity<Void> downloadLegalStatus(String country, String id, LocalDate date) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    private void assertCountryAndId(String country, String id) {
        Assert.hasText(country, "Cannot execute without country");
        Assert.hasText(id, "Cannot execute without id");
    }
}
