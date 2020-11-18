package fr.redfroggy.ilg.client.relation;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public interface GroupMemberProjection3 {
    /**
     * Member ID
     *
     * @return entityId
     */
    @ApiModelProperty(example = "0", value = "Member ID")
    Integer getEntityId();

    /**
     * Member name
     *
     * @return entityName
     */
    @ApiModelProperty(example = "BAZIN Sébastien", value = "Member name")
    String getEntityName();

    /**
     * Member registration number
     *
     * @return registrationNumber
     */
    @ApiModelProperty(example = "503207896", value = "Member registration number")
    String getRegistrationNumber();

    /**
     * Country code in ISO 3166-1 alpha-3
     *
     * @return countryCodeIso3
     */
    @ApiModelProperty(example = "FRA", value = "Country code in ISO 3166-1 alpha-3")
    String getCountryCodeIso3();

    /**
     * Country code in ISO 3166-2
     *
     * @return countryCode
     */
    @ApiModelProperty(example = "FR", value = "Country code in ISO 3166-2")
    String getCountryCode();

    /**
     * Country label
     *
     * @return country
     */
    @ApiModelProperty(example = "France", value = "Country label")
    String getCountry();

    /**
     * Share percentage
     *
     * @return share
     */
    @ApiModelProperty(example = "15.0", value = "Share percentage")
    BigDecimal getShare();

    /**
     * Member score
     *
     * @return score
     */
    @ApiModelProperty(example = "12", value = "Member score")
    Integer getScore();

    /**
     * Member type
     *
     * @return type
     */
    @ApiModelProperty(example = "person", value = "Member type")
    String getType();

    /**
     * Member name
     *
     * @return name
     */
    @ApiModelProperty(example = "BAZIN", value = "Member name")
    String getName();

    /**
     * Member firstname
     *
     * @return firstname
     */
    @ApiModelProperty(example = "Sébastien", value = "Member firstname")
    String getFirstname();

    /**
     * Member maidenname
     *
     * @return maidenName
     */
    @ApiModelProperty(example = "BAZIN", value = "Member maidenname")
    String getMaidenName();

    /**
     * Member title
     *
     * @return title
     */
    @ApiModelProperty(example = "M / Mme", value = "Member title")
    String getTitle();

    /**
     * Oldest information date
     *
     * @return minDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Oldest information date")
    String getMinDate();

    /**
     * Most recent information date
     *
     * @return maxDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Most recent information date")
    String getMaxDate();
}
