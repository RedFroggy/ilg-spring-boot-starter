package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * Alert
 */
@JsonDeserialize(builder = Alert.AlertBuilder.class)
public class Alert {
    private final String adId;

    private final AlertSource source;

    private final String name;

    private final LocalDate parutionDate;

    private final LocalDate creationDate;

    private final Integer siren;

    private final String urlEvent;

    private final List<AlertPortfolioItem> portfolioItems;

    private Alert(AlertBuilder builder) {
        this.adId = builder.adId;
        this.source = builder.source;
        this.name = builder.name;
        this.parutionDate = builder.parutionDate;
        this.creationDate = builder.creationDate;
        this.siren = builder.siren;
        this.urlEvent = builder.urlEvent;
        this.portfolioItems = builder.portfolioItems;
    }

    /**
     * Get adId
     *
     * @return adId
     **/
    public String getAdId() {
        return adId;
    }

    /**
     * Get source
     *
     * @return source
     **/
    public AlertSource getSource() {
        return source;
    }

    /**
     * Get name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    /**
     * Get parutionDate
     *
     * @return parutionDate
     **/
    public LocalDate getParutionDate() {
        return parutionDate;
    }

    /**
     * Get creationDate
     *
     * @return creationDate
     **/
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Get siren
     *
     * @return siren
     **/
    public Integer getSiren() {
        return siren;
    }

    /**
     * Get urlEvent
     *
     * @return urlEvent
     **/
    public String getUrlEvent() {
        return urlEvent;
    }

    /**
     * Get portfolioItems
     *
     * @return portfolioItems
     **/
    public List<AlertPortfolioItem> portfolioItems() {
        return portfolioItems;
    }

    public static AlertBuilder builder() {
        return new AlertBuilder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class AlertBuilder {
        private String adId;
        private AlertSource source;
        private String name;
        private LocalDate parutionDate;
        private LocalDate creationDate;
        private Integer siren;
        private String urlEvent;
        private List<AlertPortfolioItem> portfolioItems;

        private AlertBuilder() {
        }

        public AlertBuilder adId(String adId) {
            this.adId = adId;
            return this;
        }

        public AlertBuilder source(AlertSource source) {
            this.source = source;
            return this;
        }

        public AlertBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AlertBuilder parutionDate(LocalDate parutionDate) {
            this.parutionDate = parutionDate;
            return this;
        }

        public AlertBuilder creationDate(LocalDate creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public AlertBuilder siren(Integer siren) {
            this.siren = siren;
            return this;
        }

        public AlertBuilder urlEvent(String urlEvent) {
            this.urlEvent = urlEvent;
            return this;
        }

        public AlertBuilder portfolioItems(List<AlertPortfolioItem> portfolioItems) {
            this.portfolioItems = portfolioItems;
            return this;
        }

        public Alert build() {
            return new Alert(this);
        }
    }
}
