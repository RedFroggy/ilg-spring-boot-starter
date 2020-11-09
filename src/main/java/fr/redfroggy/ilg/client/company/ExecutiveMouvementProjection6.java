package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface ExecutiveMouvementProjection6 {
    /**
     * Movement code
     *
     * @return code
     */
    @ApiModelProperty(example = "1", value = "Movement code")
    Integer getCode();

    /**
     * Human readable movement description
     *
     * @return label
     */
    @ApiModelProperty(example = "Nomination", value = "Human readable movement description")
    String getLabel();
}
