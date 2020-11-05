package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair9;
import fr.redfroggy.ilg.client.openapi.model.LegalActDecision2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegalAct2
 */

public class LegalAct2   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("type")
  private CodeLabelPair9 type;

  @JsonProperty("pages")
  private Integer pages;

  @JsonProperty("decisions")
  @Valid
  private List<LegalActDecision2> decisions = null;

  @JsonProperty("downloadable")
  private Boolean downloadable;

  @JsonProperty("available")
  private Boolean available;

  public LegalAct2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LegalAct2 date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the act in deposit
   * @return date
  */
  @ApiModelProperty(value = "Date of the act in deposit")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LegalAct2 number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Number of the Act
   * @return number
  */
  @ApiModelProperty(example = "1", value = "Number of the Act")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public LegalAct2 type(CodeLabelPair9 type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodeLabelPair9 getType() {
    return type;
  }

  public void setType(CodeLabelPair9 type) {
    this.type = type;
  }

  public LegalAct2 pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Date of the act in deposit
   * @return pages
  */
  @ApiModelProperty(value = "Date of the act in deposit")


  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public LegalAct2 decisions(List<LegalActDecision2> decisions) {
    this.decisions = decisions;
    return this;
  }

  public LegalAct2 addDecisionsItem(LegalActDecision2 decisionsItem) {
    if (this.decisions == null) {
      this.decisions = new ArrayList<>();
    }
    this.decisions.add(decisionsItem);
    return this;
  }

  /**
   * Decisions
   * @return decisions
  */
  @ApiModelProperty(value = "Decisions")

  @Valid

  public List<LegalActDecision2> getDecisions() {
    return decisions;
  }

  public void setDecisions(List<LegalActDecision2> decisions) {
    this.decisions = decisions;
  }

  public LegalAct2 downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

  /**
   * Wether the document is downloadable or not
   * @return downloadable
  */
  @ApiModelProperty(value = "Wether the document is downloadable or not")


  public Boolean getDownloadable() {
    return downloadable;
  }

  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  public LegalAct2 available(Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * Wether the document is available or not
   * @return available
  */
  @ApiModelProperty(value = "Wether the document is available or not")


  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalAct2 legalAct2 = (LegalAct2) o;
    return Objects.equals(this.id, legalAct2.id) &&
        Objects.equals(this.date, legalAct2.date) &&
        Objects.equals(this.number, legalAct2.number) &&
        Objects.equals(this.type, legalAct2.type) &&
        Objects.equals(this.pages, legalAct2.pages) &&
        Objects.equals(this.decisions, legalAct2.decisions) &&
        Objects.equals(this.downloadable, legalAct2.downloadable) &&
        Objects.equals(this.available, legalAct2.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, number, type, pages, decisions, downloadable, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalAct2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

