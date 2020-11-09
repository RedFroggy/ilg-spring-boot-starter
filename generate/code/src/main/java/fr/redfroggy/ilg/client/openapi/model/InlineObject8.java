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
 * InlineObject8
 */

public class InlineObject8   {
  @JsonProperty("siren")
  private Integer siren;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("credit")
  private String credit;

  public InlineObject8 siren(Integer siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Get siren
   * @return siren
  */
  @ApiModelProperty(value = "")


  public Integer getSiren() {
    return siren;
  }

  public void setSiren(Integer siren) {
    this.siren = siren;
  }

  public InlineObject8 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(example = "reference", value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public InlineObject8 credit(String credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(example = "credit", value = "")


  public String getCredit() {
    return credit;
  }

  public void setCredit(String credit) {
    this.credit = credit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject8 inlineObject8 = (InlineObject8) o;
    return Objects.equals(this.siren, inlineObject8.siren) &&
        Objects.equals(this.reference, inlineObject8.reference) &&
        Objects.equals(this.credit, inlineObject8.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, reference, credit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject8 {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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

