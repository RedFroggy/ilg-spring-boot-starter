package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address16;
import fr.redfroggy.ilg.client.openapi.model.Company5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Site4
 */

public class Site4   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("siteNumber")
  private String siteNumber;

  @JsonProperty("name")
  private String name;

  @JsonProperty("commercialName")
  private String commercialName;

  @JsonProperty("tradings")
  private String tradings;

  @JsonProperty("status")
  private Boolean status;

  @JsonProperty("isHeadquarter")
  private Boolean isHeadquarter;

  @JsonProperty("address")
  private Address16 address;

  @JsonProperty("company")
  private Company5 company;

  public Site4 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for an establishment
   * @return id
  */
  @ApiModelProperty(example = "12345678900129", value = "Identifier for an establishment")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Site4 companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Identifier for the company owning the establishment
   * @return companyId
  */
  @ApiModelProperty(example = "123456789", value = "Identifier for the company owning the establishment")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Site4 registrationId(String registrationId) {
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

  public Site4 siteNumber(String siteNumber) {
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

  public Site4 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the establishment
   * @return name
  */
  @ApiModelProperty(example = "Great Company", value = "Name of the establishment")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Site4 commercialName(String commercialName) {
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

  public Site4 tradings(String tradings) {
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

  public Site4 status(Boolean status) {
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

  public Site4 isHeadquarter(Boolean isHeadquarter) {
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

  public Site4 address(Address16 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address16 getAddress() {
    return address;
  }

  public void setAddress(Address16 address) {
    this.address = address;
  }

  public Site4 company(Company5 company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public Company5 getCompany() {
    return company;
  }

  public void setCompany(Company5 company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site4 site4 = (Site4) o;
    return Objects.equals(this.id, site4.id) &&
        Objects.equals(this.companyId, site4.companyId) &&
        Objects.equals(this.registrationId, site4.registrationId) &&
        Objects.equals(this.siteNumber, site4.siteNumber) &&
        Objects.equals(this.name, site4.name) &&
        Objects.equals(this.commercialName, site4.commercialName) &&
        Objects.equals(this.tradings, site4.tradings) &&
        Objects.equals(this.status, site4.status) &&
        Objects.equals(this.isHeadquarter, site4.isHeadquarter) &&
        Objects.equals(this.address, site4.address) &&
        Objects.equals(this.company, site4.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, registrationId, siteNumber, name, commercialName, tradings, status, isHeadquarter, address, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site4 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    siteNumber: ").append(toIndentedString(siteNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

