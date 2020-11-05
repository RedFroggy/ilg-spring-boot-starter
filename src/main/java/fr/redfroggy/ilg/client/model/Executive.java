package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Executive
 */
@JsonDeserialize(builder = Executive.ExecutiveBuilder.class)
public class Executive {
    private final Integer execId;

    private final String civilite;

    private final String name;

    private final String firstname;

    private final String type;

    private final String maidenName;

    private final String siren;

    private final ExecutiveFonction fonction;

    private final Address address;

    private final LocalDate birthday;

    private final String phone;

    private final String email;

    private final Integer enPoste;

    private final ExecutiveMouvement mouvement;

    private final Integer nbMandatsActifs;

    private final BigDecimal scoreMoyen;

    private final Integer nbMandatsInactifs;

    private final Integer nbProcols;

    private final Address birthPlace;

    private final String nationality;

    private final String nationalityCode;

    private final List<Term> terms;


    private Executive(ExecutiveBuilder builder) {
        this.execId = builder.execId;
        this.civilite = builder.civilite;
        this.name = builder.name;
        this.firstname = builder.firstname;
        this.type = builder.type;
        this.maidenName = builder.maidenName;
        this.siren = builder.siren;
        this.fonction = builder.fonction;
        this.address = builder.address;
        this.birthday = builder.birthday;
        this.email = builder.email;
        this.phone = builder.phone;
        this.enPoste = builder.enPoste;
        this.mouvement = builder.mouvement;
        this.nbMandatsActifs = builder.nbMandatsActifs;
        this.scoreMoyen = builder.scoreMoyen;
        this.nbMandatsInactifs = builder.nbMandatsInactifs;
        this.nbProcols = builder.nbProcols;
        this.birthPlace = builder.birthPlace;
        this.nationality = builder.nationality;
        this.nationalityCode = builder.nationalityCode;
        this.terms = builder.terms;
    }

    public static ExecutiveBuilder builder() {
        return new ExecutiveBuilder();
    }

    public Integer getExecId() {
        return execId;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getEnPoste() {
        return enPoste;
    }

    public ExecutiveMouvement getMouvement() {
        return mouvement;
    }

    public Integer getNbMandatsActifs() {
        return nbMandatsActifs;
    }

    public BigDecimal getScoreMoyen() {
        return scoreMoyen;
    }

    public Integer getNbMandatsInactifs() {
        return nbMandatsInactifs;
    }

    public Integer getNbProcols() {
        return nbProcols;
    }

    public Address getBirthPlace() {
        return birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Executive title
     *
     * @return civilite
     */

    @ApiModelProperty(example = "M", value = "Executive title")
    public String getCivilite() {
        return civilite;
    }

    /**
     * Executive Lastname
     *
     * @return name
     */

    @ApiModelProperty(example = "Doe", value = "Executive Lastname")
    public String getName() {
        return name;
    }

    /**
     * Executive Firstname
     *
     * @return firstname
     */

    @ApiModelProperty(example = "Jane", value = "Executive Firstname")
    public String getFirstname() {
        return firstname;
    }

    /**
     * Executive type can be 'person', 'company' or 'family' (equivalent to person)
     *
     * @return type
     */

    @ApiModelProperty(example = "person", value = "Executive type can be 'person', 'company' or 'family' (equivalent " +
            "to person)")
    public String getType() {
        return type;
    }

    /**
     * Executive maiden name if available
     *
     * @return maidenName
     */

    @ApiModelProperty(example = "Smith", value = "Executive maiden name if available")
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Company Identifier if Executive is also a company, only available in France
     *
     * @return siren
     */

    @ApiModelProperty(example = "0123456789", value = "Company Identifier if Executive is also a company, only " +
            "available in France")
    public String getSiren() {
        return siren;
    }

    /**
     * Get fonction
     *
     * @return fonction
     */

    @ApiModelProperty(value = "")
    public ExecutiveFonction getFonction() {
        return fonction;
    }

    /**
     * List of terms
     *
     * @return terms
     */

    @ApiModelProperty(value = "List of terms")
    @Valid
    public List<? extends Term> getTerms() {
        return terms;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class ExecutiveBuilder {
        private Integer execId;
        private String civilite;
        private String name;
        private String firstname;
        private String type;
        private String maidenName;
        private String siren;
        private ExecutiveFonction fonction;
        private Address address;
        private LocalDate birthday;
        private String email;
        private String phone;
        private Integer enPoste;
        private ExecutiveMouvement mouvement;
        private Integer nbMandatsActifs;
        private BigDecimal scoreMoyen;
        private Integer nbMandatsInactifs;
        private Integer nbProcols;
        private Address birthPlace;
        private String nationality;
        private String nationalityCode;
        private List<Term> terms;

        private ExecutiveBuilder() {
        }

        @JsonProperty("exec_id")
        public ExecutiveBuilder execId(Integer execId) {
            this.execId = execId;
            return this;
        }

        public ExecutiveBuilder civilite(String civilite) {
            this.civilite = civilite;
            return this;
        }

        public ExecutiveBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ExecutiveBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public ExecutiveBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ExecutiveBuilder maidenName(String maidenName) {
            this.maidenName = maidenName;
            return this;
        }

        public ExecutiveBuilder siren(String siren) {
            this.siren = siren;
            return this;
        }

        public ExecutiveBuilder fonction(ExecutiveFonction fonction) {
            this.fonction = fonction;
            return this;
        }

        public ExecutiveBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public ExecutiveBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        @JsonProperty("birthday")
        public ExecutiveBuilder birthday(String birthday) {
            if (ObjectUtils.isEmpty(birthday)) {
                this.birthday = null;
                return this;
            }
            this.birthday = LocalDate.parse(birthday.substring(0, 10));
            return this;
        }

        public ExecutiveBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ExecutiveBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        @JsonProperty("en_poste")
        public ExecutiveBuilder enPoste(Integer enPoste) {
            this.enPoste = enPoste;
            return this;
        }

        public ExecutiveBuilder mouvement(ExecutiveMouvement mouvement) {
            this.mouvement = mouvement;
            return this;
        }

        public ExecutiveBuilder nbMandatsActifs(Integer nbMandatsActifs) {
            this.nbMandatsActifs = nbMandatsActifs;
            return this;
        }

        public ExecutiveBuilder scoreMoyen(BigDecimal scoreMoyen) {
            this.scoreMoyen = scoreMoyen;
            return this;
        }

        public ExecutiveBuilder nbMandatsInactifs(Integer nbMandatsInactifs) {
            this.nbMandatsInactifs = nbMandatsInactifs;
            return this;
        }

        public ExecutiveBuilder nbProcols(Integer nbProcols) {
            this.nbProcols = nbProcols;
            return this;
        }

        public ExecutiveBuilder birthPlace(Address birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }

        public ExecutiveBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public ExecutiveBuilder nationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }

        public ExecutiveBuilder terms(List<Term> terms) {
            this.terms = terms;
            return this;
        }

        public Executive build() {
            return new Executive(this);
        }
    }
}

