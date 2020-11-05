package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActeurContentieux
 */

public class ActeurContentieux {
    private final IdentiteActeur identiteActeur;

    private final Role typeActeur;

    private final RepresentantActeur representantActeur;

    public ActeurContentieux(@JsonProperty("identiteActeur") IdentiteActeur identiteActeur,
                             @JsonProperty("typeActeur") Role typeActeur,
                             @JsonProperty("representantActeur") RepresentantActeur representantActeur) {
        this.identiteActeur = identiteActeur;
        this.typeActeur = typeActeur;
        this.representantActeur = representantActeur;
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

    /**
     * Get typeActeur
     *
     * @return typeActeur
     */
    @ApiModelProperty(value = "")
    public Role getTypeActeur() {
        return typeActeur;
    }

    /**
     * Get representantActeur
     *
     * @return representantActeur
     */
    @ApiModelProperty(value = "")
    public RepresentantActeur getRepresentantActeur() {
        return representantActeur;
    }
}

