package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

/**
 * LegalDeposit
 */
@JsonDeserialize(builder = LegalDeposit.LegalDepositBuilder.class)
public class LegalDeposit   {

  private final Integer number;

  private final LocalDate date;

  private final List<LegalAct> acts;

  private final Boolean availability;

  private LegalDeposit(LegalDepositBuilder builder) {
    this.number = builder.number;
    this.date = builder.date;
    this.acts = builder.acts;
    this.availability = builder.availability;
  }

  /**
   * Deposit number
   * @return number
  */
  @ApiModelProperty(example = "456", value = "Deposit number")
  public Integer getNumber() {
    return number;
  }

  /**
   * where the deposit happened
   * @return date
  */
  @ApiModelProperty(value = "where the deposit happened")
  @Valid
  public LocalDate getDate() {
    return date;
  }

  /**
   * list of act composing the deposit
   * @return acts
  */
  @ApiModelProperty(value = "list of act composing the deposit")
  @Valid
  public List<LegalAct> getActs() {
    return acts;
  }

  /**
   * Available or not
   * @return availability
  */
  @ApiModelProperty(example = "true", value = "Available or not")
  public Boolean getAvailability() {
    return availability;
  }

  public static LegalDepositBuilder builder() {
    return new LegalDepositBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  public static final class LegalDepositBuilder {
    private Integer number;
    private LocalDate date;
    private List<LegalAct> acts;
    private Boolean availability;

    private LegalDepositBuilder() {
    }

    public LegalDepositBuilder number(Integer number) {
      this.number = number;
      return this;
    }

    public LegalDepositBuilder date(LocalDate date) {
      this.date = date;
      return this;
    }

    public LegalDepositBuilder acts(List<LegalAct> acts) {
      this.acts = acts;
      return this;
    }

    public LegalDepositBuilder availability(Boolean availability) {
      this.availability = availability;
      return this;
    }

    public LegalDeposit build() {
      return new LegalDeposit(this);
    }
  }
}

