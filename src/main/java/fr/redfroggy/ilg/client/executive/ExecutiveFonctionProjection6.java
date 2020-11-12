package fr.redfroggy.ilg.client.executive;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

public interface ExecutiveFonctionProjection6 {
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
     * role of office
     * @return role
    */
    @ApiModelProperty(example = "M", value = "role of office")
    String getRole();

    /**
     * Get block
     * @return block
    */
    @ApiModelProperty(value = "")
    @Valid
    BlockProjection3 getBlock();

    /**
     * order identifier
     * @return showOrder
    */
    @ApiModelProperty(value = "order identifier")
    Integer getShowOrder();
}
