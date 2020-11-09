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
 * Address13
 */

public class Address13   {
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

  @JsonProperty("deptName")
  private String deptName;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("locality")
  private String locality;

  @JsonProperty("mailFormatted")
  private Object mailFormatted;

  public Address13 country(String country) {
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

  public Address13 countryCode(String countryCode) {
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

  public Address13 street(String street) {
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

  public Address13 streetDetail(Object streetDetail) {
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

  public Address13 street2(String street2) {
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

  public Address13 postalBoxNumber(String postalBoxNumber) {
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

  public Address13 region(String region) {
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

  public Address13 deptName(String deptName) {
    this.deptName = deptName;
    return this;
  }

  /**
   * Department name
   * @return deptName
  */
  @ApiModelProperty(example = "Paris", value = "Department name")


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public Address13 postalCode(String postalCode) {
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

  public Address13 locality(String locality) {
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

  public Address13 mailFormatted(Object mailFormatted) {
    this.mailFormatted = mailFormatted;
    return this;
  }

  /**
   * Get mailFormatted
   * @return mailFormatted
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMailFormatted() {
    return mailFormatted;
  }

  public void setMailFormatted(Object mailFormatted) {
    this.mailFormatted = mailFormatted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address13 address13 = (Address13) o;
    return Objects.equals(this.country, address13.country) &&
        Objects.equals(this.countryCode, address13.countryCode) &&
        Objects.equals(this.street, address13.street) &&
        Objects.equals(this.streetDetail, address13.streetDetail) &&
        Objects.equals(this.street2, address13.street2) &&
        Objects.equals(this.postalBoxNumber, address13.postalBoxNumber) &&
        Objects.equals(this.region, address13.region) &&
        Objects.equals(this.deptName, address13.deptName) &&
        Objects.equals(this.postalCode, address13.postalCode) &&
        Objects.equals(this.locality, address13.locality) &&
        Objects.equals(this.mailFormatted, address13.mailFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryCode, street, streetDetail, street2, postalBoxNumber, region, deptName, postalCode, locality, mailFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address13 {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetDetail: ").append(toIndentedString(streetDetail)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalBoxNumber: ").append(toIndentedString(postalBoxNumber)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    mailFormatted: ").append(toIndentedString(mailFormatted)).append("\n");
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

