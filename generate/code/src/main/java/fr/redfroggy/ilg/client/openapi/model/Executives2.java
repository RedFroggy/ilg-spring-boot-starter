package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Executive4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Executives2
 */

public class Executives2   {
  @JsonProperty("executives")
  @Valid
  private List<Executive4> executives = null;

  public Executives2 executives(List<Executive4> executives) {
    this.executives = executives;
    return this;
  }

  public Executives2 addExecutivesItem(Executive4 executivesItem) {
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

  public List<Executive4> getExecutives() {
    return executives;
  }

  public void setExecutives(List<Executive4> executives) {
    this.executives = executives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executives2 executives2 = (Executives2) o;
    return Objects.equals(this.executives, executives2.executives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executives2 {\n");
    
    sb.append("    executives: ").append(toIndentedString(executives)).append("\n");
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

