package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Identity4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company4
 */

public class Company4   {
  @JsonProperty("identity")
  private Identity4 identity;

  public Company4 identity(Identity4 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identity4 getIdentity() {
    return identity;
  }

  public void setIdentity(Identity4 identity) {
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
    Company4 company4 = (Company4) o;
    return Objects.equals(this.identity, company4.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company4 {\n");
    
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

