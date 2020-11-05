package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupMember5
 */

public class GroupMember5   {
  @JsonProperty("parentId")
  private Integer parentId;

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

  @JsonProperty("group")
  private Group group;

  @JsonProperty("type")
  private String type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("title")
  private String title;

  @JsonProperty("frenchPrivateGroupHead")
  private Object frenchPrivateGroupHead;

  @JsonProperty("minDate")
  private String minDate;

  @JsonProperty("maxDate")
  private String maxDate;

  public GroupMember5 parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Parent group ID
   * @return parentId
  */
  @ApiModelProperty(example = "0", value = "Parent group ID")


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public GroupMember5 entityId(Integer entityId) {
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

  public GroupMember5 entityName(String entityName) {
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

  public GroupMember5 registrationNumber(String registrationNumber) {
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

  public GroupMember5 countryCodeIso3(String countryCodeIso3) {
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

  public GroupMember5 countryCode(String countryCode) {
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

  public GroupMember5 country(String country) {
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

  public GroupMember5 share(Float share) {
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

  public GroupMember5 score(Integer score) {
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

  public GroupMember5 group(Group group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @ApiModelProperty(value = "")

  @Valid

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public GroupMember5 type(String type) {
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

  public GroupMember5 name(String name) {
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

  public GroupMember5 firstname(String firstname) {
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

  public GroupMember5 maidenName(String maidenName) {
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

  public GroupMember5 title(String title) {
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

  public GroupMember5 frenchPrivateGroupHead(Object frenchPrivateGroupHead) {
    this.frenchPrivateGroupHead = frenchPrivateGroupHead;
    return this;
  }

  /**
   * Get frenchPrivateGroupHead
   * @return frenchPrivateGroupHead
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getFrenchPrivateGroupHead() {
    return frenchPrivateGroupHead;
  }

  public void setFrenchPrivateGroupHead(Object frenchPrivateGroupHead) {
    this.frenchPrivateGroupHead = frenchPrivateGroupHead;
  }

  public GroupMember5 minDate(String minDate) {
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

  public GroupMember5 maxDate(String maxDate) {
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
    GroupMember5 groupMember5 = (GroupMember5) o;
    return Objects.equals(this.parentId, groupMember5.parentId) &&
        Objects.equals(this.entityId, groupMember5.entityId) &&
        Objects.equals(this.entityName, groupMember5.entityName) &&
        Objects.equals(this.registrationNumber, groupMember5.registrationNumber) &&
        Objects.equals(this.countryCodeIso3, groupMember5.countryCodeIso3) &&
        Objects.equals(this.countryCode, groupMember5.countryCode) &&
        Objects.equals(this.country, groupMember5.country) &&
        Objects.equals(this.share, groupMember5.share) &&
        Objects.equals(this.score, groupMember5.score) &&
        Objects.equals(this.group, groupMember5.group) &&
        Objects.equals(this.type, groupMember5.type) &&
        Objects.equals(this.name, groupMember5.name) &&
        Objects.equals(this.firstname, groupMember5.firstname) &&
        Objects.equals(this.maidenName, groupMember5.maidenName) &&
        Objects.equals(this.title, groupMember5.title) &&
        Objects.equals(this.frenchPrivateGroupHead, groupMember5.frenchPrivateGroupHead) &&
        Objects.equals(this.minDate, groupMember5.minDate) &&
        Objects.equals(this.maxDate, groupMember5.maxDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, entityId, entityName, registrationNumber, countryCodeIso3, countryCode, country, share, score, group, type, name, firstname, maidenName, title, frenchPrivateGroupHead, minDate, maxDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMember5 {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    countryCodeIso3: ").append(toIndentedString(countryCodeIso3)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    frenchPrivateGroupHead: ").append(toIndentedString(frenchPrivateGroupHead)).append("\n");
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

