package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.model.Address;
import fr.redfroggy.ilg.client.model.Executive;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * CompanySearchResult
 */
@JsonDeserialize(builder = CompanySearchResult.CompanySearchResultBuilder.class)
public class CompanySearchResult   {

  private final String id;

  private final String companyId;

  private final String registrationId;

  private final String name;

  private final String tradings;

  private final Address address;

  private final String activity;

  private final Integer siege;

  private final Integer actif;

  private final Integer nbEtabs;

  private final String representantLegal;

  private final Executive matchedExecutive;

  private final Executive mandataire;

  public CompanySearchResult(CompanySearchResultBuilder builder) {
    this.id = builder.id;
    this.companyId = builder.companyId;
    this.registrationId = builder.registrationId;
    this.name = builder.name;
    this.tradings = builder.tradings;
    this.address = builder.address;
    this.activity = builder.activity;
    this.siege = builder.siege;
    this.actif = builder.actif;
    this.nbEtabs = builder.nbEtabs;
    this.representantLegal = builder.representantLegal;
    this.matchedExecutive = builder.matchedExecutive;
    this.mandataire = builder.mandataire;
  }

  /**
   * Company Identitfier
   * @return id
  */
  @ApiModelProperty(value = "Company Identitfier")
  public String getId() {
    return id;
  }

  /**
   * Company identifier
   * @return companyId
  */
  @ApiModelProperty(value = "Company identifier")
  public String getCompanyId() {
    return companyId;
  }

  /**
   * Company registration Number
   * @return registrationId
  */
  @ApiModelProperty(value = "Company registration Number")
  public String getRegistrationId() {
    return registrationId;
  }

  /**
   * Company Name
   * @return name
  */
  @ApiModelProperty(value = "Company Name")
  public String getName() {
    return name;
  }

  /**
   * Company trading name
   * @return tradings
  */
  @ApiModelProperty(value = "Company trading name")
  public String getTradings() {
    return tradings;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")
  @Valid
  public AddressProjection14 getAddress() {
    return address;
  }

  /**
   * Activity of the company
   * @return activity
  */
  @ApiModelProperty(value = "Activity of the company")
  public String getActivity() {
    return activity;
  }

  /**
   * Get siege
   * @return siege
  */
  @ApiModelProperty(value = "")
  public Integer getSiege() {
    return siege;
  }

  /**
   * Get actif
   * @return actif
  */
  @ApiModelProperty(value = "")
  public Integer getActif() {
    return actif;
  }

  /**
   * Get nbEtabs
   * @return nbEtabs
  */
  @ApiModelProperty(value = "")
  public Integer getNbEtabs() {
    return nbEtabs;
  }

  /**
   * Get representantLegal
   * @return representantLegal
  */
  @ApiModelProperty(value = "")
  public String getRepresentantLegal() {
    return representantLegal;
  }

  /**
   * Get matchedExecutive
   * @return matchedExecutive
  */
  @ApiModelProperty(value = "")
  @Valid
  public ExecutiveProjection6 getMatchedExecutive() {
    return matchedExecutive;
  }

  /**
   * Get mandataire
   * @return mandataire
  */
  @ApiModelProperty(value = "")
  @Valid
  public ExecutiveProjection6 getMandataire() {
    return mandataire;
  }


  public static CompanySearchResultBuilder builder() {
    return new CompanySearchResultBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(ignoreUnknown = true, value = "address.mailFormatted")
  public static final class CompanySearchResultBuilder {
    private String id;
    private String companyId;
    private String registrationId;
    private String name;
    private String tradings;
    private Address address;
    private String activity;
    private Integer siege;
    private Integer actif;
    private Integer nbEtabs;
    private String representantLegal;
    private Executive matchedExecutive;
    private Executive mandataire;

    private CompanySearchResultBuilder() {
    }

    public CompanySearchResultBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CompanySearchResultBuilder companyId(String companyId) {
      this.companyId = companyId;
      return this;
    }

    public CompanySearchResultBuilder registrationId(String registrationId) {
      this.registrationId = registrationId;
      return this;
    }

    public CompanySearchResultBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CompanySearchResultBuilder tradings(String tradings) {
      this.tradings = tradings;
      return this;
    }

    public CompanySearchResultBuilder address(Address address) {
      this.address = address;
      return this;
    }

    public CompanySearchResultBuilder activity(String activity) {
      this.activity = activity;
      return this;
    }

    public CompanySearchResultBuilder siege(Integer siege) {
      this.siege = siege;
      return this;
    }

    public CompanySearchResultBuilder actif(Integer actif) {
      this.actif = actif;
      return this;
    }

    @JsonProperty("nb_etabs")
    public CompanySearchResultBuilder nbEtabs(Integer nbEtabs) {
      this.nbEtabs = nbEtabs;
      return this;
    }

    public CompanySearchResultBuilder representantLegal(String representantLegal) {
      this.representantLegal = representantLegal;
      return this;
    }

    public CompanySearchResultBuilder matchedExecutive(Executive matchedExecutive) {
      this.matchedExecutive = matchedExecutive;
      return this;
    }

    public CompanySearchResultBuilder mandataire(Executive mandataire) {
      this.mandataire = mandataire;
      return this;
    }

    public CompanySearchResult build() {
      return new CompanySearchResult(this);
    }
  }
}

