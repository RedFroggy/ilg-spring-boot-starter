package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Block2
 */

public class Block2   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("nbActiveTerms")
  private Integer nbActiveTerms;

  @JsonProperty("nbInactiveTerms")
  private Integer nbInactiveTerms;

  @JsonProperty("nbActiveRegroupings")
  private Integer nbActiveRegroupings;

  @JsonProperty("nbInactiveRegroupings")
  private Integer nbInactiveRegroupings;

  public Block2 id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of block
   * @return id
  */
  @ApiModelProperty(value = "Identifier of block")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Block2 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label of block
   * @return label
  */
  @ApiModelProperty(value = "Label of block")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Block2 nbActiveTerms(Integer nbActiveTerms) {
    this.nbActiveTerms = nbActiveTerms;
    return this;
  }

  /**
   * number of active term in the block
   * @return nbActiveTerms
  */
  @ApiModelProperty(value = "number of active term in the block")


  public Integer getNbActiveTerms() {
    return nbActiveTerms;
  }

  public void setNbActiveTerms(Integer nbActiveTerms) {
    this.nbActiveTerms = nbActiveTerms;
  }

  public Block2 nbInactiveTerms(Integer nbInactiveTerms) {
    this.nbInactiveTerms = nbInactiveTerms;
    return this;
  }

  /**
   * number of inactive term in the block
   * @return nbInactiveTerms
  */
  @ApiModelProperty(value = "number of inactive term in the block")


  public Integer getNbInactiveTerms() {
    return nbInactiveTerms;
  }

  public void setNbInactiveTerms(Integer nbInactiveTerms) {
    this.nbInactiveTerms = nbInactiveTerms;
  }

  public Block2 nbActiveRegroupings(Integer nbActiveRegroupings) {
    this.nbActiveRegroupings = nbActiveRegroupings;
    return this;
  }

  /**
   * number of active regroupings in the block
   * @return nbActiveRegroupings
  */
  @ApiModelProperty(value = "number of active regroupings in the block")


  public Integer getNbActiveRegroupings() {
    return nbActiveRegroupings;
  }

  public void setNbActiveRegroupings(Integer nbActiveRegroupings) {
    this.nbActiveRegroupings = nbActiveRegroupings;
  }

  public Block2 nbInactiveRegroupings(Integer nbInactiveRegroupings) {
    this.nbInactiveRegroupings = nbInactiveRegroupings;
    return this;
  }

  /**
   * number of inactive regroupings in the block
   * @return nbInactiveRegroupings
  */
  @ApiModelProperty(value = "number of inactive regroupings in the block")


  public Integer getNbInactiveRegroupings() {
    return nbInactiveRegroupings;
  }

  public void setNbInactiveRegroupings(Integer nbInactiveRegroupings) {
    this.nbInactiveRegroupings = nbInactiveRegroupings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block2 block2 = (Block2) o;
    return Objects.equals(this.id, block2.id) &&
        Objects.equals(this.label, block2.label) &&
        Objects.equals(this.nbActiveTerms, block2.nbActiveTerms) &&
        Objects.equals(this.nbInactiveTerms, block2.nbInactiveTerms) &&
        Objects.equals(this.nbActiveRegroupings, block2.nbActiveRegroupings) &&
        Objects.equals(this.nbInactiveRegroupings, block2.nbInactiveRegroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, nbActiveTerms, nbInactiveTerms, nbActiveRegroupings, nbInactiveRegroupings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    nbActiveTerms: ").append(toIndentedString(nbActiveTerms)).append("\n");
    sb.append("    nbInactiveTerms: ").append(toIndentedString(nbInactiveTerms)).append("\n");
    sb.append("    nbActiveRegroupings: ").append(toIndentedString(nbActiveRegroupings)).append("\n");
    sb.append("    nbInactiveRegroupings: ").append(toIndentedString(nbInactiveRegroupings)).append("\n");
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

