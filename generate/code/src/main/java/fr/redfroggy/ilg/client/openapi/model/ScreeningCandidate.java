package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateAddresses;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateAnalytics;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateEntityIDs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScreeningCandidate
 */

public class ScreeningCandidate   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("individualId")
  private String individualId;

  @JsonProperty("processed")
  private Boolean processed;

  @JsonProperty("name")
  private String name;

  @JsonProperty("addresses")
  @Valid
  private List<ScreeningCandidateAddresses> addresses = null;

  @JsonProperty("birthday")
  @Valid
  private List<String> birthday = null;

  @JsonProperty("fileTypes")
  @Valid
  private List<String> fileTypes = null;

  /**
   * Candidate type
   */
  public enum TypeEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    UNKNOWN("Unknown");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Candidate gender
   */
  public enum GenderEnum {
    FEMALE("Female"),
    
    MALE("Male"),
    
    UNKNOWN("Unknown");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("reasonListed")
  private String reasonListed;

  @JsonProperty("entityIDs")
  @Valid
  private List<ScreeningCandidateEntityIDs> entityIDs = null;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("generatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate generatedAt;

  @JsonProperty("raw")
  private Object raw;

  @JsonProperty("processedBy")
  private String processedBy;

  @JsonProperty("processedAt")
  private String processedAt;

  @JsonProperty("analytics")
  private ScreeningCandidateAnalytics analytics;

  @JsonProperty("processingStatus")
  private String processingStatus;

  @JsonProperty("validationStatus")
  private String validationStatus;

  @JsonProperty("source")
  private String source;

  public ScreeningCandidate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Candidate identifier
   * @return id
  */
  @ApiModelProperty(example = "WX0009125985", value = "Candidate identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScreeningCandidate siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Registration id, only defined when processed with a company
   * @return siren
  */
  @ApiModelProperty(example = "780129987", value = "Registration id, only defined when processed with a company")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public ScreeningCandidate individualId(String individualId) {
    this.individualId = individualId;
    return this;
  }

  /**
   * Registration id, only defined when processes with an individual
   * @return individualId
  */
  @ApiModelProperty(example = "55874", value = "Registration id, only defined when processes with an individual")


  public String getIndividualId() {
    return individualId;
  }

  public void setIndividualId(String individualId) {
    this.individualId = individualId;
  }

  public ScreeningCandidate processed(Boolean processed) {
    this.processed = processed;
    return this;
  }

  /**
   * Wether candidate is processed
   * @return processed
  */
  @ApiModelProperty(example = "false", value = "Wether candidate is processed")


  public Boolean getProcessed() {
    return processed;
  }

  public void setProcessed(Boolean processed) {
    this.processed = processed;
  }

  public ScreeningCandidate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Candidate name
   * @return name
  */
  @ApiModelProperty(example = "Renault S.A.S", value = "Candidate name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreeningCandidate addresses(List<ScreeningCandidateAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ScreeningCandidate addAddressesItem(ScreeningCandidateAddresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Candidate addresses
   * @return addresses
  */
  @ApiModelProperty(value = "Candidate addresses")

  @Valid

  public List<ScreeningCandidateAddresses> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<ScreeningCandidateAddresses> addresses) {
    this.addresses = addresses;
  }

  public ScreeningCandidate birthday(List<String> birthday) {
    this.birthday = birthday;
    return this;
  }

  public ScreeningCandidate addBirthdayItem(String birthdayItem) {
    if (this.birthday == null) {
      this.birthday = new ArrayList<>();
    }
    this.birthday.add(birthdayItem);
    return this;
  }

  /**
   * Candidate birthday, can be multiple because of unreliable sources
   * @return birthday
  */
  @ApiModelProperty(value = "Candidate birthday, can be multiple because of unreliable sources")


  public List<String> getBirthday() {
    return birthday;
  }

  public void setBirthday(List<String> birthday) {
    this.birthday = birthday;
  }

  public ScreeningCandidate fileTypes(List<String> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  public ScreeningCandidate addFileTypesItem(String fileTypesItem) {
    if (this.fileTypes == null) {
      this.fileTypes = new ArrayList<>();
    }
    this.fileTypes.add(fileTypesItem);
    return this;
  }

  /**
   * Candidate file types
   * @return fileTypes
  */
  @ApiModelProperty(value = "Candidate file types")


  public List<String> getFileTypes() {
    return fileTypes;
  }

  public void setFileTypes(List<String> fileTypes) {
    this.fileTypes = fileTypes;
  }

  public ScreeningCandidate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Candidate type
   * @return type
  */
  @ApiModelProperty(example = "Individual", value = "Candidate type")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScreeningCandidate gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Candidate gender
   * @return gender
  */
  @ApiModelProperty(example = "Female", value = "Candidate gender")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public ScreeningCandidate reasonListed(String reasonListed) {
    this.reasonListed = reasonListed;
    return this;
  }

  /**
   * Candidate reason listed
   * @return reasonListed
  */
  @ApiModelProperty(example = "Enforcement:Money Laundering", value = "Candidate reason listed")


  public String getReasonListed() {
    return reasonListed;
  }

  public void setReasonListed(String reasonListed) {
    this.reasonListed = reasonListed;
  }

  public ScreeningCandidate entityIDs(List<ScreeningCandidateEntityIDs> entityIDs) {
    this.entityIDs = entityIDs;
    return this;
  }

  public ScreeningCandidate addEntityIDsItem(ScreeningCandidateEntityIDs entityIDsItem) {
    if (this.entityIDs == null) {
      this.entityIDs = new ArrayList<>();
    }
    this.entityIDs.add(entityIDsItem);
    return this;
  }

  /**
   * Candidate entity IDs
   * @return entityIDs
  */
  @ApiModelProperty(value = "Candidate entity IDs")

  @Valid

  public List<ScreeningCandidateEntityIDs> getEntityIDs() {
    return entityIDs;
  }

  public void setEntityIDs(List<ScreeningCandidateEntityIDs> entityIDs) {
    this.entityIDs = entityIDs;
  }

  public ScreeningCandidate score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Candidate score relevance
   * @return score
  */
  @ApiModelProperty(example = "95", value = "Candidate score relevance")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public ScreeningCandidate generatedAt(LocalDate generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Candidate generation or updated date
   * @return generatedAt
  */
  @ApiModelProperty(value = "Candidate generation or updated date")

  @Valid

  public LocalDate getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(LocalDate generatedAt) {
    this.generatedAt = generatedAt;
  }

  public ScreeningCandidate raw(Object raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Raw values return by WorldCompliance
   * @return raw
  */
  @ApiModelProperty(value = "Raw values return by WorldCompliance")

  @Valid

  public Object getRaw() {
    return raw;
  }

  public void setRaw(Object raw) {
    this.raw = raw;
  }

  public ScreeningCandidate processedBy(String processedBy) {
    this.processedBy = processedBy;
    return this;
  }

  /**
   * Username who processed the last evaluation process
   * @return processedBy
  */
  @ApiModelProperty(example = "example@infolegale.fr", value = "Username who processed the last evaluation process")


  public String getProcessedBy() {
    return processedBy;
  }

  public void setProcessedBy(String processedBy) {
    this.processedBy = processedBy;
  }

  public ScreeningCandidate processedAt(String processedAt) {
    this.processedAt = processedAt;
    return this;
  }

  /**
   * Last processed date for the last evaluation process
   * @return processedAt
  */
  @ApiModelProperty(example = "2018-12-07 15:28:30", value = "Last processed date for the last evaluation process")


  public String getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }

  public ScreeningCandidate analytics(ScreeningCandidateAnalytics analytics) {
    this.analytics = analytics;
    return this;
  }

  /**
   * Get analytics
   * @return analytics
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScreeningCandidateAnalytics getAnalytics() {
    return analytics;
  }

  public void setAnalytics(ScreeningCandidateAnalytics analytics) {
    this.analytics = analytics;
  }

  public ScreeningCandidate processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * processing status
   * @return processingStatus
  */
  @ApiModelProperty(example = "PROCESSED / UNPROCESSED", value = "processing status")


  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public ScreeningCandidate validationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

  /**
   * Validation Status
   * @return validationStatus
  */
  @ApiModelProperty(example = "VALIDATED / UNVALIDATED / PROCESS PENDING", value = "Validation Status")


  public String getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
  }

  public ScreeningCandidate source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Data source of candidate
   * @return source
  */
  @ApiModelProperty(example = "ILG / LN", value = "Data source of candidate")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningCandidate screeningCandidate = (ScreeningCandidate) o;
    return Objects.equals(this.id, screeningCandidate.id) &&
        Objects.equals(this.siren, screeningCandidate.siren) &&
        Objects.equals(this.individualId, screeningCandidate.individualId) &&
        Objects.equals(this.processed, screeningCandidate.processed) &&
        Objects.equals(this.name, screeningCandidate.name) &&
        Objects.equals(this.addresses, screeningCandidate.addresses) &&
        Objects.equals(this.birthday, screeningCandidate.birthday) &&
        Objects.equals(this.fileTypes, screeningCandidate.fileTypes) &&
        Objects.equals(this.type, screeningCandidate.type) &&
        Objects.equals(this.gender, screeningCandidate.gender) &&
        Objects.equals(this.reasonListed, screeningCandidate.reasonListed) &&
        Objects.equals(this.entityIDs, screeningCandidate.entityIDs) &&
        Objects.equals(this.score, screeningCandidate.score) &&
        Objects.equals(this.generatedAt, screeningCandidate.generatedAt) &&
        Objects.equals(this.raw, screeningCandidate.raw) &&
        Objects.equals(this.processedBy, screeningCandidate.processedBy) &&
        Objects.equals(this.processedAt, screeningCandidate.processedAt) &&
        Objects.equals(this.analytics, screeningCandidate.analytics) &&
        Objects.equals(this.processingStatus, screeningCandidate.processingStatus) &&
        Objects.equals(this.validationStatus, screeningCandidate.validationStatus) &&
        Objects.equals(this.source, screeningCandidate.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siren, individualId, processed, name, addresses, birthday, fileTypes, type, gender, reasonListed, entityIDs, score, generatedAt, raw, processedBy, processedAt, analytics, processingStatus, validationStatus, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    individualId: ").append(toIndentedString(individualId)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    reasonListed: ").append(toIndentedString(reasonListed)).append("\n");
    sb.append("    entityIDs: ").append(toIndentedString(entityIDs)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    processedBy: ").append(toIndentedString(processedBy)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

