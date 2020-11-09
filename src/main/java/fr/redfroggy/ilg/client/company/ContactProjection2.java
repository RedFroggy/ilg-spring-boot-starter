package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface ContactProjection2 {
    /**
     * Type of contact info
     *
     * @return type
     */
    @ApiModelProperty(example = "Personal", value = "Type of contact info")
    String getType();

    /**
     * Phone number
     *
     * @return phone
     */
    @ApiModelProperty(example = "+33123456789", value = "Phone number")
    String getPhone();

    /**
     * Fax number
     *
     * @return fax
     */
    @ApiModelProperty(example = "+33123456789", value = "Fax number")
    String getFax();

    /**
     * Email
     *
     * @return email
     */
    @ApiModelProperty(example = "email@example.org", value = "Email")
    String getEmail();

    /**
     * Homepage
     *
     * @return webSite
     */
    @ApiModelProperty(example = "http://greatcompany.com", value = "Homepage")
    String getWebSite();
}
