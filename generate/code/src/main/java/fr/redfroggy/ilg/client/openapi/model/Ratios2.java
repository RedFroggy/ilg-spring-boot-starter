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
 * Ratios2
 */

public class Ratios2   {
  @JsonProperty("turnover")
  private Integer turnover;

  @JsonProperty("operatingIncome")
  private Integer operatingIncome;

  @JsonProperty("financialExpenses")
  private Integer financialExpenses;

  @JsonProperty("netIncome")
  private Integer netIncome;

  @JsonProperty("equity")
  private Integer equity;

  @JsonProperty("workforce")
  private Integer workforce;

  @JsonProperty("liquidAssets")
  private Integer liquidAssets;

  @JsonProperty("operationalMargin")
  private Float operationalMargin;

  @JsonProperty("netMargin")
  private Float netMargin;

  @JsonProperty("grossOperatingSurplus")
  private Integer grossOperatingSurplus;

  @JsonProperty("revenueEquityRatio")
  private Float revenueEquityRatio;

  @JsonProperty("returnOnCapital")
  private Float returnOnCapital;

  @JsonProperty("fixedAssetsObsolescence")
  private Integer fixedAssetsObsolescence;

  @JsonProperty("cashFlow")
  private Float cashFlow;

  @JsonProperty("financialAutonomy")
  private Float financialAutonomy;

  @JsonProperty("repaymentCapacity")
  private Float repaymentCapacity;

  @JsonProperty("generalCreditworthiness")
  private Float generalCreditworthiness;

  @JsonProperty("currentRatio")
  private Float currentRatio;

  @JsonProperty("restrictedLiquidity")
  private Float restrictedLiquidity;

  @JsonProperty("financialExpensesReturnRatio")
  private Float financialExpensesReturnRatio;

  @JsonProperty("debt")
  private Float debt;

  @JsonProperty("financialStrength")
  private Float financialStrength;

  @JsonProperty("workingCapitalRequirement")
  private Integer workingCapitalRequirement;

