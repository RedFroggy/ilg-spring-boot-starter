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
 * Availability
 */

public class Availability   {
  @JsonProperty("identity")
  private Boolean identity;

  @JsonProperty("sites")
  private Boolean sites;

  @JsonProperty("risk")
  private Boolean risk;

  @JsonProperty("score")
  private Boolean score;

  @JsonProperty("financial")
  private Boolean financial;

  @JsonProperty("links")
  private Boolean links;

  @JsonProperty("groupStructure")
  private Boolean groupStructure;

  @JsonProperty("groupInfo")
  private Boolean groupInfo;

  @JsonProperty("mandataire")
  private Boolean mandataire;

  @JsonProperty("lastAds")
  private Boolean lastAds;

  @JsonProperty("events")
  private Boolean events;

  @JsonProperty("executives")
  private Boolean executives;

  @JsonProperty("mandats")
  private Boolean mandats;

  @JsonProperty("legal")
  private Boolean legal;

  @JsonProperty("kyc")
  private Boolean kyc;

  public Availability identity(Boolean identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Identity availability
   * @return identity
  */
  @ApiModelProperty(value = "Identity availability")


  public Boolean getIdentity() {
    return identity;
  }

  public void setIdentity(Boolean identity) {
    this.identity = identity;
  }

  public Availability sites(Boolean sites) {
    this.sites = sites;
    return this;
  }

  /**
   * Sites availability
   * @return sites
  */
  @ApiModelProperty(value = "Sites availability")


  public Boolean getSites() {
    return sites;
  }

  public void setSites(Boolean sites) {
    this.sites = sites;
  }

  public Availability risk(Boolean risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Risk availability
   * @return risk
  */
  @ApiModelProperty(value = "Risk availability")


  public Boolean getRisk() {
    return risk;
  }

  public void setRisk(Boolean risk) {
    this.risk = risk;
  }

  public Availability score(Boolean score) {
    this.score = score;
    return this;
  }

  /**
   * Score availability
   * @return score
  */
  @ApiModelProperty(value = "Score availability")


  public Boolean getScore() {
    return score;
  }

  public void setScore(Boolean score) {
    this.score = score;
  }

  public Availability financial(Boolean financial) {
    this.financial = financial;
    return this;
  }

  /**
   * Financial availability
   * @return financial
  */
  @ApiModelProperty(value = "Financial availability")


  public Boolean getFinancial() {
    return financial;
  }

  public void setFinancial(Boolean financial) {
    this.financial = financial;
  }

  public Availability links(Boolean links) {
    this.links = links;
    return this;
  }

  /**
   * Links availability
   * @return links
  */
  @ApiModelProperty(value = "Links availability")


  public Boolean getLinks() {
    return links;
  }

  public void setLinks(Boolean links) {
    this.links = links;
  }

  public Availability groupStructure(Boolean groupStructure) {
    this.groupStructure = groupStructure;
    return this;
  }

  /**
   * Group structure availability
   * @return groupStructure
  */
  @ApiModelProperty(value = "Group structure availability")


  public Boolean getGroupStructure() {
    return groupStructure;
  }

  public void setGroupStructure(Boolean groupStructure) {
    this.groupStructure = groupStructure;
  }

  public Availability groupInfo(Boolean groupInfo) {
    this.groupInfo = groupInfo;
    return this;
  }

  /**
   * Group infos availability
   * @return groupInfo
  */
  @ApiModelProperty(value = "Group infos availability")


  public Boolean getGroupInfo() {
    return groupInfo;
  }

  public void setGroupInfo(Boolean groupInfo) {
    this.groupInfo = groupInfo;
  }

  public Availability mandataire(Boolean mandataire) {
    this.mandataire = mandataire;
    return this;
  }

  /**
   * Mandataire availability
   * @return mandataire
  */
  @ApiModelProperty(value = "Mandataire availability")


  public Boolean getMandataire() {
    return mandataire;
  }

  public void setMandataire(Boolean mandataire) {
    this.mandataire = mandataire;
  }

  public Availability lastAds(Boolean lastAds) {
    this.lastAds = lastAds;
    return this;
  }

  /**
   * Last ads availability
   * @return lastAds
  */
  @ApiModelProperty(value = "Last ads availability")


  public Boolean getLastAds() {
    return lastAds;
  }

  public void setLastAds(Boolean lastAds) {
    this.lastAds = lastAds;
  }

  public Availability events(Boolean events) {
    this.events = events;
    return this;
  }

  /**
   * Events availability
   * @return events
  */
  @ApiModelProperty(value = "Events availability")


  public Boolean getEvents() {
    return events;
  }

  public void setEvents(Boolean events) {
    this.events = events;
  }

  public Availability executives(Boolean executives) {
    this.executives = executives;
    return this;
  }

  /**
   * Executives availability
   * @return executives
  */
  @ApiModelProperty(value = "Executives availability")


  public Boolean getExecutives() {
    return executives;
  }

  public void setExecutives(Boolean executives) {
    this.executives = executives;
  }

  public Availability mandats(Boolean mandats) {
    this.mandats = mandats;
    return this;
  }

  /**
   * Mandats availability
   * @return mandats
  */
  @ApiModelProperty(value = "Mandats availability")


  public Boolean getMandats() {
    return mandats;
  }

  public void setMandats(Boolean mandats) {
    this.mandats = mandats;
  }

  public Availability legal(Boolean legal) {
    this.legal = legal;
    return this;
  }

  /**
   * Legal availability
   * @return legal
  */
  @ApiModelProperty(value = "Legal availability")


  public Boolean getLegal() {
    return legal;
  }

  public void setLegal(Boolean legal) {
    this.legal = legal;
  }

  public Availability kyc(Boolean kyc) {
    this.kyc = kyc;
    return this;
  }

  /**
   * Kyc availability
   * @return kyc
  */
  @ApiModelProperty(value = "Kyc availability")


  public Boolean getKyc() {
    return kyc;
  }

  public void setKyc(Boolean kyc) {
    this.kyc = kyc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Availability availability = (Availability) o;
    return Objects.equals(this.identity, availability.identity) &&
        Objects.equals(this.sites, availability.sites) &&
        Objects.equals(this.risk, availability.risk) &&
        Objects.equals(this.score, availability.score) &&
        Objects.equals(this.financial, availability.financial) &&
        Objects.equals(this.links, availability.links) &&
        Objects.equals(this.groupStructure, availability.groupStructure) &&
        Objects.equals(this.groupInfo, availability.groupInfo) &&
        Objects.equals(this.mandataire, availability.mandataire) &&
        Objects.equals(this.lastAds, availability.lastAds) &&
        Objects.equals(this.events, availability.events) &&
        Objects.equals(this.executives, availability.executives) &&
        Objects.equals(this.mandats, availability.mandats) &&
        Objects.equals(this.legal, availability.legal) &&
        Objects.equals(this.kyc, availability.kyc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, sites, risk, score, financial, links, groupStructure, groupInfo, mandataire, lastAds, events, executives, mandats, legal, kyc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Availability {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    financial: ").append(toIndentedString(financial)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    groupStructure: ").append(toIndentedString(groupStructure)).append("\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
    sb.append("    mandataire: ").append(toIndentedString(mandataire)).append("\n");
    sb.append("    lastAds: ").append(toIndentedString(lastAds)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    executives: ").append(toIndentedString(executives)).append("\n");
    sb.append("    mandats: ").append(toIndentedString(mandats)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    kyc: ").append(toIndentedString(kyc)).append("\n");
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

