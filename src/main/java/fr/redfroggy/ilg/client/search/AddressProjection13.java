package fr.redfroggy.ilg.client.search;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

public interface AddressProjection13 {
    /**
     * Country name
     * @return country
    */
    @ApiModelProperty(example = "France", value = "Country name")
    String getCountry();

    /**
     * Country code (ISO 3166-2)
     * @return countryCode
    */
    @ApiModelProperty(example = "FR", value = "Country code (ISO 3166-2)")
    String getCountryCode();

    /**
     * Street address
     * @return street
    */
    @ApiModelProperty(example = "1 rue Michel Vaillant", value = "Street address")
    String getStreet();

    /**
     * Get streetDetail
     * @return streetDetail
    */
    @ApiModelProperty(value = "")
    @Valid
    Object getStreetDetail();

    /**
     * Street address 2
     * @return street2
    */
    @ApiModelProperty(example = "Enco de Botte", value = "Street address 2")
    String getStreet2();

    /**
     * Postal Box number
     * @return postalBoxNumber
    */
    @ApiModelProperty(example = "BP 001", value = "Postal Box number")
    String getPostalBoxNumber();

    /**
     * Region name
     * @return region
    */
    @ApiModelProperty(example = "Île-de-France", value = "Region name")
    String getRegion();

    /**
     * Department name
     * @return deptName
    */
    @ApiModelProperty(example = "Paris", value = "Department name")
    String getDeptName();

    /**
     * Postal Code
     * @return postalCode
    */
    @ApiModelProperty(example = "75000", value = "Postal Code")
    String getPostalCode();

    /**
     * City
     * @return locality
    */
    @ApiModelProperty(example = "Paris", value = "City")
    String getLocality();

    /**
     * Get mailFormatted
     * @return mailFormatted
    */
    @ApiModelProperty(value = "")
    @Valid
    Object getMailFormatted();
}
