package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.PostalAddressMailFormat2;
import fr.redfroggy.ilg.client.openapi.model.Street2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address2
 */

public class Address2   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("street")
  private String street;

  @JsonProperty("streetDetail")
  private Street2 streetDetail;

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
  private PostalAddressMailFormat2 mailFormatted;

  public Address2 country(String country) {
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

  public Address2 countryCode(String countryCode) {
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

  public Address2 street(String street) {
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

  public Address2 streetDetail(Street2 streetDetail) {
    this.streetDetail = streetDetail;
    return this;
  }

  /**
   * Get streetDetail
   * @return streetDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public Street2 getStreetDetail() {
    return streetDetail;
  }

  public void setStreetDetail(Street2 streetDetail) {
    this.streetDetail = streetDetail;
  }

  public Address2 street2(String street2) {
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

  public Address2 postalBoxNumber(String postalBoxNumber) {
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

  public Address2 region(String region) {
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

  public Address2 deptName(String deptName) {
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

  public Address2 postalCode(String postalCode) {
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

  public Address2 locality(String locality) {
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

  public Address2 mailFormatted(PostalAddressMailFormat2 mailFormatted) {
    this.mailFormatted = mailFormatted;
    return this;
  }

  /**
   * Get mailFormatted
   * @return mailFormatted
  */
  @ApiModelProperty(value = "")

  @Valid

  public PostalAddressMailFormat2 getMailFormatted() {
    return mailFormatted;
  }

  public void setMailFormatted(PostalAddressMailFormat2 mailFormatted) {
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
    Address2 address2 = (Address2) o;
    return Objects.equals(this.country, address2.country) &&
        Objects.equals(this.countryCode, address2.countryCode) &&
        Objects.equals(this.street, address2.street) &&
        Objects.equals(this.streetDetail, address2.streetDetail) &&
        Objects.equals(this.street2, address2.street2) &&
        Objects.equals(this.postalBoxNumber, address2.postalBoxNumber) &&
        Objects.equals(this.region, address2.region) &&
        Objects.equals(this.deptName, address2.deptName) &&
        Objects.equals(this.postalCode, address2.postalCode) &&
        Objects.equals(this.locality, address2.locality) &&
        Objects.equals(this.mailFormatted, address2.mailFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryCode, street, streetDetail, street2, postalBoxNumber, region, deptName, postalCode, locality, mailFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address2 {\n");
    
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

