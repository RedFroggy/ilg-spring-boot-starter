package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Acte;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Actes
 */

public class Actes   {
  @JsonProperty("acte")
  @Valid
  private List<Acte> acte = null;

  public Actes acte(List<Acte> acte) {
    this.acte = acte;
    return this;
  }

  public Actes addActeItem(Acte acteItem) {
    if (this.acte == null) {
      this.acte = new ArrayList<>();
    }
    this.acte.add(acteItem);
    return this;
  }

  /**
   * list
   * @return acte
  */
  @ApiModelProperty(value = "list")

  @Valid

  public List<Acte> getActe() {
    return acte;
  }

  public void setActe(List<Acte> acte) {
    this.acte = acte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actes actes = (Actes) o;
    return Objects.equals(this.acte, actes.acte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actes {\n");
    
    sb.append("    acte: ").append(toIndentedString(acte)).append("\n");
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

