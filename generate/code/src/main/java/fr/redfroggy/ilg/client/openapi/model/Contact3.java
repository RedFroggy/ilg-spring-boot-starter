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
 * Contact3
 */

public class Contact3   {
  @JsonProperty("phone")
  private String phone;

  @JsonProperty("fax")
  private String fax;

  @JsonProperty("email")
  private String email;

  @JsonProperty("webSite")
  private String webSite;

  public Contact3 phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number
   * @return phone
  */
  @ApiModelProperty(example = "+33123456789", value = "Phone number")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Contact3 fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Fax number
   * @return fax
  */
  @ApiModelProperty(example = "+33123456789", value = "Fax number")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Contact3 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
  */
  @ApiModelProperty(example = "email@example.org", value = "Email")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact3 webSite(String webSite) {
    this.webSite = webSite;
    return this;
  }

  /**
   * Homepage
   * @return webSite
  */
  @ApiModelProperty(example = "http://greatcompany.com", value = "Homepage")


  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact3 contact3 = (Contact3) o;
    return Objects.equals(this.phone, contact3.phone) &&
        Objects.equals(this.fax, contact3.fax) &&
        Objects.equals(this.email, contact3.email) &&
        Objects.equals(this.webSite, contact3.webSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, fax, email, webSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact3 {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    webSite: ").append(toIndentedString(webSite)).append("\n");
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

