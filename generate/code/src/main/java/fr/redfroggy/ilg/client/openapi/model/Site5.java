package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address17;
import fr.redfroggy.ilg.client.openapi.model.Workforce4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Site5
 */

public class Site5   {
  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("siteNumber")
  private String siteNumber;

  @JsonProperty("commercialName")
  private String commercialName;

  @JsonProperty("tradings")
  private String tradings;

  @JsonProperty("status")
  private Boolean status;

  @JsonProperty("creationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate creationDate;

  @JsonProperty("closingDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate closingDate;

  @JsonProperty("isHeadquarter")
  private Boolean isHeadquarter;

  @JsonProperty("address")
  private Address17 address;

  @JsonProperty("workforce")
  private Workforce4 workforce;

  public Site5 registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Fiscal registration Identifier
   * @return registrationId
  */
  @ApiModelProperty(example = "12345678900129", value = "Fiscal registration Identifier")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public Site5 siteNumber(String siteNumber) {
    this.siteNumber = siteNumber;
    return this;
  }

  /**
   * Establishment number
   * @return siteNumber
  */
  @ApiModelProperty(example = "00129", value = "Establishment number")


  public String getSiteNumber() {
    return siteNumber;
  }

  public void setSiteNumber(String siteNumber) {
    this.siteNumber = siteNumber;
  }

  public Site5 commercialName(String commercialName) {
    this.commercialName = commercialName;
    return this;
  }

  /**
   * Commercial Name of the establishment
   * @return commercialName
  */
  @ApiModelProperty(example = "World Aware", value = "Commercial Name of the establishment")


  public String getCommercialName() {
    return commercialName;
  }

  public void setCommercialName(String commercialName) {
    this.commercialName = commercialName;
  }

  public Site5 tradings(String tradings) {
    this.tradings = tradings;
    return this;
  }

  /**
   * Trading Name of the establishment
   * @return tradings
  */
  @ApiModelProperty(example = "GC Information", value = "Trading Name of the establishment")


  public String getTradings() {
    return tradings;
  }

  public void setTradings(String tradings) {
    this.tradings = tradings;
  }

  public Site5 status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the establishment is active or not
   * @return status
  */
  @ApiModelProperty(example = "true", value = "Whether the establishment is active or not")


  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Site5 creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * When the establishment opened
   * @return creationDate
  */
  @ApiModelProperty(value = "When the establishment opened")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Site5 closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * When the establishment closed (if status=false)
   * @return closingDate
  */
  @ApiModelProperty(value = "When the establishment closed (if status=false)")

  @Valid

  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public Site5 isHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
    return this;
  }

  /**
   * Whether the establishment is headquarter or not
   * @return isHeadquarter
  */
  @ApiModelProperty(example = "true", value = "Whether the establishment is headquarter or not")


  public Boolean getIsHeadquarter() {
    return isHeadquarter;
  }

  public void setIsHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
  }

  public Site5 address(Address17 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address17 getAddress() {
    return address;
  }

  public void setAddress(Address17 address) {
    this.address = address;
  }

  public Site5 workforce(Workforce4 workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Get workforce
   * @return workforce
  */
  @ApiModelProperty(value = "")

  @Valid

  public Workforce4 getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Workforce4 workforce) {
    this.workforce = workforce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site5 site5 = (Site5) o;
    return Objects.equals(this.registrationId, site5.registrationId) &&
        Objects.equals(this.siteNumber, site5.siteNumber) &&
        Objects.equals(this.commercialName, site5.commercialName) &&
        Objects.equals(this.tradings, site5.tradings) &&
        Objects.equals(this.status, site5.status) &&
        Objects.equals(this.creationDate, site5.creationDate) &&
        Objects.equals(this.closingDate, site5.closingDate) &&
        Objects.equals(this.isHeadquarter, site5.isHeadquarter) &&
        Objects.equals(this.address, site5.address) &&
        Objects.equals(this.workforce, site5.workforce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, siteNumber, commercialName, tradings, status, creationDate, closingDate, isHeadquarter, address, workforce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site5 {\n");
    
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    siteNumber: ").append(toIndentedString(siteNumber)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    workforce: ").append(toIndentedString(workforce)).append("\n");
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

