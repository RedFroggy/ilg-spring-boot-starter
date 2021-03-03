package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.ApiParam;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PortfolioItemRequest {

    private final PageableRequest pageable;
    private final Integer customCode;
    private final Integer eventCode;
    private final Integer siren;
    private final String cname;
    private final Integer ilgScoreOrigin;
    private final Integer customCreditMin;
    private final Integer customCreditMax;
    private final Integer portfolio;
    private final String userEmail;
    private final LocalDate monitoringStartDateMin;
    private final LocalDate monitoringStartDateMax;
    private final LocalDate creationDateMin;
    private final LocalDate creationDateMax;

    protected PortfolioItemRequest(PortfolioItemRequestBuilder builder) {
        this.pageable = builder.pageable;
        this.customCode = builder.customCode;
        this.eventCode = builder.eventCode;
        this.siren = builder.siren;
        this.cname = builder.cname;
        this.ilgScoreOrigin = builder.ilgScoreOrigin;
        this.customCreditMin = builder.customCreditMin;
        this.customCreditMax = builder.customCreditMax;
        this.portfolio = builder.portfolio;
        this.userEmail = builder.userEmail;
        this.monitoringStartDateMin = builder.monitoringStartDateMin;
        this.monitoringStartDateMax = builder.monitoringStartDateMax;
        this.creationDateMin = builder.creationDateMin;
        this.creationDateMax = builder.creationDateMax;
    }

    public PageableRequest getPageable() {
        return pageable;
    }

    @ApiParam(value = "Filter for a custom code")
    public Integer getCustomCode() {
        return customCode;
    }
    @ApiParam(value = "Filter for the event code")
    public Integer getEventCode() {
        return eventCode;
    }
    @ApiParam(value = "Filter for a siren")
    public Integer getSiren() {
        return siren;
    }
    @ApiParam(value = "Search text in company name")
    public String getCname() {
        return cname;
    }
    @ApiParam(value = "Filter for a origin score")
    public Integer getIlgScoreOrigin() {
        return ilgScoreOrigin;
    }
    @ApiParam(value = "Filter for a custom credit min")
    public Integer getCustomCreditMin() {
        return customCreditMin;
    }
    @ApiParam(value = "Filter for a custom credit max")
    public Integer getCustomCreditMax() {
        return customCreditMax;
    }
    @ApiParam(value = "List of monitoring for a portfolio")
    public Integer getPortfolio() {
        return portfolio;
    }
    @ApiParam(value = "List of monitoring for a user")
    public String getUserEmail() {
        return userEmail;
    }
    @ApiParam(value = "Filter for a start date of monitoring min (YYYY-MM-DD)")
    public LocalDate getMonitoringStartDateMin() {
        return monitoringStartDateMin;
    }
    @ApiParam(value = "Filter for a start date of monitoring max (YYYY-MM-DD)")
    public LocalDate getMonitoringStartDateMax() {
        return monitoringStartDateMax;
    }
    @ApiParam(value = "Filter for a creation date of monitoring min (YYYY-MM-DD)")
    public LocalDate getCreationDateMin() {
        return creationDateMin;
    }
    @ApiParam(value = "Filter for a creation date of monitoring max (YYYY-MM-DD)")
    public LocalDate getCreationDateMax() {
        return creationDateMax;
    }

    public static PortfolioItemRequestBuilder builder() {
        return new PortfolioItemRequestBuilder();
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (getPageable() != null) {
            queryParams.putAll(getPageable().toQueryParams());
        }
        if (getCustomCode() != null) {
            queryParams.add("customCode", String.valueOf(getCustomCode()));
        }
        if (getEventCode() != null) {
            queryParams.add("eventCode", String.valueOf(getEventCode()));
        }
        if (getSiren() != null) {
            queryParams.add("siren", String.valueOf(getSiren()));
        }
        if (getCname() != null) {
            queryParams.add("cname", getCname());
        }
        if (getIlgScoreOrigin() != null) {
            queryParams.add("ilgScoreOrigin", String.valueOf(getIlgScoreOrigin()));
        }
        if (getCustomCreditMin() != null) {
            queryParams.add("customCredit[min]", String.valueOf(getCustomCreditMin()));
        }
        if (getCustomCreditMax() != null) {
            queryParams.add("customCredit[max]", String.valueOf(getCustomCreditMax()));
        }
        if (getPortfolio() != null) {
            queryParams.add("portfolio", String.valueOf(getPortfolio()));
        }
        if (getUserEmail() != null) {
            queryParams.add("userEmail", getUserEmail());
        }
        if (getMonitoringStartDateMin() != null) {
            queryParams.add("monitoringStartDate[min]", getMonitoringStartDateMin()
                    .format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (getMonitoringStartDateMax() != null) {
            queryParams.add("monitoringStartDate[max]", getMonitoringStartDateMax()
                    .format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (getCreationDateMin() != null) {
            queryParams.add("creationDate[min]", getCreationDateMin()
                    .format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (getCreationDateMax() != null) {
            queryParams.add("creationDate[max]", getCreationDateMax()
                    .format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        return queryParams;
    }

    public static final class PortfolioItemRequestBuilder {
        private PageableRequest pageable;
        private Integer customCode;
        private Integer eventCode;
        private Integer siren;
        private String cname;
        private Integer ilgScoreOrigin;
        private Integer customCreditMin;
        private Integer customCreditMax;
        private Integer portfolio;
        private String userEmail;
        private LocalDate monitoringStartDateMin;
        private LocalDate monitoringStartDateMax;
        private LocalDate creationDateMin;
        private LocalDate creationDateMax;

        private PortfolioItemRequestBuilder() {
        }

        public PortfolioItemRequestBuilder pageable(PageableRequest pageable) {
            this.pageable = pageable;
            return this;
        }

        public PortfolioItemRequestBuilder customCode(Integer customCode) {
            this.customCode = customCode;
            return this;
        }

        public PortfolioItemRequestBuilder eventCode(Integer eventCode) {
            this.eventCode = eventCode;
            return this;
        }

        public PortfolioItemRequestBuilder siren(Integer siren) {
            this.siren = siren;
            return this;
        }

        public PortfolioItemRequestBuilder cname(String cname) {
            this.cname = cname;
            return this;
        }

        public PortfolioItemRequestBuilder ilgScoreOrigin(Integer ilgScoreOrigin) {
            this.ilgScoreOrigin = ilgScoreOrigin;
            return this;
        }

        public PortfolioItemRequestBuilder customCreditMin(Integer customCreditMin) {
            this.customCreditMin = customCreditMin;
            return this;
        }

        public PortfolioItemRequestBuilder customCreditMax(Integer customCreditMax) {
            this.customCreditMax = customCreditMax;
            return this;
        }

        public PortfolioItemRequestBuilder portfolio(Integer portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public PortfolioItemRequestBuilder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public PortfolioItemRequestBuilder monitoringStartDateMin(LocalDate monitoringStartDateMin) {
            this.monitoringStartDateMin = monitoringStartDateMin;
            return this;
        }

        public PortfolioItemRequestBuilder monitoringStartDateMax(LocalDate monitoringStartDateMax) {
            this.monitoringStartDateMax = monitoringStartDateMax;
            return this;
        }

        public PortfolioItemRequestBuilder creationDateMin(LocalDate creationDateMin) {
            this.creationDateMin = creationDateMin;
            return this;
        }

        public PortfolioItemRequestBuilder creationDateMax(LocalDate creationDateMax) {
            this.creationDateMax = creationDateMax;
            return this;
        }

        public PortfolioItemRequest build() {
            return new PortfolioItemRequest(this);
        }
    }
}
