package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.GroupMember2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Shareholders
 */

public class Shareholders   {
  @JsonProperty("members")
  @Valid
  private List<GroupMember2> members = null;

  public Shareholders members(List<GroupMember2> members) {
    this.members = members;
    return this;
  }

  public Shareholders addMembersItem(GroupMember2 membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * 
   * @return members
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GroupMember2> getMembers() {
    return members;
  }

  public void setMembers(List<GroupMember2> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shareholders shareholders = (Shareholders) o;
    return Objects.equals(this.members, shareholders.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shareholders {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

