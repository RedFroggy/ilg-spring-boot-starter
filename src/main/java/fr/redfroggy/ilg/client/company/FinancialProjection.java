package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

public interface FinancialProjection {
    /**
     * Financial turnover
     * @return turnover
    */
    @ApiModelProperty(example = "1000", value = "Financial turnover")
    String getTurnover();

    /**
     * Currency used for financial datas
     * @return currency
    */
    @ApiModelProperty(example = "k€", value = "Currency used for financial datas")
    String getCurrency();

    /**
     * Net income
     * @return netIncome
    */
    @ApiModelProperty(example = "32", value = "Net income")
    String getNetIncome();

    /**
     * Operation income
     * @return operatingIncome
    */
    @ApiModelProperty(example = "65", value = "Operation income")
    String getOperatingIncome();

    /**
     * Operation income
     * @return equity
    */
    @ApiModelProperty(example = "145", value = "Operation income")
    String getEquity();

    /**
     * Fiscal year closing date
     * @return closingDate
    */
    @ApiModelProperty(value = "Fiscal year closing date")
    LocalDate getClosingDate();

    /**
     * Last update
     * @return lastUpdate
    */
    @ApiModelProperty(value = "Last update")
    LocalDate getLastUpdate();

    /**
     * Get workforce
     * @return workforce
    */
    @ApiModelProperty(value = "")
    WorkforceProjection getWorkforce();

    /**
     * Get balances
     * @return balances
     */
    @ApiModelProperty(value = "")
    Object getBalances();
}
