package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Block3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutiveFonction6
 */

public class ExecutiveFonction6   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("role")
  private String role;

  @JsonProperty("block")
  private Block3 block;

  @JsonProperty("showOrder")
  private Integer showOrder;

  public ExecutiveFonction6 code(String code) {
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

  public ExecutiveFonction6 label(String label) {
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

  public ExecutiveFonction6 role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of office
   * @return role
  */
  @ApiModelProperty(example = "M", value = "role of office")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ExecutiveFonction6 block(Block3 block) {
    this.block = block;
    return this;
  }

  /**
   * Get block
   * @return block
  */
  @ApiModelProperty(value = "")

  @Valid

  public Block3 getBlock() {
    return block;
  }

  public void setBlock(Block3 block) {
    this.block = block;
  }

  public ExecutiveFonction6 showOrder(Integer showOrder) {
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
    ExecutiveFonction6 executiveFonction6 = (ExecutiveFonction6) o;
    return Objects.equals(this.code, executiveFonction6.code) &&
        Objects.equals(this.label, executiveFonction6.label) &&
        Objects.equals(this.role, executiveFonction6.role) &&
        Objects.equals(this.block, executiveFonction6.block) &&
        Objects.equals(this.showOrder, executiveFonction6.showOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, role, block, showOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveFonction6 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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

