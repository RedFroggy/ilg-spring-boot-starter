package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Executive5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Block
 */

public class Block   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("orderId")
  private Integer orderId;

  @JsonProperty("nbActiveTerms")
  private Integer nbActiveTerms;

  @JsonProperty("nbInactiveTerms")
  private Integer nbInactiveTerms;

  @JsonProperty("nbActiveRegroupings")
  private Integer nbActiveRegroupings;

  @JsonProperty("nbInactiveRegroupings")
  private Integer nbInactiveRegroupings;

  @JsonProperty("dirigeants")
  @Valid
  private List<Executive5> dirigeants = null;

  public Block id(Integer id) {
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

  public Block label(String label) {
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

  public Block orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * priority
   * @return orderId
  */
  @ApiModelProperty(value = "priority")


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Block nbActiveTerms(Integer nbActiveTerms) {
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

  public Block nbInactiveTerms(Integer nbInactiveTerms) {
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

  public Block nbActiveRegroupings(Integer nbActiveRegroupings) {
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

  public Block nbInactiveRegroupings(Integer nbInactiveRegroupings) {
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

  public Block dirigeants(List<Executive5> dirigeants) {
    this.dirigeants = dirigeants;
    return this;
  }

  public Block addDirigeantsItem(Executive5 dirigeantsItem) {
    if (this.dirigeants == null) {
      this.dirigeants = new ArrayList<>();
    }
    this.dirigeants.add(dirigeantsItem);
    return this;
  }

  /**
   * List of executives
   * @return dirigeants
  */
  @ApiModelProperty(value = "List of executives")

  @Valid

  public List<Executive5> getDirigeants() {
    return dirigeants;
  }

  public void setDirigeants(List<Executive5> dirigeants) {
    this.dirigeants = dirigeants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.id, block.id) &&
        Objects.equals(this.label, block.label) &&
        Objects.equals(this.orderId, block.orderId) &&
        Objects.equals(this.nbActiveTerms, block.nbActiveTerms) &&
        Objects.equals(this.nbInactiveTerms, block.nbInactiveTerms) &&
        Objects.equals(this.nbActiveRegroupings, block.nbActiveRegroupings) &&
        Objects.equals(this.nbInactiveRegroupings, block.nbInactiveRegroupings) &&
        Objects.equals(this.dirigeants, block.dirigeants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, orderId, nbActiveTerms, nbInactiveTerms, nbActiveRegroupings, nbInactiveRegroupings, dirigeants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    nbActiveTerms: ").append(toIndentedString(nbActiveTerms)).append("\n");
    sb.append("    nbInactiveTerms: ").append(toIndentedString(nbInactiveTerms)).append("\n");
    sb.append("    nbActiveRegroupings: ").append(toIndentedString(nbActiveRegroupings)).append("\n");
    sb.append("    nbInactiveRegroupings: ").append(toIndentedString(nbInactiveRegroupings)).append("\n");
    sb.append("    dirigeants: ").append(toIndentedString(dirigeants)).append("\n");
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

