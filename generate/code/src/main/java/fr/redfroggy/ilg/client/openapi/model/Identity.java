package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ActivityModel;
import fr.redfroggy.ilg.client.openapi.model.Address;
import fr.redfroggy.ilg.client.openapi.model.Contact2;
import fr.redfroggy.ilg.client.openapi.model.Cotation;
import fr.redfroggy.ilg.client.openapi.model.LegalFormModel;
import fr.redfroggy.ilg.client.openapi.model.MarketInformationModel;
import fr.redfroggy.ilg.client.openapi.model.SecondaryActivityModel;
import fr.redfroggy.ilg.client.openapi.model.Site2;
import fr.redfroggy.ilg.client.openapi.model.Workforce;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identity
 */

public class Identity   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("vatnumber")
  private String vatnumber;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tradings")
  private String tradings;

  @JsonProperty("acronym")
  private String acronym;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("headquarter")
  private Site2 headquarter;

  @JsonProperty("workforce")
  private Workforce workforce;

  @JsonProperty("contact")
  private Contact2 contact;

  @JsonProperty("legalForm")
  private LegalFormModel legalForm;

  @JsonProperty("activity")
  private ActivityModel activity;

  @JsonProperty("declaredActivity")
  private String declaredActivity;

  @JsonProperty("secondaryActivities")
  @Valid
  private List<SecondaryActivityModel> secondaryActivities = null;

  @JsonProperty("creationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate creationDate;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("rna")
  private String rna;

  @JsonProperty("capital")
  private String capital;

  @JsonProperty("rcs")
  private String rcs;

  @JsonProperty("cotation")
  private Cotation cotation;

  @JsonProperty("tags")
  @Valid
  private List<MarketInformationModel> tags = null;

  public Identity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Company Identifier
   * @return id
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Identity registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Fiscal Registration Number
   * @return registrationId
  */
  @ApiModelProperty(example = "0123456789", value = "Fiscal Registration Number")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public Identity vatnumber(String vatnumber) {
    this.vatnumber = vatnumber;
    return this;
  }

  /**
   * Tax registration number
   * @return vatnumber
  */
  @ApiModelProperty(example = "FR670123456789", value = "Tax registration number")


  public String getVatnumber() {
    return vatnumber;
  }

  public void setVatnumber(String vatnumber) {
    this.vatnumber = vatnumber;
  }

  public Identity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Company name
   * @return name
  */
  @ApiModelProperty(example = "Great Company", value = "Company name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Identity tradings(String tradings) {
    this.tradings = tradings;
    return this;
  }

  /**
   * Company trading name
   * @return tradings
  */
  @ApiModelProperty(example = "GC Information", value = "Company trading name")


  public String getTradings() {
    return tradings;
  }

  public void setTradings(String tradings) {
    this.tradings = tradings;
  }

  public Identity acronym(String acronym) {
    this.acronym = acronym;
    return this;
  }

  /**
   * Company acronym
   * @return acronym
  */
  @ApiModelProperty(example = "G.C.I", value = "Company acronym")


  public String getAcronym() {
    return acronym;
  }

  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  public Identity address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Identity headquarter(Site2 headquarter) {
    this.headquarter = headquarter;
    return this;
  }

  /**
   * Get headquarter
   * @return headquarter
  */
  @ApiModelProperty(value = "")

  @Valid

  public Site2 getHeadquarter() {
    return headquarter;
  }

  public void setHeadquarter(Site2 headquarter) {
    this.headquarter = headquarter;
  }

  public Identity workforce(Workforce workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Get workforce
   * @return workforce
  */
  @ApiModelProperty(value = "")

  @Valid

  public Workforce getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Workforce workforce) {
    this.workforce = workforce;
  }

  public Identity contact(Contact2 contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @ApiModelProperty(value = "")

  @Valid

  public Contact2 getContact() {
    return contact;
  }

  public void setContact(Contact2 contact) {
    this.contact = contact;
  }

  public Identity legalForm(LegalFormModel legalForm) {
    this.legalForm = legalForm;
    return this;
  }

  /**
   * Get legalForm
   * @return legalForm
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegalFormModel getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(LegalFormModel legalForm) {
    this.legalForm = legalForm;
  }

  public Identity activity(ActivityModel activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityModel getActivity() {
    return activity;
  }

  public void setActivity(ActivityModel activity) {
    this.activity = activity;
  }

  public Identity declaredActivity(String declaredActivity) {
    this.declaredActivity = declaredActivity;
    return this;
  }

  /**
   * Declared activity
   * @return declaredActivity
  */
  @ApiModelProperty(example = "Commerce de matériel audio", value = "Declared activity")


  public String getDeclaredActivity() {
    return declaredActivity;
  }

  public void setDeclaredActivity(String declaredActivity) {
    this.declaredActivity = declaredActivity;
  }

  public Identity secondaryActivities(List<SecondaryActivityModel> secondaryActivities) {
    this.secondaryActivities = secondaryActivities;
    return this;
  }

  public Identity addSecondaryActivitiesItem(SecondaryActivityModel secondaryActivitiesItem) {
    if (this.secondaryActivities == null) {
      this.secondaryActivities = new ArrayList<>();
    }
    this.secondaryActivities.add(secondaryActivitiesItem);
    return this;
  }

  /**
   * List of secondary activities
   * @return secondaryActivities
  */
  @ApiModelProperty(value = "List of secondary activities")

  @Valid

  public List<SecondaryActivityModel> getSecondaryActivities() {
    return secondaryActivities;
  }

  public void setSecondaryActivities(List<SecondaryActivityModel> secondaryActivities) {
    this.secondaryActivities = secondaryActivities;
  }

  public Identity creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * When the company was created
   * @return creationDate
  */
  @ApiModelProperty(value = "When the company was created")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Identity status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the company is active or not
   * @return status
  */
  @ApiModelProperty(example = "1", value = "Whether the company is active or not")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Identity rna(String rna) {
    this.rna = rna;
    return this;
  }

  /**
   * RNA (Répertoire National des Associations) number if company registred as association or null
   * @return rna
  */
  @ApiModelProperty(example = "W452006858", value = "RNA (Répertoire National des Associations) number if company registred as association or null")


  public String getRna() {
    return rna;
  }

  public void setRna(String rna) {
    this.rna = rna;
  }

  public Identity capital(String capital) {
    this.capital = capital;
    return this;
  }

  /**
   * Company Capitalization
   * @return capital
  */
  @ApiModelProperty(value = "Company Capitalization")


  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public Identity rcs(String rcs) {
    this.rcs = rcs;
    return this;
  }

  /**
   * Institution in which the company is registered
   * @return rcs
  */
  @ApiModelProperty(example = "RCS Paris", value = "Institution in which the company is registered")


  public String getRcs() {
    return rcs;
  }

  public void setRcs(String rcs) {
    this.rcs = rcs;
  }

  public Identity cotation(Cotation cotation) {
    this.cotation = cotation;
    return this;
  }

  /**
   * Get cotation
   * @return cotation
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cotation getCotation() {
    return cotation;
  }

  public void setCotation(Cotation cotation) {
    this.cotation = cotation;
  }

  public Identity tags(List<MarketInformationModel> tags) {
    this.tags = tags;
    return this;
  }

  public Identity addTagsItem(MarketInformationModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Market information
   * @return tags
  */
  @ApiModelProperty(value = "Market information")

  @Valid

  public List<MarketInformationModel> getTags() {
    return tags;
  }

  public void setTags(List<MarketInformationModel> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.id, identity.id) &&
        Objects.equals(this.registrationId, identity.registrationId) &&
        Objects.equals(this.vatnumber, identity.vatnumber) &&
        Objects.equals(this.name, identity.name) &&
        Objects.equals(this.tradings, identity.tradings) &&
        Objects.equals(this.acronym, identity.acronym) &&
        Objects.equals(this.address, identity.address) &&
        Objects.equals(this.headquarter, identity.headquarter) &&
        Objects.equals(this.workforce, identity.workforce) &&
        Objects.equals(this.contact, identity.contact) &&
        Objects.equals(this.legalForm, identity.legalForm) &&
        Objects.equals(this.activity, identity.activity) &&
        Objects.equals(this.declaredActivity, identity.declaredActivity) &&
        Objects.equals(this.secondaryActivities, identity.secondaryActivities) &&
        Objects.equals(this.creationDate, identity.creationDate) &&
        Objects.equals(this.status, identity.status) &&
        Objects.equals(this.rna, identity.rna) &&
        Objects.equals(this.capital, identity.capital) &&
        Objects.equals(this.rcs, identity.rcs) &&
        Objects.equals(this.cotation, identity.cotation) &&
        Objects.equals(this.tags, identity.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, registrationId, vatnumber, name, tradings, acronym, address, headquarter, workforce, contact, legalForm, activity, declaredActivity, secondaryActivities, creationDate, status, rna, capital, rcs, cotation, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    vatnumber: ").append(toIndentedString(vatnumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    acronym: ").append(toIndentedString(acronym)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    workforce: ").append(toIndentedString(workforce)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    declaredActivity: ").append(toIndentedString(declaredActivity)).append("\n");
    sb.append("    secondaryActivities: ").append(toIndentedString(secondaryActivities)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rna: ").append(toIndentedString(rna)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    rcs: ").append(toIndentedString(rcs)).append("\n");
    sb.append("    cotation: ").append(toIndentedString(cotation)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

