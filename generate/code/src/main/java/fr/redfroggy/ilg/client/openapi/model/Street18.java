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
 * Street18
 */

public class Street18   {
  @JsonProperty("number")
  private String number;

  @JsonProperty("repetition")
  private String repetition;

  @JsonProperty("streetType")
  private String streetType;

  @JsonProperty("streetName")
  private String streetName;

  public Street18 number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Street number
   * @return number
  */
  @ApiModelProperty(example = "1", value = "Street number")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Street18 repetition(String repetition) {
    this.repetition = repetition;
    return this;
  }

  /**
   * Street number repetition
   * @return repetition
  */
  @ApiModelProperty(example = "bis", value = "Street number repetition")


  public String getRepetition() {
    return repetition;
  }

  public void setRepetition(String repetition) {
    this.repetition = repetition;
  }

  public Street18 streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * Street Type
   * @return streetType
  */
  @ApiModelProperty(example = "rue", value = "Street Type")


  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Street18 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street name
   * @return streetName
  */
  @ApiModelProperty(example = "de la baule", value = "Street name")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Street18 street18 = (Street18) o;
    return Objects.equals(this.number, street18.number) &&
        Objects.equals(this.repetition, street18.repetition) &&
        Objects.equals(this.streetType, street18.streetType) &&
        Objects.equals(this.streetName, street18.streetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, repetition, streetType, streetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Street18 {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    repetition: ").append(toIndentedString(repetition)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
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

