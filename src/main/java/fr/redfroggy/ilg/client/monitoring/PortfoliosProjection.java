package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonDeserialize(as = Portfolios.class)
public interface PortfoliosProjection {
    @ApiModelProperty(value = "List of portfolios")
    List<? extends PortfolioProjection3> getPortfolios();

    @ApiModelProperty(example = "1", value = "Number of portfolios")
    Integer getCount();
}
