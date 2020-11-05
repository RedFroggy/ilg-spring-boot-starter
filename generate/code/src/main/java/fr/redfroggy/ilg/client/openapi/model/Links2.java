package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.LinksCounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Links2
 */

public class Links2   {
  @JsonProperty("counts")
  private LinksCounts counts;

  @JsonProperty("shareholders")
  private Object shareholders;

  @JsonProperty("subsidiaries")
  private Object subsidiaries;

  public Links2 counts(LinksCounts counts) {
    this.counts = counts;
    return this;
  }

  /**
   * Get counts
   * @return counts
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksCounts getCounts() {
    return counts;
  }

  public void setCounts(LinksCounts counts) {
    this.counts = counts;
  }

  public Links2 shareholders(Object shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  /**
   * Get shareholders
   * @return shareholders
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getShareholders() {
    return shareholders;
  }

  public void setShareholders(Object shareholders) {
    this.shareholders = shareholders;
  }

  public Links2 subsidiaries(Object subsidiaries) {
    this.subsidiaries = subsidiaries;
    return this;
  }

  /**
   * Get subsidiaries
   * @return subsidiaries
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSubsidiaries() {
    return subsidiaries;
  }

  public void setSubsidiaries(Object subsidiaries) {
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
    Links2 links2 = (Links2) o;
    return Objects.equals(this.counts, links2.counts) &&
        Objects.equals(this.shareholders, links2.shareholders) &&
        Objects.equals(this.subsidiaries, links2.subsidiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, shareholders, subsidiaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links2 {\n");
    
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
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

