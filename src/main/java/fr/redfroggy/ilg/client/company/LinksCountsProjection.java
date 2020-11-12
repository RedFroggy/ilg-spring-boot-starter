package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface LinksCountsProjection {
    /**
     * Get shareholders
     *
     * @return shareholders
     */
    @ApiModelProperty(value = "")
    Integer getShareholders();

    /**
     * Get directSubsidiaries
     *
     * @return directSubsidiaries
     */
    @ApiModelProperty(value = "")
    Integer getDirectSubsidiaries();

    /**
     * Get indirectSubsidiaries
     *
     * @return indirectSubsidiaries
     */
    @ApiModelProperty(value = "")
    Integer getIndirectSubsidiaries();
}
