package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address3;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction2;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Executive2
 */

public class Executive2   {
  @JsonProperty("exec_id")
  private Integer execId;

  @JsonProperty("civilite")
  private String civilite;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("type")
  private String type;

  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("fonction")
  private ExecutiveFonction2 fonction;

  @JsonProperty("address")
  private Address3 address;

  @JsonProperty("birthday")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate birthday;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("en_poste")
  private Integer enPoste;

  @JsonProperty("mouvement")
  private ExecutiveMouvement mouvement;

  @JsonProperty("nbMandatsActifs")
  private Integer nbMandatsActifs;

  @JsonProperty("scoreMoyen")
  private Float scoreMoyen;

  @JsonProperty("nbMandatsInactifs")
  private Integer nbMandatsInactifs;

  @JsonProperty("nbProcols")
  private Integer nbProcols;

  @JsonProperty("birthPlace")
  private Address3 birthPlace;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("nationalityCode")
  private String nationalityCode;

  public Executive2 execId(Integer execId) {
    this.execId = execId;
    return this;
  }

  /**
   * Executive Identifier
   * @return execId
  */
  @ApiModelProperty(example = "1", value = "Executive Identifier")


  public Integer getExecId() {
    return execId;
  }

  public void setExecId(Integer execId) {
    this.execId = execId;
  }

  public Executive2 civilite(String civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Executive title
   * @return civilite
  */
  @ApiModelProperty(example = "M", value = "Executive title")


  public String getCivilite() {
    return civilite;
  }

  public void setCivilite(String civilite) {
    this.civilite = civilite;
  }

  public Executive2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Executive Lastname
   * @return name
  */
  @ApiModelProperty(example = "Doe", value = "Executive Lastname")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Executive2 firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Executive Firstname
   * @return firstname
  */
  @ApiModelProperty(example = "Jane", value = "Executive Firstname")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Executive2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Executive type can be 'person', 'company' or 'family' (equivalent to person)
   * @return type
  */
  @ApiModelProperty(example = "person", value = "Executive type can be 'person', 'company' or 'family' (equivalent to person)")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Executive2 maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  /**
   * Executive maiden name if available
   * @return maidenName
  */
  @ApiModelProperty(example = "Smith", value = "Executive maiden name if available")


  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public Executive2 siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company Identifier if Executive is also a company, only available in France
   * @return siren
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier if Executive is also a company, only available in France")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public Executive2 fonction(ExecutiveFonction2 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction2 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction2 fonction) {
    this.fonction = fonction;
  }

