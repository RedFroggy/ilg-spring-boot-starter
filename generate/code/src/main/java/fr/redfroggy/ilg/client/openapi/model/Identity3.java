package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address15;
import fr.redfroggy.ilg.client.openapi.model.Contact3;
import fr.redfroggy.ilg.client.openapi.model.Site3;
import fr.redfroggy.ilg.client.openapi.model.Workforce3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identity3
 */

public class Identity3   {
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
  private Address15 address;

  @JsonProperty("headquarter")
  private Site3 headquarter;

  @JsonProperty("workforce")
  private Workforce3 workforce;

  @JsonProperty("contact")
  private Contact3 contact;

  @JsonProperty("legalForm")
  private Object legalForm;

  @JsonProperty("activity")
  private Object activity;

  @JsonProperty("declaredActivity")
  private String declaredActivity;

  @JsonProperty("secondaryActivities")
  @Valid
  private List<Object> secondaryActivities = null;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("rna")
  private String rna;

  @JsonProperty("capital")
  private String capital;

  @JsonProperty("tags")
  @Valid
  private List<Object> tags = null;

  public Identity3 id(String id) {
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

  public Identity3 registrationId(String registrationId) {
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

  public Identity3 vatnumber(String vatnumber) {
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

  public Identity3 name(String name) {
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

  public Identity3 tradings(String tradings) {
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

  public Identity3 acronym(String acronym) {
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

  public Identity3 address(Address15 address) {
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

  public Identity3 headquarter(Site3 headquarter) {
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

  public Identity3 workforce(Workforce3 workforce) {
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

  public Identity3 contact(Contact3 contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @ApiModelProperty(value = "")

  @Valid

  public Contact3 getContact() {
    return contact;
  }

  public void setContact(Contact3 contact) {
    this.contact = contact;
  }

  public Identity3 legalForm(Object legalForm) {
    this.legalForm = legalForm;
    return this;
  }

  /**
   * Get legalForm
   * @return legalForm
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(Object legalForm) {
    this.legalForm = legalForm;
  }

  public Identity3 activity(Object activity) {
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

  public Identity3 declaredActivity(String declaredActivity) {
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

  public Identity3 secondaryActivities(List<Object> secondaryActivities) {
    this.secondaryActivities = secondaryActivities;
    return this;
  }

  public Identity3 addSecondaryActivitiesItem(Object secondaryActivitiesItem) {
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


  public List<Object> getSecondaryActivities() {
    return secondaryActivities;
  }

  public void setSecondaryActivities(List<Object> secondaryActivities) {
    this.secondaryActivities = secondaryActivities;
  }

  public Identity3 creationDate(LocalDate creationDate) {
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

  public Identity3 status(Integer status) {
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

  public Identity3 rna(String rna) {
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

  public Identity3 capital(String capital) {
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

  public Identity3 tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public Identity3 addTagsItem(Object tagsItem) {
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


  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
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
    Identity3 identity3 = (Identity3) o;
    return Objects.equals(this.id, identity3.id) &&
        Objects.equals(this.registrationId, identity3.registrationId) &&
        Objects.equals(this.vatnumber, identity3.vatnumber) &&
        Objects.equals(this.name, identity3.name) &&
        Objects.equals(this.tradings, identity3.tradings) &&
        Objects.equals(this.acronym, identity3.acronym) &&
        Objects.equals(this.address, identity3.address) &&
        Objects.equals(this.headquarter, identity3.headquarter) &&
        Objects.equals(this.workforce, identity3.workforce) &&
        Objects.equals(this.contact, identity3.contact) &&
        Objects.equals(this.legalForm, identity3.legalForm) &&
        Objects.equals(this.activity, identity3.activity) &&
        Objects.equals(this.declaredActivity, identity3.declaredActivity) &&
        Objects.equals(this.secondaryActivities, identity3.secondaryActivities) &&
        Objects.equals(this.creationDate, identity3.creationDate) &&
        Objects.equals(this.status, identity3.status) &&
        Objects.equals(this.rna, identity3.rna) &&
        Objects.equals(this.capital, identity3.capital) &&
        Objects.equals(this.tags, identity3.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, registrationId, vatnumber, name, tradings, acronym, address, headquarter, workforce, contact, legalForm, activity, declaredActivity, secondaryActivities, creationDate, status, rna, capital, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity3 {\n");
    
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

