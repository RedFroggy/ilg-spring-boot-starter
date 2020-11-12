package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.GroupMemberProjection4;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * GroupMember
 */
@JsonDeserialize(builder = GroupMember.GroupMemberBuilder.class)
public class GroupMember implements GroupMemberProjection4 {
    private final Integer parentId;

    private final String nodePath;

    private final Integer entityId;

    private final String entityName;

    private final String registrationNumber;

    private final String countryCodeIso3;

    private final String countryCode;

    private final String country;

    private final Integer score;

    private final Group group;

    private final BigDecimal share;

    private final String type;

    private final String methodUsed;

    private final String qualite;

    private final Integer distance;

    private final Address address;

    private final ExecutiveFonction fonction;

    private final LocalDate birthday;

    private final String birthCity;

    private final String birthCountry;

    private final String birthCountryCode;

    private final String nationality;

    private final String nationalityCode;

    private final String name;

    private final String firstname;

    private final String maidenName;

    private final String title;

    private final String minDate;

    private final String maxDate;

    private final GroupInfo frenchPrivateGroupHead;

    public GroupMember(GroupMemberBuilder builder) {
        this.parentId = builder.parentId;
        this.nodePath = builder.nodePath;
        this.entityId = builder.entityId;
        this.entityName = builder.entityName;
        this.registrationNumber = builder.registrationNumber;
        this.countryCode = builder.countryCode;
        this.country = builder.country;
        this.share = builder.share;
        this.type = builder.type;
        this.methodUsed = builder.methodUsed;
        this.qualite = builder.qualite;
        this.distance = builder.distance;
        this.address = builder.address;
        this.fonction = builder.fonction;
        this.birthday = builder.birthday;
        this.birthCity = builder.birthCity;
        this.birthCountry = builder.birthCountry;
        this.birthCountryCode = builder.birthCountryCode;
        this.nationality = builder.nationality;
        this.nationalityCode = builder.nationalityCode;
        this.name = builder.name;
        this.firstname = builder.firstname;
        this.maidenName = builder.maidenName;
        this.title = builder.title;
        this.countryCodeIso3 = builder.countryCodeIso3;
        this.score = builder.score;
        this.group = builder.group;
        this.frenchPrivateGroupHead = builder.frenchPrivateGroupHead;
        this.minDate = builder.minDate;
        this.maxDate = builder.maxDate;
    }

