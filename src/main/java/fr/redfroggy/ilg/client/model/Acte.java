package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Acte
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Acte {

    private final String type;

    private final String descriptif;

    private final String description;

    private final LocalDate dateCommencementActivite;

    private final String opposition;

    public Acte(@JsonProperty("type") String type,
                @JsonProperty("descriptif") String descriptif,
                @JsonProperty("description") String description,
                @JsonProperty("dateCommencementActivite") LocalDate dateCommencementActivite,
                @JsonProperty("opposition") String opposition) {
        this.type = type;
        this.descriptif = descriptif;
        this.description = description;
        this.dateCommencementActivite = dateCommencementActivite;
        this.opposition = opposition;
    }

    /**
     * type of Act
     *
     * @return type
     */
    @ApiModelProperty(example = "vente", value = "type of Act")
    public String getType() {
        return type;
    }

    /**
     * Summary of Act
     *
     * @return descriptif
     */
    @ApiModelProperty(example = "Vente d'un fond de commerce", value = "Summary of Act")
    public String getDescriptif() {
        return descriptif;
    }

    /**
     * Text of act
     *
     * @return description
     */
    @ApiModelProperty(example = "Vente d'un fond en seeing privé....", value = "Text of act")
    public String getDescription() {
        return description;
    }

    /**
     * When the act starts
     *
     * @return dateCommencementActivite
     */
    @ApiModelProperty(value = "When the act starts")
    public LocalDate getDateCommencementActivite() {
        return dateCommencementActivite;
    }

    /**
     * Terms and conditions to invalidate the act
     *
     * @return opposition
     */
    @ApiModelProperty(example = "Delai d'opposition de 10 jours après publication", value = "Terms and conditions to invalidate the act")
    public String getOpposition() {
        return opposition;
    }
}

