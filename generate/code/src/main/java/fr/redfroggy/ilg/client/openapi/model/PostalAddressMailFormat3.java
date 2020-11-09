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
 * PostalAddressMailFormat3
 */

public class PostalAddressMailFormat3   {
  @JsonProperty("addressL1")
  private String addressL1;

  @JsonProperty("addressL2")
  private String addressL2;

  @JsonProperty("addressL3")
  private String addressL3;

  @JsonProperty("addressL4")
  private String addressL4;

  @JsonProperty("addressL5")
  private String addressL5;

  @JsonProperty("addressL6")
  private String addressL6;

  @JsonProperty("addressL7")
  private String addressL7;

  public PostalAddressMailFormat3 addressL1(String addressL1) {
    this.addressL1 = addressL1;
    return this;
  }

  /**
   * Line 1 Mail formatted AFNOR NF Z 10-011 (Name)
   * @return addressL1
  */
  @ApiModelProperty(example = "ACCOR", value = "Line 1 Mail formatted AFNOR NF Z 10-011 (Name)")


  public String getAddressL1() {
    return addressL1;
  }

  public void setAddressL1(String addressL1) {
    this.addressL1 = addressL1;
  }

  public PostalAddressMailFormat3 addressL2(String addressL2) {
    this.addressL2 = addressL2;
    return this;
  }

  /**
   * Line 2 Mail formatted AFNOR NF Z 10-011 (Name complement)
   * @return addressL2
  */
  @ApiModelProperty(example = "CIB CACIB", value = "Line 2 Mail formatted AFNOR NF Z 10-011 (Name complement)")


  public String getAddressL2() {
    return addressL2;
  }

  public void setAddressL2(String addressL2) {
    this.addressL2 = addressL2;
  }

  public PostalAddressMailFormat3 addressL3(String addressL3) {
    this.addressL3 = addressL3;
    return this;
  }

  /**
   * Line 3 Mail formatted AFNOR NF Z 10-011 (Address Complement) 
   * @return addressL3
  */
  @ApiModelProperty(example = "TOUR SEQUANA", value = "Line 3 Mail formatted AFNOR NF Z 10-011 (Address Complement) ")


  public String getAddressL3() {
    return addressL3;
  }

  public void setAddressL3(String addressL3) {
    this.addressL3 = addressL3;
  }

  public PostalAddressMailFormat3 addressL4(String addressL4) {
    this.addressL4 = addressL4;
    return this;
  }

  /**
   * Line 4 Mail formatted AFNOR NF Z 10-011 (Address Number & Street)
   * @return addressL4
  */
  @ApiModelProperty(example = "82 RUE HENRY FARMAN", value = "Line 4 Mail formatted AFNOR NF Z 10-011 (Address Number & Street)")


  public String getAddressL4() {
    return addressL4;
  }

  public void setAddressL4(String addressL4) {
    this.addressL4 = addressL4;
  }

  public PostalAddressMailFormat3 addressL5(String addressL5) {
    this.addressL5 = addressL5;
    return this;
  }

  /**
   * Line 5 Mail formatted AFNOR NF Z 10-011 (Postal Box, district)
   * @return addressL5
  */
  @ApiModelProperty(example = "CS 70052", value = "Line 5 Mail formatted AFNOR NF Z 10-011 (Postal Box, district)")


  public String getAddressL5() {
    return addressL5;
  }

  public void setAddressL5(String addressL5) {
    this.addressL5 = addressL5;
  }

  public PostalAddressMailFormat3 addressL6(String addressL6) {
    this.addressL6 = addressL6;
    return this;
  }

  /**
   * Line 6 Mail formatted AFNOR NF Z 10-011 (Zip code & city)
   * @return addressL6
  */
  @ApiModelProperty(example = "75008 PARIS", value = "Line 6 Mail formatted AFNOR NF Z 10-011 (Zip code & city)")


  public String getAddressL6() {
    return addressL6;
  }

  public void setAddressL6(String addressL6) {
    this.addressL6 = addressL6;
  }

  public PostalAddressMailFormat3 addressL7(String addressL7) {
    this.addressL7 = addressL7;
    return this;
  }

  /**
   * Line 7 Mail formatted AFNOR NF Z 10-011 (Country)
   * @return addressL7
  */
  @ApiModelProperty(example = "France", value = "Line 7 Mail formatted AFNOR NF Z 10-011 (Country)")


  public String getAddressL7() {
    return addressL7;
  }

  public void setAddressL7(String addressL7) {
    this.addressL7 = addressL7;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddressMailFormat3 postalAddressMailFormat3 = (PostalAddressMailFormat3) o;
    return Objects.equals(this.addressL1, postalAddressMailFormat3.addressL1) &&
        Objects.equals(this.addressL2, postalAddressMailFormat3.addressL2) &&
        Objects.equals(this.addressL3, postalAddressMailFormat3.addressL3) &&
        Objects.equals(this.addressL4, postalAddressMailFormat3.addressL4) &&
        Objects.equals(this.addressL5, postalAddressMailFormat3.addressL5) &&
        Objects.equals(this.addressL6, postalAddressMailFormat3.addressL6) &&
        Objects.equals(this.addressL7, postalAddressMailFormat3.addressL7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressL1, addressL2, addressL3, addressL4, addressL5, addressL6, addressL7);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddressMailFormat3 {\n");
    
    sb.append("    addressL1: ").append(toIndentedString(addressL1)).append("\n");
    sb.append("    addressL2: ").append(toIndentedString(addressL2)).append("\n");
    sb.append("    addressL3: ").append(toIndentedString(addressL3)).append("\n");
    sb.append("    addressL4: ").append(toIndentedString(addressL4)).append("\n");
    sb.append("    addressL5: ").append(toIndentedString(addressL5)).append("\n");
    sb.append("    addressL6: ").append(toIndentedString(addressL6)).append("\n");
    sb.append("    addressL7: ").append(toIndentedString(addressL7)).append("\n");
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

