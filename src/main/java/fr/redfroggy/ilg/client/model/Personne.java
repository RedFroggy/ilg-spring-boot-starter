package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Personne
 */

public class Personne {

    private final Identite identite;

    private final Dirigeants dirigeants;

    private final String administration;

    public Personne(@JsonProperty("identite") Identite identite,
                    @JsonProperty("dirigeants") Dirigeants dirigeants,
                    @JsonProperty("administration") String administration) {
        this.identite = identite;
        this.dirigeants = dirigeants;
        this.administration = administration;
    }

    /**
     * Get identite
     *
     * @return identite
     */
    @ApiModelProperty(value = "")
    public Identite getIdentite() {
        return identite;
    }

    /**
     * Get dirigeants
     *
     * @return dirigeants
     */
    @ApiModelProperty(value = "")
    public Dirigeants getDirigeants() {
        return dirigeants;
    }

    /**
     * Administration
     *
     * @return administration
     */
    @ApiModelProperty(value = "Administration")
    public String getAdministration() {
        return administration;
    }
}

