package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Insolvency
 */
public class Insolvency {

    private final Integer code;

    private final String label;

    private final LocalDate effectiveStart;

    private final LocalDate effectiveEnd;

    public Insolvency(@JsonProperty("code") Integer code,
                      @JsonProperty("label") String label,
                      @JsonProperty("effectiveStart") LocalDate effectiveStart,
                      @JsonProperty("effectiveEnd") LocalDate effectiveEnd) {
        this.code = code;
        this.label = label;
        this.effectiveStart = effectiveStart;
        this.effectiveEnd = effectiveEnd;
    }

    /**
     * Collective procedure code
     *
     * @return code
     */
    @ApiModelProperty(example = "5210", value = "Collective procedure code")
    public Integer getCode() {
        return code;
    }

    /**
     * Label of the insolvency procedure
     *
     * @return label
     */
    @ApiModelProperty(example = "Liquidation en cours", value = "Label of the insolvency procedure")
    public String getLabel() {
        return label;
    }

    /**
     * Effective start date of the insolvency procedure
     *
     * @return effectiveStart
     */
    @ApiModelProperty(value = "Effective start date of the insolvency procedure")
    public LocalDate getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Effective end date of the insolvency procedure
     *
     * @return effectiveEnd
     */
    @ApiModelProperty(value = "Effective end date of the insolvency procedure")
    public LocalDate getEffectiveEnd() {
        return effectiveEnd;
    }
}

