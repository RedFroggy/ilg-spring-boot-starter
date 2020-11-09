package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.time.LocalDate;

public interface SiteProjection5 {
    /**
     * Fiscal registration Identifier
     *
     * @return registrationId
     */
    @ApiModelProperty(example = "12345678900129", value = "Fiscal registration Identifier")
    String getRegistrationId();

    /**
     * Establishment number
     *
     * @return siteNumber
     */
    @ApiModelProperty(example = "00129", value = "Establishment number")
    String getSiteNumber();

    /**
     * Commercial Name of the establishment
     *
     * @return commercialName
     */
    @ApiModelProperty(example = "World Aware", value = "Commercial Name of the establishment")
    String getCommercialName();

    /**
     * Trading Name of the establishment
     *
     * @return tradings
     */
    @ApiModelProperty(example = "GC Information", value = "Trading Name of the establishment")
    String getTradings();

    /**
     * Whether the establishment is active or not
     *
     * @return status
     */
    @ApiModelProperty(example = "true", value = "Whether the establishment is active or not")
    Boolean getStatus();

    /**
     * When the establishment opened
     *
     * @return creationDate
     */
    @ApiModelProperty(value = "When the establishment opened")

    @Valid
    LocalDate getCreationDate();

    /**
     * When the establishment closed (if status=false)
     *
     * @return closingDate
     */
    @ApiModelProperty(value = "When the establishment closed (if status=false)")

    @Valid
    LocalDate getClosingDate();

    /**
     * Whether the establishment is headquarter or not
     *
     * @return isHeadquarter
     */
    @ApiModelProperty(example = "true", value = "Whether the establishment is headquarter or not")
    Boolean getIsHeadquarter();

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    @Valid
    AddressProjection17 getAddress();

    /**
     * Get workforce
     *
     * @return workforce
     */
    @ApiModelProperty(value = "")

    @Valid
    WorkforceProjection4 getWorkforce();
}
