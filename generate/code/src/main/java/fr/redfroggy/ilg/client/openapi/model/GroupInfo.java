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
 * GroupInfo
 */

public class GroupInfo   {
  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("companyName")
  private String companyName;

  @JsonProperty("groupWorkforce")
  private Integer groupWorkforce;

  @JsonProperty("groupTurnover")
  private Integer groupTurnover;

  public GroupInfo entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
  */
  @ApiModelProperty(value = "")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public GroupInfo registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
  */
  @ApiModelProperty(value = "")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public GroupInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public GroupInfo groupWorkforce(Integer groupWorkforce) {
    this.groupWorkforce = groupWorkforce;
    return this;
  }

  /**
   * Get groupWorkforce
   * @return groupWorkforce
  */
  @ApiModelProperty(value = "")


  public Integer getGroupWorkforce() {
    return groupWorkforce;
  }

  public void setGroupWorkforce(Integer groupWorkforce) {
    this.groupWorkforce = groupWorkforce;
  }

  public GroupInfo groupTurnover(Integer groupTurnover) {
    this.groupTurnover = groupTurnover;
    return this;
  }

  /**
   * Get groupTurnover
   * @return groupTurnover
  */
  @ApiModelProperty(value = "")


  public Integer getGroupTurnover() {
    return groupTurnover;
  }

  public void setGroupTurnover(Integer groupTurnover) {
    this.groupTurnover = groupTurnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupInfo groupInfo = (GroupInfo) o;
    return Objects.equals(this.entityId, groupInfo.entityId) &&
        Objects.equals(this.registrationId, groupInfo.registrationId) &&
        Objects.equals(this.companyName, groupInfo.companyName) &&
        Objects.equals(this.groupWorkforce, groupInfo.groupWorkforce) &&
        Objects.equals(this.groupTurnover, groupInfo.groupTurnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, registrationId, companyName, groupWorkforce, groupTurnover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInfo {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    groupWorkforce: ").append(toIndentedString(groupWorkforce)).append("\n");
    sb.append("    groupTurnover: ").append(toIndentedString(groupTurnover)).append("\n");
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

