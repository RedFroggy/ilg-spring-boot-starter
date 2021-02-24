package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateAddresses;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateAnalytics2;
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
 * ScreeningCandidate2
 */

public class ScreeningCandidate2   {
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

  @JsonProperty("processedBy")
  private String processedBy;

  @JsonProperty("processedAt")
  private String processedAt;

  @JsonProperty("analytics")
  private ScreeningCandidateAnalytics2 analytics;

  @JsonProperty("processingStatus")
  private String processingStatus;

  @JsonProperty("validationStatus")
  private String validationStatus;

  @JsonProperty("source")
  private String source;

  public ScreeningCandidate2 id(String id) {
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

  public ScreeningCandidate2 siren(String siren) {
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

  public ScreeningCandidate2 individualId(String individualId) {
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

  public ScreeningCandidate2 processed(Boolean processed) {
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

  public ScreeningCandidate2 name(String name) {
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

  public ScreeningCandidate2 addresses(List<ScreeningCandidateAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ScreeningCandidate2 addAddressesItem(ScreeningCandidateAddresses addressesItem) {
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

  public ScreeningCandidate2 birthday(List<String> birthday) {
    this.birthday = birthday;
    return this;
  }

  public ScreeningCandidate2 addBirthdayItem(String birthdayItem) {
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

  public ScreeningCandidate2 fileTypes(List<String> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  public ScreeningCandidate2 addFileTypesItem(String fileTypesItem) {
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

  public ScreeningCandidate2 type(TypeEnum type) {
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

  public ScreeningCandidate2 gender(GenderEnum gender) {
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

  public ScreeningCandidate2 reasonListed(String reasonListed) {
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

  public ScreeningCandidate2 entityIDs(List<ScreeningCandidateEntityIDs> entityIDs) {
    this.entityIDs = entityIDs;
    return this;
  }

  public ScreeningCandidate2 addEntityIDsItem(ScreeningCandidateEntityIDs entityIDsItem) {
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

  public ScreeningCandidate2 score(Integer score) {
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

  public ScreeningCandidate2 generatedAt(LocalDate generatedAt) {
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

  public ScreeningCandidate2 processedBy(String processedBy) {
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

  public ScreeningCandidate2 processedAt(String processedAt) {
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

  public ScreeningCandidate2 analytics(ScreeningCandidateAnalytics2 analytics) {
    this.analytics = analytics;
    return this;
  }

  /**
   * Get analytics
   * @return analytics
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScreeningCandidateAnalytics2 getAnalytics() {
    return analytics;
  }

  public void setAnalytics(ScreeningCandidateAnalytics2 analytics) {
    this.analytics = analytics;
  }

  public ScreeningCandidate2 processingStatus(String processingStatus) {
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

  public ScreeningCandidate2 validationStatus(String validationStatus) {
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

  public ScreeningCandidate2 source(String source) {
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
    ScreeningCandidate2 screeningCandidate2 = (ScreeningCandidate2) o;
    return Objects.equals(this.id, screeningCandidate2.id) &&
        Objects.equals(this.siren, screeningCandidate2.siren) &&
        Objects.equals(this.individualId, screeningCandidate2.individualId) &&
        Objects.equals(this.processed, screeningCandidate2.processed) &&
        Objects.equals(this.name, screeningCandidate2.name) &&
        Objects.equals(this.addresses, screeningCandidate2.addresses) &&
        Objects.equals(this.birthday, screeningCandidate2.birthday) &&
        Objects.equals(this.fileTypes, screeningCandidate2.fileTypes) &&
        Objects.equals(this.type, screeningCandidate2.type) &&
        Objects.equals(this.gender, screeningCandidate2.gender) &&
        Objects.equals(this.reasonListed, screeningCandidate2.reasonListed) &&
        Objects.equals(this.entityIDs, screeningCandidate2.entityIDs) &&
        Objects.equals(this.score, screeningCandidate2.score) &&
        Objects.equals(this.generatedAt, screeningCandidate2.generatedAt) &&
        Objects.equals(this.processedBy, screeningCandidate2.processedBy) &&
        Objects.equals(this.processedAt, screeningCandidate2.processedAt) &&
        Objects.equals(this.analytics, screeningCandidate2.analytics) &&
        Objects.equals(this.processingStatus, screeningCandidate2.processingStatus) &&
        Objects.equals(this.validationStatus, screeningCandidate2.validationStatus) &&
        Objects.equals(this.source, screeningCandidate2.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siren, individualId, processed, name, addresses, birthday, fileTypes, type, gender, reasonListed, entityIDs, score, generatedAt, processedBy, processedAt, analytics, processingStatus, validationStatus, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidate2 {\n");
    
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

