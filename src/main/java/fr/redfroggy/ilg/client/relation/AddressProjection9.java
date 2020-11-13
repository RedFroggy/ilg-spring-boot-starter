package fr.redfroggy.ilg.client.relation;

import io.swagger.annotations.ApiModelProperty;

public interface AddressProjection9 {
    /**
     * Country name
     *
     * @return country
     */
    @ApiModelProperty(example = "France", value = "Country name")
    String getCountry();

    /**
     * Street address
     *
     * @return street
     */
    @ApiModelProperty(example = "1 rue Michel Vaillant", value = "Street address")
    String getStreet();

    /**
     * Postal Code
     *
     * @return postalCode
     */
    @ApiModelProperty(example = "75000", value = "Postal Code")
    String getPostalCode();

    /**
     * City
     *
     * @return locality
     */
    @ApiModelProperty(example = "Paris", value = "City")
    String getLocality();
}
