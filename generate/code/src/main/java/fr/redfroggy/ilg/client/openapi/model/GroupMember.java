package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address8;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupMember
 */

public class GroupMember   {
  @JsonProperty("entityId")
  private Integer entityId;

  @JsonProperty("entityName")
  private String entityName;

  @JsonProperty("registrationNumber")
  private String registrationNumber;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("share")
  private Float share;

  @JsonProperty("type")
  private String type;

  @JsonProperty("methodUsed")
  private String methodUsed;

  @JsonProperty("qualite")
  private String qualite;

  @JsonProperty("distance")
  private Integer distance;

  @JsonProperty("address")
  private Address8 address;

  @JsonProperty("fonction")
  private ExecutiveFonction4 fonction;

  @JsonProperty("birthday")
  private LocalDate birthday;

  @JsonProperty("birthCity")
  private String birthCity;

  @JsonProperty("birthCountry")
  private String birthCountry;

  @JsonProperty("birthCountryCode")
  private String birthCountryCode;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("nationalityCode")
  private String nationalityCode;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("title")
  private String title;

  @JsonProperty("minDate")
  private String minDate;

  @JsonProperty("maxDate")
  private String maxDate;

  public GroupMember entityId(Integer entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Member ID
   * @return entityId
  */
  @ApiModelProperty(example = "0", value = "Member ID")


  public Integer getEntityId() {
    return entityId;
  }

  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }

  public GroupMember entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Member name
   * @return entityName
  */
  @ApiModelProperty(example = "BAZIN Sébastien", value = "Member name")


  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public GroupMember registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Member registration number
   * @return registrationNumber
  */
  @ApiModelProperty(example = "503207896", value = "Member registration number")


  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public GroupMember countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code in ISO 3166-2
   * @return countryCode
  */
  @ApiModelProperty(example = "FR", value = "Country code in ISO 3166-2")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public GroupMember country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country label
   * @return country
  */
  @ApiModelProperty(example = "France", value = "Country label")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GroupMember share(Float share) {
    this.share = share;
    return this;
  }

  /**
   * Share percentage
   * @return share
  */
  @ApiModelProperty(example = "15.0", value = "Share percentage")


  public Float getShare() {
    return share;
  }

  public void setShare(Float share) {
    this.share = share;
  }

  public GroupMember type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Member type
   * @return type
  */
  @ApiModelProperty(example = "person", value = "Member type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GroupMember methodUsed(String methodUsed) {
    this.methodUsed = methodUsed;
    return this;
  }

  /**
   * Method used in UBO seek
   * @return methodUsed
  */
  @ApiModelProperty(example = "legal representative", value = "Method used in UBO seek")


  public String getMethodUsed() {
    return methodUsed;
  }

  public void setMethodUsed(String methodUsed) {
    this.methodUsed = methodUsed;
  }

  public GroupMember qualite(String qualite) {
    this.qualite = qualite;
    return this;
  }

  /**
   * qualité de l'ubo
   * @return qualite
  */
  @ApiModelProperty(example = "Représentant Légal / Actionnaire", value = "qualité de l'ubo")


  public String getQualite() {
    return qualite;
  }

  public void setQualite(String qualite) {
    this.qualite = qualite;
  }

  public GroupMember distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Distance between company and UBO
   * @return distance
  */
  @ApiModelProperty(example = "0", value = "Distance between company and UBO")


  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public GroupMember address(Address8 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address8 getAddress() {
    return address;
  }

  public void setAddress(Address8 address) {
    this.address = address;
  }

  public GroupMember fonction(ExecutiveFonction4 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction4 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction4 fonction) {
    this.fonction = fonction;
  }

  public GroupMember birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * UBO birthday if available
   * @return birthday
  */
  @ApiModelProperty(value = "UBO birthday if available")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public GroupMember birthCity(String birthCity) {
    this.birthCity = birthCity;
    return this;
  }

  /**
   * UBO birth city if available
   * @return birthCity
  */
  @ApiModelProperty(example = "PARIS", value = "UBO birth city if available")


  public String getBirthCity() {
    return birthCity;
  }

  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }

  public GroupMember birthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  /**
   * UBO birth country if available
   * @return birthCountry
  */
  @ApiModelProperty(example = "France", value = "UBO birth country if available")


  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public GroupMember birthCountryCode(String birthCountryCode) {
    this.birthCountryCode = birthCountryCode;
    return this;
  }

