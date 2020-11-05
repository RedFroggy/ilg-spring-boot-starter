package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ActeursContentieux
 */

public class ActeursContentieux {

    private final List<ActeurContentieux> acteurContentieux;

    public ActeursContentieux(@JsonProperty("acteurContentieux") List<ActeurContentieux> acteurContentieux) {
        this.acteurContentieux = acteurContentieux;
    }

    /**
     * Get acteurContentieux
     *
     * @return acteurContentieux
     */
    @ApiModelProperty(value = "")
    public List<ActeurContentieux> getActeurContentieux() {
        return acteurContentieux;
    }

}

