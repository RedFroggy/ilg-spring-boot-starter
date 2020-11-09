package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.MonitoringStateModel;
import fr.redfroggy.ilg.client.openapi.model.PrivilegeCategorySynthesisModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Privilege
 */

public class Privilege   {
  @JsonProperty("monitoringState")
  private MonitoringStateModel monitoringState;

  @JsonProperty("monitoringStartDate")
  private String monitoringStartDate;

  @JsonProperty("monitoringEndDate")
  private String monitoringEndDate;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("amountPerTaxAndSocialLiabilityRatio")
  private BigDecimal amountPerTaxAndSocialLiabilityRatio;

  @JsonProperty("activePrivilegesCount")
  private Integer activePrivilegesCount;

  @JsonProperty("privilegeCategorySynthesis")
  @Valid
  private List<PrivilegeCategorySynthesisModel> privilegeCategorySynthesis = null;

  public Privilege monitoringState(MonitoringStateModel monitoringState) {
    this.monitoringState = monitoringState;
    return this;
  }

  /**
   * Get monitoringState
   * @return monitoringState
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonitoringStateModel getMonitoringState() {
    return monitoringState;
  }

  public void setMonitoringState(MonitoringStateModel monitoringState) {
    this.monitoringState = monitoringState;
  }

  public Privilege monitoringStartDate(String monitoringStartDate) {
    this.monitoringStartDate = monitoringStartDate;
    return this;
  }

  /**
   * Monitoring start date
   * @return monitoringStartDate
  */
  @ApiModelProperty(value = "Monitoring start date")


  public String getMonitoringStartDate() {
    return monitoringStartDate;
  }

  public void setMonitoringStartDate(String monitoringStartDate) {
    this.monitoringStartDate = monitoringStartDate;
  }

  public Privilege monitoringEndDate(String monitoringEndDate) {
    this.monitoringEndDate = monitoringEndDate;
    return this;
  }

  /**
   * Monitoring end date
   * @return monitoringEndDate
  */
  @ApiModelProperty(value = "Monitoring end date")


  public String getMonitoringEndDate() {
    return monitoringEndDate;
  }

  public void setMonitoringEndDate(String monitoringEndDate) {
    this.monitoringEndDate = monitoringEndDate;
  }

  public Privilege amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Current active privileges amount
   * @return amount
  */
  @ApiModelProperty(example = "1234.56", value = "Current active privileges amount")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Privilege amountPerTaxAndSocialLiabilityRatio(BigDecimal amountPerTaxAndSocialLiabilityRatio) {
    this.amountPerTaxAndSocialLiabilityRatio = amountPerTaxAndSocialLiabilityRatio;
    return this;
  }

  /**
   * Amount per tax and social liability ratio
   * @return amountPerTaxAndSocialLiabilityRatio
  */
  @ApiModelProperty(example = "1.42", value = "Amount per tax and social liability ratio")

  @Valid

  public BigDecimal getAmountPerTaxAndSocialLiabilityRatio() {
    return amountPerTaxAndSocialLiabilityRatio;
  }

  public void setAmountPerTaxAndSocialLiabilityRatio(BigDecimal amountPerTaxAndSocialLiabilityRatio) {
    this.amountPerTaxAndSocialLiabilityRatio = amountPerTaxAndSocialLiabilityRatio;
  }

  public Privilege activePrivilegesCount(Integer activePrivilegesCount) {
    this.activePrivilegesCount = activePrivilegesCount;
    return this;
  }

  /**
   * Number of currently active privileges
   * @return activePrivilegesCount
  */
  @ApiModelProperty(example = "3", value = "Number of currently active privileges")


  public Integer getActivePrivilegesCount() {
    return activePrivilegesCount;
  }

  public void setActivePrivilegesCount(Integer activePrivilegesCount) {
    this.activePrivilegesCount = activePrivilegesCount;
  }

  public Privilege privilegeCategorySynthesis(List<PrivilegeCategorySynthesisModel> privilegeCategorySynthesis) {
    this.privilegeCategorySynthesis = privilegeCategorySynthesis;
    return this;
  }

  public Privilege addPrivilegeCategorySynthesisItem(PrivilegeCategorySynthesisModel privilegeCategorySynthesisItem) {
    if (this.privilegeCategorySynthesis == null) {
      this.privilegeCategorySynthesis = new ArrayList<>();
    }
    this.privilegeCategorySynthesis.add(privilegeCategorySynthesisItem);
    return this;
  }

  /**
   * Synthesis for each privilege category
   * @return privilegeCategorySynthesis
  */
  @ApiModelProperty(value = "Synthesis for each privilege category")

  @Valid

  public List<PrivilegeCategorySynthesisModel> getPrivilegeCategorySynthesis() {
    return privilegeCategorySynthesis;
  }

  public void setPrivilegeCategorySynthesis(List<PrivilegeCategorySynthesisModel> privilegeCategorySynthesis) {
    this.privilegeCategorySynthesis = privilegeCategorySynthesis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Privilege privilege = (Privilege) o;
    return Objects.equals(this.monitoringState, privilege.monitoringState) &&
        Objects.equals(this.monitoringStartDate, privilege.monitoringStartDate) &&
        Objects.equals(this.monitoringEndDate, privilege.monitoringEndDate) &&
        Objects.equals(this.amount, privilege.amount) &&
        Objects.equals(this.amountPerTaxAndSocialLiabilityRatio, privilege.amountPerTaxAndSocialLiabilityRatio) &&
        Objects.equals(this.activePrivilegesCount, privilege.activePrivilegesCount) &&
        Objects.equals(this.privilegeCategorySynthesis, privilege.privilegeCategorySynthesis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitoringState, monitoringStartDate, monitoringEndDate, amount, amountPerTaxAndSocialLiabilityRatio, activePrivilegesCount, privilegeCategorySynthesis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Privilege {\n");
    
    sb.append("    monitoringState: ").append(toIndentedString(monitoringState)).append("\n");
    sb.append("    monitoringStartDate: ").append(toIndentedString(monitoringStartDate)).append("\n");
    sb.append("    monitoringEndDate: ").append(toIndentedString(monitoringEndDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPerTaxAndSocialLiabilityRatio: ").append(toIndentedString(amountPerTaxAndSocialLiabilityRatio)).append("\n");
    sb.append("    activePrivilegesCount: ").append(toIndentedString(activePrivilegesCount)).append("\n");
    sb.append("    privilegeCategorySynthesis: ").append(toIndentedString(privilegeCategorySynthesis)).append("\n");
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

