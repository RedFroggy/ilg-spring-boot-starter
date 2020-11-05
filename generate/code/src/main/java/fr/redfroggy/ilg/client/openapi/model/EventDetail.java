package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Actes;
import fr.redfroggy.ilg.client.openapi.model.ActeursCession;
import fr.redfroggy.ilg.client.openapi.model.ActeursContentieux;
import fr.redfroggy.ilg.client.openapi.model.AnnonceInfo;
import fr.redfroggy.ilg.client.openapi.model.EtablissementsCession;
import fr.redfroggy.ilg.client.openapi.model.Evenements;
import fr.redfroggy.ilg.client.openapi.model.Personnes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventDetail
 */

public class EventDetail   {
  @JsonProperty("annonceInfo")
  private AnnonceInfo annonceInfo;

  @JsonProperty("personnes")
  private Personnes personnes;

  @JsonProperty("evenements")
  private Evenements evenements;

  @JsonProperty("acteursCession")
  private ActeursCession acteursCession;

  @JsonProperty("acteursContentieux")
  private ActeursContentieux acteursContentieux;

  @JsonProperty("etablissementsCession")
  private EtablissementsCession etablissementsCession;

  @JsonProperty("actes")
  private Actes actes;

  public EventDetail annonceInfo(AnnonceInfo annonceInfo) {
    this.annonceInfo = annonceInfo;
    return this;
  }

  /**
   * Get annonceInfo
   * @return annonceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnonceInfo getAnnonceInfo() {
    return annonceInfo;
  }

  public void setAnnonceInfo(AnnonceInfo annonceInfo) {
    this.annonceInfo = annonceInfo;
  }

  public EventDetail personnes(Personnes personnes) {
    this.personnes = personnes;
    return this;
  }

  /**
   * Get personnes
   * @return personnes
  */
  @ApiModelProperty(value = "")

  @Valid

  public Personnes getPersonnes() {
    return personnes;
  }

  public void setPersonnes(Personnes personnes) {
    this.personnes = personnes;
  }

  public EventDetail evenements(Evenements evenements) {
    this.evenements = evenements;
    return this;
  }

  /**
   * Get evenements
   * @return evenements
  */
  @ApiModelProperty(value = "")

  @Valid

  public Evenements getEvenements() {
    return evenements;
  }

  public void setEvenements(Evenements evenements) {
    this.evenements = evenements;
  }

  public EventDetail acteursCession(ActeursCession acteursCession) {
    this.acteursCession = acteursCession;
    return this;
  }

  /**
   * Get acteursCession
   * @return acteursCession
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActeursCession getActeursCession() {
    return acteursCession;
  }

  public void setActeursCession(ActeursCession acteursCession) {
    this.acteursCession = acteursCession;
  }

  public EventDetail acteursContentieux(ActeursContentieux acteursContentieux) {
    this.acteursContentieux = acteursContentieux;
    return this;
  }

  /**
   * Get acteursContentieux
   * @return acteursContentieux
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActeursContentieux getActeursContentieux() {
    return acteursContentieux;
  }

  public void setActeursContentieux(ActeursContentieux acteursContentieux) {
    this.acteursContentieux = acteursContentieux;
  }

  public EventDetail etablissementsCession(EtablissementsCession etablissementsCession) {
    this.etablissementsCession = etablissementsCession;
    return this;
  }

  /**
   * Get etablissementsCession
   * @return etablissementsCession
  */
  @ApiModelProperty(value = "")

  @Valid

  public EtablissementsCession getEtablissementsCession() {
    return etablissementsCession;
  }

  public void setEtablissementsCession(EtablissementsCession etablissementsCession) {
    this.etablissementsCession = etablissementsCession;
  }

  public EventDetail actes(Actes actes) {
    this.actes = actes;
    return this;
  }

  /**
   * Get actes
   * @return actes
  */
  @ApiModelProperty(value = "")

  @Valid

  public Actes getActes() {
    return actes;
  }

  public void setActes(Actes actes) {
    this.actes = actes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetail eventDetail = (EventDetail) o;
    return Objects.equals(this.annonceInfo, eventDetail.annonceInfo) &&
        Objects.equals(this.personnes, eventDetail.personnes) &&
        Objects.equals(this.evenements, eventDetail.evenements) &&
        Objects.equals(this.acteursCession, eventDetail.acteursCession) &&
        Objects.equals(this.acteursContentieux, eventDetail.acteursContentieux) &&
        Objects.equals(this.etablissementsCession, eventDetail.etablissementsCession) &&
        Objects.equals(this.actes, eventDetail.actes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annonceInfo, personnes, evenements, acteursCession, acteursContentieux, etablissementsCession, actes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetail {\n");
    
    sb.append("    annonceInfo: ").append(toIndentedString(annonceInfo)).append("\n");
    sb.append("    personnes: ").append(toIndentedString(personnes)).append("\n");
    sb.append("    evenements: ").append(toIndentedString(evenements)).append("\n");
    sb.append("    acteursCession: ").append(toIndentedString(acteursCession)).append("\n");
    sb.append("    acteursContentieux: ").append(toIndentedString(acteursContentieux)).append("\n");
    sb.append("    etablissementsCession: ").append(toIndentedString(etablissementsCession)).append("\n");
    sb.append("    actes: ").append(toIndentedString(actes)).append("\n");
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

