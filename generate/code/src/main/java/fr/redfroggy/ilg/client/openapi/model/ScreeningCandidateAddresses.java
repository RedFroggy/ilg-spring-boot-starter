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
 * ScreeningCandidateAddresses
 */

public class ScreeningCandidateAddresses   {
  @JsonProperty("street")
  private String street;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private String country;

  public ScreeningCandidateAddresses street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  @ApiModelProperty(example = "13 Quai Alphonse le Gallo", value = "")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public ScreeningCandidateAddresses postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  @ApiModelProperty(example = "92100", value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ScreeningCandidateAddresses city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(example = "Boulogne-Billancourt", value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ScreeningCandidateAddresses country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(example = "France", value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningCandidateAddresses screeningCandidateAddresses = (ScreeningCandidateAddresses) o;
    return Objects.equals(this.street, screeningCandidateAddresses.street) &&
        Objects.equals(this.postalCode, screeningCandidateAddresses.postalCode) &&
        Objects.equals(this.city, screeningCandidateAddresses.city) &&
        Objects.equals(this.country, screeningCandidateAddresses.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, postalCode, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidateAddresses {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

