package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Executive3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Executives
 */

public class Executives   {
  @JsonProperty("executives")
  @Valid
  private List<Executive3> executives = null;

  @JsonProperty("count")
  private Integer count;

  public Executives executives(List<Executive3> executives) {
    this.executives = executives;
    return this;
  }

  public Executives addExecutivesItem(Executive3 executivesItem) {
    if (this.executives == null) {
      this.executives = new ArrayList<>();
    }
    this.executives.add(executivesItem);
    return this;
  }

  /**
   * List of executive
   * @return executives
  */
  @ApiModelProperty(value = "List of executive")

  @Valid

  public List<Executive3> getExecutives() {
    return executives;
  }

  public void setExecutives(List<Executive3> executives) {
    this.executives = executives;
  }

  public Executives count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of result found
   * @return count
  */
  @ApiModelProperty(value = "Number of result found")


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
    Executives executives = (Executives) o;
    return Objects.equals(this.executives, executives.executives) &&
        Objects.equals(this.count, executives.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executives, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executives {\n");
    
    sb.append("    executives: ").append(toIndentedString(executives)).append("\n");
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

