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
 * Kyc
 */

public class Kyc   {
  @JsonProperty("ubo")
  private Object ubo;

  @JsonProperty("conformity")
  private Object conformity;

  public Kyc ubo(Object ubo) {
    this.ubo = ubo;
    return this;
  }

  /**
   * Get ubo
   * @return ubo
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getUbo() {
    return ubo;
  }

  public void setUbo(Object ubo) {
    this.ubo = ubo;
  }

  public Kyc conformity(Object conformity) {
    this.conformity = conformity;
    return this;
  }

  /**
   * Get conformity
   * @return conformity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getConformity() {
    return conformity;
  }

  public void setConformity(Object conformity) {
    this.conformity = conformity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kyc kyc = (Kyc) o;
    return Objects.equals(this.ubo, kyc.ubo) &&
        Objects.equals(this.conformity, kyc.conformity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ubo, conformity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kyc {\n");
    
    sb.append("    ubo: ").append(toIndentedString(ubo)).append("\n");
    sb.append("    conformity: ").append(toIndentedString(conformity)).append("\n");
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

