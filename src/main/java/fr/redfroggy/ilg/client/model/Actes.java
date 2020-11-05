package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Actes
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Actes {

    private final List<Acte> acte;

    public Actes(@JsonProperty("acte") List<Acte> acte) {
        this.acte = acte;
    }

    /**
     * list
     *
     * @return acte
     */
    @ApiModelProperty(value = "list")
    public List<Acte> getActe() {
        return acte;
    }
}

