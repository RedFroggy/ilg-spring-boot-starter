package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.GroupInfoProjection;
import io.swagger.annotations.ApiModelProperty;

/**
 * GroupInfo
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class GroupInfo implements GroupInfoProjection {
    private final String entityId;

    private final String registrationId;

    private final String companyName;

    private final Integer groupWorkforce;

    private final Integer groupTurnover;

    public GroupInfo(@JsonProperty("entityId") String entityId,
                     @JsonProperty("registrationId") String registrationId,
                     @JsonProperty("companyName") String companyName,
                     @JsonProperty("groupWorkforce") Integer groupWorkforce,
                     @JsonProperty("groupTurnover") Integer groupTurnover) {
        this.entityId = entityId;
        this.registrationId = registrationId;
        this.companyName = companyName;
        this.groupWorkforce = groupWorkforce;
        this.groupTurnover = groupTurnover;
    }

    /**
     * Get entityId
     *
     * @return entityId
     */

    @ApiModelProperty(value = "")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Get registrationId
     *
     * @return registrationId
     */

    @ApiModelProperty(value = "")
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Get companyName
     *
     * @return companyName
     */

    @ApiModelProperty(value = "")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Get groupWorkforce
     *
     * @return groupWorkforce
     */

    @ApiModelProperty(value = "")
    public Integer getGroupWorkforce() {
        return groupWorkforce;
    }

    /**
     * Get groupTurnover
     *
     * @return groupTurnover
     */

    @ApiModelProperty(value = "")
    public Integer getGroupTurnover() {
        return groupTurnover;
    }

}

