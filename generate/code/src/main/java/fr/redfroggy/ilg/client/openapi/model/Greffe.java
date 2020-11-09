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
 * Greffe
 */

public class Greffe   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("city")
  private String city;

  @JsonProperty("groupement")
  private String groupement;

  public Greffe code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Greffe code
   * @return code
  */
  @ApiModelProperty(example = "0605", value = "Greffe code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Greffe city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Greffe city
   * @return city
  */
  @ApiModelProperty(example = "NICE", value = "Greffe city")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Greffe groupement(String groupement) {
    this.groupement = groupement;
    return this;
  }

  /**
   * Greffe group
   * @return groupement
  */
  @ApiModelProperty(example = "INTERGREFFE", value = "Greffe group")


  public String getGroupement() {
    return groupement;
  }

  public void setGroupement(String groupement) {
    this.groupement = groupement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Greffe greffe = (Greffe) o;
    return Objects.equals(this.code, greffe.code) &&
        Objects.equals(this.city, greffe.city) &&
        Objects.equals(this.groupement, greffe.groupement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, city, groupement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greffe {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    groupement: ").append(toIndentedString(groupement)).append("\n");
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

