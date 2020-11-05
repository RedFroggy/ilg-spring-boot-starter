package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Term4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Regrouping
 */

public class Regrouping   {
  @JsonProperty("regroupingId")
  private Integer regroupingId;

  @JsonProperty("terms")
  @Valid
  private List<Term4> terms = null;

  public Regrouping regroupingId(Integer regroupingId) {
    this.regroupingId = regroupingId;
    return this;
  }

  /**
   * regrouping identifier
   * @return regroupingId
  */
  @ApiModelProperty(example = "4", value = "regrouping identifier")


  public Integer getRegroupingId() {
    return regroupingId;
  }

  public void setRegroupingId(Integer regroupingId) {
    this.regroupingId = regroupingId;
  }

  public Regrouping terms(List<Term4> terms) {
    this.terms = terms;
    return this;
  }

  public Regrouping addTermsItem(Term4 termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

  /**
   * List of terms
   * @return terms
  */
  @ApiModelProperty(value = "List of terms")

  @Valid

  public List<Term4> getTerms() {
    return terms;
  }

  public void setTerms(List<Term4> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Regrouping regrouping = (Regrouping) o;
    return Objects.equals(this.regroupingId, regrouping.regroupingId) &&
        Objects.equals(this.terms, regrouping.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regroupingId, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Regrouping {\n");
    
    sb.append("    regroupingId: ").append(toIndentedString(regroupingId)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

