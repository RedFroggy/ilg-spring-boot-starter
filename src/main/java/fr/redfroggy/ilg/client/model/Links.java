package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.LinksProjection2;
import fr.redfroggy.ilg.client.relation.LinksProjection;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links
 */
public class Links implements LinksProjection, LinksProjection2 {

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

