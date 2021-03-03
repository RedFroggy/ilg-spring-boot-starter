package fr.redfroggy.ilg.client.monitoring;


import io.swagger.annotations.ApiParam;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class AlertRequest extends AlertPortfolioRequest {

    private final Integer entityId;

    private final String userEmail;

    private final Integer isPerso;

    private AlertRequest(AlertRequestBuilder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.userEmail = builder.userEmail;
        this.isPerso = builder.isPerso;
    }

    @ApiParam(value = "Identifiant unique représentant une entité")
    public Integer getEntityId() {
        return entityId;
    }

    @ApiParam(value = "Email de l'utilisateur")
    public String getUserEmail() {
        return userEmail;
    }

    @ApiParam(value = "Valeur de filtrage sur les portfolios perso (1) ou pro (0)", allowableValues = "0, 1")
    public Integer getIsPerso() {
        return isPerso;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        queryParams.putAll(super.toQueryParams());
        if (getEntityId() != null) {
            queryParams.add("entityId", String.valueOf(getEntityId()));
        }
        if (getUserEmail() != null) {
            queryParams.add("userEmail", getUserEmail());
        }
        if (getIsPerso() != null) {
            queryParams.add("isPerso", String.valueOf(getIsPerso()));
        }
        return queryParams;
    }


    public static AlertRequestBuilder builder() {
        return new AlertRequestBuilder();
    }

    public static final class AlertRequestBuilder extends AlertPortfolioRequestBuilder<AlertRequestBuilder> {
        private Integer entityId;
        private String userEmail;
        private Integer isPerso;

        private AlertRequestBuilder() {
            super();
        }

        public AlertRequestBuilder entityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }

        public AlertRequestBuilder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public AlertRequestBuilder isPerso(Integer isPerso) {
            this.isPerso = isPerso;
            return this;
        }

        public AlertRequest build() {
            return new AlertRequest(this);
        }
    }
}
