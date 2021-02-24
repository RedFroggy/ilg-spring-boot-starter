package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Portfolios
 */

public class Portfolios implements PortfoliosProjection,PortfoliosProjection2 {

    private final List<Portfolio> portfolios;

    private final Integer count;

    public Portfolios(@JsonProperty("portfolios") List<Portfolio> portfolios,
                      @JsonProperty("count") Integer count) {
        this.portfolios = portfolios;
        this.count = count;
    }

    /**
     * List of portfolios
     *
     * @return portfolios
     */
    @Override
    @ApiModelProperty(value = "List of portfolios")
    public List<? extends Portfolio> getPortfolios() {
        return portfolios;
    }

    /**
     * Number of portfolios
     *
     * @return count
     */
    @Override
    @ApiModelProperty(example = "1", value = "Number of portfolios")
    public Integer getCount() {
        return count;
    }
}

