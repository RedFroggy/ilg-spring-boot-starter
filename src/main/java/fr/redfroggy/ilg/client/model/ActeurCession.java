package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActeurCession
 */
public class ActeurCession {
    private final Role typeActeur;

    private final IdentiteActeur identiteActeur;

    private final CessionInfo cessionInfo;

    public ActeurCession(@JsonProperty("typeActeur") Role typeActeur,
                         @JsonProperty("identiteActeur") IdentiteActeur identiteActeur,
                         @JsonProperty("cessionInfo") CessionInfo cessionInfo) {
        this.typeActeur = typeActeur;
        this.identiteActeur = identiteActeur;
        this.cessionInfo = cessionInfo;
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
     * Get identiteActeur
     *
     * @return identiteActeur
     */
    @ApiModelProperty(value = "")
    public IdentiteActeur getIdentiteActeur() {
        return identiteActeur;
    }

    /**
     * Get cessionInfo
     *
     * @return cessionInfo
     */
    @ApiModelProperty(value = "")
    public CessionInfo getCessionInfo() {
        return cessionInfo;
    }
}

