package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

public interface InsolvencyProjection {
    /**
     * Collective procedure code
     *
     * @return code
     */
    @ApiModelProperty(example = "5210", value = "Collective procedure code")
    Integer getCode();

    /**
     * Label of the insolvency procedure
     *
     * @return label
     */
    @ApiModelProperty(example = "Liquidation en cours", value = "Label of the insolvency procedure")
    String getLabel();

    /**
     * Effective start date of the insolvency procedure
     *
     * @return effectiveStart
     */
    @ApiModelProperty(value = "Effective start date of the insolvency procedure")
    LocalDate getEffectiveStart();

    /**
     * Effective end date of the insolvency procedure
     *
     * @return effectiveEnd
     */
    @ApiModelProperty(value = "Effective end date of the insolvency procedure")
    LocalDate getEffectiveEnd();
}
