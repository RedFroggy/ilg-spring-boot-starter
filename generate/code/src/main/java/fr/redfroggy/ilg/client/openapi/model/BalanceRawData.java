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
 * BalanceRawData
 */

public class BalanceRawData   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("confidentiality")
  private String confidentiality;

  @JsonProperty("source")
  private String source;

  @JsonProperty("formats")
  @Valid
  private List<String> formats = null;

  @JsonProperty("data")
  @Valid
  private List<String> data = null;

  public BalanceRawData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Balance Type
   * @return type
  */
  @ApiModelProperty(example = "full", value = "Balance Type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BalanceRawData confidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

  /**
   * Balance confidentiality
   * @return confidentiality
  */
  @ApiModelProperty(example = "partial", value = "Balance confidentiality")


  public String getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
  }

  public BalanceRawData source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Balance source
   * @return source
  */
  @ApiModelProperty(example = "Infolegale", value = "Balance source")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public BalanceRawData formats(List<String> formats) {
    this.formats = formats;
    return this;
  }

  public BalanceRawData addFormatsItem(String formatsItem) {
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

  public BalanceRawData data(List<String> data) {
    this.data = data;
    return this;
  }

  public BalanceRawData addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * raw values, json document representing the official balance forms in company country
   * @return data
  */
  @ApiModelProperty(value = "raw values, json document representing the official balance forms in company country")


  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceRawData balanceRawData = (BalanceRawData) o;
    return Objects.equals(this.type, balanceRawData.type) &&
        Objects.equals(this.confidentiality, balanceRawData.confidentiality) &&
        Objects.equals(this.source, balanceRawData.source) &&
        Objects.equals(this.formats, balanceRawData.formats) &&
        Objects.equals(this.data, balanceRawData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, confidentiality, source, formats, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceRawData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

