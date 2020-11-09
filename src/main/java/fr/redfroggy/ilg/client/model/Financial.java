package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.FinancialProjection;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Financial
 */
@JsonDeserialize(builder = Financial.FinancialBuilder.class)
public class Financial implements FinancialProjection {
    private final String turnover;

    private final String currency;

    private final String netIncome;

    private final String operatingIncome;

    private final String equity;

    private final LocalDate closingDate;

    private final LocalDate lastUpdate;

    private final Workforce workforce;

    private final Object balances;

    public Financial(FinancialBuilder builder) {
        this.turnover = builder.turnover;
        this.currency = builder.currency;
        this.netIncome = builder.netIncome;
        this.operatingIncome = builder.operatingIncome;
        this.equity = builder.equity;
        this.closingDate = builder.closingDate;
        this.lastUpdate = builder.lastUpdate;
        this.workforce = builder.workforce;
        this.balances = builder.balances;
    }

    public static FinancialBuilder builder() {
        return new FinancialBuilder();
    }

    /**
     * Financial turnover
     *
     * @return turnover
     */

    @ApiModelProperty(example = "1000", value = "Financial turnover")
    public String getTurnover() {
        return turnover;
    }

    /**
     * Currency used for financial datas
     *
     * @return currency
     */

    @ApiModelProperty(example = "k€", value = "Currency used for financial datas")
    public String getCurrency() {
        return currency;
    }

    /**
     * Net income
     *
     * @return netIncome
     */

    @ApiModelProperty(example = "32", value = "Net income")
    public String getNetIncome() {
        return netIncome;
    }

    /**
     * Operation income
     *
     * @return operatingIncome
     */

    @ApiModelProperty(example = "65", value = "Operation income")
    public String getOperatingIncome() {
        return operatingIncome;
    }

    /**
     * Operation income
     *
     * @return equity
     */

    @ApiModelProperty(example = "145", value = "Operation income")
    public String getEquity() {
        return equity;
    }

    /**
     * Fiscal year closing date
     *
     * @return closingDate
     */

    @ApiModelProperty(value = "Fiscal year closing date")
    public LocalDate getClosingDate() {
        return closingDate;
    }

    /**
     * Last update
     *
     * @return lastUpdate
     */

    @ApiModelProperty(value = "Last update")
    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Get workforce
     *
     * @return workforce
     */

    @ApiModelProperty(value = "")
    public Workforce getWorkforce() {
        return workforce;
    }

    /**
     * Get balances
     *
     * @return balances
     */
    @ApiModelProperty(value = "")

    public Object getBalances() {
        return balances;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class FinancialBuilder {
        private String turnover;
        private String currency;
        private String netIncome;
        private String operatingIncome;
        private String equity;
        private LocalDate closingDate;
        private LocalDate lastUpdate;
        private Workforce workforce;
        private Object balances;

        private FinancialBuilder() {
        }

        public FinancialBuilder turnover(String turnover) {
            this.turnover = turnover;
            return this;
        }

        public FinancialBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public FinancialBuilder netIncome(String netIncome) {
            this.netIncome = netIncome;
            return this;
        }

        public FinancialBuilder operatingIncome(String operatingIncome) {
            this.operatingIncome = operatingIncome;
            return this;
        }

        public FinancialBuilder equity(String equity) {
            this.equity = equity;
            return this;
        }

        public FinancialBuilder closingDate(LocalDate closingDate) {
            this.closingDate = closingDate;
            return this;
        }

        public FinancialBuilder lastUpdate(LocalDate lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        public FinancialBuilder workforce(Workforce workforce) {
            this.workforce = workforce;
            return this;
        }

        public FinancialBuilder balances(Object balances) {
            this.balances = balances;
            return this;
        }

        public Financial build() {
            return new Financial(this);
        }
    }
}

