package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.model.Insolvency;
import io.swagger.annotations.ApiModelProperty;

public interface RiskProjection {
    /**
     * Risk class as a score range
     * @return propertyClass
    */
    @ApiModelProperty(example = "3-5", value = "Risk class as a score range")
    String getRiskClass();

    /**
     * Risk class label
     * @return label
    */
    @ApiModelProperty(example = "Risque élevé", value = "Risk class label")
    String getLabel();

    /**
     * Company Status, values can be 'active', 'insolvancy' or 'closed'
     * @return status
    */
    @ApiModelProperty(example = "active", value = "Company Status, values can be 'active', 'insolvancy' or 'closed'")
    String getStatus();

    /**
     * Get insolvency
     * @return insolvency
    */
    @ApiModelProperty(value = "")
    Insolvency getInsolvency();
}
