package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * LegalStatus
 */
@JsonDeserialize(builder = LegalStatus.LegalStatusBuilder.class)
public class LegalStatus   {
  private final String registrationId;

  private final LocalDate date;

  private final LocalDate dateAct;

  private final Boolean availability;

  private LegalStatus(LegalStatusBuilder builder) {
    this.registrationId = builder.registrationId;
    this.date = builder.date;
    this.dateAct = builder.dateAct;
    this.availability = builder.availability;
  }

  /**
   * company identifier
   * @return registrationId
  */
  @ApiModelProperty(example = "15ED4561111", value = "company identifier")
  public String getRegistrationId() {
    return registrationId;
  }

  /**
   * Deposit date
   * @return date
  */
  @ApiModelProperty(value = "Deposit date")
  @Valid
  public LocalDate getDate() {
    return date;
  }

  /**
   * Act date
   * @return dateAct
  */
  @ApiModelProperty(value = "Act date")
  @Valid
  public LocalDate getDateAct() {
    return dateAct;
  }

  /**
   * Available or not
   * @return availability
  */
  @ApiModelProperty(example = "true", value = "Available or not")
  public Boolean getAvailability() {
    return availability;
  }


  public static LegalStatusBuilder builder() {
    return new LegalStatusBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(value = {"@id", "@link"})
  public static final class LegalStatusBuilder {
    private String registrationId;
    private LocalDate date;
    private LocalDate dateAct;
    private Boolean availability;

    private LegalStatusBuilder() {
    }


    public LegalStatusBuilder registrationId(String registrationId) {
      this.registrationId = registrationId;
      return this;
    }

    public LegalStatusBuilder date(LocalDate date) {
      this.date = date;
      return this;
    }

    public LegalStatusBuilder dateAct(LocalDate dateAct) {
      this.dateAct = dateAct;
      return this;
    }

    public LegalStatusBuilder availability(Boolean availability) {
      this.availability = availability;
      return this;
    }

    public LegalStatus build() {
      return new LegalStatus(this);
    }
  }
}

