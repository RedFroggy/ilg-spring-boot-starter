package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.model.Cotation;
import fr.redfroggy.ilg.client.model.MarketInformationModel;
import fr.redfroggy.ilg.client.model.SecondaryActivityModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

public interface IdentityProjection {
    /**
     * Company Identifier
     *
     * @return id
     */
    @ApiModelProperty(example = "0123456789", value = "Company Identifier")
    String getId();

    /**
     * Fiscal Registration Number
     *
     * @return registrationId
     */
    @ApiModelProperty(example = "0123456789", value = "Fiscal Registration Number")
    String getRegistrationId();

    /**
     * Tax registration number
     *
     * @return vatnumber
     */
    @ApiModelProperty(example = "FR670123456789", value = "Tax registration number")
    String getVatnumber();

    /**
     * Company name
     *
     * @return name
     */
    @ApiModelProperty(example = "Great Company", value = "Company name")
    String getName();

    /**
     * Company trading name
     *
     * @return tradings
     */
    @ApiModelProperty(example = "GC Information", value = "Company trading name")
    String getTradings();

    /**
     * Company acronym
     *
     * @return acronym
     */
    @ApiModelProperty(example = "G.C.I", value = "Company acronym")
    String getAcronym();

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    @Valid
    AddressProjection getAddress();

    /**
     * Get headquarter
     *
     * @return headquarter
     */
    @ApiModelProperty(value = "")

    @Valid
    SiteProjection2 getHeadquarter();

    /**
     * Get workforce
     *
     * @return workforce
     */
    @ApiModelProperty(value = "")
    @Valid
    WorkforceProjection getWorkforce();

    /**
     * Get contact
     *
     * @return contact
     */
    @ApiModelProperty(value = "")

    @Valid
    ContactProjection2 getContact();

    /**
     * Get legalForm
     *
     * @return legalForm
     */
    @ApiModelProperty(value = "")
    @Valid
    LegalFormModelProjection getLegalForm();

    /**
     * Get activity
     *
     * @return activity
     */
    @ApiModelProperty(value = "")

    @Valid
    ActivityModelProjection getActivity();

    /**
     * Declared activity
     *
     * @return declaredActivity
     */
    @ApiModelProperty(example = "Commerce de matériel audio", value = "Declared activity")
    String getDeclaredActivity();

    /**
     * List of secondary activities
     *
     * @return secondaryActivities
     */
    @ApiModelProperty(value = "List of secondary activities")
    @Valid
    List<SecondaryActivityModel> getSecondaryActivities();

    /**
     * When the company was created
     *
     * @return creationDate
     */
    @ApiModelProperty(value = "When the company was created")

    @Valid
    LocalDate getCreationDate();

    /**
     * Whether the company is active or not
     *
     * @return status
     */
    @ApiModelProperty(example = "1", value = "Whether the company is active or not")
    Integer getStatus();

    /**
     * RNA (Répertoire National des Associations) number if company registred as association or null
     *
     * @return rna
     */
    @ApiModelProperty(example = "W452006858", value = "RNA (Répertoire National des Associations) number if company " +
            "registred as association or null")
    String getRna();

    /**
     * Company Capitalization
     *
     * @return capital
     */
    @ApiModelProperty(value = "Company Capitalization")
    String getCapital();

    /**
     * Institution in which the company is registered
     *
     * @return rcs
     */
    @ApiModelProperty(example = "RCS Paris", value = "Institution in which the company is registered")
    String getRcs();

    /**
     * Get cotation
     *
     * @return cotation
     */
    @ApiModelProperty(value = "")
    @Valid
    Cotation getCotation();

    /**
     * Market information
     *
     * @return tags
     */
    @ApiModelProperty(value = "Market information")
    @Valid
    List<? extends MarketInformationModel> getTags();
}
