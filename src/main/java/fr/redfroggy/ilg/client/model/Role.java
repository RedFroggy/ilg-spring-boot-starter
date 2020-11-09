package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Role
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Role {
    private final String type;

    private final String description;

    public Role(@JsonProperty("type") String type, @JsonProperty("description") String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Role type
     *
     * @return type
     */
    @ApiModelProperty(example = "PR", value = "Role type")
    public String getType() {
        return type;
    }

    /**
     * Role description
     *
     * @return description
     */
    @ApiModelProperty(example = "Principal", value = "Role description")
    public String getDescription() {
        return description;
    }

}

