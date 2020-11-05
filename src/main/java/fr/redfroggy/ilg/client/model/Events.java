package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Events
 */
public class Events {

    private final String id;

    private final Pagination pagination;

    private final Sorting sorting;

    private final List<Event> events;

    private final Integer count;

    public Events(@JsonProperty("@id") String id,
                  @JsonProperty("@pagination") Pagination pagination,
                  @JsonProperty("@sorting") Sorting sorting,
                  @JsonProperty("events") List<Event> events,
                  @JsonProperty("count") Integer count) {
        this.id = id;
        this.pagination = pagination;
        this.sorting = sorting;
        this.events = events;
        this.count = count;
    }

    /**
     * Pagination
     *
     * @return pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * List of event
     *
     * @return events
     */
    @ApiModelProperty(value = "List of event")
    public List<? extends Event> getEvents() {
        return events;
    }

    /**
     * Number of event
     *
     * @return count
     */
    @ApiModelProperty(value = "Number of event")
    public Integer getCount() {
        return count;
    }

    /**
     * Sorting of events
     *
     * @return sorting
     */
    @ApiModelProperty(value = "Sorting of events")
    public Sorting getSorting() {
        return sorting;
    }
}