    public static GroupMemberBuilder builder() {
        return new GroupMemberBuilder();
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getNodePath() {
        return nodePath;
    }

    public String getCountryCodeIso3() {
        return countryCodeIso3;
    }

    public Group getGroup() {
        return group;
    }

    public GroupInfo getFrenchPrivateGroupHead() {
        return frenchPrivateGroupHead;
    }

    /**
     * Member ID
     *
     * @return entityId
     */
    @ApiModelProperty(example = "0", value = "Member ID")
    public Integer getEntityId() {
        return entityId;
    }

    /**
     * Member name
     *
     * @return entityName
     */
    @ApiModelProperty(example = "BAZIN Sébastien", value = "Member name")
    public String getEntityName() {
        return entityName;
    }

    /**
     * Member registration number
     *
     * @return registrationNumber
     */
    @ApiModelProperty(example = "503207896", value = "Member registration number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Country code in ISO 3166-2
     *
     * @return countryCode
     */
    @ApiModelProperty(example = "FR", value = "Country code in ISO 3166-2")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country label
     *
     * @return country
     */
    @ApiModelProperty(example = "France", value = "Country label")
    public String getCountry() {
        return country;
    }

    /**
     * Member score
     *
     * @return score
     */
    @ApiModelProperty(example = "12", value = "Member score")
    public Integer getScore() {
        return score;
    }

    /**
     * Share percentage
     *
     * @return share
     */
    @ApiModelProperty(example = "15.0", value = "Share percentage")
    public BigDecimal getShare() {
        return share;
    }

    /**
     * Member type
     *
     * @return type
     */
    @ApiModelProperty(example = "person", value = "Member type")
    public String getType() {
        return type;
    }

    /**
     * Method used in UBO seek
     *
     * @return methodUsed
     */
    @ApiModelProperty(example = "legal representative", value = "Method used in UBO seek")
    public String getMethodUsed() {
        return methodUsed;
    }

    /**
     * qualité de l'ubo
     *
     * @return qualite
     */
    @ApiModelProperty(example = "Représentant Légal / Actionnaire", value = "qualité de l'ubo")
    public String getQualite() {
        return qualite;
    }

    /**
     * Distance between company and UBO
     *
     * @return distance
     */
    @ApiModelProperty(example = "0", value = "Distance between company and UBO")
    public Integer getDistance() {
        return distance;
    }

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    public Address getAddress() {
        return address;
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
     * UBO birthday if available
     *
     * @return birthday
     */
    @ApiModelProperty(value = "UBO birthday if available")
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * UBO birth city if available
     *
     * @return birthCity
     */
    @ApiModelProperty(example = "PARIS", value = "UBO birth city if available")
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * UBO birth country if available
     *
     * @return birthCountry
     */
    @ApiModelProperty(example = "France", value = "UBO birth country if available")
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * UBO birth country code (ISO 3166-2) if available
     *
     * @return birthCountryCode
     */
    @ApiModelProperty(example = "FR", value = "UBO birth country code (ISO 3166-2) if available")
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * Executive nationality
     *
     * @return nationality
     */
    @ApiModelProperty(example = "France", value = "Executive nationality")
    public String getNationality() {
        return nationality;
    }

    /**
     * Executive country code (ISO 3166-2)
     *
     * @return nationalityCode
     */
    @ApiModelProperty(example = "FR", value = "Executive country code (ISO 3166-2)")
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Member name
     *
     * @return name
     */
    @ApiModelProperty(example = "BAZIN", value = "Member name")
    public String getName() {
        return name;
    }

    /**
     * Member firstname
     *
     * @return firstname
     */
    @ApiModelProperty(example = "Sébastien", value = "Member firstname")
    public String getFirstname() {
        return firstname;
    }

    /**
     * Member maidenname
     *
     * @return maidenName
     */
    @ApiModelProperty(example = "BAZIN", value = "Member maidenname")
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Member title
     *
     * @return title
     */
    @ApiModelProperty(example = "M / Mme", value = "Member title")
    public String getTitle() {
        return title;
    }

    /**
     * Oldest information date
     *
     * @return minDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Oldest information date")
    public String getMinDate() {
        return minDate;
    }

    /**
     * Most recent information date
     *
     * @return maxDate
     */
    @ApiModelProperty(example = "1970-01-01", value = "Most recent information date")
    public String getMaxDate() {
        return maxDate;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link", "group"})
    public static final class GroupMemberBuilder {
        private Integer parentId;
        private String nodePath;
        private Integer entityId;
        private String entityName;
        private String registrationNumber;
        private String countryCodeIso3;
        private String countryCode;
        private String country;
        private Integer score;
        private Group group;
        private BigDecimal share;
        private String type;
        private String methodUsed;
        private String qualite;
        private Integer distance;
        private Address address;
        private ExecutiveFonction fonction;
        private LocalDate birthday;
        private String birthCity;
        private String birthCountry;
        private String birthCountryCode;
        private String nationality;
        private String nationalityCode;
        private String name;
        private String firstname;
        private String maidenName;
        private String title;
        private GroupInfo frenchPrivateGroupHead;
        private String minDate;
        private String maxDate;

        private GroupMemberBuilder() {
        }

        public GroupMemberBuilder parentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }

        public GroupMemberBuilder nodePath(String nodePath) {
            this.nodePath = nodePath;
            return this;
        }

        public GroupMemberBuilder entityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }

        public GroupMemberBuilder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        public GroupMemberBuilder registrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public GroupMemberBuilder countryCodeIso3(String countryCodeIso3) {
            this.countryCodeIso3 = countryCodeIso3;
            return this;
        }

        public GroupMemberBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public GroupMemberBuilder country(String country) {
            this.country = country;
            return this;
        }

        public GroupMemberBuilder score(Integer score) {
            this.score = score;
            return this;
        }

        public GroupMemberBuilder group(Group group) {
            this.group = group;
            return this;
        }

        public GroupMemberBuilder share(BigDecimal share) {
            this.share = share;
            return this;
        }

        public GroupMemberBuilder type(String type) {
            this.type = type;
            return this;
        }

        public GroupMemberBuilder methodUsed(String methodUsed) {
            this.methodUsed = methodUsed;
            return this;
        }

        public GroupMemberBuilder qualite(String qualite) {
            this.qualite = qualite;
            return this;
        }

        public GroupMemberBuilder distance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public GroupMemberBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public GroupMemberBuilder fonction(ExecutiveFonction fonction) {
            this.fonction = fonction;
            return this;
        }

        public GroupMemberBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public GroupMemberBuilder birthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public GroupMemberBuilder birthCountry(String birthCountry) {
            this.birthCountry = birthCountry;
            return this;
        }

        public GroupMemberBuilder birthCountryCode(String birthCountryCode) {
            this.birthCountryCode = birthCountryCode;
            return this;
        }

        public GroupMemberBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public GroupMemberBuilder nationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }

        public GroupMemberBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupMemberBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public GroupMemberBuilder maidenName(String maidenName) {
            this.maidenName = maidenName;
            return this;
        }

        public GroupMemberBuilder title(String title) {
            this.title = title;
            return this;
        }

        public GroupMemberBuilder frenchPrivateGroupHead(GroupInfo frenchPrivateGroupHead) {
            this.frenchPrivateGroupHead = frenchPrivateGroupHead;
            return this;
        }

        public GroupMemberBuilder minDate(String minDate) {
            this.minDate = minDate;
            return this;
        }

        public GroupMemberBuilder maxDate(String maxDate) {
            this.maxDate = maxDate;
            return this;
        }

        public GroupMember build() {
            return new GroupMember(this);
        }
    }
}
