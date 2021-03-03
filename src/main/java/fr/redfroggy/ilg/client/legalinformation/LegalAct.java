package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.model.CodeLabelPair;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

/**
 * LegalAct
 */
@JsonDeserialize(builder = LegalAct.LegalActBuilder.class)
public class LegalAct   {

  private final String id;

  private final LocalDate date;

  private final Integer number;

  private final CodeLabelPair type;

  private final Integer pages;

  private final List<LegalActDecision> decisions;

  private final Boolean downloadable;

  private final Boolean available;

  private LegalAct(LegalActBuilder builder) {
    this.id = builder.id;
    this.date = builder.date;
    this.number = builder.number;
    this.type = builder.type;
    this.pages = builder.pages;
    this.decisions = builder.decisions;
    this.downloadable = builder.downloadable;
    this.available = builder.available;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /**
   * Date of the act in deposit
   * @return date
  */
  @ApiModelProperty(value = "Date of the act in deposit")
  @Valid
  public LocalDate getDate() {
    return date;
  }

  /**
   * Number of the Act
   * @return number
  */
  @ApiModelProperty(example = "1", value = "Number of the Act")
  public Integer getNumber() {
    return number;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")
  @Valid
  public CodeLabelPair getType() {
    return type;
  }

  /**
   * Date of the act in deposit
   * @return pages
  */
  @ApiModelProperty(value = "Date of the act in deposit")
  public Integer getPages() {
    return pages;
  }

  /**
   * Decisions
   * @return decisions
  */
  @ApiModelProperty(value = "Decisions")
  @Valid
  public List<LegalActDecision> getDecisions() {
    return decisions;
  }

  /**
   * Wether the document is downloadable or not
   * @return downloadable
  */
  @ApiModelProperty(value = "Wether the document is downloadable or not")
  public Boolean getDownloadable() {
    return downloadable;
  }

  /**
   * Wether the document is available or not
   * @return available
  */
  @ApiModelProperty(value = "Wether the document is available or not")
  public Boolean getAvailable() {
    return available;
  }

  public static LegalActBuilder builder() {
    return new LegalActBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(value = {"@id", "@link"})
  public static final class LegalActBuilder {
    private String id;
    private LocalDate date;
    private Integer number;
    private CodeLabelPair type;
    private Integer pages;
    private List<LegalActDecision> decisions = null;
    private Boolean downloadable;
    private Boolean available;

    private LegalActBuilder() {
    }

    public LegalActBuilder id(String id) {
      this.id = id;
      return this;
    }

    public LegalActBuilder date(LocalDate date) {
      this.date = date;
      return this;
    }

    public LegalActBuilder number(Integer number) {
      this.number = number;
      return this;
    }

    public LegalActBuilder type(CodeLabelPair type) {
      this.type = type;
      return this;
    }

    public LegalActBuilder pages(Integer pages) {
      this.pages = pages;
      return this;
    }

    public LegalActBuilder decisions(List<LegalActDecision> decisions) {
      this.decisions = decisions;
      return this;
    }

    public LegalActBuilder downloadable(Boolean downloadable) {
      this.downloadable = downloadable;
      return this;
    }

    public LegalActBuilder available(Boolean available) {
      this.available = available;
      return this;
    }

    public LegalAct build() {
      return new LegalAct(this);
    }
  }
}

