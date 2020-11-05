package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Customer2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolio3
 */

public class Portfolio3   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("title")
  private String title;

  @JsonProperty("alertType")
  private Integer alertType;

  @JsonProperty("matchable")
  private Boolean matchable;

  @JsonProperty("referenceContrat")
  private String referenceContrat;

  @JsonProperty("updateDate")
  private LocalDate updateDate;

  @JsonProperty("customer")
  @Valid
  private List<Customer2> customer = null;

  @JsonProperty("countSubscriptions")
  private Integer countSubscriptions;

  @JsonProperty("countItems")
  private Integer countItems;

  @JsonProperty("editable")
  private Boolean editable;

  public Portfolio3 id(Integer id) {
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

  public Portfolio3 label(String label) {
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

  public Portfolio3 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Display name of the portfolio
   * @return title
  */
  @ApiModelProperty(example = "Surveillance en ligne", value = "Display name of the portfolio")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Portfolio3 alertType(Integer alertType) {
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

  public Portfolio3 matchable(Boolean matchable) {
    this.matchable = matchable;
    return this;
  }

  /**
   * Is a machine expert portfolio
   * @return matchable
  */
  @ApiModelProperty(example = "false", value = "Is a machine expert portfolio")


  public Boolean getMatchable() {
    return matchable;
  }

  public void setMatchable(Boolean matchable) {
    this.matchable = matchable;
  }

  public Portfolio3 referenceContrat(String referenceContrat) {
    this.referenceContrat = referenceContrat;
    return this;
  }

  /**
   * Reference contrat
   * @return referenceContrat
  */
  @ApiModelProperty(example = "1", value = "Reference contrat")


  public String getReferenceContrat() {
    return referenceContrat;
  }

  public void setReferenceContrat(String referenceContrat) {
    this.referenceContrat = referenceContrat;
  }

  public Portfolio3 updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Update date of the portfolio
   * @return updateDate
  */
  @ApiModelProperty(value = "Update date of the portfolio")

  @Valid

  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public Portfolio3 customer(List<Customer2> customer) {
    this.customer = customer;
    return this;
  }

  public Portfolio3 addCustomerItem(Customer2 customerItem) {
    if (this.customer == null) {
      this.customer = new ArrayList<>();
    }
    this.customer.add(customerItem);
    return this;
  }

  /**
   * customer information
   * @return customer
  */
  @ApiModelProperty(value = "customer information")

  @Valid

  public List<Customer2> getCustomer() {
    return customer;
  }

  public void setCustomer(List<Customer2> customer) {
    this.customer = customer;
  }

  public Portfolio3 countSubscriptions(Integer countSubscriptions) {
    this.countSubscriptions = countSubscriptions;
    return this;
  }

  /**
   * number of subscriptions
   * @return countSubscriptions
  */
  @ApiModelProperty(example = "1", value = "number of subscriptions")


  public Integer getCountSubscriptions() {
    return countSubscriptions;
  }

  public void setCountSubscriptions(Integer countSubscriptions) {
    this.countSubscriptions = countSubscriptions;
  }

  public Portfolio3 countItems(Integer countItems) {
    this.countItems = countItems;
    return this;
  }

  /**
   * number of items
   * @return countItems
  */
  @ApiModelProperty(example = "1", value = "number of items")


  public Integer getCountItems() {
    return countItems;
  }

  public void setCountItems(Integer countItems) {
    this.countItems = countItems;
  }

  public Portfolio3 editable(Boolean editable) {
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
    Portfolio3 portfolio3 = (Portfolio3) o;
    return Objects.equals(this.id, portfolio3.id) &&
        Objects.equals(this.label, portfolio3.label) &&
        Objects.equals(this.title, portfolio3.title) &&
        Objects.equals(this.alertType, portfolio3.alertType) &&
        Objects.equals(this.matchable, portfolio3.matchable) &&
        Objects.equals(this.referenceContrat, portfolio3.referenceContrat) &&
        Objects.equals(this.updateDate, portfolio3.updateDate) &&
        Objects.equals(this.customer, portfolio3.customer) &&
        Objects.equals(this.countSubscriptions, portfolio3.countSubscriptions) &&
        Objects.equals(this.countItems, portfolio3.countItems) &&
        Objects.equals(this.editable, portfolio3.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, title, alertType, matchable, referenceContrat, updateDate, customer, countSubscriptions, countItems, editable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio3 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    matchable: ").append(toIndentedString(matchable)).append("\n");
    sb.append("    referenceContrat: ").append(toIndentedString(referenceContrat)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    countSubscriptions: ").append(toIndentedString(countSubscriptions)).append("\n");
    sb.append("    countItems: ").append(toIndentedString(countItems)).append("\n");
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

