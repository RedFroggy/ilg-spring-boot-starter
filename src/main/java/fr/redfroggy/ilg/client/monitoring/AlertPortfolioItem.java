package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * PortfolioItem
 */

public class AlertPortfolioItem {

    private final Integer portfolioId;

    private final String customCode;

    private final Integer customCredit;

    public AlertPortfolioItem(@JsonProperty("portfolioId") Integer portfolioId,
                              @JsonProperty("customCode") String customCode,
                              @JsonProperty("customCredit") Integer customCredit) {
        this.portfolioId = portfolioId;
        this.customCode = customCode;
        this.customCredit = customCredit;
    }

    /**
     * portfolioId
     *
     * @return portfolioId
     */
    @ApiModelProperty(example = "2588955", value = "portfolio Id")
    public Integer getPortfolioId() {
        return portfolioId;
    }

    /**
     * Reference of the item
     *
     * @return customCode
     */
    @ApiModelProperty(example = "SXXCCS", value = "Reference of the item")
    public String getCustomCode() {
        return customCode;
    }

    /**
     * Custom credit of the item
     *
     * @return customCredit
     */
    @ApiModelProperty(example = "1000", value = "Custom credit of the item")
    public Integer getCustomCredit() {
        return customCredit;
    }
}

