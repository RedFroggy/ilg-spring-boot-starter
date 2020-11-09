package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ActeursCession
 */

public class ActeursCession {
    private final List<ActeurCession> acteurCession;

    public ActeursCession(@JsonProperty("acteurCession") List<ActeurCession> acteurCession) {
        this.acteurCession = acteurCession;
    }

    /**
     * @return acteurCession
     */
    @ApiModelProperty(value = "")
    public List<ActeurCession> getActeurCession() {
        return acteurCession;
    }

}