  public Ratios2 turnover(Integer turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Turnover
   * @return turnover
  */
  @ApiModelProperty(example = "110797", value = "Turnover")


  public Integer getTurnover() {
    return turnover;
  }

  public void setTurnover(Integer turnover) {
    this.turnover = turnover;
  }

  public Ratios2 operatingIncome(Integer operatingIncome) {
    this.operatingIncome = operatingIncome;
    return this;
  }

  /**
   * Operating income
   * @return operatingIncome
  */
  @ApiModelProperty(example = "21", value = "Operating income")


  public Integer getOperatingIncome() {
    return operatingIncome;
  }

  public void setOperatingIncome(Integer operatingIncome) {
    this.operatingIncome = operatingIncome;
  }

  public Ratios2 financialExpenses(Integer financialExpenses) {
    this.financialExpenses = financialExpenses;
    return this;
  }

  /**
   * Financial expenses
   * @return financialExpenses
  */
  @ApiModelProperty(example = "0", value = "Financial expenses")


  public Integer getFinancialExpenses() {
    return financialExpenses;
  }

  public void setFinancialExpenses(Integer financialExpenses) {
    this.financialExpenses = financialExpenses;
  }

  public Ratios2 netIncome(Integer netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Net income
   * @return netIncome
  */
  @ApiModelProperty(example = "0", value = "Net income")


  public Integer getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(Integer netIncome) {
    this.netIncome = netIncome;
  }

  public Ratios2 equity(Integer equity) {
    this.equity = equity;
    return this;
  }

  /**
   * Equity
   * @return equity
  */
  @ApiModelProperty(example = "1633", value = "Equity")


  public Integer getEquity() {
    return equity;
  }

  public void setEquity(Integer equity) {
    this.equity = equity;
  }

  public Ratios2 workforce(Integer workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Effectif
   * @return workforce
  */
  @ApiModelProperty(example = "85", value = "Effectif")


  public Integer getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Integer workforce) {
    this.workforce = workforce;
  }

  public Ratios2 liquidAssets(Integer liquidAssets) {
    this.liquidAssets = liquidAssets;
    return this;
  }

  /**
   * Liquid Assets
   * @return liquidAssets
  */
  @ApiModelProperty(example = "2334333", value = "Liquid Assets")


  public Integer getLiquidAssets() {
    return liquidAssets;
  }

  public void setLiquidAssets(Integer liquidAssets) {
    this.liquidAssets = liquidAssets;
  }

  public Ratios2 operationalMargin(Float operationalMargin) {
    this.operationalMargin = operationalMargin;
    return this;
  }

  /**
   * Operational margin
   * @return operationalMargin
  */
  @ApiModelProperty(example = "0.02", value = "Operational margin")


  public Float getOperationalMargin() {
    return operationalMargin;
  }

  public void setOperationalMargin(Float operationalMargin) {
    this.operationalMargin = operationalMargin;
  }

  public Ratios2 netMargin(Float netMargin) {
    this.netMargin = netMargin;
    return this;
  }

  /**
   * Net margin
   * @return netMargin
  */
  @ApiModelProperty(example = "1.01", value = "Net margin")


  public Float getNetMargin() {
    return netMargin;
  }

  public void setNetMargin(Float netMargin) {
    this.netMargin = netMargin;
  }

  public Ratios2 grossOperatingSurplus(Integer grossOperatingSurplus) {
    this.grossOperatingSurplus = grossOperatingSurplus;
    return this;
  }

  /**
   * Gross operating surplus
   * @return grossOperatingSurplus
  */
  @ApiModelProperty(example = "7000", value = "Gross operating surplus")


  public Integer getGrossOperatingSurplus() {
    return grossOperatingSurplus;
  }

  public void setGrossOperatingSurplus(Integer grossOperatingSurplus) {
    this.grossOperatingSurplus = grossOperatingSurplus;
  }

  public Ratios2 revenueEquityRatio(Float revenueEquityRatio) {
    this.revenueEquityRatio = revenueEquityRatio;
    return this;
  }

  /**
   * Revenue on equity ratio
   * @return revenueEquityRatio
  */
  @ApiModelProperty(example = "67.85", value = "Revenue on equity ratio")


  public Float getRevenueEquityRatio() {
    return revenueEquityRatio;
  }

  public void setRevenueEquityRatio(Float revenueEquityRatio) {
    this.revenueEquityRatio = revenueEquityRatio;
  }

  public Ratios2 returnOnCapital(Float returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
    return this;
  }

  /**
   * Return on capital
   * @return returnOnCapital
  */
  @ApiModelProperty(example = "0.0", value = "Return on capital")


  public Float getReturnOnCapital() {
    return returnOnCapital;
  }

  public void setReturnOnCapital(Float returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
  }

  public Ratios2 fixedAssetsObsolescence(Integer fixedAssetsObsolescence) {
    this.fixedAssetsObsolescence = fixedAssetsObsolescence;
    return this;
  }

  /**
   * Fixed assets obsolescence
   * @return fixedAssetsObsolescence
  */
  @ApiModelProperty(example = "0", value = "Fixed assets obsolescence")


  public Integer getFixedAssetsObsolescence() {
    return fixedAssetsObsolescence;
  }

  public void setFixedAssetsObsolescence(Integer fixedAssetsObsolescence) {
    this.fixedAssetsObsolescence = fixedAssetsObsolescence;
  }

  public Ratios2 cashFlow(Float cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

  /**
   * Cash flow
   * @return cashFlow
  */
  @ApiModelProperty(example = "27000.0", value = "Cash flow")


  public Float getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(Float cashFlow) {
    this.cashFlow = cashFlow;
  }

  public Ratios2 financialAutonomy(Float financialAutonomy) {
    this.financialAutonomy = financialAutonomy;
    return this;
  }

  /**
   * Financial autonomy
   * @return financialAutonomy
  */
  @ApiModelProperty(example = "0.0", value = "Financial autonomy")


  public Float getFinancialAutonomy() {
    return financialAutonomy;
  }

  public void setFinancialAutonomy(Float financialAutonomy) {
    this.financialAutonomy = financialAutonomy;
  }

  public Ratios2 repaymentCapacity(Float repaymentCapacity) {
    this.repaymentCapacity = repaymentCapacity;
    return this;
  }

  /**
   * Repayment capacity
   * @return repaymentCapacity
  */
  @ApiModelProperty(example = "178.0", value = "Repayment capacity")


  public Float getRepaymentCapacity() {
    return repaymentCapacity;
  }

  public void setRepaymentCapacity(Float repaymentCapacity) {
    this.repaymentCapacity = repaymentCapacity;
  }

  public Ratios2 generalCreditworthiness(Float generalCreditworthiness) {
    this.generalCreditworthiness = generalCreditworthiness;
    return this;
  }

  /**
   * General creditworthiness
   * @return generalCreditworthiness
  */
  @ApiModelProperty(example = "1.0", value = "General creditworthiness")


  public Float getGeneralCreditworthiness() {
    return generalCreditworthiness;
  }

  public void setGeneralCreditworthiness(Float generalCreditworthiness) {
    this.generalCreditworthiness = generalCreditworthiness;
  }

  public Ratios2 currentRatio(Float currentRatio) {
    this.currentRatio = currentRatio;
    return this;
  }

  /**
   * Current ratio
   * @return currentRatio
  */
  @ApiModelProperty(example = "5.0", value = "Current ratio")


  public Float getCurrentRatio() {
    return currentRatio;
  }

  public void setCurrentRatio(Float currentRatio) {
    this.currentRatio = currentRatio;
  }

  public Ratios2 restrictedLiquidity(Float restrictedLiquidity) {
    this.restrictedLiquidity = restrictedLiquidity;
    return this;
  }

  /**
   * RestrictedLliquidity
   * @return restrictedLiquidity
  */
  @ApiModelProperty(example = "5.0", value = "RestrictedLliquidity")


  public Float getRestrictedLiquidity() {
    return restrictedLiquidity;
  }

  public void setRestrictedLiquidity(Float restrictedLiquidity) {
    this.restrictedLiquidity = restrictedLiquidity;
  }

  public Ratios2 financialExpensesReturnRatio(Float financialExpensesReturnRatio) {
    this.financialExpensesReturnRatio = financialExpensesReturnRatio;
    return this;
  }

  /**
   * Financial expenses on return ratio
   * @return financialExpensesReturnRatio
  */
  @ApiModelProperty(example = "26.0", value = "Financial expenses on return ratio")


  public Float getFinancialExpensesReturnRatio() {
    return financialExpensesReturnRatio;
  }

  public void setFinancialExpensesReturnRatio(Float financialExpensesReturnRatio) {
    this.financialExpensesReturnRatio = financialExpensesReturnRatio;
  }

  public Ratios2 debt(Float debt) {
    this.debt = debt;
    return this;
  }

  /**
   * Debt
   * @return debt
  */
  @ApiModelProperty(example = "3400.0", value = "Debt")


  public Float getDebt() {
    return debt;
  }

  public void setDebt(Float debt) {
    this.debt = debt;
  }

  public Ratios2 financialStrength(Float financialStrength) {
    this.financialStrength = financialStrength;
    return this;
  }

  /**
   * Financial strength
   * @return financialStrength
  */
  @ApiModelProperty(example = "45.0", value = "Financial strength")


  public Float getFinancialStrength() {
    return financialStrength;
  }

  public void setFinancialStrength(Float financialStrength) {
    this.financialStrength = financialStrength;
  }

  public Ratios2 workingCapitalRequirement(Integer workingCapitalRequirement) {
    this.workingCapitalRequirement = workingCapitalRequirement;
    return this;
  }

  /**
   * Working capital requirement
   * @return workingCapitalRequirement
  */
  @ApiModelProperty(example = "516000", value = "Working capital requirement")


  public Integer getWorkingCapitalRequirement() {
    return workingCapitalRequirement;
  }

  public void setWorkingCapitalRequirement(Integer workingCapitalRequirement) {
    this.workingCapitalRequirement = workingCapitalRequirement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ratios2 ratios2 = (Ratios2) o;
    return Objects.equals(this.turnover, ratios2.turnover) &&
        Objects.equals(this.operatingIncome, ratios2.operatingIncome) &&
        Objects.equals(this.financialExpenses, ratios2.financialExpenses) &&
        Objects.equals(this.netIncome, ratios2.netIncome) &&
        Objects.equals(this.equity, ratios2.equity) &&
        Objects.equals(this.workforce, ratios2.workforce) &&
        Objects.equals(this.liquidAssets, ratios2.liquidAssets) &&
        Objects.equals(this.operationalMargin, ratios2.operationalMargin) &&
        Objects.equals(this.netMargin, ratios2.netMargin) &&
        Objects.equals(this.grossOperatingSurplus, ratios2.grossOperatingSurplus) &&
        Objects.equals(this.revenueEquityRatio, ratios2.revenueEquityRatio) &&
        Objects.equals(this.returnOnCapital, ratios2.returnOnCapital) &&
        Objects.equals(this.fixedAssetsObsolescence, ratios2.fixedAssetsObsolescence) &&
        Objects.equals(this.cashFlow, ratios2.cashFlow) &&
        Objects.equals(this.financialAutonomy, ratios2.financialAutonomy) &&
        Objects.equals(this.repaymentCapacity, ratios2.repaymentCapacity) &&
        Objects.equals(this.generalCreditworthiness, ratios2.generalCreditworthiness) &&
        Objects.equals(this.currentRatio, ratios2.currentRatio) &&
        Objects.equals(this.restrictedLiquidity, ratios2.restrictedLiquidity) &&
        Objects.equals(this.financialExpensesReturnRatio, ratios2.financialExpensesReturnRatio) &&
        Objects.equals(this.debt, ratios2.debt) &&
        Objects.equals(this.financialStrength, ratios2.financialStrength) &&
        Objects.equals(this.workingCapitalRequirement, ratios2.workingCapitalRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, operatingIncome, financialExpenses, netIncome, equity, workforce, liquidAssets, operationalMargin, netMargin, grossOperatingSurplus, revenueEquityRatio, returnOnCapital, fixedAssetsObsolescence, cashFlow, financialAutonomy, repaymentCapacity, generalCreditworthiness, currentRatio, restrictedLiquidity, financialExpensesReturnRatio, debt, financialStrength, workingCapitalRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ratios2 {\n");
    
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    operatingIncome: ").append(toIndentedString(operatingIncome)).append("\n");
    sb.append("    financialExpenses: ").append(toIndentedString(financialExpenses)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
    sb.append("    workforce: ").append(toIndentedString(workforce)).append("\n");
    sb.append("    liquidAssets: ").append(toIndentedString(liquidAssets)).append("\n");
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

