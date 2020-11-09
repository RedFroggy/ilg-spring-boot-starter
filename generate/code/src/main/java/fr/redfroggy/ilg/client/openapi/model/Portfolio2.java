package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.PortfolioItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolio2
 */

public class Portfolio2   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("alertType")
  private Integer alertType;

  @JsonProperty("item")
  @Valid
  private List<PortfolioItem> item = null;

  @JsonProperty("editable")
  private Boolean editable;

  public Portfolio2 id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Portfolio's Id
   * @return id
  */
  @ApiModelProperty(example = "2", value = "Portfolio's Id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Portfolio2 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Name of the portfolio
   * @return label
  */
  @ApiModelProperty(example = "Créalerte Rhône", value = "Name of the portfolio")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Portfolio2 alertType(Integer alertType) {
    this.alertType = alertType;
    return this;
  }

  /**
   * Type of alert (jurialerte, scorealerte…
   * @return alertType
  */
  @ApiModelProperty(example = "2", value = "Type of alert (jurialerte, scorealerte…")


  public Integer getAlertType() {
    return alertType;
  }

  public void setAlertType(Integer alertType) {
    this.alertType = alertType;
  }

  public Portfolio2 item(List<PortfolioItem> item) {
    this.item = item;
    return this;
  }

  public Portfolio2 addItemItem(PortfolioItem itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<>();
    }
    this.item.add(itemItem);
    return this;
  }

  /**
   * List of monitored item
   * @return item
  */
  @ApiModelProperty(value = "List of monitored item")

  @Valid

  public List<PortfolioItem> getItem() {
    return item;
  }

  public void setItem(List<PortfolioItem> item) {
    this.item = item;
  }

  public Portfolio2 editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * this portfolio is editable
   * @return editable
  */
  @ApiModelProperty(example = "false", value = "this portfolio is editable")


  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolio2 portfolio2 = (Portfolio2) o;
    return Objects.equals(this.id, portfolio2.id) &&
        Objects.equals(this.label, portfolio2.label) &&
        Objects.equals(this.alertType, portfolio2.alertType) &&
        Objects.equals(this.item, portfolio2.item) &&
        Objects.equals(this.editable, portfolio2.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, alertType, item, editable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

