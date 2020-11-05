package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * UboInvestigationStep
 */
public class UboInvestigationStep {

    private final String step;

    private final String reason;

    private final CodeLabelPair decision;

    public UboInvestigationStep(@JsonProperty("step") String step,
                                @JsonProperty("reason") String reason,
                                @JsonProperty("decision") CodeLabelPair decision) {
        this.step = step;
        this.reason = reason;
        this.decision = decision;
    }

    /**
     * Investigation step name
     *
     * @return step
     */
    @ApiModelProperty(value = "Investigation step name")
    public String getStep() {
        return step;
    }

    /**
     * Investigation step result
     *
     * @return reason
     */
    @ApiModelProperty(value = "Investigation step result")
    public String getReason() {
        return reason;
    }

    /**
     * Get decision
     *
     * @return decision
     */
    @ApiModelProperty(value = "")
    public CodeLabelPair getDecision() {
        return decision;
    }
}

