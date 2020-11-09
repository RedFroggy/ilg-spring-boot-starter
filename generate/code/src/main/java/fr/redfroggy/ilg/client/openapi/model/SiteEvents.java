package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiteEvents
 */

public class SiteEvents   {
  @JsonProperty("eventDesc")
  private String eventDesc;

  @JsonProperty("eventDate")
  private String eventDate;

  public SiteEvents eventDesc(String eventDesc) {
    this.eventDesc = eventDesc;
    return this;
  }

  /**
   * Get eventDesc
   * @return eventDesc
  */
  @ApiModelProperty(example = "Modification siège", value = "")


  public String getEventDesc() {
    return eventDesc;
  }

  public void setEventDesc(String eventDesc) {
    this.eventDesc = eventDesc;
  }

  public SiteEvents eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  */
  @ApiModelProperty(example = "2015-07-09", value = "")


  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteEvents siteEvents = (SiteEvents) o;
    return Objects.equals(this.eventDesc, siteEvents.eventDesc) &&
        Objects.equals(this.eventDate, siteEvents.eventDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDesc, eventDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteEvents {\n");
    
    sb.append("    eventDesc: ").append(toIndentedString(eventDesc)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
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

