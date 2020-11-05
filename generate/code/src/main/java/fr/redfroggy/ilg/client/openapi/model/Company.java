package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Event3;
import fr.redfroggy.ilg.client.openapi.model.Executive;
import fr.redfroggy.ilg.client.openapi.model.Financial;
import fr.redfroggy.ilg.client.openapi.model.GroupInfo;
import fr.redfroggy.ilg.client.openapi.model.GroupMember4;
import fr.redfroggy.ilg.client.openapi.model.Identity;
import fr.redfroggy.ilg.client.openapi.model.Kyc;
import fr.redfroggy.ilg.client.openapi.model.Links2;
import fr.redfroggy.ilg.client.openapi.model.Risk;
import fr.redfroggy.ilg.client.openapi.model.Score;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */

public class Company   {
  @JsonProperty("identity")
  private Identity identity;

  @JsonProperty("sites")
  private Object sites;

  @JsonProperty("risk")
  private Risk risk;

  @JsonProperty("score")
  private Score score;

  @JsonProperty("financial")
  private Financial financial;

  @JsonProperty("links")
  private Links2 links;

  @JsonProperty("groupStructure")
  private GroupMember4 groupStructure;

  @JsonProperty("groupInfo")
  private GroupInfo groupInfo;

  @JsonProperty("mandataire")
  private Executive mandataire;

  @JsonProperty("lastAds")
  @Valid
  private List<Event3> lastAds = null;

  @JsonProperty("events")
  private Object events;

  @JsonProperty("executives")
  private Object executives;

  @JsonProperty("mandats")
  private Object mandats;

  @JsonProperty("legal")
  private Object legal;

  @JsonProperty("kyc")
  private Kyc kyc;

  public Company identity(Identity identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identity getIdentity() {
    return identity;
  }

  public void setIdentity(Identity identity) {
    this.identity = identity;
  }

  public Company sites(Object sites) {
    this.sites = sites;
    return this;
  }

  /**
   * Get sites
   * @return sites
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSites() {
    return sites;
  }

  public void setSites(Object sites) {
    this.sites = sites;
  }

  public Company risk(Risk risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  */
  @ApiModelProperty(value = "")

  @Valid

  public Risk getRisk() {
    return risk;
  }

  public void setRisk(Risk risk) {
    this.risk = risk;
  }

  public Company score(Score score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @ApiModelProperty(value = "")

  @Valid

  public Score getScore() {
    return score;
  }

  public void setScore(Score score) {
    this.score = score;
  }

  public Company financial(Financial financial) {
    this.financial = financial;
    return this;
  }

  /**
   * Get financial
   * @return financial
  */
  @ApiModelProperty(value = "")

  @Valid

  public Financial getFinancial() {
    return financial;
  }

  public void setFinancial(Financial financial) {
    this.financial = financial;
  }

  public Company links(Links2 links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public Links2 getLinks() {
    return links;
  }

  public void setLinks(Links2 links) {
    this.links = links;
  }

  public Company groupStructure(GroupMember4 groupStructure) {
    this.groupStructure = groupStructure;
    return this;
  }

  /**
   * Get groupStructure
   * @return groupStructure
  */
  @ApiModelProperty(value = "")

  @Valid

  public GroupMember4 getGroupStructure() {
    return groupStructure;
  }

  public void setGroupStructure(GroupMember4 groupStructure) {
    this.groupStructure = groupStructure;
  }

  public Company groupInfo(GroupInfo groupInfo) {
    this.groupInfo = groupInfo;
    return this;
  }

  /**
   * Get groupInfo
   * @return groupInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GroupInfo getGroupInfo() {
    return groupInfo;
  }

  public void setGroupInfo(GroupInfo groupInfo) {
    this.groupInfo = groupInfo;
  }

  public Company mandataire(Executive mandataire) {
    this.mandataire = mandataire;
    return this;
  }

  /**
   * Get mandataire
   * @return mandataire
  */
  @ApiModelProperty(value = "")

  @Valid

  public Executive getMandataire() {
    return mandataire;
  }

  public void setMandataire(Executive mandataire) {
    this.mandataire = mandataire;
  }

  public Company lastAds(List<Event3> lastAds) {
    this.lastAds = lastAds;
    return this;
  }

  public Company addLastAdsItem(Event3 lastAdsItem) {
    if (this.lastAds == null) {
      this.lastAds = new ArrayList<>();
    }
    this.lastAds.add(lastAdsItem);
    return this;
  }

  /**
   * 
   * @return lastAds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Event3> getLastAds() {
    return lastAds;
  }

  public void setLastAds(List<Event3> lastAds) {
    this.lastAds = lastAds;
  }

  public Company events(Object events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEvents() {
    return events;
  }

  public void setEvents(Object events) {
    this.events = events;
  }

  public Company executives(Object executives) {
    this.executives = executives;
    return this;
  }

  /**
   * Get executives
   * @return executives
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getExecutives() {
    return executives;
  }

  public void setExecutives(Object executives) {
    this.executives = executives;
  }

  public Company mandats(Object mandats) {
    this.mandats = mandats;
    return this;
  }

  /**
   * Get mandats
   * @return mandats
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMandats() {
    return mandats;
  }

  public void setMandats(Object mandats) {
    this.mandats = mandats;
  }

  public Company legal(Object legal) {
    this.legal = legal;
    return this;
  }

  /**
   * Get legal
   * @return legal
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLegal() {
    return legal;
  }

  public void setLegal(Object legal) {
    this.legal = legal;
  }

  public Company kyc(Kyc kyc) {
    this.kyc = kyc;
    return this;
  }

  /**
   * Get kyc
   * @return kyc
  */
  @ApiModelProperty(value = "")

  @Valid

  public Kyc getKyc() {
    return kyc;
  }

  public void setKyc(Kyc kyc) {
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
    Company company = (Company) o;
    return Objects.equals(this.identity, company.identity) &&
        Objects.equals(this.sites, company.sites) &&
        Objects.equals(this.risk, company.risk) &&
        Objects.equals(this.score, company.score) &&
        Objects.equals(this.financial, company.financial) &&
        Objects.equals(this.links, company.links) &&
        Objects.equals(this.groupStructure, company.groupStructure) &&
        Objects.equals(this.groupInfo, company.groupInfo) &&
        Objects.equals(this.mandataire, company.mandataire) &&
        Objects.equals(this.lastAds, company.lastAds) &&
        Objects.equals(this.events, company.events) &&
        Objects.equals(this.executives, company.executives) &&
        Objects.equals(this.mandats, company.mandats) &&
        Objects.equals(this.legal, company.legal) &&
        Objects.equals(this.kyc, company.kyc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, sites, risk, score, financial, links, groupStructure, groupInfo, mandataire, lastAds, events, executives, mandats, legal, kyc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
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

