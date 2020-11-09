package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject14
 */

public class InlineObject14   {
  @JsonProperty("siren")
  @Valid
  private List<String> siren = null;

  public InlineObject14 siren(List<String> siren) {
    this.siren = siren;
    return this;
  }

  public InlineObject14 addSirenItem(String sirenItem) {
    if (this.siren == null) {
      this.siren = new ArrayList<>();
    }
    this.siren.add(sirenItem);
    return this;
  }

  /**
   * Get siren
   * @return siren
  */
  @ApiModelProperty(value = "")


  public List<String> getSiren() {
    return siren;
  }

  public void setSiren(List<String> siren) {
    this.siren = siren;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject14 inlineObject14 = (InlineObject14) o;
    return Objects.equals(this.siren, inlineObject14.siren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject14 {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
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

