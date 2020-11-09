package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Identity5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company5
 */

public class Company5   {
  @JsonProperty("identity")
  private Identity5 identity;

  public Company5 identity(Identity5 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identity5 getIdentity() {
    return identity;
  }

  public void setIdentity(Identity5 identity) {
    this.identity = identity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company5 company5 = (Company5) o;
    return Objects.equals(this.identity, company5.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company5 {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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

