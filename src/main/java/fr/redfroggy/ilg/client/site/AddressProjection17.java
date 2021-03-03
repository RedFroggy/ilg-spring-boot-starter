package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

public interface AddressProjection17 {
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
    StreetProjection16 getStreetDetail();

    /**
     * Street address 2
     * @return street2
    */
    @ApiModelProperty(example = "Enco de Botte", value = "Street address 2")
    String getStreet2();

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
}
