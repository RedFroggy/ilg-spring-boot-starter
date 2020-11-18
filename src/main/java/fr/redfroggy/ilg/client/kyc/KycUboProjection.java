package fr.redfroggy.ilg.client.kyc;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface KycUboProjection {

    /**
     * Oldest information date
     * @return minDate
     */
    @ApiModelProperty(value = "Oldest information date")
    String getMinDate();

    /**
     * Most recent information date
     * @return maxDate
     */
    @ApiModelProperty(value = "Most recent information date")
    String getMaxDate();

    /**
     * Number of UBO
     * @return totalMembers
     */
    @ApiModelProperty(value = "Number of UBO")
    Integer getTotalMembers();

    /**
     * Number of capital detentions
     * @return totalCapitalDetentionMembers
     */
    @ApiModelProperty(value = "Number of capital detentions")
    Integer getTotalCapitalDetentionMembers();

    /**
     * Number of legal representatives
     * @return totalLegalRepresentativeMembers
     */
    @ApiModelProperty(value = "Number of legal representatives")
    Integer getTotalLegalRepresentativeMembers();

    /**
     * UBO
     * @return members
     */
    @ApiModelProperty(value = "UBO")
    List<? extends GroupMemberProjection> getMembers();

    /**
     * Procedure steps passed through to find ubo
     * @return steps
     */
    @ApiModelProperty(value = "Procedure steps passed through to find ubo")
    List<? extends UboInvestigationStepProjection> getSteps();
}
