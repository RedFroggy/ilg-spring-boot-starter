package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.site.LegalFormModelProjection3;
import io.swagger.annotations.ApiModelProperty;

/**
 * LegalFormModel
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class LegalFormModel implements LegalFormModelProjection3 {

    private final String code;

    private final String codeINSEE;

    private final String label;

    public LegalFormModel(@JsonProperty("code") String code,
                          @JsonProperty("codeINSEE") String codeINSEE,
                          @JsonProperty("label") String label) {
        this.code = code;
        this.codeINSEE = codeINSEE;
        this.label = label;
    }

    /**
     * Legal form code
     *
     * @return code
     */

    @ApiModelProperty(example = "5710", value = "Legal form code")
    public String getCode() {
        return code;
    }

    /**
     * Legal form INSEE code
     *
     * @return codeINSEE
     */

    @ApiModelProperty(example = "1000", value = "Legal form INSEE code")
    public String getCodeINSEE() {
        return null;
    }

    /**
     * Legal form label
     *
     * @return label
     */

    @ApiModelProperty(example = "Société par actions simplifiée (SAS)", value = "Legal form label")
    public String getLabel() {
        return label;
    }
}

