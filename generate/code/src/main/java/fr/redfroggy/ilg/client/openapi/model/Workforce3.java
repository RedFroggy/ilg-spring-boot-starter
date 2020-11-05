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
 * Workforce3
 */

public class Workforce3   {
  @JsonProperty("value")
  private String value;

  @JsonProperty("range")
  private String range;

  @JsonProperty("rangeMin")
  private Integer rangeMin;

  @JsonProperty("rangeMax")
  private Integer rangeMax;

  public Workforce3 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Number of employee, can be 'NN' indicating that no data has been collected
   * @return value
  */
  @ApiModelProperty(example = "10", value = "Number of employee, can be 'NN' indicating that no data has been collected")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Workforce3 range(String range) {
    this.range = range;
    return this;
  }

  /**
   * Range of employees
   * @return range
  */
  @ApiModelProperty(example = "10 - 50", value = "Range of employees")


  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public Workforce3 rangeMin(Integer rangeMin) {
    this.rangeMin = rangeMin;
    return this;
  }

  /**
   * Range minimum
   * @return rangeMin
  */
  @ApiModelProperty(example = "10", value = "Range minimum")


  public Integer getRangeMin() {
    return rangeMin;
  }

  public void setRangeMin(Integer rangeMin) {
    this.rangeMin = rangeMin;
  }

  public Workforce3 rangeMax(Integer rangeMax) {
    this.rangeMax = rangeMax;
    return this;
  }

  /**
   * Range maximum
   * @return rangeMax
  */
  @ApiModelProperty(example = "50", value = "Range maximum")


  public Integer getRangeMax() {
    return rangeMax;
  }

  public void setRangeMax(Integer rangeMax) {
    this.rangeMax = rangeMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workforce3 workforce3 = (Workforce3) o;
    return Objects.equals(this.value, workforce3.value) &&
        Objects.equals(this.range, workforce3.range) &&
        Objects.equals(this.rangeMin, workforce3.rangeMin) &&
        Objects.equals(this.rangeMax, workforce3.rangeMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, range, rangeMin, rangeMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workforce3 {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    rangeMin: ").append(toIndentedString(rangeMin)).append("\n");
    sb.append("    rangeMax: ").append(toIndentedString(rangeMax)).append("\n");
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

