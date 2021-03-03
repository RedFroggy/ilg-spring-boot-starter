package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.ExecutiveTermsProjection;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

/**
 * ExecutiveTerms
 */
@JsonIgnoreProperties(value={"@Pagination"})
public class ExecutiveTerms implements ExecutiveTermsProjection {

  private final List<Mandat> mandats;

  public ExecutiveTerms(@JsonProperty("mandats") List<Mandat> mandats) {
    this.mandats = mandats;
  }

  /**
   * List of term of office
   * @return mandats
  */
  @ApiModelProperty(value = "List of term of office")
  @Valid
  public List<Mandat> getMandats() {
    return mandats;
  }
}

