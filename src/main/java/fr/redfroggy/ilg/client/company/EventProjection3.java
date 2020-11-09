package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.time.LocalDate;

public interface EventProjection3 {
    /**
     * Ad Unique Identifier
     * @return adId
    */
    @ApiModelProperty(example = "1A10015", value = "Ad Unique Identifier")
    String getAdId();

    /**
     * Source of the Information
     * @return source
    */
    @ApiModelProperty(example = "JAL", value = "Source of the Information")
    String getSource();

    /**
     * Source of the Information
     * @return origine
    */
    @ApiModelProperty(example = "JAL", value = "Source of the Information")
    String getOrigine();

    /**
     * Event code
     * @return eventCode
    */
    @ApiModelProperty(example = "1100", value = "Event code")
    Integer getEventCode();

    /**
     * Event in human readable text
     * @return categorie
    */
    @ApiModelProperty(example = "Création d'entreprise", value = "Event in human readable text")
    String getCategorie();

    /**
     * Date when the information was published
     * @return dateParution
    */
    @ApiModelProperty(value = "Date when the information was published")

    @Valid
    LocalDate getDateParution();

    /**
     * Date when the change has happened or will happen
     * @return dateEffet
    */
    @ApiModelProperty(value = "Date when the change has happened or will happen")

    @Valid
    LocalDate getDateEffet();

    /**
     * Role of the company regarding the information
     * @return role
    */
    @ApiModelProperty(value = "Role of the company regarding the information")
    String getRole();

    /**
     * Get impact
     * @return impact
    */
    @ApiModelProperty(value = "")
    String getImpact();
}
