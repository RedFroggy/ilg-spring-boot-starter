package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.redfroggy.ilg.client.model.Site;
import io.swagger.annotations.ApiModelProperty;

@JsonDeserialize(as = Site.class)
public interface SiteProjection4 {
    /**
     * Identifier for an establishment
     *
     * @return id
     */
    @ApiModelProperty(example = "12345678900129", value = "Identifier for an establishment")
    String getId();

    /**
     * Identifier for the company owning the establishment
     *
     * @return companyId
     */
    @ApiModelProperty(example = "123456789", value = "Identifier for the company owning the establishment")
    String getCompanyId();

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
     * Name of the establishment
     *
     * @return name
     */
    @ApiModelProperty(example = "Great Company", value = "Name of the establishment")
    String getName();

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
    AddressProjection13 getAddress();

    /**
     * Get company
     *
     * @return company
     */
    @ApiModelProperty(value = "")
    CompanyProjection5 getCompany();
}
