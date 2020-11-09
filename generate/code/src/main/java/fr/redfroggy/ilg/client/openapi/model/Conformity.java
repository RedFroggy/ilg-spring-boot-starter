package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ConformityRisk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conformity
 */

public class Conformity   {
  @JsonProperty("operatingRisk")
  private ConformityRisk operatingRisk;

  @JsonProperty("countryRisk")
  private ConformityRisk countryRisk;

  @JsonProperty("activityRisk")
  private ConformityRisk activityRisk;

  public Conformity operatingRisk(ConformityRisk operatingRisk) {
    this.operatingRisk = operatingRisk;
    return this;
  }

  /**
   * Get operatingRisk
   * @return operatingRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk getOperatingRisk() {
    return operatingRisk;
  }

  public void setOperatingRisk(ConformityRisk operatingRisk) {
    this.operatingRisk = operatingRisk;
  }

  public Conformity countryRisk(ConformityRisk countryRisk) {
    this.countryRisk = countryRisk;
    return this;
  }

  /**
   * Get countryRisk
   * @return countryRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk getCountryRisk() {
    return countryRisk;
  }

  public void setCountryRisk(ConformityRisk countryRisk) {
    this.countryRisk = countryRisk;
  }

  public Conformity activityRisk(ConformityRisk activityRisk) {
    this.activityRisk = activityRisk;
    return this;
  }

  /**
   * Get activityRisk
   * @return activityRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk getActivityRisk() {
    return activityRisk;
  }

  public void setActivityRisk(ConformityRisk activityRisk) {
    this.activityRisk = activityRisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conformity conformity = (Conformity) o;
    return Objects.equals(this.operatingRisk, conformity.operatingRisk) &&
        Objects.equals(this.countryRisk, conformity.countryRisk) &&
        Objects.equals(this.activityRisk, conformity.activityRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingRisk, countryRisk, activityRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conformity {\n");
    
    sb.append("    operatingRisk: ").append(toIndentedString(operatingRisk)).append("\n");
    sb.append("    countryRisk: ").append(toIndentedString(countryRisk)).append("\n");
    sb.append("    activityRisk: ").append(toIndentedString(activityRisk)).append("\n");
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

