package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Financial2;
import fr.redfroggy.ilg.client.openapi.model.GroupInfo2;
import fr.redfroggy.ilg.client.openapi.model.Identity3;
import fr.redfroggy.ilg.client.openapi.model.Risk2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company3
 */

public class Company3   {
  @JsonProperty("identity")
  private Identity3 identity;

  @JsonProperty("risk")
  private Risk2 risk;

  @JsonProperty("financial")
  private Financial2 financial;

  @JsonProperty("groupInfo")
  private GroupInfo2 groupInfo;

  public Company3 identity(Identity3 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identity3 getIdentity() {
    return identity;
  }

  public void setIdentity(Identity3 identity) {
    this.identity = identity;
  }

  public Company3 risk(Risk2 risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  */
  @ApiModelProperty(value = "")

  @Valid

  public Risk2 getRisk() {
    return risk;
  }

  public void setRisk(Risk2 risk) {
    this.risk = risk;
  }

  public Company3 financial(Financial2 financial) {
    this.financial = financial;
    return this;
  }

  /**
   * Get financial
   * @return financial
  */
  @ApiModelProperty(value = "")

  @Valid

  public Financial2 getFinancial() {
    return financial;
  }

  public void setFinancial(Financial2 financial) {
    this.financial = financial;
  }

  public Company3 groupInfo(GroupInfo2 groupInfo) {
    this.groupInfo = groupInfo;
    return this;
  }

  /**
   * Get groupInfo
   * @return groupInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GroupInfo2 getGroupInfo() {
    return groupInfo;
  }

  public void setGroupInfo(GroupInfo2 groupInfo) {
    this.groupInfo = groupInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company3 company3 = (Company3) o;
    return Objects.equals(this.identity, company3.identity) &&
        Objects.equals(this.risk, company3.risk) &&
        Objects.equals(this.financial, company3.financial) &&
        Objects.equals(this.groupInfo, company3.groupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, risk, financial, groupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company3 {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    financial: ").append(toIndentedString(financial)).append("\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
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

