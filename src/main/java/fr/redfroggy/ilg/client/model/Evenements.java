package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Evenements
 */

public class Evenements {

    private final List<Evenement> evenement;

    public Evenements(@JsonProperty("evenement") List<Evenement> evenement) {
        this.evenement = evenement;
    }

    /**
     * @return evenement
     */
    @ApiModelProperty(value = "")
    public List<Evenement> getEvenement() {
        return evenement;
    }

}

