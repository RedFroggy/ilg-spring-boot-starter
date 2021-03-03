package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.ApiParam;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlertPortfolioRequest {

    @ApiParam(value = "Date de début de recherche de parution des alertes (format yyyy-mm-dd)")
    private final LocalDate alertMinDate;

    @ApiParam(value = "Date de fin de recherche de parution des alertes (format yyyy-mm-dd)")
    private final LocalDate alertMaxDate;

    @ApiParam(value = "Enum sur la source de l’alerte, Available values : BOD, JAL, PRE, RPC, SIR, TCO", allowableValues = "BOD, JAL, PRE, RPC, SIR, TCO")
    private final AlertSource source;

    private final PageableRequest pageable;

    protected AlertPortfolioRequest(AlertPortfolioRequestBuilder builder) {
        this.alertMinDate = builder.alertMinDate;
        this.alertMaxDate = builder.alertMaxDate;
        this.source = builder.source;
        this.pageable = builder.pageable;
    }

    public static AlertPortfolioRequestBuilder builder() {
        return new AlertPortfolioRequestBuilder();
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (alertMinDate != null) {
            queryParams.add("alertMinDate", alertMinDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (alertMaxDate != null) {
            queryParams.add("alertMaxDate", alertMaxDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (source != null) {
            queryParams.add("source[]", source.name());
        }

        if (pageable != null) {
            queryParams.putAll(pageable.toQueryParams());
        }
        return queryParams;
    }

    public static class AlertPortfolioRequestBuilder<T extends  AlertPortfolioRequestBuilder> {
        private LocalDate alertMinDate;
        private LocalDate alertMaxDate;
        private AlertSource source;
        private PageableRequest pageable;

        protected AlertPortfolioRequestBuilder() {
        }

        public T alertMinDate(LocalDate alertMinDate) {
            this.alertMinDate = alertMinDate;
            return (T)this;
        }

        public T alertMaxDate(LocalDate alertMaxDate) {
            this.alertMaxDate = alertMaxDate;
            return (T)this;
        }

        public T source(AlertSource source) {
            this.source = source;
            return (T)this;
        }

        public T pageable(PageableRequest pageable) {
            this.pageable = pageable;
            return (T)this;
        }

        public AlertPortfolioRequest build() {
            return new AlertPortfolioRequest(this);
        }
    }
}
