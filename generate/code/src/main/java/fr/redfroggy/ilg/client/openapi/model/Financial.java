package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Workforce;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Financial
 */

public class Financial   {
  @JsonProperty("turnover")
  private String turnover;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("netIncome")
  private String netIncome;

  @JsonProperty("operatingIncome")
  private String operatingIncome;

  @JsonProperty("equity")
  private String equity;

  @JsonProperty("closingDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate closingDate;

  @JsonProperty("lastUpdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate lastUpdate;

  @JsonProperty("workforce")
  private Workforce workforce;

  @JsonProperty("balances")
  private Object balances;

  @JsonProperty("deptStatus")
  private Object deptStatus;

  public Financial turnover(String turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Financial turnover
   * @return turnover
  */
  @ApiModelProperty(example = "1000", value = "Financial turnover")


  public String getTurnover() {
    return turnover;
  }

  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }

  public Financial currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency used for financial datas
   * @return currency
  */
  @ApiModelProperty(example = "k€", value = "Currency used for financial datas")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Financial netIncome(String netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Net income
   * @return netIncome
  */
  @ApiModelProperty(example = "32", value = "Net income")


  public String getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(String netIncome) {
    this.netIncome = netIncome;
  }

  public Financial operatingIncome(String operatingIncome) {
    this.operatingIncome = operatingIncome;
    return this;
  }

  /**
   * Operation income
   * @return operatingIncome
  */
  @ApiModelProperty(example = "65", value = "Operation income")


  public String getOperatingIncome() {
    return operatingIncome;
  }

  public void setOperatingIncome(String operatingIncome) {
    this.operatingIncome = operatingIncome;
  }

  public Financial equity(String equity) {
    this.equity = equity;
    return this;
  }

  /**
   * Operation income
   * @return equity
  */
  @ApiModelProperty(example = "145", value = "Operation income")


  public String getEquity() {
    return equity;
  }

  public void setEquity(String equity) {
    this.equity = equity;
  }

  public Financial closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Fiscal year closing date
   * @return closingDate
  */
  @ApiModelProperty(value = "Fiscal year closing date")

  @Valid

  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public Financial lastUpdate(LocalDate lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Last update
   * @return lastUpdate
  */
  @ApiModelProperty(value = "Last update")

  @Valid

  public LocalDate getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(LocalDate lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Financial workforce(Workforce workforce) {
    this.workforce = workforce;
    return this;
  }

  /**
   * Get workforce
   * @return workforce
  */
  @ApiModelProperty(value = "")

  @Valid

  public Workforce getWorkforce() {
    return workforce;
  }

  public void setWorkforce(Workforce workforce) {
    this.workforce = workforce;
  }

  public Financial balances(Object balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBalances() {
    return balances;
  }

  public void setBalances(Object balances) {
    this.balances = balances;
  }

  public Financial deptStatus(Object deptStatus) {
    this.deptStatus = deptStatus;
    return this;
  }

  /**
   * Get deptStatus
   * @return deptStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDeptStatus() {
    return deptStatus;
  }

  public void setDeptStatus(Object deptStatus) {
    this.deptStatus = deptStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Financial financial = (Financial) o;
    return Objects.equals(this.turnover, financial.turnover) &&
        Objects.equals(this.currency, financial.currency) &&
        Objects.equals(this.netIncome, financial.netIncome) &&
        Objects.equals(this.operatingIncome, financial.operatingIncome) &&
        Objects.equals(this.equity, financial.equity) &&
        Objects.equals(this.closingDate, financial.closingDate) &&
        Objects.equals(this.lastUpdate, financial.lastUpdate) &&
        Objects.equals(this.workforce, financial.workforce) &&
        Objects.equals(this.balances, financial.balances) &&
        Objects.equals(this.deptStatus, financial.deptStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, currency, netIncome, operatingIncome, equity, closingDate, lastUpdate, workforce, balances, deptStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Financial {\n");
    
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    operatingIncome: ").append(toIndentedString(operatingIncome)).append("\n");
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    workforce: ").append(toIndentedString(workforce)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    deptStatus: ").append(toIndentedString(deptStatus)).append("\n");
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

