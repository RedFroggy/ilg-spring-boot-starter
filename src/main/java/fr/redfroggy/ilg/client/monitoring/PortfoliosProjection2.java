package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Portfolios
 */
@JsonDeserialize(as = Portfolios.class)
public interface PortfoliosProjection2 {

    /**
     * List of portfolios
     *
     * @return portfolios
     */
    @ApiModelProperty(value = "List of portfolios")
    List<? extends PortfolioProjection2> getPortfolios();

    /**
     * Number of portfolios
     *
     * @return count
     */
    @ApiModelProperty(example = "1", value = "Number of portfolios")
    public Integer getCount();
}

