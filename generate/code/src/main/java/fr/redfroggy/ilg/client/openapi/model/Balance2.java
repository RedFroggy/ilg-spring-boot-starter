package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.BalanceDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balance2
 */

public class Balance2   {
  @JsonProperty("typeName")
  private String typeName;

  @JsonProperty("closingDate")
  private LocalDate closingDate;

  @JsonProperty("confidentiality")
  private String confidentiality;

  @JsonProperty("ratios")
  private Object ratios;

  @JsonProperty("availability")
  private Boolean availability;

  @JsonProperty("raw")
  private Object raw;

  @JsonProperty("sig")
  private Object sig;

  @JsonProperty("documents")
  @Valid
  private List<BalanceDocument> documents = null;

  public Balance2 typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Identifier type for Balance
   * @return typeName
  */
  @ApiModelProperty(example = "social", value = "Identifier type for Balance")


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Balance2 closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Close balance date
   * @return closingDate
  */
  @ApiModelProperty(value = "Close balance date")

  @Valid

  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public Balance2 confidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

  /**
   * Balance confidentiality
   * @return confidentiality
  */
  @ApiModelProperty(example = "none", value = "Balance confidentiality")


  public String getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
  }

  public Balance2 ratios(Object ratios) {
    this.ratios = ratios;
    return this;
  }

  /**
   * Get ratios
   * @return ratios
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRatios() {
    return ratios;
  }

  public void setRatios(Object ratios) {
    this.ratios = ratios;
  }

  public Balance2 availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Availability
   * @return availability
  */
  @ApiModelProperty(example = "true", value = "Availability")


  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }

  public Balance2 raw(Object raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRaw() {
    return raw;
  }

  public void setRaw(Object raw) {
    this.raw = raw;
  }

  public Balance2 sig(Object sig) {
    this.sig = sig;
    return this;
  }

  /**
   * Get sig
   * @return sig
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSig() {
    return sig;
  }

  public void setSig(Object sig) {
    this.sig = sig;
  }

  public Balance2 documents(List<BalanceDocument> documents) {
    this.documents = documents;
    return this;
  }

  public Balance2 addDocumentsItem(BalanceDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * PDF document available for download (May be charged per call)
   * @return documents
  */
  @ApiModelProperty(value = "PDF document available for download (May be charged per call)")

  @Valid

  public List<BalanceDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<BalanceDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance2 balance2 = (Balance2) o;
    return Objects.equals(this.typeName, balance2.typeName) &&
        Objects.equals(this.closingDate, balance2.closingDate) &&
        Objects.equals(this.confidentiality, balance2.confidentiality) &&
        Objects.equals(this.ratios, balance2.ratios) &&
        Objects.equals(this.availability, balance2.availability) &&
        Objects.equals(this.raw, balance2.raw) &&
        Objects.equals(this.sig, balance2.sig) &&
        Objects.equals(this.documents, balance2.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, closingDate, confidentiality, ratios, availability, raw, sig, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance2 {\n");
    
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    sig: ").append(toIndentedString(sig)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

