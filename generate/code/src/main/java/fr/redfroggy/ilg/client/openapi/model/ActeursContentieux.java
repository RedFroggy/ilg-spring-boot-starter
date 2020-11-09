package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ActeurContentieux;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActeursContentieux
 */

public class ActeursContentieux   {
  @JsonProperty("acteurContentieux")
  private ActeurContentieux acteurContentieux;

  public ActeursContentieux acteurContentieux(ActeurContentieux acteurContentieux) {
    this.acteurContentieux = acteurContentieux;
    return this;
  }

  /**
   * Get acteurContentieux
   * @return acteurContentieux
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActeurContentieux getActeurContentieux() {
    return acteurContentieux;
  }

  public void setActeurContentieux(ActeurContentieux acteurContentieux) {
    this.acteurContentieux = acteurContentieux;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActeursContentieux acteursContentieux = (ActeursContentieux) o;
    return Objects.equals(this.acteurContentieux, acteursContentieux.acteurContentieux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acteurContentieux);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActeursContentieux {\n");
    
    sb.append("    acteurContentieux: ").append(toIndentedString(acteurContentieux)).append("\n");
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

