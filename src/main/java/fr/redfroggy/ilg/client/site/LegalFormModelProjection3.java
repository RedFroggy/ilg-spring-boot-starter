package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

public interface LegalFormModelProjection3 {
    /**
     * Legal form code
     * @return code
    */
    @ApiModelProperty(example = "5710", value = "Legal form code")
    String getCode();

    /**
     * Legal form INSEE code
     * @return codeINSEE
     */
    @ApiModelProperty(example = "1000", value = "Legal form INSEE code")
    String getCodeINSEE();

    /**
     * Legal form label
     * @return label
    */
    @ApiModelProperty(example = "Société par actions simplifiée (SAS)", value = "Legal form label")
    String getLabel();
}
