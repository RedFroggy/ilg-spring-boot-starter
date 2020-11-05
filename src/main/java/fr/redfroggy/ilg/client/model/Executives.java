package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Executives
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Executives {

    private final List<Executive> executives;

    private final Integer count;

    public Executives(@JsonProperty("executives") List<Executive> executives,
                      @JsonProperty("count") Integer count) {
        this.executives = executives;
        this.count = count;
    }

    /**
     * List of executive
     *
     * @return executives
     */

    @ApiModelProperty(value = "List of executive")
    public List<? extends Executive> getExecutives() {
        return executives;
    }

    /**
     * Number of result found
     *
     * @return count
     */

    @ApiModelProperty(value = "Number of result found")
    public Integer getCount() {
        return count;
    }
}

