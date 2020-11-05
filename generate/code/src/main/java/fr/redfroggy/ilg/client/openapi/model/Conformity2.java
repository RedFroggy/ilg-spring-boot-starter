package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ConformityRisk2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conformity2
 */

public class Conformity2   {
  @JsonProperty("operatingRisk")
  private ConformityRisk2 operatingRisk;

  @JsonProperty("countryRisk")
  private ConformityRisk2 countryRisk;

  @JsonProperty("activityRisk")
  private ConformityRisk2 activityRisk;

  public Conformity2 operatingRisk(ConformityRisk2 operatingRisk) {
    this.operatingRisk = operatingRisk;
    return this;
  }

  /**
   * Get operatingRisk
   * @return operatingRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk2 getOperatingRisk() {
    return operatingRisk;
  }

  public void setOperatingRisk(ConformityRisk2 operatingRisk) {
    this.operatingRisk = operatingRisk;
  }

  public Conformity2 countryRisk(ConformityRisk2 countryRisk) {
    this.countryRisk = countryRisk;
    return this;
  }

  /**
   * Get countryRisk
   * @return countryRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk2 getCountryRisk() {
    return countryRisk;
  }

  public void setCountryRisk(ConformityRisk2 countryRisk) {
    this.countryRisk = countryRisk;
  }

  public Conformity2 activityRisk(ConformityRisk2 activityRisk) {
    this.activityRisk = activityRisk;
    return this;
  }

  /**
   * Get activityRisk
   * @return activityRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRisk2 getActivityRisk() {
    return activityRisk;
  }

  public void setActivityRisk(ConformityRisk2 activityRisk) {
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
    Conformity2 conformity2 = (Conformity2) o;
    return Objects.equals(this.operatingRisk, conformity2.operatingRisk) &&
        Objects.equals(this.countryRisk, conformity2.countryRisk) &&
        Objects.equals(this.activityRisk, conformity2.activityRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingRisk, countryRisk, activityRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conformity2 {\n");
    
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

