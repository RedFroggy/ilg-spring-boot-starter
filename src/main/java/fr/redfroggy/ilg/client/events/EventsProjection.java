package fr.redfroggy.ilg.client.events;

import fr.redfroggy.ilg.client.Pagination;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

public interface EventsProjection {

    /**
     * Pagination
     * @return pagination
     */
    Pagination getPagination();

    /**
     * List of event
     * @return events
    */
    @ApiModelProperty(value = "List of event")
    @Valid
    List<? extends EventProjection2> getEvents();

    /**
     * Number of event
     * @return count
    */
    @ApiModelProperty(value = "Number of event")
    Integer getCount();
}
