package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.ActivityModelProjection;
import fr.redfroggy.ilg.client.site.ActivityModelProjection3;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActivityModel
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class ActivityModel implements ActivityModelProjection, ActivityModelProjection3 {

    private final String code;

    private final String label;

    public ActivityModel(@JsonProperty("code") String code, @JsonProperty("label") String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * Activity code
     *
     * @return code
     */

    @ApiModelProperty(example = "3030Z", value = "Activity code")
    public String getCode() {
        return code;
    }

    /**
     * Activity label
     *
     * @return label
     */

    @ApiModelProperty(example = "Construction aéronautique et spatiale", value = "Activity label")
    public String getLabel() {
        return label;
    }

}

