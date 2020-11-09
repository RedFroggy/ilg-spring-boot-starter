package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * EtablissementsCession
 */

public class EtablissementsCession {
    private final List<Etablissement> etablissementCession;

    public EtablissementsCession(@JsonProperty("etablissementCession") List<Etablissement> etablissementCession) {
        this.etablissementCession = etablissementCession;
    }


    /**
     * @return etablissementCession
     */
    @ApiModelProperty(value = "")
    public List<Etablissement> getEtablissementCession() {
        return etablissementCession;
    }

}

