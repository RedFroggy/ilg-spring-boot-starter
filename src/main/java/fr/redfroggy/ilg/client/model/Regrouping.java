package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

/**
 * ExecutiveTerms
 */

public class Regrouping {

  private final Integer regroupingId;

  private final List<Term> terms;

  public Regrouping(@JsonProperty("regroupingId") Integer regroupingId,
                    @JsonProperty("terms") List<Term> terms) {
    this.regroupingId = regroupingId;
    this.terms = terms;
  }

  public Integer getRegroupingId() {
    return regroupingId;
  }

  /**
   * List of term of office
   * @return mandats
  */
  @ApiModelProperty(value = "List of term of office")
  @Valid
  public List<Term> getTerms() {
    return terms;
  }
}

