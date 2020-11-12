package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.MandatProjection3;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Mandat
 */
@JsonDeserialize(builder = Mandat.MandatBuilder.class)
public class Mandat implements MandatProjection3 {

  private final String siren;

  private final String raisonSociale;

  private final Address adresse;

  private final ExecutiveFonction fonction;

  private final ExecutiveMouvement mouvement;

  private final List<ExecutiveMouvement> mouvements;

  private final List<Regrouping> regroupings;

  private final Integer score;

  private final String riskLabel;

  public Mandat(MandatBuilder builder) {
    this.siren = builder.siren;
    this.raisonSociale = builder.raisonSociale;
    this.adresse = builder.adresse;
    this.regroupings = builder.regroupings;
    this.score = builder.score;
    this.riskLabel = builder.riskLabel;
    this.fonction = builder.fonction;
    this.mouvement = builder.mouvement;
    this.mouvements = builder.mouvements;
  }

  /**
   * Company Identifier (Only available in France)
   * @return siren
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier (Only available in France)")
  public String getSiren() {
    return siren;
  }

  /**
   * Company name
   * @return raisonSociale
  */
  @ApiModelProperty(example = "Great Company", value = "Company name")
  public String getRaisonSociale() {
    return raisonSociale;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")
  public Address getAdresse() {
    return adresse;
  }

  /**
   * Get fonction
   *
   * @return fonction
   */
  public ExecutiveFonction getFonction() {
    return fonction;
  }

  /**
   * Get mouvement
   *
   * @return mouvement
   */
  public ExecutiveMouvement getMouvement() {
    return mouvement;
  }

  /**
   *
   * @return mouvements
   */
  public List<ExecutiveMouvement> getMouvements() {
    return mouvements;
  }


  /**
   * List of term of offices
   * @return regroupings
  */
  @ApiModelProperty(value = "List of term of offices")
  public List<Regrouping> getRegroupings() {
    return regroupings;
  }

  /**
   * Score of the company
   * @return score
  */
  @ApiModelProperty(value = "Score of the company")
  public Integer getScore() {
    return score;
  }

  /**
   * Score risk of the company
   * @return riskLabel
  */
  @ApiModelProperty(value = "Score risk of the company")
  public String getRiskLabel() {
    return riskLabel;
  }

  public static MandatBuilder builder() {
    return new MandatBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  public static final class MandatBuilder {
    private String siren;
    private String raisonSociale;
    private Address adresse;
    private ExecutiveFonction fonction;
    private ExecutiveMouvement mouvement;
    private List<ExecutiveMouvement> mouvements;
    private List<Regrouping> regroupings;
    private Integer score;
    private String riskLabel;

    private MandatBuilder() {
    }

    public static MandatBuilder aMandat() {
      return new MandatBuilder();
    }

    public MandatBuilder siren(String siren) {
      this.siren = siren;
      return this;
    }

    public MandatBuilder raisonSociale(String raisonSociale) {
      this.raisonSociale = raisonSociale;
      return this;
    }

    public MandatBuilder adresse(Address adresse) {
      this.adresse = adresse;
      return this;
    }

    public MandatBuilder fonction(ExecutiveFonction fonction) {
      this.fonction = fonction;
      return this;
    }

    public MandatBuilder mouvement(ExecutiveMouvement mouvement) {
      this.mouvement = mouvement;
      return this;
    }

    public MandatBuilder mouvements(List<ExecutiveMouvement> mouvements) {
      this.mouvements = mouvements;
      return this;
    }

    public MandatBuilder regroupings(List<Regrouping> regroupings) {
      this.regroupings = regroupings;
      return this;
    }

    public MandatBuilder score(Integer score) {
      this.score = score;
      return this;
    }

    @JsonProperty("risk_label")
    public MandatBuilder riskLabel(String riskLabel) {
      this.riskLabel = riskLabel;
      return this;
    }

    public Mandat build() {
      Mandat mandat = new Mandat(this);
      return mandat;
    }
  }
}

