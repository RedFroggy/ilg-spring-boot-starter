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
 * KycConformityStatusCountModel
 */

public class KycConformityStatusCountModel   {
  @JsonProperty("low")
  private Integer low;

  @JsonProperty("medium")
  private Integer medium;

  @JsonProperty("high")
  private Integer high;

  public KycConformityStatusCountModel low(Integer low) {
    this.low = low;
    return this;
  }

  /**
   * Low status count
   * @return low
  */
  @ApiModelProperty(example = "2", value = "Low status count")


  public Integer getLow() {
    return low;
  }

  public void setLow(Integer low) {
    this.low = low;
  }

  public KycConformityStatusCountModel medium(Integer medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Medium status count
   * @return medium
  */
  @ApiModelProperty(example = "1", value = "Medium status count")


  public Integer getMedium() {
    return medium;
  }

  public void setMedium(Integer medium) {
    this.medium = medium;
  }

  public KycConformityStatusCountModel high(Integer high) {
    this.high = high;
    return this;
  }

  /**
   * High status count
   * @return high
  */
  @ApiModelProperty(example = "0", value = "High status count")


  public Integer getHigh() {
    return high;
  }

  public void setHigh(Integer high) {
    this.high = high;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycConformityStatusCountModel kycConformityStatusCountModel = (KycConformityStatusCountModel) o;
    return Objects.equals(this.low, kycConformityStatusCountModel.low) &&
        Objects.equals(this.medium, kycConformityStatusCountModel.medium) &&
        Objects.equals(this.high, kycConformityStatusCountModel.high);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, medium, high);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycConformityStatusCountModel {\n");
    
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
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

