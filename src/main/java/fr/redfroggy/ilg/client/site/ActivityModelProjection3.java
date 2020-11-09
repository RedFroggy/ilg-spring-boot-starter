package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

public interface ActivityModelProjection3 {
    /**
     * Activity code
     * @return code
    */
    @ApiModelProperty(example = "3030Z", value = "Activity code")
    String getCode();

    /**
     * Activity label
     * @return label
    */
    @ApiModelProperty(example = "Construction aéronautique et spatiale", value = "Activity label")
    String getLabel();
}
