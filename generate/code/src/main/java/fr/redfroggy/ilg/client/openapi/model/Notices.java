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
 * Notices
 */

public class Notices   {
  @JsonProperty("operationalMargin")
  private String operationalMargin;

  @JsonProperty("netMargin")
  private String netMargin;

  @JsonProperty("grossOperatingSurplus")
  private String grossOperatingSurplus;

  @JsonProperty("revenueEquityRatio")
  private String revenueEquityRatio;

  @JsonProperty("returnOnCapital")
  private String returnOnCapital;

  @JsonProperty("fixedAssetsObsolescence")
  private String fixedAssetsObsolescence;

  @JsonProperty("cashFlow")
  private String cashFlow;

  @JsonProperty("financialAutonomy")
  private String financialAutonomy;

  @JsonProperty("repaymentCapacity")
  private String repaymentCapacity;

  @JsonProperty("generalCreditworthiness")
  private String generalCreditworthiness;

  @JsonProperty("currentRatio")
  private String currentRatio;

  @JsonProperty("restrictedLiquidity")
  private String restrictedLiquidity;

  @JsonProperty("financialExpensesReturnRatio")
  private String financialExpensesReturnRatio;

  @JsonProperty("debt")
  private String debt;

  @JsonProperty("financialStrength")
  private String financialStrength;

  @JsonProperty("workingCapitalRequirement")
  private String workingCapitalRequirement;

  @JsonProperty("workingCapitalRequirementTurnover")
  private String workingCapitalRequirementTurnover;

  @JsonProperty("customersPaymentTime")
  private String customersPaymentTime;

  @JsonProperty("suppliersPaymentTime")
  private String suppliersPaymentTime;

  public Notices operationalMargin(String operationalMargin) {
    this.operationalMargin = operationalMargin;
    return this;
  }

  /**
   * Operational margin
   * @return operationalMargin
  */
  @ApiModelProperty(example = "+", value = "Operational margin")


  public String getOperationalMargin() {
    return operationalMargin;
  }

  public void setOperationalMargin(String operationalMargin) {
    this.operationalMargin = operationalMargin;
  }

  public Notices netMargin(String netMargin) {
    this.netMargin = netMargin;
    return this;
  }

  /**
   * Net margin
   * @return netMargin
  */
  @ApiModelProperty(example = "+", value = "Net margin")


  public String getNetMargin() {
    return netMargin;
  }

  public void setNetMargin(String netMargin) {
    this.netMargin = netMargin;
  }

  public Notices grossOperatingSurplus(String grossOperatingSurplus) {
    this.grossOperatingSurplus = grossOperatingSurplus;
    return this;
  }

  /**
   * Gross operating surplus
   * @return grossOperatingSurplus
  */
  @ApiModelProperty(example = "++", value = "Gross operating surplus")


  public String getGrossOperatingSurplus() {
    return grossOperatingSurplus;
  }

  public void setGrossOperatingSurplus(String grossOperatingSurplus) {
    this.grossOperatingSurplus = grossOperatingSurplus;
  }

  public Notices revenueEquityRatio(String revenueEquityRatio) {
    this.revenueEquityRatio = revenueEquityRatio;
    return this;
  }

  /**
   * Revenue on equity ratio
   * @return revenueEquityRatio
  */
  @ApiModelProperty(example = "++", value = "Revenue on equity ratio")


  public String getRevenueEquityRatio() {
    return revenueEquityRatio;
  }

  public void setRevenueEquityRatio(String revenueEquityRatio) {
    this.revenueEquityRatio = revenueEquityRatio;
  }

  public Notices returnOnCapital(String returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
    return this;
  }

  /**
   * Return on capital
   * @return returnOnCapital
  */
  @ApiModelProperty(example = "+", value = "Return on capital")


  public String getReturnOnCapital() {
    return returnOnCapital;
  }

  public void setReturnOnCapital(String returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
  }

  public Notices fixedAssetsObsolescence(String fixedAssetsObsolescence) {
    this.fixedAssetsObsolescence = fixedAssetsObsolescence;
    return this;
  }

  /**
   * Fixed assets obsolescence
   * @return fixedAssetsObsolescence
  */
  @ApiModelProperty(example = "-", value = "Fixed assets obsolescence")


  public String getFixedAssetsObsolescence() {
    return fixedAssetsObsolescence;
  }

  public void setFixedAssetsObsolescence(String fixedAssetsObsolescence) {
    this.fixedAssetsObsolescence = fixedAssetsObsolescence;
  }

