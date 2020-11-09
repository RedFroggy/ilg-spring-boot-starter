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
 * ExecutiveFonction9
 */

public class ExecutiveFonction9   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("priority")
  private Integer priority;

  public ExecutiveFonction9 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Position code
   * @return code
  */
  @ApiModelProperty(example = "047", value = "Position code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ExecutiveFonction9 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Position description
   * @return label
  */
  @ApiModelProperty(example = "Administrateur", value = "Position description")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ExecutiveFonction9 priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Position priority order
   * @return priority
  */
  @ApiModelProperty(example = "4", value = "Position priority order")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveFonction9 executiveFonction9 = (ExecutiveFonction9) o;
    return Objects.equals(this.code, executiveFonction9.code) &&
        Objects.equals(this.label, executiveFonction9.label) &&
        Objects.equals(this.priority, executiveFonction9.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveFonction9 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

