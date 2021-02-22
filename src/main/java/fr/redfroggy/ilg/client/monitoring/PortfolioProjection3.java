package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

public interface PortfolioProjection3 {
    /**
     * Portfolio's Id
     *
     * @return id
     */
    @ApiModelProperty(example = "2", value = "Portfolio's Id")
    Integer getId();

    /**
     * Name of the portfolio
     *
     * @return label
     */
    @ApiModelProperty(example = "Créalerte Rhône", value = "Name of the portfolio")
    String getLabel();

    /**
     * Display name of the portfolio
     *
     * @return title
     */
    @ApiModelProperty(example = "Surveillance en ligne", value = "Display name of the portfolio")
    String getTitle();

    /**
     * Type of alert (jurialerte, scorealerte…
     *
     * @return alertType
     */
    @ApiModelProperty(example = "2", value = "Type of alert (jurialerte, scorealerte…")
    AlertType getAlertType();

    /**
     * Is a machine expert portfolio
     *
     * @return matchable
     */
    @ApiModelProperty(example = "false", value = "Is a machine expert portfolio")
    Boolean getMatchable();

    /**
     * Update date of the portfolio
     *
     * @return updateDate
     */
    @ApiModelProperty(value = "Update date of the portfolio")
    LocalDate getUpdateDate();

    /**
     * Portfolio perso or not
     *
     * @return isPerso
     */
    @ApiModelProperty(value = "Portfolio perso or not")
    Boolean getIsPerso();

    /**
     * customer information
     *
     * @return customer
     */
    @ApiModelProperty(value = "customer information")
    Customer getCustomer();

    /**
     * this portfolio is editable
     *
     * @return editable
     */
    @ApiModelProperty(example = "false", value = "Is the portfolio editable")
    Boolean getEditable();
}
