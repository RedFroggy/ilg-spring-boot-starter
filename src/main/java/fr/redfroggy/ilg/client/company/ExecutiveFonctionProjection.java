package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface ExecutiveFonctionProjection {
    /**
     * Position code
     * @return code
    */
    @ApiModelProperty(example = "047", value = "Position code")
    String getCode();

    /**
     * Position description
     * @return label
    */
    @ApiModelProperty(example = "Administrateur", value = "Position description")
    String getLabel();

    /**
     * Position priority order
     * @return priority
    */
    @ApiModelProperty(example = "4", value = "Position priority order")
    Integer getPriority();
}