  /**
   * UBO birth country code (ISO 3166-2) if available
   * @return birthCountryCode
  */
  @ApiModelProperty(example = "FR", value = "UBO birth country code (ISO 3166-2) if available")


  public String getBirthCountryCode() {
    return birthCountryCode;
  }

  public void setBirthCountryCode(String birthCountryCode) {
    this.birthCountryCode = birthCountryCode;
  }

  public GroupMember nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Executive nationality
   * @return nationality
  */
  @ApiModelProperty(example = "France", value = "Executive nationality")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public GroupMember nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

  /**
   * Executive country code (ISO 3166-2)
   * @return nationalityCode
  */
  @ApiModelProperty(example = "FR", value = "Executive country code (ISO 3166-2)")


  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }

  public GroupMember name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Member name
   * @return name
  */
  @ApiModelProperty(example = "BAZIN", value = "Member name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupMember firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Member firstname
   * @return firstname
  */
  @ApiModelProperty(example = "Sébastien", value = "Member firstname")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public GroupMember maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  /**
   * Member maidenname
   * @return maidenName
  */
  @ApiModelProperty(example = "BAZIN", value = "Member maidenname")


  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public GroupMember title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Member title
   * @return title
  */
  @ApiModelProperty(example = "M / Mme", value = "Member title")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GroupMember minDate(String minDate) {
    this.minDate = minDate;
    return this;
  }

  /**
   * Oldest information date
   * @return minDate
  */
  @ApiModelProperty(example = "1970-01-01", value = "Oldest information date")


  public String getMinDate() {
    return minDate;
  }

  public void setMinDate(String minDate) {
    this.minDate = minDate;
  }

  public GroupMember maxDate(String maxDate) {
    this.maxDate = maxDate;
    return this;
  }

  /**
   * Most recent information date
   * @return maxDate
  */
  @ApiModelProperty(example = "1970-01-01", value = "Most recent information date")


  public String getMaxDate() {
    return maxDate;
  }

  public void setMaxDate(String maxDate) {
    this.maxDate = maxDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMember groupMember = (GroupMember) o;
    return Objects.equals(this.entityId, groupMember.entityId) &&
        Objects.equals(this.entityName, groupMember.entityName) &&
        Objects.equals(this.registrationNumber, groupMember.registrationNumber) &&
        Objects.equals(this.countryCode, groupMember.countryCode) &&
        Objects.equals(this.country, groupMember.country) &&
        Objects.equals(this.share, groupMember.share) &&
        Objects.equals(this.type, groupMember.type) &&
        Objects.equals(this.methodUsed, groupMember.methodUsed) &&
        Objects.equals(this.qualite, groupMember.qualite) &&
        Objects.equals(this.distance, groupMember.distance) &&
        Objects.equals(this.address, groupMember.address) &&
        Objects.equals(this.fonction, groupMember.fonction) &&
        Objects.equals(this.birthday, groupMember.birthday) &&
        Objects.equals(this.birthCity, groupMember.birthCity) &&
        Objects.equals(this.birthCountry, groupMember.birthCountry) &&
        Objects.equals(this.birthCountryCode, groupMember.birthCountryCode) &&
        Objects.equals(this.nationality, groupMember.nationality) &&
        Objects.equals(this.nationalityCode, groupMember.nationalityCode) &&
        Objects.equals(this.name, groupMember.name) &&
        Objects.equals(this.firstname, groupMember.firstname) &&
        Objects.equals(this.maidenName, groupMember.maidenName) &&
        Objects.equals(this.title, groupMember.title) &&
        Objects.equals(this.minDate, groupMember.minDate) &&
        Objects.equals(this.maxDate, groupMember.maxDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityName, registrationNumber, countryCode, country, share, type, methodUsed, qualite, distance, address, fonction, birthday, birthCity, birthCountry, birthCountryCode, nationality, nationalityCode, name, firstname, maidenName, title, minDate, maxDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMember {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    methodUsed: ").append(toIndentedString(methodUsed)).append("\n");
    sb.append("    qualite: ").append(toIndentedString(qualite)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fonction: ").append(toIndentedString(fonction)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthCountryCode: ").append(toIndentedString(birthCountryCode)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    minDate: ").append(toIndentedString(minDate)).append("\n");
    sb.append("    maxDate: ").append(toIndentedString(maxDate)).append("\n");
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

