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
 * DebtTaxOfficeStatusModel
 */

public class DebtTaxOfficeStatusModel   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  public DebtTaxOfficeStatusModel code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Status of privilege at Tax Office
   * @return code
  */
  @ApiModelProperty(example = "C", value = "Status of privilege at Tax Office")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DebtTaxOfficeStatusModel label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Documentation in progress
   * @return label
  */
  @ApiModelProperty(example = "", value = "Documentation in progress")


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
    DebtTaxOfficeStatusModel debtTaxOfficeStatusModel = (DebtTaxOfficeStatusModel) o;
    return Objects.equals(this.code, debtTaxOfficeStatusModel.code) &&
        Objects.equals(this.label, debtTaxOfficeStatusModel.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtTaxOfficeStatusModel {\n");
    
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

