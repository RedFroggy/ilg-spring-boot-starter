package fr.redfroggy.ilg.client.executive;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface ExecutivesProjection2 {
    /**
     * List of executive
     * @return executives
    */
    @ApiModelProperty(value = "List of executive")
    List<? extends ExecutiveProjection4> getExecutives();

}
