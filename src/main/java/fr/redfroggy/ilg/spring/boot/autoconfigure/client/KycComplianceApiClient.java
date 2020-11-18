package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.kyc.KycComplianceApi;
import fr.redfroggy.ilg.client.kyc.KycUboProjection;
import fr.redfroggy.ilg.client.model.KycUbo;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class KycComplianceApiClient implements KycComplianceApi {

    private final IlgRestTemplate client;

    public KycComplianceApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<KycUboProjection> getKycUbo(String country, String id) {
        return (ResponseEntity) client.getForCompanyEntity(country, id, "/kyc/ubo", KycUbo.class);
    }
}
