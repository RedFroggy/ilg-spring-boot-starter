package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address15;
import fr.redfroggy.ilg.client.openapi.model.Workforce3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Site3
 */

public class Site3   {
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

  @JsonProperty("sigle")
  private String sigle;

  @JsonProperty("status")
  private Boolean status;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("closingDate")
  private LocalDate closingDate;

  @JsonProperty("isHeadquarter")
  private Boolean isHeadquarter;

  @JsonProperty("address")
  private Address15 address;

  @JsonProperty("headquarter")
  private Site3 headquarter;

  @JsonProperty("workforce")
  private Workforce3 workforce;

  @JsonProperty("activity")
  private Object activity;

  @JsonProperty("tailleUniteUrbaine")
  private Integer tailleUniteUrbaine;

  @JsonProperty("trancheCommune")
  private String trancheCommune;

  @JsonProperty("lieuActivite")
  private String lieuActivite;

  @JsonProperty("surface")
  private String surface;

  @JsonProperty("origine")
  private String origine;

  public Site3 id(String id) {
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

  public Site3 companyId(String companyId) {
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

  public Site3 registrationId(String registrationId) {
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

  public Site3 siteNumber(String siteNumber) {
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

  public Site3 name(String name) {
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

  public Site3 commercialName(String commercialName) {
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

  public Site3 tradings(String tradings) {
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

  public Site3 sigle(String sigle) {
    this.sigle = sigle;
    return this;
  }

  /**
   * Acronym of the establishment
   * @return sigle
  */
  @ApiModelProperty(example = "G.C.W.A.", value = "Acronym of the establishment")


  public String getSigle() {
    return sigle;
  }

  public void setSigle(String sigle) {
    this.sigle = sigle;
  }

  public Site3 status(Boolean status) {
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

  public Site3 creationDate(LocalDate creationDate) {
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

  public Site3 closingDate(LocalDate closingDate) {
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

  public Site3 isHeadquarter(Boolean isHeadquarter) {
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

  public Site3 address(Address15 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address15 getAddress() {
    return address;
  }

  public void setAddress(Address15 address) {
    this.address = address;
  }

  public Site3 headquarter(Site3 headquarter) {
    this.headquarter = headquarter;
    return this;
  }

  /**
   * Get headquarter
   * @return headquarter
  */
  @ApiModelProperty(value = "")

  @Valid

  public Site3 getHeadquarter() {
    return headquarter;
  }

  public void setHeadquarter(Site3 headquarter) {
    this.headquarter = headquarter;
  }

  public Site3 workforce(Workforce3 workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Get workforce
   * @return workforce
  */
  @ApiModelProperty(value = "")

  @Valid

  public Workforce3 getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Workforce3 workforce) {
    this.workforce = workforce;
  }

  public Site3 activity(Object activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getActivity() {
    return activity;
  }

  public void setActivity(Object activity) {
    this.activity = activity;
  }

  public Site3 tailleUniteUrbaine(Integer tailleUniteUrbaine) {
    this.tailleUniteUrbaine = tailleUniteUrbaine;
    return this;
  }

  /**
   * Size of urban unit
   * @return tailleUniteUrbaine
  */
  @ApiModelProperty(value = "Size of urban unit")


  public Integer getTailleUniteUrbaine() {
    return tailleUniteUrbaine;
  }

  public void setTailleUniteUrbaine(Integer tailleUniteUrbaine) {
    this.tailleUniteUrbaine = tailleUniteUrbaine;
  }

  public Site3 trancheCommune(String trancheCommune) {
    this.trancheCommune = trancheCommune;
    return this;
  }

  /**
   * Range size of city where the establishment is located
   * @return trancheCommune
  */
  @ApiModelProperty(example = "10000 - 100000", value = "Range size of city where the establishment is located")


  public String getTrancheCommune() {
    return trancheCommune;
  }

  public void setTrancheCommune(String trancheCommune) {
    this.trancheCommune = trancheCommune;
  }

  public Site3 lieuActivite(String lieuActivite) {
    this.lieuActivite = lieuActivite;
    return this;
  }

  /**
   * à compléter
   * @return lieuActivite
  */
  @ApiModelProperty(value = "à compléter")


  public String getLieuActivite() {
    return lieuActivite;
  }

  public void setLieuActivite(String lieuActivite) {
    this.lieuActivite = lieuActivite;
  }

  public Site3 surface(String surface) {
    this.surface = surface;
    return this;
  }

  /**
   * à compléter
   * @return surface
  */
  @ApiModelProperty(value = "à compléter")


  public String getSurface() {
    return surface;
  }

  public void setSurface(String surface) {
    this.surface = surface;
  }

  public Site3 origine(String origine) {
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
    Site3 site3 = (Site3) o;
    return Objects.equals(this.id, site3.id) &&
        Objects.equals(this.companyId, site3.companyId) &&
        Objects.equals(this.registrationId, site3.registrationId) &&
        Objects.equals(this.siteNumber, site3.siteNumber) &&
        Objects.equals(this.name, site3.name) &&
        Objects.equals(this.commercialName, site3.commercialName) &&
        Objects.equals(this.tradings, site3.tradings) &&
        Objects.equals(this.sigle, site3.sigle) &&
        Objects.equals(this.status, site3.status) &&
        Objects.equals(this.creationDate, site3.creationDate) &&
        Objects.equals(this.closingDate, site3.closingDate) &&
        Objects.equals(this.isHeadquarter, site3.isHeadquarter) &&
        Objects.equals(this.address, site3.address) &&
        Objects.equals(this.headquarter, site3.headquarter) &&
        Objects.equals(this.workforce, site3.workforce) &&
        Objects.equals(this.activity, site3.activity) &&
        Objects.equals(this.tailleUniteUrbaine, site3.tailleUniteUrbaine) &&
        Objects.equals(this.trancheCommune, site3.trancheCommune) &&
        Objects.equals(this.lieuActivite, site3.lieuActivite) &&
        Objects.equals(this.surface, site3.surface) &&
        Objects.equals(this.origine, site3.origine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, registrationId, siteNumber, name, commercialName, tradings, sigle, status, creationDate, closingDate, isHeadquarter, address, headquarter, workforce, activity, tailleUniteUrbaine, trancheCommune, lieuActivite, surface, origine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site3 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    siteNumber: ").append(toIndentedString(siteNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    sigle: ").append(toIndentedString(sigle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    workforce: ").append(toIndentedString(workforce)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    tailleUniteUrbaine: ").append(toIndentedString(tailleUniteUrbaine)).append("\n");
    sb.append("    trancheCommune: ").append(toIndentedString(trancheCommune)).append("\n");
    sb.append("    lieuActivite: ").append(toIndentedString(lieuActivite)).append("\n");
    sb.append("    surface: ").append(toIndentedString(surface)).append("\n");
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

