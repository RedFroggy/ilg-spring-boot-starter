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
 * ExecutiveMouvement8
 */

public class ExecutiveMouvement8   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("label")
  private String label;

  public ExecutiveMouvement8 code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Movement code
   * @return code
  */
  @ApiModelProperty(example = "1", value = "Movement code")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ExecutiveMouvement8 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Human readable movement description
   * @return label
  */
  @ApiModelProperty(example = "Nomination", value = "Human readable movement description")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveMouvement8 executiveMouvement8 = (ExecutiveMouvement8) o;
    return Objects.equals(this.code, executiveMouvement8.code) &&
        Objects.equals(this.label, executiveMouvement8.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveMouvement8 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

