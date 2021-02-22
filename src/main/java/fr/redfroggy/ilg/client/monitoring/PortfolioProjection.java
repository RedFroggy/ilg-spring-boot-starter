package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

@JsonDeserialize(as = Portfolio.class)
public interface PortfolioProjection {
    /**
     * Portfolio's Id
     * @return id
    */
    @ApiModelProperty(example = "2", value = "Portfolio's Id")
    Integer getId();

    /**
     * Name of the portfolio
     * @return label
    */
    @ApiModelProperty(example = "Créalerte Rhône", value = "Name of the portfolio")
    String getLabel();

    /**
     * Display name of the portfolio
     * @return title
    */
    @ApiModelProperty(example = "Surveillance en ligne", value = "Display name of the portfolio")
    String getTitle();

    /**
     * Type of alert (jurialerte, scorealerte…
     * @return alertType
    */
    @ApiModelProperty(example = "2", value = "Type of alert (jurialerte, scorealerte…")
    AlertType getAlertType();

    /**
     * Extension of financial links
     * @return extendable
    */
    @ApiModelProperty(example = "false", value = "Extension of financial links")
    Boolean getExtendable();

    /**
     * Is a machine expert portfolio
     * @return matchable
    */
    @ApiModelProperty(example = "false", value = "Is a machine expert portfolio")
    Boolean getMatchable();

    /**
     * Portfolio type : complex, normal…
     * @return type
    */
    @ApiModelProperty(example = "1", value = "Portfolio type : complex, normal…")
    Integer getType();

    /**
     * Update date of the portfolio
     * @return updateDate
    */
    @ApiModelProperty(value = "Update date of the portfolio")
    LocalDate getUpdateDate();

    /**
     * Creation date of the portfolio
     * @return createdAt
    */
    @ApiModelProperty(value = "Creation date of the portfolio")
    LocalDate getCreatedAt();

    /**
     * Portfolio perso or not
     *
     * @return isPerso
     */
    @ApiModelProperty(value = "Is a personal portfolio or not")
    Boolean getIsPerso();


    /**
     * customer information
     * @return customer
    */
    @ApiModelProperty(value = "customer information")
    Customer getCustomer();

    /**
     * this portfolio is editable
     * @return editable
    */
    @ApiModelProperty(example = "false", value = "is the portfolio editable")
    Boolean getEditable();

    /**
     * type of delivery (jurialerte or ftp)
     *
     * @return deliverable
     */
    @ApiModelProperty(example = "false", value = "type of delivery (jurialerte or ftp)")
    Boolean getDeliverable();
}
