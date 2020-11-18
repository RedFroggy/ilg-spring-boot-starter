package fr.redfroggy.ilg.client.kyc;

import io.swagger.annotations.ApiModelProperty;

public interface UboInvestigationStepProjection {
    /**
     * Investigation step name
     * @return step
    */
    @ApiModelProperty(value = "Investigation step name")
    String getStep();

    /**
     * Investigation step result
     * @return reason
    */
    @ApiModelProperty(value = "Investigation step result")
    String getReason();

    /**
     * Get decision
     * @return decision
    */
    @ApiModelProperty(value = "")
    CodeLabelPairProjection4 getDecision();
}
