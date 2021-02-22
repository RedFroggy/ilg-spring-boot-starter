package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

public interface SiteProjection {
    /**
     * Identifier for an establishment
     * @return id
    */
    @ApiModelProperty(example = "12345678900129", value = "Identifier for an establishment")
    String getId();

    /**
     * Identifier for the company owning the establishment
     * @return companyId
    */
    @ApiModelProperty(example = "123456789", value = "Identifier for the company owning the establishment")
    String getCompanyId();

    /**
     * Fiscal registration Identifier
     * @return registrationId
    */
    @ApiModelProperty(example = "12345678900129", value = "Fiscal registration Identifier")
    String getRegistrationId();

    /**
     * Establishment number
     * @return siteNumber
    */
    @ApiModelProperty(example = "00129", value = "Establishment number")
    String getSiteNumber();

    /**
     * Name of the establishment
     * @return name
    */
    @ApiModelProperty(example = "Great Company", value = "Name of the establishment")
    String getName();

    /**
     * Commercial Name of the establishment
     * @return commercialName
    */
    @ApiModelProperty(example = "World Aware", value = "Commercial Name of the establishment")
    String getCommercialName();

    /**
     * Trading Name of the establishment
     * @return tradings
    */
    @ApiModelProperty(example = "GC Information", value = "Trading Name of the establishment")
    String getTradings();

    /**
     * Acronym of the establishment
     * @return sigle
    */
    @ApiModelProperty(example = "G.C.W.A.", value = "Acronym of the establishment")
    String getSigle();

    /**
     * Whether the establishment is active or not
     * @return status
    */
    @ApiModelProperty(example = "true", value = "Whether the establishment is active or not")
    Boolean getStatus();

    /**
     * When the establishment opened
     * @return creationDate
    */
    @ApiModelProperty(value = "When the establishment opened")

    @Valid
    LocalDate getCreationDate();

    /**
     * When the establishment closed (if status=false)
     * @return closingDate
    */
    @ApiModelProperty(value = "When the establishment closed (if status=false)")

    @Valid
    LocalDate getClosingDate();

    /**
     * Whether the establishment is headquarter or not
     * @return isHeadquarter
    */
    @ApiModelProperty(example = "true", value = "Whether the establishment is headquarter or not")
    Boolean getIsHeadquarter();

    /**
     * Get address
     * @return address
    */
    @ApiModelProperty(value = "")

    @Valid
    AddressProjection2 getAddress();

    /**
     * Get headquarter
     * @return headquarter
    */
    @ApiModelProperty(value = "")
    @Valid
    SiteProjection getHeadquarter();

    /**
     * Get workforce
     * @return workforce
    */
    @ApiModelProperty(value = "")

    @Valid
    WorkforceProjection2 getWorkforce();

    /**
     * Get activity
     * @return activity
    */
    @ApiModelProperty(value = "")

    @Valid
    CodeLabelPairProjection2 getActivity();

    /**
     * Get company
     * @return company
    */
    @ApiModelProperty(value = "")

    @Valid
    CompanyProjection4 getCompany();

    /**
     * Size of urban unit
     * @return tailleUniteUrbaine
    */
    @ApiModelProperty(value = "Size of urban unit")
    Integer getTailleUniteUrbaine();

    /**
     * Range size of city where the establishment is located
     * @return trancheCommune
    */
    @ApiModelProperty(example = "10000 - 100000", value = "Range size of city where the establishment is located")
    String getTrancheCommune();

    /**
     * à compléter
     * @return lieuActivite
    */
    @ApiModelProperty(value = "à compléter")
    String getLieuActivite();

    /**
     * à compléter
     * @return surface
    */
    @ApiModelProperty(value = "à compléter")
    String getSurface();

    /**
     * INSEE origin
     * @return origine
    */
    @ApiModelProperty(example = "Création", value = "INSEE origin")
    String getOrigine();

    /**
     * list of event
     * @return events
    */
    @ApiModelProperty(value = "list of event")
    List<? extends SiteEventsProjection> getEvents();
}
