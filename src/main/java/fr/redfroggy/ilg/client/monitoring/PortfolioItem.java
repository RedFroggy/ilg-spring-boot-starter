package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@JsonDeserialize(builder = PortfolioItem.PortfolioItemBuilder.class)
public class PortfolioItem implements Serializable, PortfolioItemProjection2 {
    private final static long serialVersionUID = 1L;

    private final Integer id;
    private final Integer siren;
    private final String companyName;
    private final String customCode;
    private final Integer customCredit;
    private final LocalDate monitoringStartDate;
    private final Object portfolio;
    private final List<Object> links;

    public PortfolioItem(PortfolioItemBuilder builder) {
        this.id = builder.id;
        this.siren = builder.siren;
        this.companyName = builder.companyName;
        this.customCode = builder.customCode;
        this.customCredit = builder.customCredit;
        this.monitoringStartDate = builder.monitoringStartDate;
        this.portfolio = builder.portfolio;
        this.links = builder.links;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Integer getSiren() {
        return siren;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCustomCode() {
        return customCode;
    }

    @Override
    public Integer getCustomCredit() {
        return customCredit;
    }

    public LocalDate getMonitoringStartDate() {
        return monitoringStartDate;
    }

    public Object getPortfolio() {
        return portfolio;
    }

    public List<Object> getLinks() {
        return links;
    }

    public static PortfolioItemBuilder builder() {
        return new PortfolioItemBuilder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class PortfolioItemBuilder {
        private Integer id;
        private Integer siren;
        private String companyName;
        private String customCode;
        private Integer customCredit;
        private LocalDate monitoringStartDate;
        private Object portfolio;
        private List<Object> links;

        private PortfolioItemBuilder() {
        }

        public PortfolioItemBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public PortfolioItemBuilder siren(Integer siren) {
            this.siren = siren;
            return this;
        }

        public PortfolioItemBuilder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public PortfolioItemBuilder customCode(String customCode) {
            this.customCode = customCode;
            return this;
        }

        public PortfolioItemBuilder customCredit(Integer customCredit) {
            this.customCredit = customCredit;
            return this;
        }

        public PortfolioItemBuilder monitoringStartDate(LocalDate monitoringStartDate) {
            this.monitoringStartDate = monitoringStartDate;
            return this;
        }

        public PortfolioItemBuilder portfolio(Object portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public PortfolioItemBuilder links(List<Object> links) {
            this.links = links;
            return this;
        }

        public PortfolioItem build() {
            return new PortfolioItem(this);
        }
    }
}