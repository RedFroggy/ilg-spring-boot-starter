package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.WorkforceProjection;
import fr.redfroggy.ilg.client.site.WorkforceProjection2;
import fr.redfroggy.ilg.client.site.WorkforceProjection4;

/**
 * Workforce
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Workforce implements WorkforceProjection, WorkforceProjection2, WorkforceProjection4 {

    private final String value;

    private final String range;

    private final Integer rangeMin;

    private final Integer rangeMax;

    public Workforce(@JsonProperty("value") String value, @JsonProperty("range") String range,
                     @JsonProperty("rangeMin") Integer rangeMin, @JsonProperty("rangeMax") Integer rangeMax) {
        this.value = value;
        this.range = range;
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
    }


    /**
     * Number of employee, can be 'NN' indicating that no data has been collected
     *
     * @return value
     */

    public String getValue() {
        return value;
    }

    /**
     * Range of employees
     *
     * @return range
     */

    public String getRange() {
        return range;
    }

    /**
     * Range minimum
     *
     * @return rangeMin
     */

    public Integer getRangeMin() {
        return rangeMin;
    }

    /**
     * Range maximum
     *
     * @return rangeMax
     */

    public Integer getRangeMax() {
        return rangeMax;
    }

}

