package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Acte
 */

public class Acte   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("descriptif")
  private String descriptif;

  @JsonProperty("description")
  private String description;

  @JsonProperty("dateCommencementActivite")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateCommencementActivite;

  @JsonProperty("opposition")
  private String opposition;

  public Acte type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of Act
   * @return type
  */
  @ApiModelProperty(example = "vente", value = "type of Act")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Acte descriptif(String descriptif) {
    this.descriptif = descriptif;
    return this;
  }

  /**
   * Summary of Act
   * @return descriptif
  */
  @ApiModelProperty(example = "Vente d'un fond de commerce", value = "Summary of Act")


  public String getDescriptif() {
    return descriptif;
  }

  public void setDescriptif(String descriptif) {
    this.descriptif = descriptif;
  }

  public Acte description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text of act
   * @return description
  */
  @ApiModelProperty(example = "Vente d'un fond en seeing privé....", value = "Text of act")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Acte dateCommencementActivite(LocalDate dateCommencementActivite) {
    this.dateCommencementActivite = dateCommencementActivite;
    return this;
  }

  /**
   * When the act starts
   * @return dateCommencementActivite
  */
  @ApiModelProperty(value = "When the act starts")

  @Valid

  public LocalDate getDateCommencementActivite() {
    return dateCommencementActivite;
  }

  public void setDateCommencementActivite(LocalDate dateCommencementActivite) {
    this.dateCommencementActivite = dateCommencementActivite;
  }

  public Acte opposition(String opposition) {
    this.opposition = opposition;
    return this;
  }

  /**
   * Terms and conditions to invalidate the act
   * @return opposition
  */
  @ApiModelProperty(example = "Delai d'opposition de 10 jours après publication", value = "Terms and conditions to invalidate the act")


  public String getOpposition() {
    return opposition;
  }

  public void setOpposition(String opposition) {
    this.opposition = opposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acte acte = (Acte) o;
    return Objects.equals(this.type, acte.type) &&
        Objects.equals(this.descriptif, acte.descriptif) &&
        Objects.equals(this.description, acte.description) &&
        Objects.equals(this.dateCommencementActivite, acte.dateCommencementActivite) &&
        Objects.equals(this.opposition, acte.opposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, descriptif, description, dateCommencementActivite, opposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acte {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    descriptif: ").append(toIndentedString(descriptif)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCommencementActivite: ").append(toIndentedString(dateCommencementActivite)).append("\n");
    sb.append("    opposition: ").append(toIndentedString(opposition)).append("\n");
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

