package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * RepresentantActeur
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class RepresentantActeur {

    private final IdentiteActeur identiteActeur;

    public RepresentantActeur(@JsonProperty("identiteActeur") IdentiteActeur identiteActeur) {
        this.identiteActeur = identiteActeur;
    }

    /**
     * Get identiteActeur
     *
     * @return identiteActeur
     */
    @ApiModelProperty(value = "")
    public IdentiteActeur getIdentiteActeur() {
        return identiteActeur;
    }

}

