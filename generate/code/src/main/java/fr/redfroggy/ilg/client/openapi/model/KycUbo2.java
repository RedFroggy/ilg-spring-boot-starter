package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.GroupMember6;
import fr.redfroggy.ilg.client.openapi.model.UboInvestigationStep2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KycUbo2
 */

public class KycUbo2   {
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
  private List<GroupMember6> members = null;

  @JsonProperty("steps")
  @Valid
  private List<UboInvestigationStep2> steps = null;

  public KycUbo2 minDate(String minDate) {
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

  public KycUbo2 maxDate(String maxDate) {
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

  public KycUbo2 totalMembers(Integer totalMembers) {
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

  public KycUbo2 totalCapitalDetentionMembers(Integer totalCapitalDetentionMembers) {
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

  public KycUbo2 totalLegalRepresentativeMembers(Integer totalLegalRepresentativeMembers) {
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

  public KycUbo2 members(List<GroupMember6> members) {
    this.members = members;
    return this;
  }

  public KycUbo2 addMembersItem(GroupMember6 membersItem) {
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

  public List<GroupMember6> getMembers() {
    return members;
  }

  public void setMembers(List<GroupMember6> members) {
    this.members = members;
  }

  public KycUbo2 steps(List<UboInvestigationStep2> steps) {
    this.steps = steps;
    return this;
  }

  public KycUbo2 addStepsItem(UboInvestigationStep2 stepsItem) {
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

  public List<UboInvestigationStep2> getSteps() {
    return steps;
  }

  public void setSteps(List<UboInvestigationStep2> steps) {
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
    KycUbo2 kycUbo2 = (KycUbo2) o;
    return Objects.equals(this.minDate, kycUbo2.minDate) &&
        Objects.equals(this.maxDate, kycUbo2.maxDate) &&
        Objects.equals(this.totalMembers, kycUbo2.totalMembers) &&
        Objects.equals(this.totalCapitalDetentionMembers, kycUbo2.totalCapitalDetentionMembers) &&
        Objects.equals(this.totalLegalRepresentativeMembers, kycUbo2.totalLegalRepresentativeMembers) &&
        Objects.equals(this.members, kycUbo2.members) &&
        Objects.equals(this.steps, kycUbo2.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDate, maxDate, totalMembers, totalCapitalDetentionMembers, totalLegalRepresentativeMembers, members, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycUbo2 {\n");
    
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

