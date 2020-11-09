package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Insolvency2
 */

public class Insolvency2   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("effectiveStart")
  private LocalDate effectiveStart;

  @JsonProperty("effectiveEnd")
  private LocalDate effectiveEnd;

  public Insolvency2 code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Collective procedure code
   * @return code
  */
  @ApiModelProperty(example = "5210", value = "Collective procedure code")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Insolvency2 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label of the insolvency procedure
   * @return label
  */
  @ApiModelProperty(example = "Liquidation en cours", value = "Label of the insolvency procedure")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Insolvency2 effectiveStart(LocalDate effectiveStart) {
    this.effectiveStart = effectiveStart;
    return this;
  }

  /**
   * Effective start date of the insolvency procedure
   * @return effectiveStart
  */
  @ApiModelProperty(value = "Effective start date of the insolvency procedure")

  @Valid

  public LocalDate getEffectiveStart() {
    return effectiveStart;
  }

  public void setEffectiveStart(LocalDate effectiveStart) {
    this.effectiveStart = effectiveStart;
  }

  public Insolvency2 effectiveEnd(LocalDate effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
    return this;
  }

  /**
   * Effective end date of the insolvency procedure
   * @return effectiveEnd
  */
  @ApiModelProperty(value = "Effective end date of the insolvency procedure")

  @Valid

  public LocalDate getEffectiveEnd() {
    return effectiveEnd;
  }

  public void setEffectiveEnd(LocalDate effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insolvency2 insolvency2 = (Insolvency2) o;
    return Objects.equals(this.code, insolvency2.code) &&
        Objects.equals(this.label, insolvency2.label) &&
        Objects.equals(this.effectiveStart, insolvency2.effectiveStart) &&
        Objects.equals(this.effectiveEnd, insolvency2.effectiveEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, effectiveStart, effectiveEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insolvency2 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
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

