package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.monitoring.AlertSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "ilg.monitoring-alert")
@Validated
public class MonitoringAlertProperties {

    private Integer portfolioId;

    private final Request alertRequest = new Request();

    @NotNull
    public Integer getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Integer portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Request getAlertRequest() {
        return alertRequest;
    }

    public class Request {

        private AlertSource source;

        private String sort = "adId";

        private Sorting.Direction order = Sorting.Direction.ASC;

        private Integer pageNumber = 50;

        public AlertSource getSource() {
            return source;
        }

        public void setSource(AlertSource source) {
            this.source = source;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public Sorting.Direction getOrder() {
            return order;
        }

        public void setOrder(Sorting.Direction order) {
            this.order = order;
        }

        public Integer getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
        }
    }
}
