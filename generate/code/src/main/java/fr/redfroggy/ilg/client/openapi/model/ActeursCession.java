package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ActeurCession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActeursCession
 */

public class ActeursCession   {
  @JsonProperty("acteurCession")
  @Valid
  private List<ActeurCession> acteurCession = null;

  public ActeursCession acteurCession(List<ActeurCession> acteurCession) {
    this.acteurCession = acteurCession;
    return this;
  }

  public ActeursCession addActeurCessionItem(ActeurCession acteurCessionItem) {
    if (this.acteurCession == null) {
      this.acteurCession = new ArrayList<>();
    }
    this.acteurCession.add(acteurCessionItem);
    return this;
  }

  /**
   * 
   * @return acteurCession
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ActeurCession> getActeurCession() {
    return acteurCession;
  }

  public void setActeurCession(List<ActeurCession> acteurCession) {
    this.acteurCession = acteurCession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActeursCession acteursCession = (ActeursCession) o;
    return Objects.equals(this.acteurCession, acteursCession.acteurCession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acteurCession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActeursCession {\n");
    
    sb.append("    acteurCession: ").append(toIndentedString(acteurCession)).append("\n");
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

