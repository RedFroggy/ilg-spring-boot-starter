package fr.redfroggy.ilg.client.company;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

public interface GroupMemberProjection4 {
    /**
     * Parent group ID
     * @return parentId
     */
    @ApiModelProperty(example = "0", value = "Parent group ID")
    Integer getParentId();

    /**
     * Complete path from root to current node
     * @return nodePath
     */
    @ApiModelProperty(example = "0/1", value = "Complete path from root to current node")
    String getNodePath();

    /**
     * Member ID
     * @return entityId
     */
    @ApiModelProperty(example = "0", value = "Member ID")
    Integer getEntityId();

    /**
     * Member name
     * @return entityName
     */
    @ApiModelProperty(example = "BAZIN Sébastien", value = "Member name")
    String getEntityName();

    /**
     * Member registration number
     * @return registrationNumber
     */
    @ApiModelProperty(example = "503207896", value = "Member registration number")
    String getRegistrationNumber();

    /**
     * Country code in ISO 3166-1 alpha-3
     * @return countryCodeIso3
     */
    @ApiModelProperty(example = "FRA", value = "Country code in ISO 3166-1 alpha-3")
    String getCountryCodeIso3();

    /**
     * Country code in ISO 3166-2
     * @return countryCode
     */
    @ApiModelProperty(example = "FR", value = "Country code in ISO 3166-2")
    String getCountryCode();

    /**
     * Country label
     * @return country
     */
    @ApiModelProperty(example = "France", value = "Country label")
    String getCountry();

    /**
     * Member score
     * @return score
     */
    @ApiModelProperty(example = "12", value = "Member score")
    Integer getScore();

    /**
     * Get group
     * @return group
     */
    @ApiModelProperty(value = "")
    Object getGroup();

    /**
     * Get address
     * @return address
     */
    @ApiModelProperty(value = "")

    @Valid
    AddressProjection getAddress();

    /**
     * Member name
     * @return name
     */
    @ApiModelProperty(example = "BAZIN", value = "Member name")
    String getName();

    /**
     * Member firstname
     * @return firstname
     */
    @ApiModelProperty(example = "Sébastien", value = "Member firstname")
    String getFirstname();

    /**
     * Member maidenname
     * @return maidenName
     */
    @ApiModelProperty(example = "BAZIN", value = "Member maidenname")
    String getMaidenName();

    /**
     * Member title
     * @return title
     */
    @ApiModelProperty(example = "M / Mme", value = "Member title")
    String getTitle();

    /**
     * Get frenchPrivateGroupHead
     * @return frenchPrivateGroupHead
     */
    @ApiModelProperty(value = "")
    GroupInfoProjection getFrenchPrivateGroupHead();

    /**
     * Oldest information date
     * @return minDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Oldest information date")
    String getMinDate();

    /**
     * Most recent information date
     * @return maxDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Most recent information date")
    String getMaxDate();
}
