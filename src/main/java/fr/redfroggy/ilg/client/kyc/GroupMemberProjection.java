package fr.redfroggy.ilg.client.kyc;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;

public interface GroupMemberProjection {
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
     * Share percentage
     * @return share
    */
    @ApiModelProperty(example = "15.0", value = "Share percentage")
    @Valid
    BigDecimal getShare();

    /**
     * Member type
     * @return type
    */
    @ApiModelProperty(example = "person", value = "Member type")
    String getType();

    /**
     * Method used in UBO seek
     * @return methodUsed
    */
    @ApiModelProperty(example = "legal representative", value = "Method used in UBO seek")
    String getMethodUsed();

    /**
     * qualité de l'ubo
     * @return qualite
    */
    @ApiModelProperty(example = "Représentant Légal / Actionnaire", value = "qualité de l'ubo")
    String getQualite();

    /**
     * Distance between company and UBO
     * @return distance
    */
    @ApiModelProperty(example = "0", value = "Distance between company and UBO")
    Integer getDistance();

    /**
     * Get address
     * @return address
    */
    @ApiModelProperty(value = "")
    AddressProjection6 getAddress();

    /**
     * Get fonction
     * @return fonction
    */
    @ApiModelProperty(value = "")
    ExecutiveFonctionProjection4 getFonction();

    /**
     * UBO birthday if available
     * @return birthday
    */
    @ApiModelProperty(value = "UBO birthday if available")
    @Valid
    LocalDate getBirthday();

    /**
     * UBO birth city if available
     * @return birthCity
    */
    @ApiModelProperty(example = "PARIS", value = "UBO birth city if available")
    String getBirthCity();

    /**
     * UBO birth country if available
     * @return birthCountry
    */
    @ApiModelProperty(example = "France", value = "UBO birth country if available")
    String getBirthCountry();

    /**
     * UBO birth country code (ISO 3166-2) if available
     * @return birthCountryCode
    */
    @ApiModelProperty(example = "FR", value = "UBO birth country code (ISO 3166-2) if available")
    String getBirthCountryCode();

    /**
     * Executive nationality
     * @return nationality
    */
    @ApiModelProperty(example = "France", value = "Executive nationality")
    String getNationality();

    /**
     * Executive country code (ISO 3166-2)
     * @return nationalityCode
    */
    @ApiModelProperty(example = "FR", value = "Executive country code (ISO 3166-2)")
    String getNationalityCode();

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
