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
 * CodeLabelPair
 */

public class CodeLabelPair   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  public CodeLabelPair code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code
   * @return code
  */
  @ApiModelProperty(value = "Code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CodeLabelPair label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Description of the code
   * @return label
  */
  @ApiModelProperty(value = "Description of the code")


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
    CodeLabelPair codeLabelPair = (CodeLabelPair) o;
    return Objects.equals(this.code, codeLabelPair.code) &&
        Objects.equals(this.label, codeLabelPair.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeLabelPair {\n");
    
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

