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
 * Rectificatif
 */

public class Rectificatif   {
  @JsonProperty("nomPublication")
  private String nomPublication;

  @JsonProperty("dateParution")
  private LocalDate dateParution;

  @JsonProperty("numParution")
  private String numParution;

  @JsonProperty("numAnnonce")
  private String numAnnonce;

  public Rectificatif nomPublication(String nomPublication) {
    this.nomPublication = nomPublication;
    return this;
  }

  /**
   * Parution name
   * @return nomPublication
  */
  @ApiModelProperty(example = "Great Newspaper", value = "Parution name")


  public String getNomPublication() {
    return nomPublication;
  }

  public void setNomPublication(String nomPublication) {
    this.nomPublication = nomPublication;
  }

  public Rectificatif dateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
    return this;
  }

  /**
   * Release date
   * @return dateParution
  */
  @ApiModelProperty(value = "Release date")

  @Valid

  public LocalDate getDateParution() {
    return dateParution;
  }

  public void setDateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
  }

  public Rectificatif numParution(String numParution) {
    this.numParution = numParution;
    return this;
  }

  /**
   * Parution number
   * @return numParution
  */
  @ApiModelProperty(example = "XA123456", value = "Parution number")


  public String getNumParution() {
    return numParution;
  }

  public void setNumParution(String numParution) {
    this.numParution = numParution;
  }

  public Rectificatif numAnnonce(String numAnnonce) {
    this.numAnnonce = numAnnonce;
    return this;
  }

  /**
   * Event number
   * @return numAnnonce
  */
  @ApiModelProperty(example = "45632", value = "Event number")


  public String getNumAnnonce() {
    return numAnnonce;
  }

  public void setNumAnnonce(String numAnnonce) {
    this.numAnnonce = numAnnonce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectificatif rectificatif = (Rectificatif) o;
    return Objects.equals(this.nomPublication, rectificatif.nomPublication) &&
        Objects.equals(this.dateParution, rectificatif.dateParution) &&
        Objects.equals(this.numParution, rectificatif.numParution) &&
        Objects.equals(this.numAnnonce, rectificatif.numAnnonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomPublication, dateParution, numParution, numAnnonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectificatif {\n");
    
    sb.append("    nomPublication: ").append(toIndentedString(nomPublication)).append("\n");
    sb.append("    dateParution: ").append(toIndentedString(dateParution)).append("\n");
    sb.append("    numParution: ").append(toIndentedString(numParution)).append("\n");
    sb.append("    numAnnonce: ").append(toIndentedString(numAnnonce)).append("\n");
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

