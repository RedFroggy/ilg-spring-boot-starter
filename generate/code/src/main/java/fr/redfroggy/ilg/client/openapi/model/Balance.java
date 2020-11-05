package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.BalanceRawData2;
import fr.redfroggy.ilg.client.openapi.model.Notices;
import fr.redfroggy.ilg.client.openapi.model.Ratios;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balance
 */

public class Balance   {
  @JsonProperty("typeName")
  private String typeName;

  @JsonProperty("balanceId")
  private Integer balanceId;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("closingDate")
  private LocalDate closingDate;

  @JsonProperty("duration")
  private Integer duration;

  @JsonProperty("source")
  private Integer source;

  @JsonProperty("turnover")
  private String turnover;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("updateDate")
  private LocalDate updateDate;

  @JsonProperty("previousDuration")
  private Integer previousDuration;

  @JsonProperty("type")
  private String type;

  @JsonProperty("confidentiality")
  private String confidentiality;

  @JsonProperty("ratios")
  private Ratios ratios;

  @JsonProperty("notices")
  private Notices notices;

  @JsonProperty("raw")
  private BalanceRawData2 raw;

  @JsonProperty("sig")
  private Object sig;

  public Balance typeName(String typeName) {
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

  public Balance balanceId(Integer balanceId) {
    this.balanceId = balanceId;
    return this;
  }

  /**
   * Balance identifier
   * @return balanceId
  */
  @ApiModelProperty(example = "123", value = "Balance identifier")


  public Integer getBalanceId() {
    return balanceId;
  }

  public void setBalanceId(Integer balanceId) {
    this.balanceId = balanceId;
  }

  public Balance registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Company identifier
   * @return registrationId
  */
  @ApiModelProperty(example = "123456789", value = "Company identifier")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public Balance closingDate(LocalDate closingDate) {
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

  public Balance duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Balance duration
   * @return duration
  */
  @ApiModelProperty(example = "12", value = "Balance duration")


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Balance source(Integer source) {
    this.source = source;
    return this;
  }

  /**
   * Balance source
   * @return source
  */
  @ApiModelProperty(example = "7", value = "Balance source")


  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public Balance turnover(String turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Turn over
   * @return turnover
  */
  @ApiModelProperty(example = "110797", value = "Turn over")


  public String getTurnover() {
    return turnover;
  }

  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }

  public Balance creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Insertion date
   * @return creationDate
  */
  @ApiModelProperty(value = "Insertion date")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Balance updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Modification date
   * @return updateDate
  */
  @ApiModelProperty(value = "Modification date")

  @Valid

  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public Balance previousDuration(Integer previousDuration) {
    this.previousDuration = previousDuration;
    return this;
  }

  /**
   * Previous balance duration
   * @return previousDuration
  */
  @ApiModelProperty(example = "12", value = "Previous balance duration")


  public Integer getPreviousDuration() {
    return previousDuration;
  }

  public void setPreviousDuration(Integer previousDuration) {
    this.previousDuration = previousDuration;
  }

  public Balance type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Balance type among values simple, full, consolidated
   * @return type
  */
  @ApiModelProperty(example = "simple", value = "Balance type among values simple, full, consolidated")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Balance confidentiality(String confidentiality) {
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

  public Balance ratios(Ratios ratios) {
    this.ratios = ratios;
    return this;
  }

  /**
   * Get ratios
   * @return ratios
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ratios getRatios() {
    return ratios;
  }

  public void setRatios(Ratios ratios) {
    this.ratios = ratios;
  }

  public Balance notices(Notices notices) {
    this.notices = notices;
    return this;
  }

  /**
   * Get notices
   * @return notices
  */
  @ApiModelProperty(value = "")

  @Valid

  public Notices getNotices() {
    return notices;
  }

  public void setNotices(Notices notices) {
    this.notices = notices;
  }

  public Balance raw(BalanceRawData2 raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
  */
  @ApiModelProperty(value = "")

  @Valid

  public BalanceRawData2 getRaw() {
    return raw;
  }

  public void setRaw(BalanceRawData2 raw) {
    this.raw = raw;
  }

  public Balance sig(Object sig) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.typeName, balance.typeName) &&
        Objects.equals(this.balanceId, balance.balanceId) &&
        Objects.equals(this.registrationId, balance.registrationId) &&
        Objects.equals(this.closingDate, balance.closingDate) &&
        Objects.equals(this.duration, balance.duration) &&
        Objects.equals(this.source, balance.source) &&
        Objects.equals(this.turnover, balance.turnover) &&
        Objects.equals(this.creationDate, balance.creationDate) &&
        Objects.equals(this.updateDate, balance.updateDate) &&
        Objects.equals(this.previousDuration, balance.previousDuration) &&
        Objects.equals(this.type, balance.type) &&
        Objects.equals(this.confidentiality, balance.confidentiality) &&
        Objects.equals(this.ratios, balance.ratios) &&
        Objects.equals(this.notices, balance.notices) &&
        Objects.equals(this.raw, balance.raw) &&
        Objects.equals(this.sig, balance.sig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, balanceId, registrationId, closingDate, duration, source, turnover, creationDate, updateDate, previousDuration, type, confidentiality, ratios, notices, raw, sig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    balanceId: ").append(toIndentedString(balanceId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    previousDuration: ").append(toIndentedString(previousDuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    notices: ").append(toIndentedString(notices)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    sig: ").append(toIndentedString(sig)).append("\n");
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

