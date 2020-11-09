package fr.redfroggy.ilg.client.site;

import io.swagger.annotations.ApiModelProperty;

public interface SiteEventsProjection {
    /**
     * Get eventDesc
     *
     * @return eventDesc
     */
    @ApiModelProperty(example = "Modification siège", value = "")
    String getEventDesc();

    /**
     * Get eventDate
     *
     * @return eventDate
     */
    @ApiModelProperty(example = "2015-07-09", value = "")
    String getEventDate();
}
