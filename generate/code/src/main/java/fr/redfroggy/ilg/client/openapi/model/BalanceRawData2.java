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
 * BalanceRawData2
 */

public class BalanceRawData2   {
  @JsonProperty("formats")
  @Valid
  private List<String> formats = null;

  public BalanceRawData2 formats(List<String> formats) {
    this.formats = formats;
    return this;
  }

  public BalanceRawData2 addFormatsItem(String formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<>();
    }
    this.formats.add(formatsItem);
    return this;
  }

  /**
   * Base official balance forms in company country which data fill
   * @return formats
  */
  @ApiModelProperty(value = "Base official balance forms in company country which data fill")


  public List<String> getFormats() {
    return formats;
  }

  public void setFormats(List<String> formats) {
    this.formats = formats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceRawData2 balanceRawData2 = (BalanceRawData2) o;
    return Objects.equals(this.formats, balanceRawData2.formats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceRawData2 {\n");
    
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
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

