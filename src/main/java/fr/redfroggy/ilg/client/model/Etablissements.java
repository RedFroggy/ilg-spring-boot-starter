package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Etablissements
 */

public class Etablissements {

    private final List<Etablissement> etablissement;

    public Etablissements(@JsonProperty("etablissement") List<Etablissement> etablissement) {
        this.etablissement = etablissement;
    }

    /**
     * @return etablissement
     */
    @ApiModelProperty(value = "")
    public List<Etablissement> getEtablissement() {
        return etablissement;
    }

}

