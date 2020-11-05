package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UboInvestigationStep
 */

public class UboInvestigationStep   {
  @JsonProperty("step")
  private String step;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("decision")
  private CodeLabelPair5 decision;

  public UboInvestigationStep step(String step) {
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

  public UboInvestigationStep reason(String reason) {
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

  public UboInvestigationStep decision(CodeLabelPair5 decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodeLabelPair5 getDecision() {
    return decision;
  }

  public void setDecision(CodeLabelPair5 decision) {
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
    UboInvestigationStep uboInvestigationStep = (UboInvestigationStep) o;
    return Objects.equals(this.step, uboInvestigationStep.step) &&
        Objects.equals(this.reason, uboInvestigationStep.reason) &&
        Objects.equals(this.decision, uboInvestigationStep.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, reason, decision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UboInvestigationStep {\n");
    
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

