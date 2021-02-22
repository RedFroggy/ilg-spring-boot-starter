package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Portfolio
 */
@JsonDeserialize(builder = Portfolio.PortfolioBuilder.class)
public class Portfolio implements PortfolioProjection, PortfolioProjection2, PortfolioProjection3 {

    private final Integer id;

    private final String label;

    private final String title;

    private final AlertType alertType;

    private final PortfolioItem item;

    private final Boolean extendable;

    private final Boolean matchable;

    private final Integer type;

    private final LocalDate updateDate;

    private final Boolean isPerso;

    private final LocalDate createdAt;

    private final Customer customer;

    private final Boolean editable;

    private final Boolean deliverable;

    public Portfolio(PortfolioBuilder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.title = builder.title;
        this.alertType = builder.alertType;
        this.item = builder.item;
        this.extendable = builder.extendable;
        this.matchable = builder.matchable;
        this.type = builder.type;
        this.updateDate = builder.updateDate;
        this.isPerso = builder.isPerso;
        this.createdAt = builder.createdAt;
        this.customer = builder.customer;
        this.editable = builder.editable;
        this.deliverable = builder.deliverable;
    }

    /**
     * Portfolio's Id
     *
     * @return id
     */
    @ApiModelProperty(example = "2", value = "Portfolio's Id")
    public Integer getId() {
        return id;
    }

    /**
     * Name of the portfolio
     *
     * @return label
     */
    @ApiModelProperty(example = "Créalerte Rhône", value = "Name of the portfolio")
    public String getLabel() {
        return label;
    }

    /**
     * Display name of the portfolio
     *
     * @return title
     */
    @ApiModelProperty(example = "Surveillance en ligne", value = "Display name of the portfolio")
    public String getTitle() {
        return title;
    }

    /**
     * Type of alert (jurialerte, scorealerte…
     *
     * @return alertType
     */
    @ApiModelProperty(example = "2", value = "Type of alert (jurialerte, scorealerte…")
    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * Monitored item
     *
     * @return item
     */
    @ApiModelProperty(value = "Monitored item")
    @Override
    public PortfolioItem getItem() {
        return item;
    }

    /**
     * Extension of financial links
     *
     * @return extendable
     */
    @ApiModelProperty(example = "false", value = "Extension of financial links")
    public Boolean getExtendable() {
        return extendable;
    }

    /**
     * Is a machine expert portfolio
     *
     * @return matchable
     */
    @ApiModelProperty(example = "false", value = "Is a machine expert portfolio")
    public Boolean getMatchable() {
        return matchable;
    }

    /**
     * Portfolio type : complex, normal…
     *
     * @return type
     */
    @ApiModelProperty(example = "1", value = "Portfolio type : complex, normal…")
    public Integer getType() {
        return type;
    }

    /**
     * Update date of the portfolio
     *
     * @return updateDate
     */
    @ApiModelProperty(value = "Update date of the portfolio")
    public LocalDate getUpdateDate() {
        return updateDate;
    }

    /**
     * Portfolio perso or not 1=perso, 0=pro
     *
     * @return isPerso
     */
    @ApiModelProperty(value = "Is a personal portfolio or not: 1=perso, 0=pro")
    public Boolean getIsPerso() {
        return isPerso;
    }

    /**
     * Creation date of the portfolio
     *
     * @return createdAt
     */
    @ApiModelProperty(value = "Creation date of the portfolio")
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    /**
     * customer information
     *
     * @return customer
     */
    @ApiModelProperty(value = "customer information")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * this portfolio is editable
     *
     * @return editable
     */
    @ApiModelProperty(example = "false", value = "is the portfolio editable")
    public Boolean getEditable() {
        return editable;
    }

    /**
     * type of delivery (jurialerte or ftp)
     *
     * @return deliverable
     */
    @ApiModelProperty(example = "false", value = "type of delivery (jurialerte or ftp)")
    public Boolean getDeliverable() {
        return deliverable;
    }

    public static PortfolioBuilder builder() {
        return new PortfolioBuilder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class PortfolioBuilder {
        private Integer id;
        private String label;
        private String title;
        private AlertType alertType;
        private PortfolioItem item;
        private Boolean extendable;
        private Boolean matchable;
        private Integer type;
        private LocalDate updateDate;
        private Boolean isPerso;
        private LocalDate createdAt;
        private Customer customer;
        private Boolean editable;
        private Boolean deliverable;

        private PortfolioBuilder() {
        }

        public PortfolioBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public PortfolioBuilder label(String label) {
            this.label = label;
            return this;
        }

        public PortfolioBuilder title(String title) {
            this.title = title;
            return this;
        }

        public PortfolioBuilder alertType(AlertType alertType) {
            this.alertType = alertType;
            return this;
        }

        public PortfolioBuilder item(PortfolioItem item) {
            this.item = item;
            return this;
        }

        public PortfolioBuilder extendable(Boolean extendable) {
            this.extendable = extendable;
            return this;
        }

        public PortfolioBuilder matchable(Boolean matchable) {
            this.matchable = matchable;
            return this;
        }

        public PortfolioBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public PortfolioBuilder updateDate(LocalDate updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public PortfolioBuilder isPerso(Boolean isPerso) {
            this.isPerso = isPerso;
            return this;
        }

        public PortfolioBuilder createdAt(LocalDate createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public PortfolioBuilder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public PortfolioBuilder editable(Boolean editable) {
            this.editable = editable;
            return this;
        }

        public PortfolioBuilder deliverable(Boolean deliverable) {
            this.deliverable = deliverable;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}

