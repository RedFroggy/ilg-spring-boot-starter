package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.LegalAct2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegalDeposit2
 */

public class LegalDeposit2   {
  @JsonProperty("number")
  private Integer number;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("acts")
  @Valid
  private List<LegalAct2> acts = null;

  @JsonProperty("availability")
  private Boolean availability;

  public LegalDeposit2 number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Deposit number
   * @return number
  */
  @ApiModelProperty(example = "456", value = "Deposit number")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public LegalDeposit2 date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * where the deposit happened
   * @return date
  */
  @ApiModelProperty(value = "where the deposit happened")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LegalDeposit2 acts(List<LegalAct2> acts) {
    this.acts = acts;
    return this;
  }

  public LegalDeposit2 addActsItem(LegalAct2 actsItem) {
    if (this.acts == null) {
      this.acts = new ArrayList<>();
    }
    this.acts.add(actsItem);
    return this;
  }

  /**
   * list of act composing the deposit
   * @return acts
  */
  @ApiModelProperty(value = "list of act composing the deposit")

  @Valid

  public List<LegalAct2> getActs() {
    return acts;
  }

  public void setActs(List<LegalAct2> acts) {
    this.acts = acts;
  }

  public LegalDeposit2 availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Available or not
   * @return availability
  */
  @ApiModelProperty(example = "true", value = "Available or not")


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
    LegalDeposit2 legalDeposit2 = (LegalDeposit2) o;
    return Objects.equals(this.number, legalDeposit2.number) &&
        Objects.equals(this.date, legalDeposit2.date) &&
        Objects.equals(this.acts, legalDeposit2.acts) &&
        Objects.equals(this.availability, legalDeposit2.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, acts, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalDeposit2 {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    acts: ").append(toIndentedString(acts)).append("\n");
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

