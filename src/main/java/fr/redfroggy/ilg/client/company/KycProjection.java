package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

public interface KycProjection {
    /**
     * Get ubo
     *
     * @return ubo
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getUbo();

    /**
     * Get conformity
     *
     * @return conformity
     */
    @ApiModelProperty(value = "")

    @Valid
    Object getConformity();
}
