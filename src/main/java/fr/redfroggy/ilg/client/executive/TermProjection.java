package fr.redfroggy.ilg.client.executive;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

public interface TermProjection {
    /**
     * identifier of term
     * @return id
    */
    @ApiModelProperty(example = "1", value = "identifier of term")
    String getId();

    /**
     * identifier of a company
     * @return siren
    */
    @ApiModelProperty(example = "503207896", value = "identifier of a company")
    Integer getSiren();

    /**
     * Get fonction
     * @return fonction
    */
    @ApiModelProperty(value = "")
    @Valid
    ExecutiveFonctionProjection6 getFonction();

    /**
     * Get startCode
     * @return startCode
    */
    @ApiModelProperty(value = "")
    @Valid
    ExecutiveMouvementProjection5 getStartCode();

    /**
     * Date opening the term
     * @return startDate
    */
    @ApiModelProperty(value = "Date opening the term")
    @Valid
    LocalDate getStartDate();

    /**
     * Get endCode
     * @return endCode
    */
    @ApiModelProperty(value = "")
    @Valid
    ExecutiveMouvementProjection5 getEndCode();

    /**
     * Date closing the term
     * @return endDate
    */
    @ApiModelProperty(value = "Date closing the term")
    @Valid
    LocalDate getEndDate();

    /**
     * Get lastMovementCode
     * @return lastMovementCode
    */
    @ApiModelProperty(value = "")
    @Valid
    ExecutiveMouvementProjection5 getLastMovementCode();

    /**
     * Last movement date during the term
     * @return lastMovementDate
    */
    @ApiModelProperty(value = "Last movement date during the term")
    @Valid
    LocalDate getLastMovementDate();

    /**
     * principal
     * @return principal
    */
    @ApiModelProperty(value = "principal")
    Integer getPrincipal();
}
