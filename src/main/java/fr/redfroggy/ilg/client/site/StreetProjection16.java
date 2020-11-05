package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

public interface StreetProjection16 {
    /**
     * Street number
     *
     * @return number
     */
    @ApiModelProperty(example = "1", value = "Street number")
    String getNumber();

    /**
     * Street number repetition
     *
     * @return repetition
     */
    @ApiModelProperty(example = "bis", value = "Street number repetition")
    String getRepetition();

    /**
     * Street Type
     *
     * @return streetType
     */
    @ApiModelProperty(example = "rue", value = "Street Type")
    String getStreetType();

    /**
     * Street name
     *
     * @return streetName
     */
    @ApiModelProperty(example = "de la baule", value = "Street name")
    String getStreetName();
}
