package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

/**
 * LegalDepositList
 */
@JsonIgnoreProperties(value = {"@id"})
public class LegalDepositList {

  private final List<LegalDeposit> list;

  public LegalDepositList(@JsonProperty("list") List<LegalDeposit> list) {
    this.list = list;
  }

  /**
   * list of document
   * @return list
  */
  @ApiModelProperty(value = "list of document")
  @Valid
  public List<LegalDeposit> getList() {
    return list;
  }

}

