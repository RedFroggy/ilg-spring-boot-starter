package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Dirigeant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dirigeants
 */

public class Dirigeants   {
  @JsonProperty("dirigeant")
  @Valid
  private List<Dirigeant> dirigeant = null;

  public Dirigeants dirigeant(List<Dirigeant> dirigeant) {
    this.dirigeant = dirigeant;
    return this;
  }

  public Dirigeants addDirigeantItem(Dirigeant dirigeantItem) {
    if (this.dirigeant == null) {
      this.dirigeant = new ArrayList<>();
    }
    this.dirigeant.add(dirigeantItem);
    return this;
  }

  /**
   * 
   * @return dirigeant
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Dirigeant> getDirigeant() {
    return dirigeant;
  }

  public void setDirigeant(List<Dirigeant> dirigeant) {
    this.dirigeant = dirigeant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dirigeants dirigeants = (Dirigeants) o;
    return Objects.equals(this.dirigeant, dirigeants.dirigeant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirigeant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dirigeants {\n");
    
    sb.append("    dirigeant: ").append(toIndentedString(dirigeant)).append("\n");
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

