package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.model.Regrouping;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

public interface MandatProjection3 {
    /**
     * Company Identifier (Only available in France)
     * @return siren
    */
    @ApiModelProperty(example = "0123456789", value = "Company Identifier (Only available in France)")
    String getSiren();

    /**
     * Company name
     * @return raisonSociale
    */
    @ApiModelProperty(example = "Great Company", value = "Company name")
    String getRaisonSociale();

    /**
     * Get adresse
     * @return adresse
    */
    @ApiModelProperty(value = "")
    @Valid
    AddressProjection11 getAdresse();

    /**
     * List of term of offices
     * @return regroupings
    */
    @ApiModelProperty(value = "List of term of offices")
    @Valid
    List<Regrouping> getRegroupings();

    /**
     * Score of the company
     * @return score
    */
    @ApiModelProperty(value = "Score of the company")
    Integer getScore();

    /**
     * Score risk of the company
     * @return riskLabel
    */
    @ApiModelProperty(value = "Score risk of the company")
    String getRiskLabel();
}
