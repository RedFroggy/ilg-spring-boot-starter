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
 * LegalActDecision
 */

public class LegalActDecision   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("label")
  private String label;

  public LegalActDecision type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of decision
   * @return type
  */
  @ApiModelProperty(value = "Type of decision")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LegalActDecision label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Complementary information about the decision
   * @return label
  */
  @ApiModelProperty(value = "Complementary information about the decision")


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
    LegalActDecision legalActDecision = (LegalActDecision) o;
    return Objects.equals(this.type, legalActDecision.type) &&
        Objects.equals(this.label, legalActDecision.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalActDecision {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

