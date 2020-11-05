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
 * ExecutiveFonction12
 */

public class ExecutiveFonction12   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("showOrder")
  private Integer showOrder;

  public ExecutiveFonction12 code(String code) {
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

  public ExecutiveFonction12 label(String label) {
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

  public ExecutiveFonction12 showOrder(Integer showOrder) {
    this.showOrder = showOrder;
    return this;
  }

  /**
   * order identifier
   * @return showOrder
  */
  @ApiModelProperty(value = "order identifier")


  public Integer getShowOrder() {
    return showOrder;
  }

  public void setShowOrder(Integer showOrder) {
    this.showOrder = showOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveFonction12 executiveFonction12 = (ExecutiveFonction12) o;
    return Objects.equals(this.code, executiveFonction12.code) &&
        Objects.equals(this.label, executiveFonction12.label) &&
        Objects.equals(this.showOrder, executiveFonction12.showOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, showOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveFonction12 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    showOrder: ").append(toIndentedString(showOrder)).append("\n");
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

