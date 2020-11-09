package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * MarketInformationModel
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class MarketInformationModel {

    private final String code;

    private final String label;

    public MarketInformationModel(@JsonProperty("code") String code,
                                  @JsonProperty("label") String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * Market information code
     *
     * @return code
     */
    @ApiModelProperty(example = "PME", value = "Market information code")
    public String getCode() {
        return code;
    }

    /**
     * Market information label
     *
     * @return label
     */
    @ApiModelProperty(example = "Petite ou Moyenne Entreprise", value = "Market information label")
    public String getLabel() {
        return label;
    }
}

