package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Customer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolio
 */

public class Portfolio   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("title")
  private String title;

  @JsonProperty("alertType")
  private Integer alertType;

  @JsonProperty("extendable")
  private Boolean extendable;

  @JsonProperty("matchable")
  private Boolean matchable;

  @JsonProperty("type")
  private Integer type;

  @JsonProperty("updateDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate updateDate;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;

  @JsonProperty("isPerso")
  private Boolean isPerso;

  @JsonProperty("customer")
  @Valid
  private List<Customer> customer = null;

  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("deliverable")
  private Boolean deliverable;

  public Portfolio id(Integer id) {
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

  public Portfolio label(String label) {
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

  public Portfolio title(String title) {
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

  public Portfolio alertType(Integer alertType) {
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

  public Portfolio extendable(Boolean extendable) {
    this.extendable = extendable;
    return this;
  }

  /**
   * Extension of financial links
   * @return extendable
  */
  @ApiModelProperty(example = "false", value = "Extension of financial links")


  public Boolean getExtendable() {
    return extendable;
  }

  public void setExtendable(Boolean extendable) {
    this.extendable = extendable;
  }

  public Portfolio matchable(Boolean matchable) {
    this.matchable = matchable;
    return this;
  }

  /**
   * Is a machine expert portfolio
   * @return matchable
  */
  @ApiModelProperty(example = "true", value = "Is a machine expert portfolio")


  public Boolean getMatchable() {
    return matchable;
  }

  public void setMatchable(Boolean matchable) {
    this.matchable = matchable;
  }

  public Portfolio type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Portfolio type : complex, normal…
   * @return type
  */
  @ApiModelProperty(example = "1", value = "Portfolio type : complex, normal…")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Portfolio updateDate(LocalDate updateDate) {
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

  public Portfolio createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of the portfolio
   * @return createdAt
  */
  @ApiModelProperty(value = "Creation date of the portfolio")

  @Valid

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public Portfolio isPerso(Boolean isPerso) {
    this.isPerso = isPerso;
    return this;
  }

  /**
   * portfolio perso or not
   * @return isPerso
  */
  @ApiModelProperty(example = "true", value = "portfolio perso or not")


  public Boolean getIsPerso() {
    return isPerso;
  }

  public void setIsPerso(Boolean isPerso) {
    this.isPerso = isPerso;
  }

  public Portfolio customer(List<Customer> customer) {
    this.customer = customer;
    return this;
  }

  public Portfolio addCustomerItem(Customer customerItem) {
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

  public List<Customer> getCustomer() {
    return customer;
  }

  public void setCustomer(List<Customer> customer) {
    this.customer = customer;
  }

  public Portfolio editable(Boolean editable) {
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

  public Portfolio deliverable(Boolean deliverable) {
    this.deliverable = deliverable;
    return this;
  }

  /**
   * type of delivery (jurialerte or ftp)
   * @return deliverable
  */
  @ApiModelProperty(example = "false", value = "type of delivery (jurialerte or ftp)")


  public Boolean getDeliverable() {
    return deliverable;
  }

  public void setDeliverable(Boolean deliverable) {
    this.deliverable = deliverable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolio portfolio = (Portfolio) o;
    return Objects.equals(this.id, portfolio.id) &&
        Objects.equals(this.label, portfolio.label) &&
        Objects.equals(this.title, portfolio.title) &&
        Objects.equals(this.alertType, portfolio.alertType) &&
        Objects.equals(this.extendable, portfolio.extendable) &&
        Objects.equals(this.matchable, portfolio.matchable) &&
        Objects.equals(this.type, portfolio.type) &&
        Objects.equals(this.updateDate, portfolio.updateDate) &&
        Objects.equals(this.createdAt, portfolio.createdAt) &&
        Objects.equals(this.isPerso, portfolio.isPerso) &&
        Objects.equals(this.customer, portfolio.customer) &&
        Objects.equals(this.editable, portfolio.editable) &&
        Objects.equals(this.deliverable, portfolio.deliverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, title, alertType, extendable, matchable, type, updateDate, createdAt, isPerso, customer, editable, deliverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    extendable: ").append(toIndentedString(extendable)).append("\n");
    sb.append("    matchable: ").append(toIndentedString(matchable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isPerso: ").append(toIndentedString(isPerso)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    deliverable: ").append(toIndentedString(deliverable)).append("\n");
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

