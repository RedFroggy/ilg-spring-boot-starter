package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.LegalDeposit2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegalDepositList2
 */

public class LegalDepositList2   {
  @JsonProperty("list")
  @Valid
  private List<LegalDeposit2> list = null;

  public LegalDepositList2 list(List<LegalDeposit2> list) {
    this.list = list;
    return this;
  }

  public LegalDepositList2 addListItem(LegalDeposit2 listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * list of document
   * @return list
  */
  @ApiModelProperty(value = "list of document")

  @Valid

  public List<LegalDeposit2> getList() {
    return list;
  }

  public void setList(List<LegalDeposit2> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalDepositList2 legalDepositList2 = (LegalDepositList2) o;
    return Objects.equals(this.list, legalDepositList2.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalDepositList2 {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

