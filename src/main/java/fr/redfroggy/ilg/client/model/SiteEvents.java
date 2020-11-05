package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.site.SiteEventsProjection;

/**
 * SiteEvents
 */
public class SiteEvents implements SiteEventsProjection {

    private final String eventDesc;

    private final String eventDate;

    public SiteEvents(@JsonProperty("eventDesc") String eventDesc, @JsonProperty("eventDate") String eventDate) {
        this.eventDesc = eventDesc;
        this.eventDate = eventDate;
    }

    /**
     * Get eventDesc
     *
     * @return eventDesc
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * Get eventDate
     *
     * @return eventDate
     */
    public String getEventDate() {
        return eventDate;
    }
}

