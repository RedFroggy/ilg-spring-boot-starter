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
 * InlineObject9
 */

public class InlineObject9   {
  @JsonProperty("idsItems")
  @Valid
  private List<String> idsItems = null;

  public InlineObject9 idsItems(List<String> idsItems) {
    this.idsItems = idsItems;
    return this;
  }

  public InlineObject9 addIdsItemsItem(String idsItemsItem) {
    if (this.idsItems == null) {
      this.idsItems = new ArrayList<>();
    }
    this.idsItems.add(idsItemsItem);
    return this;
  }

  /**
   * Get idsItems
   * @return idsItems
  */
  @ApiModelProperty(value = "")


  public List<String> getIdsItems() {
    return idsItems;
  }

  public void setIdsItems(List<String> idsItems) {
    this.idsItems = idsItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject9 inlineObject9 = (InlineObject9) o;
    return Objects.equals(this.idsItems, inlineObject9.idsItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idsItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject9 {\n");
    
    sb.append("    idsItems: ").append(toIndentedString(idsItems)).append("\n");
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

