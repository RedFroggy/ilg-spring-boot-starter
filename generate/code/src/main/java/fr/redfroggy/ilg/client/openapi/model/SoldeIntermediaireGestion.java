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
 * SoldeIntermediaireGestion
 */

public class SoldeIntermediaireGestion   {
  @JsonProperty("confidentiality")
  private Boolean confidentiality;

  @JsonProperty("duree")
  private Integer duree;

  @JsonProperty("devise")
  private String devise;

  @JsonProperty("ventesMarchandises")
  private Integer ventesMarchandises;

  @JsonProperty("achatsMarchandises")
  private Integer achatsMarchandises;

  @JsonProperty("variationStocksMarchandises")
  private Integer variationStocksMarchandises;

  @JsonProperty("margeCommerciale")
  private Integer margeCommerciale;

  @JsonProperty("prodVendueBiens")
  private Integer prodVendueBiens;

  @JsonProperty("prodVendueServices")
  private Integer prodVendueServices;

  @JsonProperty("prodStockees")
  private Integer prodStockees;

  @JsonProperty("prodImmobilisees")
  private Integer prodImmobilisees;

  @JsonProperty("prodExercice")
  private Integer prodExercice;

  @JsonProperty("achatMatPremEtApprov")
  private Integer achatMatPremEtApprov;

  @JsonProperty("variationStockMatPremEtApprov")
  private Integer variationStockMatPremEtApprov;

  @JsonProperty("autreAchatsEtChargesExternes")
  private Integer autreAchatsEtChargesExternes;

  @JsonProperty("valeurAjoutee")
  private Integer valeurAjoutee;

  @JsonProperty("subventionExploit")
  private Integer subventionExploit;

  @JsonProperty("impotsTaxesVersementAnticipes")
  private Integer impotsTaxesVersementAnticipes;

  @JsonProperty("salaireEtTraitements")
  private Integer salaireEtTraitements;

  @JsonProperty("chargesSociales")
  private Integer chargesSociales;

  @JsonProperty("ebe")
  private Integer ebe;

  @JsonProperty("dotationAmortExploit")
  private Integer dotationAmortExploit;

  @JsonProperty("provisionsExploit")
  private Integer provisionsExploit;

  @JsonProperty("repriseAmortProvTransferts")
  private Integer repriseAmortProvTransferts;

  @JsonProperty("autreProduits")
  private Integer autreProduits;

  @JsonProperty("autreCharges")
  private Integer autreCharges;

  @JsonProperty("resultatExploit")
  private Integer resultatExploit;

  @JsonProperty("benefAttribuePerteTransferee")
  private Integer benefAttribuePerteTransferee;

  @JsonProperty("perteSupporteePerteTransferee")
  private Integer perteSupporteePerteTransferee;

  @JsonProperty("prodFinParticipations")
  private Integer prodFinParticipations;

  @JsonProperty("prodAutresValeursMobilieres")
  private Integer prodAutresValeursMobilieres;

  @JsonProperty("autresInteretsAssimiles")
  private Integer autresInteretsAssimiles;

  @JsonProperty("differencesPositivesChange")
  private Integer differencesPositivesChange;

  @JsonProperty("produitsNetsCessionVmp")
  private Integer produitsNetsCessionVmp;

  @JsonProperty("repriseProvTransfertFin")
  private Integer repriseProvTransfertFin;

  @JsonProperty("interetsChargesAssimilees")
  private Integer interetsChargesAssimilees;

  @JsonProperty("differencesNegativesChange")
  private Integer differencesNegativesChange;

  @JsonProperty("chargesNettesCessionVmp")
  private Integer chargesNettesCessionVmp;

  @JsonProperty("dotationsFinAmortProv")
  private Integer dotationsFinAmortProv;

  @JsonProperty("resultatCourantAvantImpots")
  private Integer resultatCourantAvantImpots;

  @JsonProperty("totalProduitsExceptionnels")
  private Integer totalProduitsExceptionnels;

  @JsonProperty("totalChargesExceptionnelles")
  private Integer totalChargesExceptionnelles;

  @JsonProperty("resultatExceptionnel")
  private Integer resultatExceptionnel;

  @JsonProperty("resultatAvantImpots")
  private Integer resultatAvantImpots;

  @JsonProperty("partSalariesAuxResultats")
  private Integer partSalariesAuxResultats;

  @JsonProperty("impotsSurBenefices")
  private Integer impotsSurBenefices;

  @JsonProperty("beneficeOuPerte")
  private Integer beneficeOuPerte;

