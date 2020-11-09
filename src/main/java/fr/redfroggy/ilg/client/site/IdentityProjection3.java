package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

public interface IdentityProjection3 {
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
     * Company name
     *
     * @return name
     */
    @ApiModelProperty(example = "Great Company", value = "Company name")
    String getName();

    /**
     * Get legalForm
     *
     * @return legalForm
     */
    @ApiModelProperty(value = "")
    LegalFormModelProjection3 getLegalForm();

    /**
     * Get activity
     *
     * @return activity
     */
    @ApiModelProperty(value = "")
    ActivityModelProjection3 getActivity();
}
