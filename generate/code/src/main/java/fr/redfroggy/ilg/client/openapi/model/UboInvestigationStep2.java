package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair7;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UboInvestigationStep2
 */

public class UboInvestigationStep2   {
  @JsonProperty("step")
  private String step;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("decision")
  private CodeLabelPair7 decision;

  public UboInvestigationStep2 step(String step) {
    this.step = step;
    return this;
  }

  /**
   * Investigation step name
   * @return step
  */
  @ApiModelProperty(value = "Investigation step name")


  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public UboInvestigationStep2 reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Investigation step result
   * @return reason
  */
  @ApiModelProperty(value = "Investigation step result")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public UboInvestigationStep2 decision(CodeLabelPair7 decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodeLabelPair7 getDecision() {
    return decision;
  }

  public void setDecision(CodeLabelPair7 decision) {
    this.decision = decision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UboInvestigationStep2 uboInvestigationStep2 = (UboInvestigationStep2) o;
    return Objects.equals(this.step, uboInvestigationStep2.step) &&
        Objects.equals(this.reason, uboInvestigationStep2.reason) &&
        Objects.equals(this.decision, uboInvestigationStep2.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, reason, decision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UboInvestigationStep2 {\n");
    
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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

