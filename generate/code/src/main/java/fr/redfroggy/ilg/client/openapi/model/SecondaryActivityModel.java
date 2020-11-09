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
 * SecondaryActivityModel
 */

public class SecondaryActivityModel   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("label")
  private String label;

  public SecondaryActivityModel code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Secondary activity code
   * @return code
  */
  @ApiModelProperty(example = "4941B", value = "Secondary activity code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SecondaryActivityModel label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Secondary activity label
   * @return label
  */
  @ApiModelProperty(example = "Transports routiers de fret de proximité", value = "Secondary activity label")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryActivityModel secondaryActivityModel = (SecondaryActivityModel) o;
    return Objects.equals(this.code, secondaryActivityModel.code) &&
        Objects.equals(this.label, secondaryActivityModel.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryActivityModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

