package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.site.CodeLabelPairProjection2;

/**
 * CodeLabelPair
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class CodeLabelPair implements CodeLabelPairProjection2 {

    private final String code;

    private final String label;

    public CodeLabelPair(@JsonProperty("code") String code, @JsonProperty("label") String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * Code
     *
     * @return code
     */

    public String getCode() {
        return code;
    }

    /**
     * Description of the code
     *
     * @return label
     */

    public String getLabel() {
        return label;
    }
}

