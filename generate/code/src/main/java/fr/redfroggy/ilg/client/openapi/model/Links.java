package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Shareholders2;
import fr.redfroggy.ilg.client.openapi.model.Subsidiaries2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Links
 */

public class Links   {
  @JsonProperty("shareholders")
  private Shareholders2 shareholders;

  @JsonProperty("subsidiaries")
  private Subsidiaries2 subsidiaries;

  public Links shareholders(Shareholders2 shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  /**
   * Get shareholders
   * @return shareholders
  */
  @ApiModelProperty(value = "")

  @Valid

  public Shareholders2 getShareholders() {
    return shareholders;
  }

  public void setShareholders(Shareholders2 shareholders) {
    this.shareholders = shareholders;
  }

  public Links subsidiaries(Subsidiaries2 subsidiaries) {
    this.subsidiaries = subsidiaries;
    return this;
  }

  /**
   * Get subsidiaries
   * @return subsidiaries
  */
  @ApiModelProperty(value = "")

  @Valid

  public Subsidiaries2 getSubsidiaries() {
    return subsidiaries;
  }

  public void setSubsidiaries(Subsidiaries2 subsidiaries) {
    this.subsidiaries = subsidiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.shareholders, links.shareholders) &&
        Objects.equals(this.subsidiaries, links.subsidiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareholders, subsidiaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    shareholders: ").append(toIndentedString(shareholders)).append("\n");
    sb.append("    subsidiaries: ").append(toIndentedString(subsidiaries)).append("\n");
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

