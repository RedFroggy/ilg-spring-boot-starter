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
 * AnnonceInfo4
 */

public class AnnonceInfo4   {
  @JsonProperty("adID")
  private String adID;

  public AnnonceInfo4 adID(String adID) {
    this.adID = adID;
    return this;
  }

  /**
   * Event identifier
   * @return adID
  */
  @ApiModelProperty(example = "XA1235456", value = "Event identifier")


  public String getAdID() {
    return adID;
  }

  public void setAdID(String adID) {
    this.adID = adID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnonceInfo4 annonceInfo4 = (AnnonceInfo4) o;
    return Objects.equals(this.adID, annonceInfo4.adID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnonceInfo4 {\n");
    
    sb.append("    adID: ").append(toIndentedString(adID)).append("\n");
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

