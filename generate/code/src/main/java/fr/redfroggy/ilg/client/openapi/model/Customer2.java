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
 * Customer2
 */

public class Customer2   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("customerCode")
  private Integer customerCode;

  public Customer2 id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Customer's Id
   * @return id
  */
  @ApiModelProperty(example = "2", value = "Customer's Id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Customer2 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Name of the Customer
   * @return label
  */
  @ApiModelProperty(example = "INFOLEGALE", value = "Name of the Customer")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Customer2 customerCode(Integer customerCode) {
    this.customerCode = customerCode;
    return this;
  }

  /**
   * Customer code
   * @return customerCode
  */
  @ApiModelProperty(example = "1", value = "Customer code")


  public Integer getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(Integer customerCode) {
    this.customerCode = customerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer2 customer2 = (Customer2) o;
    return Objects.equals(this.id, customer2.id) &&
        Objects.equals(this.label, customer2.label) &&
        Objects.equals(this.customerCode, customer2.customerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, customerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
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