  public SoldeIntermediaireGestion confidentiality(Boolean confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

  /**
   * Confidentiality
   * @return confidentiality
  */
  @ApiModelProperty(value = "Confidentiality")


  public Boolean getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(Boolean confidentiality) {
    this.confidentiality = confidentiality;
  }

  public SoldeIntermediaireGestion duree(Integer duree) {
    this.duree = duree;
    return this;
  }

  /**
   * Duration
   * @return duree
  */
  @ApiModelProperty(value = "Duration")


  public Integer getDuree() {
    return duree;
  }

  public void setDuree(Integer duree) {
    this.duree = duree;
  }

  public SoldeIntermediaireGestion devise(String devise) {
    this.devise = devise;
    return this;
  }

  /**
   * Currency
   * @return devise
  */
  @ApiModelProperty(value = "Currency")


  public String getDevise() {
    return devise;
  }

  public void setDevise(String devise) {
    this.devise = devise;
  }

  public SoldeIntermediaireGestion ventesMarchandises(Integer ventesMarchandises) {
    this.ventesMarchandises = ventesMarchandises;
    return this;
  }

  /**
   * Sells
   * @return ventesMarchandises
  */
  @ApiModelProperty(value = "Sells")


  public Integer getVentesMarchandises() {
    return ventesMarchandises;
  }

  public void setVentesMarchandises(Integer ventesMarchandises) {
    this.ventesMarchandises = ventesMarchandises;
  }

  public SoldeIntermediaireGestion achatsMarchandises(Integer achatsMarchandises) {
    this.achatsMarchandises = achatsMarchandises;
    return this;
  }

  /**
   * Supplies
   * @return achatsMarchandises
  */
  @ApiModelProperty(value = "Supplies")


  public Integer getAchatsMarchandises() {
    return achatsMarchandises;
  }

  public void setAchatsMarchandises(Integer achatsMarchandises) {
    this.achatsMarchandises = achatsMarchandises;
  }

  public SoldeIntermediaireGestion variationStocksMarchandises(Integer variationStocksMarchandises) {
    this.variationStocksMarchandises = variationStocksMarchandises;
    return this;
  }

  /**
   * Stock Variation
   * @return variationStocksMarchandises
  */
  @ApiModelProperty(value = "Stock Variation")


  public Integer getVariationStocksMarchandises() {
    return variationStocksMarchandises;
  }

  public void setVariationStocksMarchandises(Integer variationStocksMarchandises) {
    this.variationStocksMarchandises = variationStocksMarchandises;
  }

  public SoldeIntermediaireGestion margeCommerciale(Integer margeCommerciale) {
    this.margeCommerciale = margeCommerciale;
    return this;
  }

  /**
   * Production Margin
   * @return margeCommerciale
  */
  @ApiModelProperty(value = "Production Margin")


  public Integer getMargeCommerciale() {
    return margeCommerciale;
  }

  public void setMargeCommerciale(Integer margeCommerciale) {
    this.margeCommerciale = margeCommerciale;
  }

  public SoldeIntermediaireGestion prodVendueBiens(Integer prodVendueBiens) {
    this.prodVendueBiens = prodVendueBiens;
    return this;
  }

  /**
   * Goods sold
   * @return prodVendueBiens
  */
  @ApiModelProperty(value = "Goods sold")


  public Integer getProdVendueBiens() {
    return prodVendueBiens;
  }

  public void setProdVendueBiens(Integer prodVendueBiens) {
    this.prodVendueBiens = prodVendueBiens;
  }

  public SoldeIntermediaireGestion prodVendueServices(Integer prodVendueServices) {
    this.prodVendueServices = prodVendueServices;
    return this;
  }

  /**
   * Services Sold
   * @return prodVendueServices
  */
  @ApiModelProperty(value = "Services Sold")


  public Integer getProdVendueServices() {
    return prodVendueServices;
  }

  public void setProdVendueServices(Integer prodVendueServices) {
    this.prodVendueServices = prodVendueServices;
  }

  public SoldeIntermediaireGestion prodStockees(Integer prodStockees) {
    this.prodStockees = prodStockees;
    return this;
  }

  /**
   * Stored Production
   * @return prodStockees
  */
  @ApiModelProperty(value = "Stored Production")


  public Integer getProdStockees() {
    return prodStockees;
  }

  public void setProdStockees(Integer prodStockees) {
    this.prodStockees = prodStockees;
  }

  public SoldeIntermediaireGestion prodImmobilisees(Integer prodImmobilisees) {
    this.prodImmobilisees = prodImmobilisees;
    return this;
  }

  /**
   * Self production
   * @return prodImmobilisees
  */
  @ApiModelProperty(value = "Self production")


  public Integer getProdImmobilisees() {
    return prodImmobilisees;
  }

  public void setProdImmobilisees(Integer prodImmobilisees) {
    this.prodImmobilisees = prodImmobilisees;
  }

  public SoldeIntermediaireGestion prodExercice(Integer prodExercice) {
    this.prodExercice = prodExercice;
    return this;
  }

  /**
   * Production
   * @return prodExercice
  */
  @ApiModelProperty(value = "Production")


  public Integer getProdExercice() {
    return prodExercice;
  }

  public void setProdExercice(Integer prodExercice) {
    this.prodExercice = prodExercice;
  }

  public SoldeIntermediaireGestion achatMatPremEtApprov(Integer achatMatPremEtApprov) {
    this.achatMatPremEtApprov = achatMatPremEtApprov;
    return this;
  }

  /**
   * Raw material supplies
   * @return achatMatPremEtApprov
  */
  @ApiModelProperty(value = "Raw material supplies")


  public Integer getAchatMatPremEtApprov() {
    return achatMatPremEtApprov;
  }

  public void setAchatMatPremEtApprov(Integer achatMatPremEtApprov) {
    this.achatMatPremEtApprov = achatMatPremEtApprov;
  }

  public SoldeIntermediaireGestion variationStockMatPremEtApprov(Integer variationStockMatPremEtApprov) {
    this.variationStockMatPremEtApprov = variationStockMatPremEtApprov;
    return this;
  }

  /**
   * Raw material stock variation
   * @return variationStockMatPremEtApprov
  */
  @ApiModelProperty(value = "Raw material stock variation")


  public Integer getVariationStockMatPremEtApprov() {
    return variationStockMatPremEtApprov;
  }

  public void setVariationStockMatPremEtApprov(Integer variationStockMatPremEtApprov) {
    this.variationStockMatPremEtApprov = variationStockMatPremEtApprov;
  }

  public SoldeIntermediaireGestion autreAchatsEtChargesExternes(Integer autreAchatsEtChargesExternes) {
    this.autreAchatsEtChargesExternes = autreAchatsEtChargesExternes;
    return this;
  }

  /**
   * External debts and other supplies
   * @return autreAchatsEtChargesExternes
  */
  @ApiModelProperty(value = "External debts and other supplies")


  public Integer getAutreAchatsEtChargesExternes() {
    return autreAchatsEtChargesExternes;
  }

  public void setAutreAchatsEtChargesExternes(Integer autreAchatsEtChargesExternes) {
    this.autreAchatsEtChargesExternes = autreAchatsEtChargesExternes;
  }

  public SoldeIntermediaireGestion valeurAjoutee(Integer valeurAjoutee) {
    this.valeurAjoutee = valeurAjoutee;
    return this;
  }

  /**
   * Added value
   * @return valeurAjoutee
  */
  @ApiModelProperty(value = "Added value")


  public Integer getValeurAjoutee() {
    return valeurAjoutee;
  }

  public void setValeurAjoutee(Integer valeurAjoutee) {
    this.valeurAjoutee = valeurAjoutee;
  }

  public SoldeIntermediaireGestion subventionExploit(Integer subventionExploit) {
    this.subventionExploit = subventionExploit;
    return this;
  }

  /**
   * Operating Aid
   * @return subventionExploit
  */
  @ApiModelProperty(value = "Operating Aid")


  public Integer getSubventionExploit() {
    return subventionExploit;
  }

  public void setSubventionExploit(Integer subventionExploit) {
    this.subventionExploit = subventionExploit;
  }

  public SoldeIntermediaireGestion impotsTaxesVersementAnticipes(Integer impotsTaxesVersementAnticipes) {
    this.impotsTaxesVersementAnticipes = impotsTaxesVersementAnticipes;
    return this;
  }

  /**
   * Advance tax payment
   * @return impotsTaxesVersementAnticipes
  */
  @ApiModelProperty(value = "Advance tax payment")


  public Integer getImpotsTaxesVersementAnticipes() {
    return impotsTaxesVersementAnticipes;
  }

  public void setImpotsTaxesVersementAnticipes(Integer impotsTaxesVersementAnticipes) {
    this.impotsTaxesVersementAnticipes = impotsTaxesVersementAnticipes;
  }

  public SoldeIntermediaireGestion salaireEtTraitements(Integer salaireEtTraitements) {
    this.salaireEtTraitements = salaireEtTraitements;
    return this;
  }

  /**
   * Payroll
   * @return salaireEtTraitements
  */
  @ApiModelProperty(value = "Payroll")


  public Integer getSalaireEtTraitements() {
    return salaireEtTraitements;
  }

  public void setSalaireEtTraitements(Integer salaireEtTraitements) {
    this.salaireEtTraitements = salaireEtTraitements;
  }

  public SoldeIntermediaireGestion chargesSociales(Integer chargesSociales) {
    this.chargesSociales = chargesSociales;
    return this;
  }

  /**
   * Payroll tax epenses
   * @return chargesSociales
  */
  @ApiModelProperty(value = "Payroll tax epenses")


  public Integer getChargesSociales() {
    return chargesSociales;
  }

  public void setChargesSociales(Integer chargesSociales) {
    this.chargesSociales = chargesSociales;
  }

  public SoldeIntermediaireGestion ebe(Integer ebe) {
    this.ebe = ebe;
    return this;
  }

  /**
   * Operating Margin
   * @return ebe
  */
  @ApiModelProperty(value = "Operating Margin")


  public Integer getEbe() {
    return ebe;
  }

  public void setEbe(Integer ebe) {
    this.ebe = ebe;
  }

  public SoldeIntermediaireGestion dotationAmortExploit(Integer dotationAmortExploit) {
    this.dotationAmortExploit = dotationAmortExploit;
    return this;
  }

  /**
   * Amortization
   * @return dotationAmortExploit
  */
  @ApiModelProperty(value = "Amortization")


  public Integer getDotationAmortExploit() {
    return dotationAmortExploit;
  }

  public void setDotationAmortExploit(Integer dotationAmortExploit) {
    this.dotationAmortExploit = dotationAmortExploit;
  }

  public SoldeIntermediaireGestion provisionsExploit(Integer provisionsExploit) {
    this.provisionsExploit = provisionsExploit;
    return this;
  }

  /**
   * Amortization expenses
   * @return provisionsExploit
  */
  @ApiModelProperty(value = "Amortization expenses")


  public Integer getProvisionsExploit() {
    return provisionsExploit;
  }

  public void setProvisionsExploit(Integer provisionsExploit) {
    this.provisionsExploit = provisionsExploit;
  }

  public SoldeIntermediaireGestion repriseAmortProvTransferts(Integer repriseAmortProvTransferts) {
    this.repriseAmortProvTransferts = repriseAmortProvTransferts;
    return this;
  }

  /**
   * Amortization reversal
   * @return repriseAmortProvTransferts
  */
  @ApiModelProperty(value = "Amortization reversal")


  public Integer getRepriseAmortProvTransferts() {
    return repriseAmortProvTransferts;
  }

  public void setRepriseAmortProvTransferts(Integer repriseAmortProvTransferts) {
    this.repriseAmortProvTransferts = repriseAmortProvTransferts;
  }

  public SoldeIntermediaireGestion autreProduits(Integer autreProduits) {
    this.autreProduits = autreProduits;
    return this;
  }

  /**
   * Other products
   * @return autreProduits
  */
  @ApiModelProperty(value = "Other products")


  public Integer getAutreProduits() {
    return autreProduits;
  }

  public void setAutreProduits(Integer autreProduits) {
    this.autreProduits = autreProduits;
  }

  public SoldeIntermediaireGestion autreCharges(Integer autreCharges) {
    this.autreCharges = autreCharges;
    return this;
  }

  /**
   * Other charges
   * @return autreCharges
  */
  @ApiModelProperty(value = "Other charges")


  public Integer getAutreCharges() {
    return autreCharges;
  }

  public void setAutreCharges(Integer autreCharges) {
    this.autreCharges = autreCharges;
  }

  public SoldeIntermediaireGestion resultatExploit(Integer resultatExploit) {
    this.resultatExploit = resultatExploit;
    return this;
  }

  /**
   * Other debts
   * @return resultatExploit
  */
  @ApiModelProperty(value = "Other debts")


  public Integer getResultatExploit() {
    return resultatExploit;
  }

  public void setResultatExploit(Integer resultatExploit) {
    this.resultatExploit = resultatExploit;
  }

  public SoldeIntermediaireGestion benefAttribuePerteTransferee(Integer benefAttribuePerteTransferee) {
    this.benefAttribuePerteTransferee = benefAttribuePerteTransferee;
    return this;
  }

  /**
   * Operating Profit
   * @return benefAttribuePerteTransferee
  */
  @ApiModelProperty(value = "Operating Profit")


  public Integer getBenefAttribuePerteTransferee() {
    return benefAttribuePerteTransferee;
  }

  public void setBenefAttribuePerteTransferee(Integer benefAttribuePerteTransferee) {
    this.benefAttribuePerteTransferee = benefAttribuePerteTransferee;
  }

  public SoldeIntermediaireGestion perteSupporteePerteTransferee(Integer perteSupporteePerteTransferee) {
    this.perteSupporteePerteTransferee = perteSupporteePerteTransferee;
    return this;
  }

  /**
   * Allocated gain or transferred loss
   * @return perteSupporteePerteTransferee
  */
  @ApiModelProperty(value = "Allocated gain or transferred loss")


  public Integer getPerteSupporteePerteTransferee() {
    return perteSupporteePerteTransferee;
  }

  public void setPerteSupporteePerteTransferee(Integer perteSupporteePerteTransferee) {
    this.perteSupporteePerteTransferee = perteSupporteePerteTransferee;
  }

  public SoldeIntermediaireGestion prodFinParticipations(Integer prodFinParticipations) {
    this.prodFinParticipations = prodFinParticipations;
    return this;
  }

  /**
   * Revenue from financial production
   * @return prodFinParticipations
  */
  @ApiModelProperty(value = "Revenue from financial production")


  public Integer getProdFinParticipations() {
    return prodFinParticipations;
  }

  public void setProdFinParticipations(Integer prodFinParticipations) {
    this.prodFinParticipations = prodFinParticipations;
  }

  public SoldeIntermediaireGestion prodAutresValeursMobilieres(Integer prodAutresValeursMobilieres) {
    this.prodAutresValeursMobilieres = prodAutresValeursMobilieres;
    return this;
  }

  /**
   * Production of other movable values
   * @return prodAutresValeursMobilieres
  */
  @ApiModelProperty(value = "Production of other movable values")


  public Integer getProdAutresValeursMobilieres() {
    return prodAutresValeursMobilieres;
  }

  public void setProdAutresValeursMobilieres(Integer prodAutresValeursMobilieres) {
    this.prodAutresValeursMobilieres = prodAutresValeursMobilieres;
  }

  public SoldeIntermediaireGestion autresInteretsAssimiles(Integer autresInteretsAssimiles) {
    this.autresInteretsAssimiles = autresInteretsAssimiles;
    return this;
  }

  /**
   * Similar other interests
   * @return autresInteretsAssimiles
  */
  @ApiModelProperty(value = "Similar other interests")


  public Integer getAutresInteretsAssimiles() {
    return autresInteretsAssimiles;
  }

  public void setAutresInteretsAssimiles(Integer autresInteretsAssimiles) {
    this.autresInteretsAssimiles = autresInteretsAssimiles;
  }

  public SoldeIntermediaireGestion differencesPositivesChange(Integer differencesPositivesChange) {
    this.differencesPositivesChange = differencesPositivesChange;
    return this;
  }

  /**
   * Positive exchange difference
   * @return differencesPositivesChange
  */
  @ApiModelProperty(value = "Positive exchange difference")


  public Integer getDifferencesPositivesChange() {
    return differencesPositivesChange;
  }

  public void setDifferencesPositivesChange(Integer differencesPositivesChange) {
    this.differencesPositivesChange = differencesPositivesChange;
  }

  public SoldeIntermediaireGestion produitsNetsCessionVmp(Integer produitsNetsCessionVmp) {
    this.produitsNetsCessionVmp = produitsNetsCessionVmp;
    return this;
  }

  /**
   * Financial revenues from net marketable securities
   * @return produitsNetsCessionVmp
  */
  @ApiModelProperty(value = "Financial revenues from net marketable securities")


  public Integer getProduitsNetsCessionVmp() {
    return produitsNetsCessionVmp;
  }

  public void setProduitsNetsCessionVmp(Integer produitsNetsCessionVmp) {
    this.produitsNetsCessionVmp = produitsNetsCessionVmp;
  }

  public SoldeIntermediaireGestion repriseProvTransfertFin(Integer repriseProvTransfertFin) {
    this.repriseProvTransfertFin = repriseProvTransfertFin;
    return this;
  }

  /**
   * Financial provision reversal
   * @return repriseProvTransfertFin
  */
  @ApiModelProperty(value = "Financial provision reversal")


  public Integer getRepriseProvTransfertFin() {
    return repriseProvTransfertFin;
  }

  public void setRepriseProvTransfertFin(Integer repriseProvTransfertFin) {
    this.repriseProvTransfertFin = repriseProvTransfertFin;
  }

  public SoldeIntermediaireGestion interetsChargesAssimilees(Integer interetsChargesAssimilees) {
    this.interetsChargesAssimilees = interetsChargesAssimilees;
    return this;
  }

  /**
   * Interests and similar charges
   * @return interetsChargesAssimilees
  */
  @ApiModelProperty(value = "Interests and similar charges")


  public Integer getInteretsChargesAssimilees() {
    return interetsChargesAssimilees;
  }

  public void setInteretsChargesAssimilees(Integer interetsChargesAssimilees) {
    this.interetsChargesAssimilees = interetsChargesAssimilees;
  }

  public SoldeIntermediaireGestion differencesNegativesChange(Integer differencesNegativesChange) {
    this.differencesNegativesChange = differencesNegativesChange;
    return this;
  }

  /**
   * Negative exchange difference
   * @return differencesNegativesChange
  */
  @ApiModelProperty(value = "Negative exchange difference")


  public Integer getDifferencesNegativesChange() {
    return differencesNegativesChange;
  }

  public void setDifferencesNegativesChange(Integer differencesNegativesChange) {
    this.differencesNegativesChange = differencesNegativesChange;
  }

  public SoldeIntermediaireGestion chargesNettesCessionVmp(Integer chargesNettesCessionVmp) {
    this.chargesNettesCessionVmp = chargesNettesCessionVmp;
    return this;
  }

  /**
   * Charges on sales of marketable securities
   * @return chargesNettesCessionVmp
  */
  @ApiModelProperty(value = "Charges on sales of marketable securities")


  public Integer getChargesNettesCessionVmp() {
    return chargesNettesCessionVmp;
  }

  public void setChargesNettesCessionVmp(Integer chargesNettesCessionVmp) {
    this.chargesNettesCessionVmp = chargesNettesCessionVmp;
  }

  public SoldeIntermediaireGestion dotationsFinAmortProv(Integer dotationsFinAmortProv) {
    this.dotationsFinAmortProv = dotationsFinAmortProv;
    return this;
  }

  /**
   * Financial amortization
   * @return dotationsFinAmortProv
  */
  @ApiModelProperty(value = "Financial amortization")


  public Integer getDotationsFinAmortProv() {
    return dotationsFinAmortProv;
  }

  public void setDotationsFinAmortProv(Integer dotationsFinAmortProv) {
    this.dotationsFinAmortProv = dotationsFinAmortProv;
  }

  public SoldeIntermediaireGestion resultatCourantAvantImpots(Integer resultatCourantAvantImpots) {
    this.resultatCourantAvantImpots = resultatCourantAvantImpots;
    return this;
  }

  /**
   * Charged operating profit before taxes
   * @return resultatCourantAvantImpots
  */
  @ApiModelProperty(value = "Charged operating profit before taxes")


  public Integer getResultatCourantAvantImpots() {
    return resultatCourantAvantImpots;
  }

  public void setResultatCourantAvantImpots(Integer resultatCourantAvantImpots) {
    this.resultatCourantAvantImpots = resultatCourantAvantImpots;
  }

  public SoldeIntermediaireGestion totalProduitsExceptionnels(Integer totalProduitsExceptionnels) {
    this.totalProduitsExceptionnels = totalProduitsExceptionnels;
    return this;
  }

  /**
   * Extraordinary production total
   * @return totalProduitsExceptionnels
  */
  @ApiModelProperty(value = "Extraordinary production total")


  public Integer getTotalProduitsExceptionnels() {
    return totalProduitsExceptionnels;
  }

  public void setTotalProduitsExceptionnels(Integer totalProduitsExceptionnels) {
    this.totalProduitsExceptionnels = totalProduitsExceptionnels;
  }

  public SoldeIntermediaireGestion totalChargesExceptionnelles(Integer totalChargesExceptionnelles) {
    this.totalChargesExceptionnelles = totalChargesExceptionnelles;
    return this;
  }

  /**
   * Extraordinary debts total
   * @return totalChargesExceptionnelles
  */
  @ApiModelProperty(value = "Extraordinary debts total")


  public Integer getTotalChargesExceptionnelles() {
    return totalChargesExceptionnelles;
  }

  public void setTotalChargesExceptionnelles(Integer totalChargesExceptionnelles) {
    this.totalChargesExceptionnelles = totalChargesExceptionnelles;
  }

  public SoldeIntermediaireGestion resultatExceptionnel(Integer resultatExceptionnel) {
    this.resultatExceptionnel = resultatExceptionnel;
    return this;
  }

  /**
   * Extraordinary profits
   * @return resultatExceptionnel
  */
  @ApiModelProperty(value = "Extraordinary profits")


  public Integer getResultatExceptionnel() {
    return resultatExceptionnel;
  }

  public void setResultatExceptionnel(Integer resultatExceptionnel) {
    this.resultatExceptionnel = resultatExceptionnel;
  }

  public SoldeIntermediaireGestion resultatAvantImpots(Integer resultatAvantImpots) {
    this.resultatAvantImpots = resultatAvantImpots;
    return this;
  }

  /**
   * Operating profit before taxes
   * @return resultatAvantImpots
  */
  @ApiModelProperty(value = "Operating profit before taxes")


  public Integer getResultatAvantImpots() {
    return resultatAvantImpots;
  }

  public void setResultatAvantImpots(Integer resultatAvantImpots) {
    this.resultatAvantImpots = resultatAvantImpots;
  }

  public SoldeIntermediaireGestion partSalariesAuxResultats(Integer partSalariesAuxResultats) {
    this.partSalariesAuxResultats = partSalariesAuxResultats;
    return this;
  }

  /**
   * Employee profit sharing
   * @return partSalariesAuxResultats
  */
  @ApiModelProperty(value = "Employee profit sharing")


  public Integer getPartSalariesAuxResultats() {
    return partSalariesAuxResultats;
  }

  public void setPartSalariesAuxResultats(Integer partSalariesAuxResultats) {
    this.partSalariesAuxResultats = partSalariesAuxResultats;
  }

  public SoldeIntermediaireGestion impotsSurBenefices(Integer impotsSurBenefices) {
    this.impotsSurBenefices = impotsSurBenefices;
    return this;
  }

  /**
   * Income Taxes
   * @return impotsSurBenefices
  */
  @ApiModelProperty(value = "Income Taxes")


  public Integer getImpotsSurBenefices() {
    return impotsSurBenefices;
  }

  public void setImpotsSurBenefices(Integer impotsSurBenefices) {
    this.impotsSurBenefices = impotsSurBenefices;
  }

  public SoldeIntermediaireGestion beneficeOuPerte(Integer beneficeOuPerte) {
    this.beneficeOuPerte = beneficeOuPerte;
    return this;
  }

  /**
   * Profit or loss
   * @return beneficeOuPerte
  */
  @ApiModelProperty(value = "Profit or loss")


  public Integer getBeneficeOuPerte() {
    return beneficeOuPerte;
  }

  public void setBeneficeOuPerte(Integer beneficeOuPerte) {
    this.beneficeOuPerte = beneficeOuPerte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoldeIntermediaireGestion soldeIntermediaireGestion = (SoldeIntermediaireGestion) o;
    return Objects.equals(this.confidentiality, soldeIntermediaireGestion.confidentiality) &&
        Objects.equals(this.duree, soldeIntermediaireGestion.duree) &&
        Objects.equals(this.devise, soldeIntermediaireGestion.devise) &&
        Objects.equals(this.ventesMarchandises, soldeIntermediaireGestion.ventesMarchandises) &&
        Objects.equals(this.achatsMarchandises, soldeIntermediaireGestion.achatsMarchandises) &&
        Objects.equals(this.variationStocksMarchandises, soldeIntermediaireGestion.variationStocksMarchandises) &&
        Objects.equals(this.margeCommerciale, soldeIntermediaireGestion.margeCommerciale) &&
        Objects.equals(this.prodVendueBiens, soldeIntermediaireGestion.prodVendueBiens) &&
        Objects.equals(this.prodVendueServices, soldeIntermediaireGestion.prodVendueServices) &&
        Objects.equals(this.prodStockees, soldeIntermediaireGestion.prodStockees) &&
        Objects.equals(this.prodImmobilisees, soldeIntermediaireGestion.prodImmobilisees) &&
        Objects.equals(this.prodExercice, soldeIntermediaireGestion.prodExercice) &&
        Objects.equals(this.achatMatPremEtApprov, soldeIntermediaireGestion.achatMatPremEtApprov) &&
        Objects.equals(this.variationStockMatPremEtApprov, soldeIntermediaireGestion.variationStockMatPremEtApprov) &&
        Objects.equals(this.autreAchatsEtChargesExternes, soldeIntermediaireGestion.autreAchatsEtChargesExternes) &&
        Objects.equals(this.valeurAjoutee, soldeIntermediaireGestion.valeurAjoutee) &&
        Objects.equals(this.subventionExploit, soldeIntermediaireGestion.subventionExploit) &&
        Objects.equals(this.impotsTaxesVersementAnticipes, soldeIntermediaireGestion.impotsTaxesVersementAnticipes) &&
        Objects.equals(this.salaireEtTraitements, soldeIntermediaireGestion.salaireEtTraitements) &&
        Objects.equals(this.chargesSociales, soldeIntermediaireGestion.chargesSociales) &&
        Objects.equals(this.ebe, soldeIntermediaireGestion.ebe) &&
        Objects.equals(this.dotationAmortExploit, soldeIntermediaireGestion.dotationAmortExploit) &&
        Objects.equals(this.provisionsExploit, soldeIntermediaireGestion.provisionsExploit) &&
        Objects.equals(this.repriseAmortProvTransferts, soldeIntermediaireGestion.repriseAmortProvTransferts) &&
        Objects.equals(this.autreProduits, soldeIntermediaireGestion.autreProduits) &&
        Objects.equals(this.autreCharges, soldeIntermediaireGestion.autreCharges) &&
        Objects.equals(this.resultatExploit, soldeIntermediaireGestion.resultatExploit) &&
        Objects.equals(this.benefAttribuePerteTransferee, soldeIntermediaireGestion.benefAttribuePerteTransferee) &&
        Objects.equals(this.perteSupporteePerteTransferee, soldeIntermediaireGestion.perteSupporteePerteTransferee) &&
        Objects.equals(this.prodFinParticipations, soldeIntermediaireGestion.prodFinParticipations) &&
        Objects.equals(this.prodAutresValeursMobilieres, soldeIntermediaireGestion.prodAutresValeursMobilieres) &&
        Objects.equals(this.autresInteretsAssimiles, soldeIntermediaireGestion.autresInteretsAssimiles) &&
        Objects.equals(this.differencesPositivesChange, soldeIntermediaireGestion.differencesPositivesChange) &&
        Objects.equals(this.produitsNetsCessionVmp, soldeIntermediaireGestion.produitsNetsCessionVmp) &&
        Objects.equals(this.repriseProvTransfertFin, soldeIntermediaireGestion.repriseProvTransfertFin) &&
        Objects.equals(this.interetsChargesAssimilees, soldeIntermediaireGestion.interetsChargesAssimilees) &&
        Objects.equals(this.differencesNegativesChange, soldeIntermediaireGestion.differencesNegativesChange) &&
        Objects.equals(this.chargesNettesCessionVmp, soldeIntermediaireGestion.chargesNettesCessionVmp) &&
        Objects.equals(this.dotationsFinAmortProv, soldeIntermediaireGestion.dotationsFinAmortProv) &&
        Objects.equals(this.resultatCourantAvantImpots, soldeIntermediaireGestion.resultatCourantAvantImpots) &&
        Objects.equals(this.totalProduitsExceptionnels, soldeIntermediaireGestion.totalProduitsExceptionnels) &&
        Objects.equals(this.totalChargesExceptionnelles, soldeIntermediaireGestion.totalChargesExceptionnelles) &&
        Objects.equals(this.resultatExceptionnel, soldeIntermediaireGestion.resultatExceptionnel) &&
        Objects.equals(this.resultatAvantImpots, soldeIntermediaireGestion.resultatAvantImpots) &&
        Objects.equals(this.partSalariesAuxResultats, soldeIntermediaireGestion.partSalariesAuxResultats) &&
        Objects.equals(this.impotsSurBenefices, soldeIntermediaireGestion.impotsSurBenefices) &&
        Objects.equals(this.beneficeOuPerte, soldeIntermediaireGestion.beneficeOuPerte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidentiality, duree, devise, ventesMarchandises, achatsMarchandises, variationStocksMarchandises, margeCommerciale, prodVendueBiens, prodVendueServices, prodStockees, prodImmobilisees, prodExercice, achatMatPremEtApprov, variationStockMatPremEtApprov, autreAchatsEtChargesExternes, valeurAjoutee, subventionExploit, impotsTaxesVersementAnticipes, salaireEtTraitements, chargesSociales, ebe, dotationAmortExploit, provisionsExploit, repriseAmortProvTransferts, autreProduits, autreCharges, resultatExploit, benefAttribuePerteTransferee, perteSupporteePerteTransferee, prodFinParticipations, prodAutresValeursMobilieres, autresInteretsAssimiles, differencesPositivesChange, produitsNetsCessionVmp, repriseProvTransfertFin, interetsChargesAssimilees, differencesNegativesChange, chargesNettesCessionVmp, dotationsFinAmortProv, resultatCourantAvantImpots, totalProduitsExceptionnels, totalChargesExceptionnelles, resultatExceptionnel, resultatAvantImpots, partSalariesAuxResultats, impotsSurBenefices, beneficeOuPerte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoldeIntermediaireGestion {\n");
    
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    duree: ").append(toIndentedString(duree)).append("\n");
    sb.append("    devise: ").append(toIndentedString(devise)).append("\n");
    sb.append("    ventesMarchandises: ").append(toIndentedString(ventesMarchandises)).append("\n");
    sb.append("    achatsMarchandises: ").append(toIndentedString(achatsMarchandises)).append("\n");
    sb.append("    variationStocksMarchandises: ").append(toIndentedString(variationStocksMarchandises)).append("\n");
    sb.append("    margeCommerciale: ").append(toIndentedString(margeCommerciale)).append("\n");
    sb.append("    prodVendueBiens: ").append(toIndentedString(prodVendueBiens)).append("\n");
    sb.append("    prodVendueServices: ").append(toIndentedString(prodVendueServices)).append("\n");
    sb.append("    prodStockees: ").append(toIndentedString(prodStockees)).append("\n");
    sb.append("    prodImmobilisees: ").append(toIndentedString(prodImmobilisees)).append("\n");
    sb.append("    prodExercice: ").append(toIndentedString(prodExercice)).append("\n");
    sb.append("    achatMatPremEtApprov: ").append(toIndentedString(achatMatPremEtApprov)).append("\n");
    sb.append("    variationStockMatPremEtApprov: ").append(toIndentedString(variationStockMatPremEtApprov)).append("\n");
    sb.append("    autreAchatsEtChargesExternes: ").append(toIndentedString(autreAchatsEtChargesExternes)).append("\n");
    sb.append("    valeurAjoutee: ").append(toIndentedString(valeurAjoutee)).append("\n");
    sb.append("    subventionExploit: ").append(toIndentedString(subventionExploit)).append("\n");
    sb.append("    impotsTaxesVersementAnticipes: ").append(toIndentedString(impotsTaxesVersementAnticipes)).append("\n");
    sb.append("    salaireEtTraitements: ").append(toIndentedString(salaireEtTraitements)).append("\n");
    sb.append("    chargesSociales: ").append(toIndentedString(chargesSociales)).append("\n");
    sb.append("    ebe: ").append(toIndentedString(ebe)).append("\n");
    sb.append("    dotationAmortExploit: ").append(toIndentedString(dotationAmortExploit)).append("\n");
    sb.append("    provisionsExploit: ").append(toIndentedString(provisionsExploit)).append("\n");
    sb.append("    repriseAmortProvTransferts: ").append(toIndentedString(repriseAmortProvTransferts)).append("\n");
    sb.append("    autreProduits: ").append(toIndentedString(autreProduits)).append("\n");
    sb.append("    autreCharges: ").append(toIndentedString(autreCharges)).append("\n");
    sb.append("    resultatExploit: ").append(toIndentedString(resultatExploit)).append("\n");
    sb.append("    benefAttribuePerteTransferee: ").append(toIndentedString(benefAttribuePerteTransferee)).append("\n");
    sb.append("    perteSupporteePerteTransferee: ").append(toIndentedString(perteSupporteePerteTransferee)).append("\n");
    sb.append("    prodFinParticipations: ").append(toIndentedString(prodFinParticipations)).append("\n");
    sb.append("    prodAutresValeursMobilieres: ").append(toIndentedString(prodAutresValeursMobilieres)).append("\n");
    sb.append("    autresInteretsAssimiles: ").append(toIndentedString(autresInteretsAssimiles)).append("\n");
    sb.append("    differencesPositivesChange: ").append(toIndentedString(differencesPositivesChange)).append("\n");
    sb.append("    produitsNetsCessionVmp: ").append(toIndentedString(produitsNetsCessionVmp)).append("\n");
    sb.append("    repriseProvTransfertFin: ").append(toIndentedString(repriseProvTransfertFin)).append("\n");
    sb.append("    interetsChargesAssimilees: ").append(toIndentedString(interetsChargesAssimilees)).append("\n");
    sb.append("    differencesNegativesChange: ").append(toIndentedString(differencesNegativesChange)).append("\n");
    sb.append("    chargesNettesCessionVmp: ").append(toIndentedString(chargesNettesCessionVmp)).append("\n");
    sb.append("    dotationsFinAmortProv: ").append(toIndentedString(dotationsFinAmortProv)).append("\n");
    sb.append("    resultatCourantAvantImpots: ").append(toIndentedString(resultatCourantAvantImpots)).append("\n");
    sb.append("    totalProduitsExceptionnels: ").append(toIndentedString(totalProduitsExceptionnels)).append("\n");
    sb.append("    totalChargesExceptionnelles: ").append(toIndentedString(totalChargesExceptionnelles)).append("\n");
    sb.append("    resultatExceptionnel: ").append(toIndentedString(resultatExceptionnel)).append("\n");
    sb.append("    resultatAvantImpots: ").append(toIndentedString(resultatAvantImpots)).append("\n");
    sb.append("    partSalariesAuxResultats: ").append(toIndentedString(partSalariesAuxResultats)).append("\n");
    sb.append("    impotsSurBenefices: ").append(toIndentedString(impotsSurBenefices)).append("\n");
    sb.append("    beneficeOuPerte: ").append(toIndentedString(beneficeOuPerte)).append("\n");
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

