package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.GroupMember;
import fr.redfroggy.ilg.client.openapi.model.UboInvestigationStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KycUbo
 */

public class KycUbo   {
  @JsonProperty("minDate")
  private String minDate;

  @JsonProperty("maxDate")
  private String maxDate;

  @JsonProperty("totalMembers")
  private Integer totalMembers;

  @JsonProperty("totalCapitalDetentionMembers")
  private Integer totalCapitalDetentionMembers;

  @JsonProperty("totalLegalRepresentativeMembers")
  private Integer totalLegalRepresentativeMembers;

  @JsonProperty("members")
  @Valid
  private List<GroupMember> members = null;

  @JsonProperty("steps")
  @Valid
  private List<UboInvestigationStep> steps = null;

  public KycUbo minDate(String minDate) {
    this.minDate = minDate;
    return this;
  }

  /**
   * Oldest information date
   * @return minDate
  */
  @ApiModelProperty(value = "Oldest information date")


  public String getMinDate() {
    return minDate;
  }

  public void setMinDate(String minDate) {
    this.minDate = minDate;
  }

  public KycUbo maxDate(String maxDate) {
    this.maxDate = maxDate;
    return this;
  }

  /**
   * Most recent information date
   * @return maxDate
  */
  @ApiModelProperty(value = "Most recent information date")


  public String getMaxDate() {
    return maxDate;
  }

  public void setMaxDate(String maxDate) {
    this.maxDate = maxDate;
  }

  public KycUbo totalMembers(Integer totalMembers) {
    this.totalMembers = totalMembers;
    return this;
  }

  /**
   * Number of UBO
   * @return totalMembers
  */
  @ApiModelProperty(value = "Number of UBO")


  public Integer getTotalMembers() {
    return totalMembers;
  }

  public void setTotalMembers(Integer totalMembers) {
    this.totalMembers = totalMembers;
  }

  public KycUbo totalCapitalDetentionMembers(Integer totalCapitalDetentionMembers) {
    this.totalCapitalDetentionMembers = totalCapitalDetentionMembers;
    return this;
  }

  /**
   * Number of capital detentions
   * @return totalCapitalDetentionMembers
  */
  @ApiModelProperty(value = "Number of capital detentions")


  public Integer getTotalCapitalDetentionMembers() {
    return totalCapitalDetentionMembers;
  }

  public void setTotalCapitalDetentionMembers(Integer totalCapitalDetentionMembers) {
    this.totalCapitalDetentionMembers = totalCapitalDetentionMembers;
  }

  public KycUbo totalLegalRepresentativeMembers(Integer totalLegalRepresentativeMembers) {
    this.totalLegalRepresentativeMembers = totalLegalRepresentativeMembers;
    return this;
  }

  /**
   * Number of legal representatives
   * @return totalLegalRepresentativeMembers
  */
  @ApiModelProperty(value = "Number of legal representatives")


  public Integer getTotalLegalRepresentativeMembers() {
    return totalLegalRepresentativeMembers;
  }

  public void setTotalLegalRepresentativeMembers(Integer totalLegalRepresentativeMembers) {
    this.totalLegalRepresentativeMembers = totalLegalRepresentativeMembers;
  }

  public KycUbo members(List<GroupMember> members) {
    this.members = members;
    return this;
  }

  public KycUbo addMembersItem(GroupMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * UBO
   * @return members
  */
  @ApiModelProperty(value = "UBO")

  @Valid

  public List<GroupMember> getMembers() {
    return members;
  }

  public void setMembers(List<GroupMember> members) {
    this.members = members;
  }

  public KycUbo steps(List<UboInvestigationStep> steps) {
    this.steps = steps;
    return this;
  }

  public KycUbo addStepsItem(UboInvestigationStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Procedure steps passed through to find ubo
   * @return steps
  */
  @ApiModelProperty(value = "Procedure steps passed through to find ubo")

  @Valid

  public List<UboInvestigationStep> getSteps() {
    return steps;
  }

  public void setSteps(List<UboInvestigationStep> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycUbo kycUbo = (KycUbo) o;
    return Objects.equals(this.minDate, kycUbo.minDate) &&
        Objects.equals(this.maxDate, kycUbo.maxDate) &&
        Objects.equals(this.totalMembers, kycUbo.totalMembers) &&
        Objects.equals(this.totalCapitalDetentionMembers, kycUbo.totalCapitalDetentionMembers) &&
        Objects.equals(this.totalLegalRepresentativeMembers, kycUbo.totalLegalRepresentativeMembers) &&
        Objects.equals(this.members, kycUbo.members) &&
        Objects.equals(this.steps, kycUbo.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDate, maxDate, totalMembers, totalCapitalDetentionMembers, totalLegalRepresentativeMembers, members, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycUbo {\n");
    
    sb.append("    minDate: ").append(toIndentedString(minDate)).append("\n");
    sb.append("    maxDate: ").append(toIndentedString(maxDate)).append("\n");
    sb.append("    totalMembers: ").append(toIndentedString(totalMembers)).append("\n");
    sb.append("    totalCapitalDetentionMembers: ").append(toIndentedString(totalCapitalDetentionMembers)).append("\n");
    sb.append("    totalLegalRepresentativeMembers: ").append(toIndentedString(totalLegalRepresentativeMembers)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

