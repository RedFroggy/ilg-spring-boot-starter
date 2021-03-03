package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address2;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair3;
import fr.redfroggy.ilg.client.openapi.model.Company4;
import fr.redfroggy.ilg.client.openapi.model.SiteEvents;
import fr.redfroggy.ilg.client.openapi.model.Workforce2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Site
 */

public class Site   {
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
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate creationDate;

  @JsonProperty("closingDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate closingDate;

  @JsonProperty("isHeadquarter")
  private Boolean isHeadquarter;

  @JsonProperty("address")
  private Address2 address;

  @JsonProperty("headquarter")
  private Site headquarter;

  @JsonProperty("workforce")
  private Workforce2 workforce;

  @JsonProperty("activity")
  private CodeLabelPair3 activity;

  @JsonProperty("company")
  private Company4 company;

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

  @JsonProperty("events")
  @Valid
  private List<SiteEvents> events = null;

  public Site id(String id) {
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

  public Site companyId(String companyId) {
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

  public Site registrationId(String registrationId) {
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

  public Site siteNumber(String siteNumber) {
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

  public Site name(String name) {
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

  public Site commercialName(String commercialName) {
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

  public Site tradings(String tradings) {
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

  public Site sigle(String sigle) {
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

  public Site status(Boolean status) {
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

  public Site creationDate(LocalDate creationDate) {
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

  public Site closingDate(LocalDate closingDate) {
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

  public Site isHeadquarter(Boolean isHeadquarter) {
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

  public Site address(Address2 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address2 getAddress() {
    return address;
  }

  public void setAddress(Address2 address) {
    this.address = address;
  }

  public Site headquarter(Site headquarter) {
    this.headquarter = headquarter;
    return this;
  }

  /**
   * Get headquarter
   * @return headquarter
  */
  @ApiModelProperty(value = "")

  @Valid

  public Site getHeadquarter() {
    return headquarter;
  }

  public void setHeadquarter(Site headquarter) {
    this.headquarter = headquarter;
  }

  public Site workforce(Workforce2 workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Get workforce
   * @return workforce
  */
  @ApiModelProperty(value = "")

  @Valid

  public Workforce2 getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Workforce2 workforce) {
    this.workforce = workforce;
  }

  public Site activity(CodeLabelPair3 activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodeLabelPair3 getActivity() {
    return activity;
  }

  public void setActivity(CodeLabelPair3 activity) {
    this.activity = activity;
  }

  public Site company(Company4 company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public Company4 getCompany() {
    return company;
  }

  public void setCompany(Company4 company) {
    this.company = company;
  }

  public Site tailleUniteUrbaine(Integer tailleUniteUrbaine) {
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

  public Site trancheCommune(String trancheCommune) {
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

  public Site lieuActivite(String lieuActivite) {
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

  public Site surface(String surface) {
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

  public Site origine(String origine) {
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

  public Site events(List<SiteEvents> events) {
    this.events = events;
    return this;
  }

  public Site addEventsItem(SiteEvents eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * list of event
   * @return events
  */
  @ApiModelProperty(value = "list of event")

  @Valid

  public List<SiteEvents> getEvents() {
    return events;
  }

  public void setEvents(List<SiteEvents> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.id, site.id) &&
        Objects.equals(this.companyId, site.companyId) &&
        Objects.equals(this.registrationId, site.registrationId) &&
        Objects.equals(this.siteNumber, site.siteNumber) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.commercialName, site.commercialName) &&
        Objects.equals(this.tradings, site.tradings) &&
        Objects.equals(this.sigle, site.sigle) &&
        Objects.equals(this.status, site.status) &&
        Objects.equals(this.creationDate, site.creationDate) &&
        Objects.equals(this.closingDate, site.closingDate) &&
        Objects.equals(this.isHeadquarter, site.isHeadquarter) &&
        Objects.equals(this.address, site.address) &&
        Objects.equals(this.headquarter, site.headquarter) &&
        Objects.equals(this.workforce, site.workforce) &&
        Objects.equals(this.activity, site.activity) &&
        Objects.equals(this.company, site.company) &&
        Objects.equals(this.tailleUniteUrbaine, site.tailleUniteUrbaine) &&
        Objects.equals(this.trancheCommune, site.trancheCommune) &&
        Objects.equals(this.lieuActivite, site.lieuActivite) &&
        Objects.equals(this.surface, site.surface) &&
        Objects.equals(this.origine, site.origine) &&
        Objects.equals(this.events, site.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, registrationId, siteNumber, name, commercialName, tradings, sigle, status, creationDate, closingDate, isHeadquarter, address, headquarter, workforce, activity, company, tailleUniteUrbaine, trancheCommune, lieuActivite, surface, origine, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
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
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    tailleUniteUrbaine: ").append(toIndentedString(tailleUniteUrbaine)).append("\n");
    sb.append("    trancheCommune: ").append(toIndentedString(trancheCommune)).append("\n");
    sb.append("    lieuActivite: ").append(toIndentedString(lieuActivite)).append("\n");
    sb.append("    surface: ").append(toIndentedString(surface)).append("\n");
    sb.append("    origine: ").append(toIndentedString(origine)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

