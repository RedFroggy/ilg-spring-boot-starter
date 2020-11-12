package fr.redfroggy.ilg.client.company;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.redfroggy.ilg.client.model.ExecutiveTerms;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

@JsonDeserialize(as=ExecutiveTerms.class)
public interface ExecutiveTermsProjection {
    /**
     * List of term of office
     * @return mandats
    */
    @ApiModelProperty(value = "List of term of office")
    @Valid
    List<? extends MandatProjection3> getMandats();
}
