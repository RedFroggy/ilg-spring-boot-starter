package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * LinksCounts
 */
public class LinksCounts {

    private final Integer shareholders;

    private final Integer directSubsidiaries;

    private final Integer indirectSubsidiaries;

    public LinksCounts(@JsonProperty("shareholders") Integer shareholders,
                       @JsonProperty("directSubsidiaries") Integer directSubsidiaries,
                       @JsonProperty("indirectSubsidiaries") Integer indirectSubsidiaries) {
        this.shareholders = shareholders;
        this.directSubsidiaries = directSubsidiaries;
        this.indirectSubsidiaries = indirectSubsidiaries;
    }

    /**
     * Get shareholders
     *
     * @return shareholders
     */
    @ApiModelProperty(value = "")
    public Integer getShareholders() {
        return shareholders;
    }

    /**
     * Get directSubsidiaries
     *
     * @return directSubsidiaries
     */
    @ApiModelProperty(value = "")
    public Integer getDirectSubsidiaries() {
        return directSubsidiaries;
    }

    /**
     * Get indirectSubsidiaries
     *
     * @return indirectSubsidiaries
     */
    @ApiModelProperty(value = "")
    public Integer getIndirectSubsidiaries() {
        return indirectSubsidiaries;
    }

}

