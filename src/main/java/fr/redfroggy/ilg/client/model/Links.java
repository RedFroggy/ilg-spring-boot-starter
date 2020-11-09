package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links
 */
public class Links {

    private final LinksCounts counts;

    private final Shareholders shareholders;

    private final Subsidiaries subsidiaries;

    public Links(@JsonProperty("counts") LinksCounts counts,
                 @JsonProperty("shareholders") Shareholders shareholders,
                 @JsonProperty("subsidiaries") Subsidiaries subsidiaries) {
        this.counts = counts;
        this.shareholders = shareholders;
        this.subsidiaries = subsidiaries;
    }

    /**
     * Get counts
     *
     * @return counts
     */
    @ApiModelProperty(value = "")
    public LinksCounts getCounts() {
        return counts;
    }

    /**
     * Get shareholders
     *
     * @return shareholders
     */
    @ApiModelProperty(value = "")
    public Shareholders getShareholders() {
        return shareholders;
    }

    /**
     * Get subsidiaries
     *
     * @return subsidiaries
     */
    @ApiModelProperty(value = "")
    public Subsidiaries getSubsidiaries() {
        return subsidiaries;
    }

}

