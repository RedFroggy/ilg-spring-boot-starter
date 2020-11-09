package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Personnes
 */

public class Personnes {

    private final List<Personne> personne;

    public Personnes(@JsonProperty("personne") List<Personne> personne) {
        this.personne = personne;
    }

    /**
     * Array of personne
     *
     * @return personne
     */
    @ApiModelProperty(value = "Array of personne")
    public List<Personne> getPersonne() {
        return personne;
    }
}

