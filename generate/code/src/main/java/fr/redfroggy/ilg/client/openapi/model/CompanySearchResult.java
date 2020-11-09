package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address14;
import fr.redfroggy.ilg.client.openapi.model.Executive6;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanySearchResult
 */

public class CompanySearchResult   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tradings")
  private String tradings;

  @JsonProperty("address")
  private Address14 address;

  @JsonProperty("activity")
  private String activity;

  @JsonProperty("siege")
  private Integer siege;

  @JsonProperty("actif")
  private Integer actif;

  @JsonProperty("nb_etabs")
  private Integer nbEtabs;

  @JsonProperty("representantLegal")
  private String representantLegal;

  @JsonProperty("matchedExecutive")
  private Executive6 matchedExecutive;

  @JsonProperty("mandataire")
  private Executive6 mandataire;

  public CompanySearchResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Company Identitfier
   * @return id
  */
  @ApiModelProperty(value = "Company Identitfier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanySearchResult companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company identifier
   * @return companyId
  */
  @ApiModelProperty(value = "Company identifier")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CompanySearchResult registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Company registration Number
   * @return registrationId
  */
  @ApiModelProperty(value = "Company registration Number")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public CompanySearchResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Company Name
   * @return name
  */
  @ApiModelProperty(value = "Company Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanySearchResult tradings(String tradings) {
    this.tradings = tradings;
    return this;
  }

  /**
   * Company trading name
   * @return tradings
  */
  @ApiModelProperty(value = "Company trading name")


  public String getTradings() {
    return tradings;
  }

  public void setTradings(String tradings) {
    this.tradings = tradings;
  }

  public CompanySearchResult address(Address14 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address14 getAddress() {
    return address;
  }

  public void setAddress(Address14 address) {
    this.address = address;
  }

  public CompanySearchResult activity(String activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Activity of the company
   * @return activity
  */
  @ApiModelProperty(value = "Activity of the company")


  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public CompanySearchResult siege(Integer siege) {
    this.siege = siege;
    return this;
  }

  /**
   * Get siege
   * @return siege
  */
  @ApiModelProperty(value = "")


  public Integer getSiege() {
    return siege;
  }

  public void setSiege(Integer siege) {
    this.siege = siege;
  }

  public CompanySearchResult actif(Integer actif) {
    this.actif = actif;
    return this;
  }

  /**
   * Get actif
   * @return actif
  */
  @ApiModelProperty(value = "")


  public Integer getActif() {
    return actif;
  }

  public void setActif(Integer actif) {
    this.actif = actif;
  }

  public CompanySearchResult nbEtabs(Integer nbEtabs) {
    this.nbEtabs = nbEtabs;
    return this;
  }

  /**
   * Get nbEtabs
   * @return nbEtabs
  */
  @ApiModelProperty(value = "")


  public Integer getNbEtabs() {
    return nbEtabs;
  }

  public void setNbEtabs(Integer nbEtabs) {
    this.nbEtabs = nbEtabs;
  }

  public CompanySearchResult representantLegal(String representantLegal) {
    this.representantLegal = representantLegal;
    return this;
  }

  /**
   * Get representantLegal
   * @return representantLegal
  */
  @ApiModelProperty(value = "")


  public String getRepresentantLegal() {
    return representantLegal;
  }

  public void setRepresentantLegal(String representantLegal) {
    this.representantLegal = representantLegal;
  }

  public CompanySearchResult matchedExecutive(Executive6 matchedExecutive) {
    this.matchedExecutive = matchedExecutive;
    return this;
  }

  /**
   * Get matchedExecutive
   * @return matchedExecutive
  */
  @ApiModelProperty(value = "")

  @Valid

  public Executive6 getMatchedExecutive() {
    return matchedExecutive;
  }

  public void setMatchedExecutive(Executive6 matchedExecutive) {
    this.matchedExecutive = matchedExecutive;
  }

  public CompanySearchResult mandataire(Executive6 mandataire) {
    this.mandataire = mandataire;
    return this;
  }

  /**
   * Get mandataire
   * @return mandataire
  */
  @ApiModelProperty(value = "")

  @Valid

  public Executive6 getMandataire() {
    return mandataire;
  }

  public void setMandataire(Executive6 mandataire) {
    this.mandataire = mandataire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySearchResult companySearchResult = (CompanySearchResult) o;
    return Objects.equals(this.id, companySearchResult.id) &&
        Objects.equals(this.companyId, companySearchResult.companyId) &&
        Objects.equals(this.registrationId, companySearchResult.registrationId) &&
        Objects.equals(this.name, companySearchResult.name) &&
        Objects.equals(this.tradings, companySearchResult.tradings) &&
        Objects.equals(this.address, companySearchResult.address) &&
        Objects.equals(this.activity, companySearchResult.activity) &&
        Objects.equals(this.siege, companySearchResult.siege) &&
        Objects.equals(this.actif, companySearchResult.actif) &&
        Objects.equals(this.nbEtabs, companySearchResult.nbEtabs) &&
        Objects.equals(this.representantLegal, companySearchResult.representantLegal) &&
        Objects.equals(this.matchedExecutive, companySearchResult.matchedExecutive) &&
        Objects.equals(this.mandataire, companySearchResult.mandataire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, registrationId, name, tradings, address, activity, siege, actif, nbEtabs, representantLegal, matchedExecutive, mandataire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySearchResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tradings: ").append(toIndentedString(tradings)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    siege: ").append(toIndentedString(siege)).append("\n");
    sb.append("    actif: ").append(toIndentedString(actif)).append("\n");
    sb.append("    nbEtabs: ").append(toIndentedString(nbEtabs)).append("\n");
    sb.append("    representantLegal: ").append(toIndentedString(representantLegal)).append("\n");
    sb.append("    matchedExecutive: ").append(toIndentedString(matchedExecutive)).append("\n");
    sb.append("    mandataire: ").append(toIndentedString(mandataire)).append("\n");
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

