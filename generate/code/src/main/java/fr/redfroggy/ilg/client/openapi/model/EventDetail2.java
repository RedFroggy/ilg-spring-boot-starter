package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.AnnonceInfo2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventDetail2
 */

public class EventDetail2   {
  @JsonProperty("annonceInfo")
  private AnnonceInfo2 annonceInfo;

  public EventDetail2 annonceInfo(AnnonceInfo2 annonceInfo) {
    this.annonceInfo = annonceInfo;
    return this;
  }

  /**
   * Get annonceInfo
   * @return annonceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnonceInfo2 getAnnonceInfo() {
    return annonceInfo;
  }

  public void setAnnonceInfo(AnnonceInfo2 annonceInfo) {
    this.annonceInfo = annonceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetail2 eventDetail2 = (EventDetail2) o;
    return Objects.equals(this.annonceInfo, eventDetail2.annonceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annonceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetail2 {\n");
    
    sb.append("    annonceInfo: ").append(toIndentedString(annonceInfo)).append("\n");
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