  public Notices cashFlow(String cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

  /**
   * Cash flow
   * @return cashFlow
  */
  @ApiModelProperty(example = "", value = "Cash flow")


  public String getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(String cashFlow) {
    this.cashFlow = cashFlow;
  }

  public Notices financialAutonomy(String financialAutonomy) {
    this.financialAutonomy = financialAutonomy;
    return this;
  }

  /**
   * Financial autonomy
   * @return financialAutonomy
  */
  @ApiModelProperty(example = "--", value = "Financial autonomy")


  public String getFinancialAutonomy() {
    return financialAutonomy;
  }

  public void setFinancialAutonomy(String financialAutonomy) {
    this.financialAutonomy = financialAutonomy;
  }

  public Notices repaymentCapacity(String repaymentCapacity) {
    this.repaymentCapacity = repaymentCapacity;
    return this;
  }

  /**
   * Repayment capacity
   * @return repaymentCapacity
  */
  @ApiModelProperty(example = "+++", value = "Repayment capacity")


  public String getRepaymentCapacity() {
    return repaymentCapacity;
  }

  public void setRepaymentCapacity(String repaymentCapacity) {
    this.repaymentCapacity = repaymentCapacity;
  }

  public Notices generalCreditworthiness(String generalCreditworthiness) {
    this.generalCreditworthiness = generalCreditworthiness;
    return this;
  }

  /**
   * General creditworthiness
   * @return generalCreditworthiness
  */
  @ApiModelProperty(example = "---", value = "General creditworthiness")


  public String getGeneralCreditworthiness() {
    return generalCreditworthiness;
  }

  public void setGeneralCreditworthiness(String generalCreditworthiness) {
    this.generalCreditworthiness = generalCreditworthiness;
  }

  public Notices currentRatio(String currentRatio) {
    this.currentRatio = currentRatio;
    return this;
  }

  /**
   * Current ratio
   * @return currentRatio
  */
  @ApiModelProperty(example = "", value = "Current ratio")


  public String getCurrentRatio() {
    return currentRatio;
  }

  public void setCurrentRatio(String currentRatio) {
    this.currentRatio = currentRatio;
  }

  public Notices restrictedLiquidity(String restrictedLiquidity) {
    this.restrictedLiquidity = restrictedLiquidity;
    return this;
  }

  /**
   * RestrictedLliquidity
   * @return restrictedLiquidity
  */
  @ApiModelProperty(example = "++", value = "RestrictedLliquidity")


  public String getRestrictedLiquidity() {
    return restrictedLiquidity;
  }

  public void setRestrictedLiquidity(String restrictedLiquidity) {
    this.restrictedLiquidity = restrictedLiquidity;
  }

  public Notices financialExpensesReturnRatio(String financialExpensesReturnRatio) {
    this.financialExpensesReturnRatio = financialExpensesReturnRatio;
    return this;
  }

  /**
   * Financial expenses on return ratio
   * @return financialExpensesReturnRatio
  */
  @ApiModelProperty(example = "", value = "Financial expenses on return ratio")


  public String getFinancialExpensesReturnRatio() {
    return financialExpensesReturnRatio;
  }

  public void setFinancialExpensesReturnRatio(String financialExpensesReturnRatio) {
    this.financialExpensesReturnRatio = financialExpensesReturnRatio;
  }

  public Notices debt(String debt) {
    this.debt = debt;
    return this;
  }

  /**
   * Debt
   * @return debt
  */
  @ApiModelProperty(example = "+", value = "Debt")


  public String getDebt() {
    return debt;
  }

  public void setDebt(String debt) {
    this.debt = debt;
  }

  public Notices financialStrength(String financialStrength) {
    this.financialStrength = financialStrength;
    return this;
  }

  /**
   * Financial strength
   * @return financialStrength
  */
  @ApiModelProperty(example = "-", value = "Financial strength")


  public String getFinancialStrength() {
    return financialStrength;
  }

  public void setFinancialStrength(String financialStrength) {
    this.financialStrength = financialStrength;
  }

  public Notices workingCapitalRequirement(String workingCapitalRequirement) {
    this.workingCapitalRequirement = workingCapitalRequirement;
    return this;
  }

  /**
   * Working capital requirement
   * @return workingCapitalRequirement
  */
  @ApiModelProperty(example = "-", value = "Working capital requirement")


  public String getWorkingCapitalRequirement() {
    return workingCapitalRequirement;
  }

  public void setWorkingCapitalRequirement(String workingCapitalRequirement) {
    this.workingCapitalRequirement = workingCapitalRequirement;
  }

  public Notices workingCapitalRequirementTurnover(String workingCapitalRequirementTurnover) {
    this.workingCapitalRequirementTurnover = workingCapitalRequirementTurnover;
    return this;
  }

  /**
   * Working capital requirement turnover
   * @return workingCapitalRequirementTurnover
  */
  @ApiModelProperty(example = "", value = "Working capital requirement turnover")


  public String getWorkingCapitalRequirementTurnover() {
    return workingCapitalRequirementTurnover;
  }

  public void setWorkingCapitalRequirementTurnover(String workingCapitalRequirementTurnover) {
    this.workingCapitalRequirementTurnover = workingCapitalRequirementTurnover;
  }

  public Notices customersPaymentTime(String customersPaymentTime) {
    this.customersPaymentTime = customersPaymentTime;
    return this;
  }

  /**
   * Customers payment time
   * @return customersPaymentTime
  */
  @ApiModelProperty(example = "", value = "Customers payment time")


  public String getCustomersPaymentTime() {
    return customersPaymentTime;
  }

  public void setCustomersPaymentTime(String customersPaymentTime) {
    this.customersPaymentTime = customersPaymentTime;
  }

  public Notices suppliersPaymentTime(String suppliersPaymentTime) {
    this.suppliersPaymentTime = suppliersPaymentTime;
    return this;
  }

  /**
   * Suppliers payment time
   * @return suppliersPaymentTime
  */
  @ApiModelProperty(example = "", value = "Suppliers payment time")


  public String getSuppliersPaymentTime() {
    return suppliersPaymentTime;
  }

  public void setSuppliersPaymentTime(String suppliersPaymentTime) {
    this.suppliersPaymentTime = suppliersPaymentTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notices notices = (Notices) o;
    return Objects.equals(this.operationalMargin, notices.operationalMargin) &&
        Objects.equals(this.netMargin, notices.netMargin) &&
        Objects.equals(this.grossOperatingSurplus, notices.grossOperatingSurplus) &&
        Objects.equals(this.revenueEquityRatio, notices.revenueEquityRatio) &&
        Objects.equals(this.returnOnCapital, notices.returnOnCapital) &&
        Objects.equals(this.fixedAssetsObsolescence, notices.fixedAssetsObsolescence) &&
        Objects.equals(this.cashFlow, notices.cashFlow) &&
        Objects.equals(this.financialAutonomy, notices.financialAutonomy) &&
        Objects.equals(this.repaymentCapacity, notices.repaymentCapacity) &&
        Objects.equals(this.generalCreditworthiness, notices.generalCreditworthiness) &&
        Objects.equals(this.currentRatio, notices.currentRatio) &&
        Objects.equals(this.restrictedLiquidity, notices.restrictedLiquidity) &&
        Objects.equals(this.financialExpensesReturnRatio, notices.financialExpensesReturnRatio) &&
        Objects.equals(this.debt, notices.debt) &&
        Objects.equals(this.financialStrength, notices.financialStrength) &&
        Objects.equals(this.workingCapitalRequirement, notices.workingCapitalRequirement) &&
        Objects.equals(this.workingCapitalRequirementTurnover, notices.workingCapitalRequirementTurnover) &&
        Objects.equals(this.customersPaymentTime, notices.customersPaymentTime) &&
        Objects.equals(this.suppliersPaymentTime, notices.suppliersPaymentTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalMargin, netMargin, grossOperatingSurplus, revenueEquityRatio, returnOnCapital, fixedAssetsObsolescence, cashFlow, financialAutonomy, repaymentCapacity, generalCreditworthiness, currentRatio, restrictedLiquidity, financialExpensesReturnRatio, debt, financialStrength, workingCapitalRequirement, workingCapitalRequirementTurnover, customersPaymentTime, suppliersPaymentTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notices {\n");
    
    sb.append("    operationalMargin: ").append(toIndentedString(operationalMargin)).append("\n");
    sb.append("    netMargin: ").append(toIndentedString(netMargin)).append("\n");
    sb.append("    grossOperatingSurplus: ").append(toIndentedString(grossOperatingSurplus)).append("\n");
    sb.append("    revenueEquityRatio: ").append(toIndentedString(revenueEquityRatio)).append("\n");
    sb.append("    returnOnCapital: ").append(toIndentedString(returnOnCapital)).append("\n");
    sb.append("    fixedAssetsObsolescence: ").append(toIndentedString(fixedAssetsObsolescence)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    financialAutonomy: ").append(toIndentedString(financialAutonomy)).append("\n");
    sb.append("    repaymentCapacity: ").append(toIndentedString(repaymentCapacity)).append("\n");
    sb.append("    generalCreditworthiness: ").append(toIndentedString(generalCreditworthiness)).append("\n");
    sb.append("    currentRatio: ").append(toIndentedString(currentRatio)).append("\n");
    sb.append("    restrictedLiquidity: ").append(toIndentedString(restrictedLiquidity)).append("\n");
    sb.append("    financialExpensesReturnRatio: ").append(toIndentedString(financialExpensesReturnRatio)).append("\n");
    sb.append("    debt: ").append(toIndentedString(debt)).append("\n");
    sb.append("    financialStrength: ").append(toIndentedString(financialStrength)).append("\n");
    sb.append("    workingCapitalRequirement: ").append(toIndentedString(workingCapitalRequirement)).append("\n");
    sb.append("    workingCapitalRequirementTurnover: ").append(toIndentedString(workingCapitalRequirementTurnover)).append("\n");
    sb.append("    customersPaymentTime: ").append(toIndentedString(customersPaymentTime)).append("\n");
    sb.append("    suppliersPaymentTime: ").append(toIndentedString(suppliersPaymentTime)).append("\n");
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

