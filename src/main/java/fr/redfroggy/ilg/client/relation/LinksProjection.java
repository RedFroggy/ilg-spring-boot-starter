package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.redfroggy.ilg.client.model.Links;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

@JsonDeserialize(as = Links.class)
public interface LinksProjection {
    /**
     * Get shareholders
     *
     * @return shareholders
     */
    @ApiModelProperty(value = "")
    @Valid
    ShareholdersProjection2 getShareholders();

    /**
     * Get subsidiaries
     *
     * @return subsidiaries
     */
    @ApiModelProperty(value = "")
    @Valid
    SubsidiariesProjection2 getSubsidiaries();
}
