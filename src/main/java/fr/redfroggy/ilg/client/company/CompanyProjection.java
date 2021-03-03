package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

public interface CompanyProjection {
    /**
     * Get identity
     * @return identity
     */
    @ApiModelProperty(value = "")
    @Valid
    IdentityProjection getIdentity();

    /**
     * Get sites
     * @return sites
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getSites();

    /**
     * Get risk
     * @return risk
     */
    @ApiModelProperty(value = "")
    @Valid
    RiskProjection getRisk();

    /**
     * Get score
     * @return score
     */
    @ApiModelProperty(value = "")
    @Valid
    ScoreProjection getScore();

    /**
     * Get financial
     * @return financial
     */
    @ApiModelProperty(value = "")
    @Valid
    FinancialProjection getFinancial();

    /**
     * Get links
     * @return links
     */
    @ApiModelProperty(value = "")
    @Valid
    LinksProjection2 getLinks();

    /**
     * Get groupStructure
     * @return groupStructure
     */
    @ApiModelProperty(value = "")
    @Valid
    GroupMemberProjection4 getGroupStructure();

    /**
     * Get groupInfo
     * @return groupInfo
     */
    @ApiModelProperty(value = "")
    @Valid
    GroupInfoProjection getGroupInfo();

    /**
     * Get mandataire
     * @return mandataire
     */
    @ApiModelProperty(value = "")
    @Valid
    ExecutiveProjection getMandataire();

    /**
     *
     * @return lastAds
     */
    @ApiModelProperty(value = "")
    @Valid
    List<? extends EventProjection3> getLastAds();

    /**
     * Get events
     * @return events
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getEvents();

    /**
     * Get executives
     * @return executives
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getExecutives();

    /**
     * Get mandats
     * @return mandats
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getMandats();

    /**
     * Get legal
     * @return legal
     */
    @ApiModelProperty(value = "")
    @Valid
    Object getLegal();

    /**
     * Get kyc
     * @return kyc
     */
    @ApiModelProperty(value = "")
    @Valid
    KycProjection getKyc();
}
