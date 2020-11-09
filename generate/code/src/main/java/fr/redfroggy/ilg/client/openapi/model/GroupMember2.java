package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address9;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupMember2
 */

public class GroupMember2   {
  @JsonProperty("entityId")
  private Integer entityId;

  @JsonProperty("entityName")
  private String entityName;

  @JsonProperty("registrationNumber")
  private String registrationNumber;

  @JsonProperty("countryCodeIso3")
  private String countryCodeIso3;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("share")
  private Float share;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("type")
  private String type;

  @JsonProperty("address")
  private Address9 address;

  @JsonProperty("birthday")
  private LocalDate birthday;

  @JsonProperty("birthCity")
  private String birthCity;

  @JsonProperty("birthCountry")
  private String birthCountry;

  @JsonProperty("birthCountryCode")
  private String birthCountryCode;

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

  public GroupMember2 entityId(Integer entityId) {
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

  public GroupMember2 entityName(String entityName) {
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

  public GroupMember2 registrationNumber(String registrationNumber) {
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

  public GroupMember2 countryCodeIso3(String countryCodeIso3) {
    this.countryCodeIso3 = countryCodeIso3;
    return this;
  }

  /**
   * Country code in ISO 3166-1 alpha-3
   * @return countryCodeIso3
  */
  @ApiModelProperty(example = "FRA", value = "Country code in ISO 3166-1 alpha-3")


  public String getCountryCodeIso3() {
    return countryCodeIso3;
  }

  public void setCountryCodeIso3(String countryCodeIso3) {
    this.countryCodeIso3 = countryCodeIso3;
  }

  public GroupMember2 countryCode(String countryCode) {
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

  public GroupMember2 country(String country) {
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

  public GroupMember2 share(Float share) {
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

  public GroupMember2 score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Member score
   * @return score
  */
  @ApiModelProperty(example = "12", value = "Member score")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public GroupMember2 type(String type) {
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

  public GroupMember2 address(Address9 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address9 getAddress() {
    return address;
  }

  public void setAddress(Address9 address) {
    this.address = address;
  }

  public GroupMember2 birthday(LocalDate birthday) {
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

  public GroupMember2 birthCity(String birthCity) {
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

  public GroupMember2 birthCountry(String birthCountry) {
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

  public GroupMember2 birthCountryCode(String birthCountryCode) {
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

  public GroupMember2 name(String name) {
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

  public GroupMember2 firstname(String firstname) {
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

  public GroupMember2 maidenName(String maidenName) {
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

  public GroupMember2 title(String title) {
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

  public GroupMember2 minDate(String minDate) {
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

  public GroupMember2 maxDate(String maxDate) {
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
    GroupMember2 groupMember2 = (GroupMember2) o;
    return Objects.equals(this.entityId, groupMember2.entityId) &&
        Objects.equals(this.entityName, groupMember2.entityName) &&
        Objects.equals(this.registrationNumber, groupMember2.registrationNumber) &&
        Objects.equals(this.countryCodeIso3, groupMember2.countryCodeIso3) &&
        Objects.equals(this.countryCode, groupMember2.countryCode) &&
        Objects.equals(this.country, groupMember2.country) &&
        Objects.equals(this.share, groupMember2.share) &&
        Objects.equals(this.score, groupMember2.score) &&
        Objects.equals(this.type, groupMember2.type) &&
        Objects.equals(this.address, groupMember2.address) &&
        Objects.equals(this.birthday, groupMember2.birthday) &&
        Objects.equals(this.birthCity, groupMember2.birthCity) &&
        Objects.equals(this.birthCountry, groupMember2.birthCountry) &&
        Objects.equals(this.birthCountryCode, groupMember2.birthCountryCode) &&
        Objects.equals(this.name, groupMember2.name) &&
        Objects.equals(this.firstname, groupMember2.firstname) &&
        Objects.equals(this.maidenName, groupMember2.maidenName) &&
        Objects.equals(this.title, groupMember2.title) &&
        Objects.equals(this.minDate, groupMember2.minDate) &&
        Objects.equals(this.maxDate, groupMember2.maxDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityName, registrationNumber, countryCodeIso3, countryCode, country, share, score, type, address, birthday, birthCity, birthCountry, birthCountryCode, name, firstname, maidenName, title, minDate, maxDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMember2 {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    countryCodeIso3: ").append(toIndentedString(countryCodeIso3)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthCountryCode: ").append(toIndentedString(birthCountryCode)).append("\n");
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

