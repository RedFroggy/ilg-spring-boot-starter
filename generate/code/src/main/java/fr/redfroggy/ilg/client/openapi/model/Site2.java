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
 * Site2
 */

public class Site2   {
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

  @JsonProperty("origine")
  private String origine;

  public Site2 id(String id) {
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

  public Site2 companyId(String companyId) {
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

  public Site2 registrationId(String registrationId) {
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

  public Site2 siteNumber(String siteNumber) {
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

  public Site2 name(String name) {
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

  public Site2 commercialName(String commercialName) {
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

  public Site2 tradings(String tradings) {
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

  public Site2 status(Boolean status) {
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

  public Site2 isHeadquarter(Boolean isHeadquarter) {
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

  public Site2 origine(String origine) {
    this.origine = origine;
    return this;
  }

  /**
   * INSEE origin
   * @return origine
  */
  @ApiModelProperty(example = "Création", value = "INSEE origin")


  public String getOrigine() {
    return origine;
  }

  public void setOrigine(String origine) {
    this.origine = origine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site2 site2 = (Site2) o;
    return Objects.equals(this.id, site2.id) &&
        Objects.equals(this.companyId, site2.companyId) &&
        Objects.equals(this.registrationId, site2.registrationId) &&
        Objects.equals(this.siteNumber, site2.siteNumber) &&
        Objects.equals(this.name, site2.name) &&
        Objects.equals(this.commercialName, site2.commercialName) &&
        Objects.equals(this.tradings, site2.tradings) &&
        Objects.equals(this.status, site2.status) &&
        Objects.equals(this.isHeadquarter, site2.isHeadquarter) &&
        Objects.equals(this.origine, site2.origine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, registrationId, siteNumber, name, commercialName, tradings, status, isHeadquarter, origine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    siteNumber: ").append(toIndentedString(siteNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    origine: ").append(toIndentedString(origine)).append("\n");
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

