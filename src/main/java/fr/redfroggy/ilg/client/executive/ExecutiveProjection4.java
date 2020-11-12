package fr.redfroggy.ilg.client.executive;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.time.LocalDate;
import java.util.List;

public interface ExecutiveProjection4 {
    /**
     * Executive Identifier
     *
     * @return execId
     */
    @ApiModelProperty(example = "1", value = "Executive Identifier")
    Integer getExecId();

    /**
     * Executive title
     *
     * @return civilite
     */
    @ApiModelProperty(example = "M", value = "Executive title")
    String getCivilite();

    /**
     * Executive Lastname
     *
     * @return name
     */
    @ApiModelProperty(example = "Doe", value = "Executive Lastname")
    String getName();

    /**
     * Executive Firstname
     *
     * @return firstname
     */
    @ApiModelProperty(example = "Jane", value = "Executive Firstname")
    String getFirstname();

    /**
     * Executive maiden name if available
     *
     * @return maidenName
     */
    @ApiModelProperty(example = "Smith", value = "Executive maiden name if available")
    String getMaidenName();

    /**
     * Company Identifier if Executive is also a company, only available in France
     *
     * @return siren
     */
    @ApiModelProperty(example = "0123456789", value =
            "Company Identifier if Executive is also a company, only available in France")
    String getSiren();

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    @Valid
    AddressProjection5 getAddress();

    /**
     * Executive birthday, only available for a person
     *
     * @return birthday
     */
    @ApiModelProperty(value = "Executive birthday, only available for a person")
    @Valid
    LocalDate getBirthday();

    /**
     * Get birthPlace
     *
     * @return birthPlace
     */
    @ApiModelProperty(value = "")
    @Valid
    AddressProjection5 getBirthPlace();

    /**
     * Executive nationality code (ISO 3166-2)
     *
     * @return nationalityCode
     */
    @ApiModelProperty(example = "FR", value = "Executive nationality code (ISO 3166-2)")
    String getNationalityCode();

    /**
     * List of terms
     *
     * @return terms
     */
    @ApiModelProperty(value = "List of terms")
    @Valid
    List<? extends TermProjection> getTerms();
}
