package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Conformity2;
import fr.redfroggy.ilg.client.openapi.model.KycUbo2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KycModel
 */

public class KycModel   {
  @JsonProperty("ubo")
  private KycUbo2 ubo;

  @JsonProperty("conformity")
  private Conformity2 conformity;

  public KycModel ubo(KycUbo2 ubo) {
    this.ubo = ubo;
    return this;
  }

  /**
   * Get ubo
   * @return ubo
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycUbo2 getUbo() {
    return ubo;
  }

  public void setUbo(KycUbo2 ubo) {
    this.ubo = ubo;
  }

  public KycModel conformity(Conformity2 conformity) {
    this.conformity = conformity;
    return this;
  }

  /**
   * Get conformity
   * @return conformity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Conformity2 getConformity() {
    return conformity;
  }

  public void setConformity(Conformity2 conformity) {
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
    KycModel kycModel = (KycModel) o;
    return Objects.equals(this.ubo, kycModel.ubo) &&
        Objects.equals(this.conformity, kycModel.conformity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ubo, conformity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycModel {\n");
    
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

