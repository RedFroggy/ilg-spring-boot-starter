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
 * LegalFormModel3
 */

public class LegalFormModel3   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("codeINSEE")
  private String codeINSEE;

  @JsonProperty("label")
  private String label;

  public LegalFormModel3 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Legal form code
   * @return code
  */
  @ApiModelProperty(example = "1900", value = "Legal form code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LegalFormModel3 codeINSEE(String codeINSEE) {
    this.codeINSEE = codeINSEE;
    return this;
  }

  /**
   * Legal form INSEE code
   * @return codeINSEE
  */
  @ApiModelProperty(example = "1000", value = "Legal form INSEE code")


  public String getCodeINSEE() {
    return codeINSEE;
  }

  public void setCodeINSEE(String codeINSEE) {
    this.codeINSEE = codeINSEE;
  }

  public LegalFormModel3 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Legal form label
   * @return label
  */
  @ApiModelProperty(example = "Personne physique", value = "Legal form label")


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
    LegalFormModel3 legalFormModel3 = (LegalFormModel3) o;
    return Objects.equals(this.code, legalFormModel3.code) &&
        Objects.equals(this.codeINSEE, legalFormModel3.codeINSEE) &&
        Objects.equals(this.label, legalFormModel3.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeINSEE, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalFormModel3 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeINSEE: ").append(toIndentedString(codeINSEE)).append("\n");
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