  public Executive2 address(Address3 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address3 getAddress() {
    return address;
  }

  public void setAddress(Address3 address) {
    this.address = address;
  }

  public Executive2 birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Executive birthday, only available for a person
   * @return birthday
  */
  @ApiModelProperty(value = "Executive birthday, only available for a person")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Executive2 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Executive email address
   * @return email
  */
  @ApiModelProperty(example = "mail@example.com", value = "Executive email address")

@javax.validation.constraints.Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Executive2 phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Executive phone number
   * @return phone
  */
  @ApiModelProperty(example = "+33658452114", value = "Executive phone number")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Executive2 enPoste(Integer enPoste) {
    this.enPoste = enPoste;
    return this;
  }

  /**
   * Is the Executive is actually active
   * @return enPoste
  */
  @ApiModelProperty(example = "1", value = "Is the Executive is actually active")


  public Integer getEnPoste() {
    return enPoste;
  }

  public void setEnPoste(Integer enPoste) {
    this.enPoste = enPoste;
  }

  public Executive2 mouvement(ExecutiveMouvement mouvement) {
    this.mouvement = mouvement;
    return this;
  }

  /**
   * Get mouvement
   * @return mouvement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement getMouvement() {
    return mouvement;
  }

  public void setMouvement(ExecutiveMouvement mouvement) {
    this.mouvement = mouvement;
  }

  public Executive2 nbMandatsActifs(Integer nbMandatsActifs) {
    this.nbMandatsActifs = nbMandatsActifs;
    return this;
  }

  /**
   * Number of company in which executive has an active assignment
   * @return nbMandatsActifs
  */
  @ApiModelProperty(example = "3", value = "Number of company in which executive has an active assignment")


  public Integer getNbMandatsActifs() {
    return nbMandatsActifs;
  }

  public void setNbMandatsActifs(Integer nbMandatsActifs) {
    this.nbMandatsActifs = nbMandatsActifs;
  }

  public Executive2 scoreMoyen(Float scoreMoyen) {
    this.scoreMoyen = scoreMoyen;
    return this;
  }

  /**
   * Average company score in which executive has an active assignment
   * @return scoreMoyen
  */
  @ApiModelProperty(example = "12.4", value = "Average company score in which executive has an active assignment")


  public Float getScoreMoyen() {
    return scoreMoyen;
  }

  public void setScoreMoyen(Float scoreMoyen) {
    this.scoreMoyen = scoreMoyen;
  }

  public Executive2 nbMandatsInactifs(Integer nbMandatsInactifs) {
    this.nbMandatsInactifs = nbMandatsInactifs;
    return this;
  }

  /**
   * Number of company in which executive has an inactive assignment
   * @return nbMandatsInactifs
  */
  @ApiModelProperty(example = "2", value = "Number of company in which executive has an inactive assignment")


  public Integer getNbMandatsInactifs() {
    return nbMandatsInactifs;
  }

  public void setNbMandatsInactifs(Integer nbMandatsInactifs) {
    this.nbMandatsInactifs = nbMandatsInactifs;
  }

  public Executive2 nbProcols(Integer nbProcols) {
    this.nbProcols = nbProcols;
    return this;
  }

  /**
   * Number of event with an impact on company
   * @return nbProcols
  */
  @ApiModelProperty(example = "1", value = "Number of event with an impact on company")


  public Integer getNbProcols() {
    return nbProcols;
  }

  public void setNbProcols(Integer nbProcols) {
    this.nbProcols = nbProcols;
  }

  public Executive2 birthPlace(Address3 birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

  /**
   * Get birthPlace
   * @return birthPlace
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address3 getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(Address3 birthPlace) {
    this.birthPlace = birthPlace;
  }

  public Executive2 nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Executive nationality
   * @return nationality
  */
  @ApiModelProperty(example = "France", value = "Executive nationality")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Executive2 nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

  /**
   * Executive nationality code (ISO 3166-2)
   * @return nationalityCode
  */
  @ApiModelProperty(example = "FR", value = "Executive nationality code (ISO 3166-2)")


  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executive2 executive2 = (Executive2) o;
    return Objects.equals(this.execId, executive2.execId) &&
        Objects.equals(this.civilite, executive2.civilite) &&
        Objects.equals(this.name, executive2.name) &&
        Objects.equals(this.firstname, executive2.firstname) &&
        Objects.equals(this.type, executive2.type) &&
        Objects.equals(this.maidenName, executive2.maidenName) &&
        Objects.equals(this.siren, executive2.siren) &&
        Objects.equals(this.fonction, executive2.fonction) &&
        Objects.equals(this.address, executive2.address) &&
        Objects.equals(this.birthday, executive2.birthday) &&
        Objects.equals(this.email, executive2.email) &&
        Objects.equals(this.phone, executive2.phone) &&
        Objects.equals(this.enPoste, executive2.enPoste) &&
        Objects.equals(this.mouvement, executive2.mouvement) &&
        Objects.equals(this.nbMandatsActifs, executive2.nbMandatsActifs) &&
        Objects.equals(this.scoreMoyen, executive2.scoreMoyen) &&
        Objects.equals(this.nbMandatsInactifs, executive2.nbMandatsInactifs) &&
        Objects.equals(this.nbProcols, executive2.nbProcols) &&
        Objects.equals(this.birthPlace, executive2.birthPlace) &&
        Objects.equals(this.nationality, executive2.nationality) &&
        Objects.equals(this.nationalityCode, executive2.nationalityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execId, civilite, name, firstname, type, maidenName, siren, fonction, address, birthday, email, phone, enPoste, mouvement, nbMandatsActifs, scoreMoyen, nbMandatsInactifs, nbProcols, birthPlace, nationality, nationalityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executive2 {\n");
    
    sb.append("    execId: ").append(toIndentedString(execId)).append("\n");
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    fonction: ").append(toIndentedString(fonction)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    enPoste: ").append(toIndentedString(enPoste)).append("\n");
    sb.append("    mouvement: ").append(toIndentedString(mouvement)).append("\n");
    sb.append("    nbMandatsActifs: ").append(toIndentedString(nbMandatsActifs)).append("\n");
    sb.append("    scoreMoyen: ").append(toIndentedString(scoreMoyen)).append("\n");
    sb.append("    nbMandatsInactifs: ").append(toIndentedString(nbMandatsInactifs)).append("\n");
    sb.append("    nbProcols: ").append(toIndentedString(nbProcols)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
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

