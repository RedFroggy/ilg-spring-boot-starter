package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

public interface LinksProjection2 {
    /**
     * Get counts
     *
     * @return counts
     */
    @ApiModelProperty(value = "")
    @Valid
    LinksCountsProjection getCounts();

    /**
     * Get shareholders
     *
     * @return shareholders
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getShareholders();

    /**
     * Get subsidiaries
     *
     * @return subsidiaries
     */
    @ApiModelProperty(value = "")

    @Valid
    Object getSubsidiaries();
}
