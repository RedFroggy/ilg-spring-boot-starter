package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

public interface GroupInfoProjection {
    /**
     * Get entityId
     * @return entityId
    */
    @ApiModelProperty(value = "")
    String getEntityId();

    /**
     * Get registrationId
     * @return registrationId
    */
    @ApiModelProperty(value = "")
    String getRegistrationId();

    /**
     * Get companyName
     * @return companyName
    */
    @ApiModelProperty(value = "")
    String getCompanyName();

    /**
     * Get groupWorkforce
     * @return groupWorkforce
    */
    @ApiModelProperty(value = "")
    Integer getGroupWorkforce();

    /**
     * Get groupTurnover
     * @return groupTurnover
    */
    @ApiModelProperty(value = "")
    Integer getGroupTurnover();
}
