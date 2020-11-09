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
 * BalanceDocument
 */

public class BalanceDocument   {
  @JsonProperty("documentType")
  private String documentType;

  @JsonProperty("availability")
  private Boolean availability;

  public BalanceDocument documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Type of document, raw : Simple PDF print, rg : Original PDF, cc : Original pdf + statutory auditor's report
   * @return documentType
  */
  @ApiModelProperty(value = "Type of document, raw : Simple PDF print, rg : Original PDF, cc : Original pdf + statutory auditor's report")


  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public BalanceDocument availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Document is available
   * @return availability
  */
  @ApiModelProperty(value = "Document is available")


  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDocument balanceDocument = (BalanceDocument) o;
    return Objects.equals(this.documentType, balanceDocument.documentType) &&
        Objects.equals(this.availability, balanceDocument.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDocument {\n");
    
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

