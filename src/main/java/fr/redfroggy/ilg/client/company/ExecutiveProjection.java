package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface ExecutiveProjection {
    /**
     * Executive title
     * @return civilite
     */
    @ApiModelProperty(example = "M", value = "Executive title")
    String getCivilite();

    /**
     * Executive Lastname
     * @return name
     */
    @ApiModelProperty(example = "Doe", value = "Executive Lastname")
    String getName();

    /**
     * Executive Firstname
     * @return firstname
     */
    @ApiModelProperty(example = "Jane", value = "Executive Firstname")
    String getFirstname();

    /**
     * Executive type can be 'person', 'company' or 'family' (equivalent to person)
     * @return type
     */
    @ApiModelProperty(example = "person", value =
            "Executive type can be 'person', 'company' or 'family' (equivalent to person)")
    String getType();

    /**
     * Executive maiden name if available
     * @return maidenName
     */
    @ApiModelProperty(example = "Smith", value = "Executive maiden name if available")
    String getMaidenName();

    /**
     * Company Identifier if Executive is also a company, only available in France
     * @return siren
     */
    @ApiModelProperty(example = "0123456789", value =
            "Company Identifier if Executive is also a company, only available in France")
    String getSiren();

    /**
     * Get fonction
     * @return fonction
     */
    @ApiModelProperty(value = "")
    ExecutiveFonctionProjection getFonction();

    /**
     * Executive email address
     * @return email
     */
    @ApiModelProperty(example = "mail@example.com", value = "Executive email address")
    String getEmail();

    /**
     * Executive phone number
     * @return phone
     */
    @ApiModelProperty(example = "+33658452114", value = "Executive phone number")
    String getPhone();
}
