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
 * SupervisionCustomData
 */

public class SupervisionCustomData   {
  @JsonProperty("customCode")
  private String customCode;

  @JsonProperty("customCredit")
  private Integer customCredit;

  public SupervisionCustomData customCode(String customCode) {
    this.customCode = customCode;
    return this;
  }

  /**
   * Custom reference for a supervision
   * @return customCode
  */
  @ApiModelProperty(example = "AD-2456-87", value = "Custom reference for a supervision")


  public String getCustomCode() {
    return customCode;
  }

  public void setCustomCode(String customCode) {
    this.customCode = customCode;
  }

  public SupervisionCustomData customCredit(Integer customCredit) {
    this.customCredit = customCredit;
    return this;
  }

  /**
   * Custom credit allowed
   * @return customCredit
  */
  @ApiModelProperty(example = "5000", value = "Custom credit allowed")


  public Integer getCustomCredit() {
    return customCredit;
  }

  public void setCustomCredit(Integer customCredit) {
    this.customCredit = customCredit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupervisionCustomData supervisionCustomData = (SupervisionCustomData) o;
    return Objects.equals(this.customCode, supervisionCustomData.customCode) &&
        Objects.equals(this.customCredit, supervisionCustomData.customCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customCode, customCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupervisionCustomData {\n");
    
    sb.append("    customCode: ").append(toIndentedString(customCode)).append("\n");
    sb.append("    customCredit: ").append(toIndentedString(customCredit)).append("\n");
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

