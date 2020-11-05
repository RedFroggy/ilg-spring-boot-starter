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
 * ScreeningCandidateEntityIDs
 */

public class ScreeningCandidateEntityIDs   {
  @JsonProperty("Other")
  private String other;

  public ScreeningCandidateEntityIDs other(String other) {
    this.other = other;
    return this;
  }

  /**
   * Get other
   * @return other
  */
  @ApiModelProperty(example = "78012998703591", value = "")


  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningCandidateEntityIDs screeningCandidateEntityIDs = (ScreeningCandidateEntityIDs) o;
    return Objects.equals(this.other, screeningCandidateEntityIDs.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidateEntityIDs {\n");
    
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

