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
 * PrivilegeCategoryModel
 */

public class PrivilegeCategoryModel   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("validityInMonths")
  private Integer validityInMonths;

  public PrivilegeCategoryModel code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Category code
   * @return code
  */
  @ApiModelProperty(example = "03", value = "Category code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PrivilegeCategoryModel label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Category label
   * @return label
  */
  @ApiModelProperty(example = "Trésor", value = "Category label")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PrivilegeCategoryModel validityInMonths(Integer validityInMonths) {
    this.validityInMonths = validityInMonths;
    return this;
  }

  /**
   * Privilege validity in months for the category
   * @return validityInMonths
  */
  @ApiModelProperty(example = "48", value = "Privilege validity in months for the category")


  public Integer getValidityInMonths() {
    return validityInMonths;
  }

  public void setValidityInMonths(Integer validityInMonths) {
    this.validityInMonths = validityInMonths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegeCategoryModel privilegeCategoryModel = (PrivilegeCategoryModel) o;
    return Objects.equals(this.code, privilegeCategoryModel.code) &&
        Objects.equals(this.label, privilegeCategoryModel.label) &&
        Objects.equals(this.validityInMonths, privilegeCategoryModel.validityInMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, validityInMonths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeCategoryModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validityInMonths: ").append(toIndentedString(validityInMonths)).append("\n");
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

