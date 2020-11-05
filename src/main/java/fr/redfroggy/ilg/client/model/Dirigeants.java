package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Dirigeants
 */

public class Dirigeants {

    private final List<Dirigeant> dirigeant;

    public Dirigeants(@JsonProperty("dirigeant") List<Dirigeant> dirigeant) {
        this.dirigeant = dirigeant;
    }

    /**
     * @return dirigeant
     */
    @ApiModelProperty(value = "")
    public List<Dirigeant> getDirigeant() {
        return dirigeant;
    }

}

