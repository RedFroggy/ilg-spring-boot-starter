package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Risk
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Risk {

    private final String riskClass;

    private final String label;

    private final String status;

    private final Insolvency insolvency;

    public Risk(@JsonProperty("class") String riskClass,
                @JsonProperty("label") String label,
                @JsonProperty("status") String status,
                @JsonProperty("insolvency") Insolvency insolvency) {
        this.riskClass = riskClass;
        this.label = label;
        this.status = status;
        this.insolvency = insolvency;
    }

    /**
     * Risk class as a score range
     *
     * @return propertyClass
     */

    @ApiModelProperty(example = "3-5", value = "Risk class as a score range")
    public String getRiskClass() {
        return riskClass;
    }

    /**
     * Risk class label
     *
     * @return label
     */

    @ApiModelProperty(example = "Risque élevé", value = "Risk class label")
    public String getLabel() {
        return label;
    }

    /**
     * Company Status, values can be 'active', 'insolvancy' or 'closed'
     *
     * @return status
     */

    @ApiModelProperty(example = "active", value = "Company Status, values can be 'active', 'insolvancy' or 'closed'")
    public String getStatus() {
        return status;
    }

    /**
     * Get insolvency
     *
     * @return insolvency
     */

    @ApiModelProperty(value = "")
    public Insolvency getInsolvency() {
        return insolvency;
    }
}

