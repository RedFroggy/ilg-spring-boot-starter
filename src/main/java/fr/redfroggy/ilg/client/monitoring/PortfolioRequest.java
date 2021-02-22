package fr.redfroggy.ilg.client.monitoring;

import fr.redfroggy.ilg.client.PageRequest;
import io.swagger.annotations.ApiParam;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PortfolioRequest {

    private final Integer entityId;

    private final String userEmail;

    private final String label;

    private final AlertType alertType;

    private final Integer isPerso;

    private final LocalDate updateDateMin;

    private final LocalDate updateDateMax;

    private final Integer audit;

    private final Integer editable;

    private final PageRequest page;

    private final MonitoringSorting sort;

    protected PortfolioRequest(PortfolioRequestBuilder builder) {
        this.alertType = builder.alertType;
        this.editable = builder.editable;
        this.updateDateMin = builder.updateDateMin;
        this.updateDateMax = builder.updateDateMax;
        this.userEmail = builder.userEmail;
        this.entityId = builder.entityId;
        this.isPerso = builder.isPerso;
        this.audit = builder.audit;
        this.label = builder.label;
        this.page = builder.page;
        this.sort = builder.sort;
    }

    @ApiParam(value = "part of name of the portfolio")
    public String getLabel() {
        return label;
    }

    @ApiParam(value = "type of of alert 4=juri, 8=score, 12=juri+score (ex: alertType[]=4&alertType[]=12)")
    public AlertType getAlertType() {
        return alertType;
    }

    @ApiParam(value = "update date min YYYY-MM-DD")
    public LocalDate getUpdateDateMin() {
        return updateDateMin;
    }

    @ApiParam(value = "update date max YYYY-MM-DD")
    public LocalDate getUpdateDateMax() {
        return updateDateMax;
    }

    @ApiParam(value = "Portfolio auditable or not 1 or 0")
    public Integer getAudit() {
        return audit;
    }

    @ApiParam(value = "Portfolio is editable or not 1 or 0")
    public Integer getEditable() {
        return editable;
    }

    @ApiParam(value = "Unique identifier representing a entity")
    public Integer getEntityId() {
        return entityId;
    }

    @ApiParam(value = "Email of user")
    public String getUserEmail() {
        return userEmail;
    }

    @ApiParam(value = "Portfolio perso or not 1=perso, 0=pro")
    public Integer getIsPerso() {
        return isPerso;
    }


    public PageRequest getPage() {
        return page;
    }

    public MonitoringSorting getSort() {
        return sort;
    }

    public static PortfolioRequestBuilder builder() {
        return new PortfolioRequestBuilder();
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (getEntityId() != null) {
            queryParams.add("entityId", String.valueOf(getEntityId()));
        }
        if (getUserEmail() != null) {
            queryParams.add("userEmail", getUserEmail());
        }
        if (getIsPerso() != null) {
            queryParams.add("isPerso", String.valueOf(getIsPerso()));
        }
        if (getLabel() != null) {
            queryParams.add("label", getLabel());
        }
        if (getUpdateDateMin() != null) {
            queryParams.add("updateDate[min]", getUpdateDateMin().format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (getUpdateDateMax() != null) {
            queryParams.add("updateDate[max]", getUpdateDateMax().format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (getAlertType() != null) {
            queryParams.add("alertType[]", getAlertType().toString());
        }
        if (getAudit() != null) {
            queryParams.add("audit", String.valueOf(getAudit()));
        }
        if (getEditable() != null) {
            queryParams.add("editable", String.valueOf(getEditable()));
        }
        if (getPage() != null) {
            queryParams.putAll(getPage().toQueryParams());
        }
        if (getSort() != null) {
            queryParams.putAll(getSort().toQueryParams());
        }
        return queryParams;
    }

    public static final class PortfolioRequestBuilder {
        private Integer entityId;
        private String userEmail;
        private String label;
        private AlertType alertType;
        private Integer isPerso;
        private LocalDate updateDateMin;
        private LocalDate updateDateMax;
        private Integer audit;
        private Integer editable;
        private PageRequest page;
        private MonitoringSorting sort;

        private PortfolioRequestBuilder() {
        }

        public static PortfolioRequestBuilder aPortfolioRequest() {
            return new PortfolioRequestBuilder();
        }

        public PortfolioRequestBuilder entityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }

        public PortfolioRequestBuilder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public PortfolioRequestBuilder label(String label) {
            this.label = label;
            return this;
        }

        public PortfolioRequestBuilder alertType(AlertType alertType) {
            this.alertType = alertType;
            return this;
        }

        public PortfolioRequestBuilder isPerso(Integer isPerso) {
            this.isPerso = isPerso;
            return this;
        }

        public PortfolioRequestBuilder updateDateMin(LocalDate updateDateMin) {
            this.updateDateMin = updateDateMin;
            return this;
        }

        public PortfolioRequestBuilder updateDateMax(LocalDate updateDateMax) {
            this.updateDateMax = updateDateMax;
            return this;
        }

        public PortfolioRequestBuilder audit(Integer audit) {
            this.audit = audit;
            return this;
        }

        public PortfolioRequestBuilder editable(Integer editable) {
            this.editable = editable;
            return this;
        }

        public PortfolioRequestBuilder page(PageRequest page) {
            this.page = page;
            return this;
        }

        public PortfolioRequestBuilder sort(MonitoringSorting sort) {
            this.sort = sort;
            return this;
        }

        public PortfolioRequest build() {
            return new PortfolioRequest(this);
        }
    }
}
