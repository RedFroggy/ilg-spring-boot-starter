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
 * LinksCounts
 */

public class LinksCounts   {
  @JsonProperty("shareholders")
  private Integer shareholders;

  @JsonProperty("directSubsidiaries")
  private Integer directSubsidiaries;

  @JsonProperty("indirectSubsidiaries")
  private Integer indirectSubsidiaries;

  public LinksCounts shareholders(Integer shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  /**
   * Get shareholders
   * @return shareholders
  */
  @ApiModelProperty(value = "")


  public Integer getShareholders() {
    return shareholders;
  }

  public void setShareholders(Integer shareholders) {
    this.shareholders = shareholders;
  }

  public LinksCounts directSubsidiaries(Integer directSubsidiaries) {
    this.directSubsidiaries = directSubsidiaries;
    return this;
  }

  /**
   * Get directSubsidiaries
   * @return directSubsidiaries
  */
  @ApiModelProperty(value = "")


  public Integer getDirectSubsidiaries() {
    return directSubsidiaries;
  }

  public void setDirectSubsidiaries(Integer directSubsidiaries) {
    this.directSubsidiaries = directSubsidiaries;
  }

  public LinksCounts indirectSubsidiaries(Integer indirectSubsidiaries) {
    this.indirectSubsidiaries = indirectSubsidiaries;
    return this;
  }

  /**
   * Get indirectSubsidiaries
   * @return indirectSubsidiaries
  */
  @ApiModelProperty(value = "")


  public Integer getIndirectSubsidiaries() {
    return indirectSubsidiaries;
  }

  public void setIndirectSubsidiaries(Integer indirectSubsidiaries) {
    this.indirectSubsidiaries = indirectSubsidiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksCounts linksCounts = (LinksCounts) o;
    return Objects.equals(this.shareholders, linksCounts.shareholders) &&
        Objects.equals(this.directSubsidiaries, linksCounts.directSubsidiaries) &&
        Objects.equals(this.indirectSubsidiaries, linksCounts.indirectSubsidiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareholders, directSubsidiaries, indirectSubsidiaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksCounts {\n");
    
    sb.append("    shareholders: ").append(toIndentedString(shareholders)).append("\n");
    sb.append("    directSubsidiaries: ").append(toIndentedString(directSubsidiaries)).append("\n");
    sb.append("    indirectSubsidiaries: ").append(toIndentedString(indirectSubsidiaries)).append("\n");
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

