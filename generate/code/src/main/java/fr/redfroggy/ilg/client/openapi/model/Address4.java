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
 * Address4
 */

public class Address4   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("street")
  private String street;

  @JsonProperty("streetDetail")
  private Object streetDetail;

  @JsonProperty("street2")
  private String street2;

  @JsonProperty("postalBoxNumber")
  private String postalBoxNumber;

  @JsonProperty("region")
  private String region;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("locality")
  private String locality;

  public Address4 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country name
   * @return country
  */
  @ApiModelProperty(example = "France", value = "Country name")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address4 countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code (ISO 3166-2)
   * @return countryCode
  */
  @ApiModelProperty(example = "FR", value = "Country code (ISO 3166-2)")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address4 street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street address
   * @return street
  */
  @ApiModelProperty(example = "1 rue Michel Vaillant", value = "Street address")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address4 streetDetail(Object streetDetail) {
    this.streetDetail = streetDetail;
    return this;
  }

  /**
   * Get streetDetail
   * @return streetDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getStreetDetail() {
    return streetDetail;
  }

  public void setStreetDetail(Object streetDetail) {
    this.streetDetail = streetDetail;
  }

  public Address4 street2(String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * Street address 2
   * @return street2
  */
  @ApiModelProperty(example = "Enco de Botte", value = "Street address 2")


  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public Address4 postalBoxNumber(String postalBoxNumber) {
    this.postalBoxNumber = postalBoxNumber;
    return this;
  }

  /**
   * Postal Box number
   * @return postalBoxNumber
  */
  @ApiModelProperty(example = "BP 001", value = "Postal Box number")


  public String getPostalBoxNumber() {
    return postalBoxNumber;
  }

  public void setPostalBoxNumber(String postalBoxNumber) {
    this.postalBoxNumber = postalBoxNumber;
  }

  public Address4 region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Region name
   * @return region
  */
  @ApiModelProperty(example = "Île-de-France", value = "Region name")


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Address4 postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code
   * @return postalCode
  */
  @ApiModelProperty(example = "75000", value = "Postal Code")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address4 locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * City
   * @return locality
  */
  @ApiModelProperty(example = "Paris", value = "City")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address4 address4 = (Address4) o;
    return Objects.equals(this.country, address4.country) &&
        Objects.equals(this.countryCode, address4.countryCode) &&
        Objects.equals(this.street, address4.street) &&
        Objects.equals(this.streetDetail, address4.streetDetail) &&
        Objects.equals(this.street2, address4.street2) &&
        Objects.equals(this.postalBoxNumber, address4.postalBoxNumber) &&
        Objects.equals(this.region, address4.region) &&
        Objects.equals(this.postalCode, address4.postalCode) &&
        Objects.equals(this.locality, address4.locality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryCode, street, streetDetail, street2, postalBoxNumber, region, postalCode, locality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address4 {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetDetail: ").append(toIndentedString(streetDetail)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalBoxNumber: ").append(toIndentedString(postalBoxNumber)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
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

