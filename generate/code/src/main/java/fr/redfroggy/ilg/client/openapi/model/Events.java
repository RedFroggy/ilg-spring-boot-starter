package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Event2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Events
 */

public class Events   {
  @JsonProperty("events")
  @Valid
  private List<Event2> events = null;

  @JsonProperty("count")
  private Integer count;

  public Events events(List<Event2> events) {
    this.events = events;
    return this;
  }

  public Events addEventsItem(Event2 eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * List of event
   * @return events
  */
  @ApiModelProperty(value = "List of event")

  @Valid

  public List<Event2> getEvents() {
    return events;
  }

  public void setEvents(List<Event2> events) {
    this.events = events;
  }

  public Events count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of event
   * @return count
  */
  @ApiModelProperty(value = "Number of event")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.events, events.events) &&
        Objects.equals(this.count, events.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

