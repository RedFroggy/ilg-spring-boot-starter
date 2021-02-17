package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class PortfolioItems {

    private final List<PortfolioItem> items;

    private final Integer count;

    public PortfolioItems(@JsonProperty("items") List<PortfolioItem> items,
                      @JsonProperty("count") Integer count) {
        this.items = items;
        this.count = count;
    }

    /**
     * List of items
     *
     * @return items
     */
    @ApiModelProperty(value = "List of portfolios")
    public List<PortfolioItem> getItems() {
        return items;
    }

    /**
     * Number of items
     *
     * @return count
     */
    @ApiModelProperty(example = "1", value = "Number of items")
    public Integer getCount() {
        return count;
    }
}
