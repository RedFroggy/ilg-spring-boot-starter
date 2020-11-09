package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Insolvency2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Risk2
 */

public class Risk2   {
  @JsonProperty("class")
  private String propertyClass;

  @JsonProperty("label")
  private String label;

  @JsonProperty("status")
  private String status;

  @JsonProperty("insolvency")
  private Insolvency2 insolvency;

  public Risk2 propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Risk class as a score range
   * @return propertyClass
  */
  @ApiModelProperty(example = "3-5", value = "Risk class as a score range")


  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Risk2 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Risk class label
   * @return label
  */
  @ApiModelProperty(example = "Risque élevé", value = "Risk class label")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Risk2 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Company Status, values can be 'active', 'insolvancy' or 'closed'
   * @return status
  */
  @ApiModelProperty(example = "active", value = "Company Status, values can be 'active', 'insolvancy' or 'closed'")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Risk2 insolvency(Insolvency2 insolvency) {
    this.insolvency = insolvency;
    return this;
  }

  /**
   * Get insolvency
   * @return insolvency
  */
  @ApiModelProperty(value = "")

  @Valid

  public Insolvency2 getInsolvency() {
    return insolvency;
  }

  public void setInsolvency(Insolvency2 insolvency) {
    this.insolvency = insolvency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Risk2 risk2 = (Risk2) o;
    return Objects.equals(this.propertyClass, risk2.propertyClass) &&
        Objects.equals(this.label, risk2.label) &&
        Objects.equals(this.status, risk2.status) &&
        Objects.equals(this.insolvency, risk2.insolvency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, label, status, insolvency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Risk2 {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    insolvency: ").append(toIndentedString(insolvency)).append("\n");
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

