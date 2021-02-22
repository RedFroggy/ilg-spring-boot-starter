package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.TermProjection2;
import fr.redfroggy.ilg.client.executive.TermProjection;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * Term
 */

@JsonDeserialize(builder = Term.TermBuilder.class)
public class Term implements TermProjection, TermProjection2 {

    private final String id;

    private final Integer siren;

    private final ExecutiveFonction fonction;

    private final ExecutiveMouvement startCode;

    private final LocalDate startDate;

    private final ExecutiveMouvement endCode;

    private final LocalDate endDate;

    private final ExecutiveMouvement lastMovementCode;

    private final LocalDate lastMovementDate;

    private final Integer principal;

    private Term(TermBuilder builder) {
        this.id = builder.id;
        this.siren = builder.siren;
        this.fonction = builder.fonction;
        this.startCode = builder.startCode;
        this.startDate = builder.startDate;
        this.endCode = builder.endCode;
        this.endDate = builder.endDate;
        this.lastMovementCode = builder.lastMovementCode;
        this.lastMovementDate = builder.lastMovementDate;
        this.principal = builder.principal;
    }

    public static TermBuilder builder() {
        return new TermBuilder();
    }

    /**
     * identifier of term
     *
     * @return id
     */
    @ApiModelProperty(example = "1", value = "identifier of term")
    public String getId() {
        return id;
    }

    /**
     * identifier of a company
     *
     * @return siren
     */
    @ApiModelProperty(example = "503207896", value = "identifier of a company")
    public Integer getSiren() {
        return siren;
    }

    /**
     * Get fonction
     *
     * @return fonction
     */
    @ApiModelProperty(value = "")
    @Valid
    public ExecutiveFonction getFonction() {
        return fonction;
    }

    /**
     * Get startCode
     *
     * @return startCode
     */
    @ApiModelProperty(value = "")
    @Valid
    public ExecutiveMouvement getStartCode() {
        return startCode;
    }

    /**
     * Date opening the term
     *
     * @return startDate
     */
    @ApiModelProperty(value = "Date opening the term")
    @Valid
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Get endCode
     *
     * @return endCode
     */
    @ApiModelProperty(value = "")
    @Valid
    public ExecutiveMouvement getEndCode() {
        return endCode;
    }

    /**
     * Date closing the term
     *
     * @return endDate
     */
    @ApiModelProperty(value = "Date closing the term")
    @Valid
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Get lastMovementCode
     *
     * @return lastMovementCode
     */
    @ApiModelProperty(value = "")
    @Valid
    public ExecutiveMouvement getLastMovementCode() {
        return lastMovementCode;
    }

    /**
     * Last movement date during the term
     *
     * @return lastMovementDate
     */
    @ApiModelProperty(value = "Last movement date during the term")
    @Valid
    public LocalDate getLastMovementDate() {
        return lastMovementDate;
    }

    /**
     * principal
     *
     * @return principal
     */
    @ApiModelProperty(value = "principal")
    public Integer getPrincipal() {
        return principal;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class TermBuilder {
        private String id;
        private Integer siren;
        private ExecutiveFonction fonction;
        private ExecutiveMouvement startCode;
        private LocalDate startDate;
        private ExecutiveMouvement endCode;
        private LocalDate endDate;
        private ExecutiveMouvement lastMovementCode;
        private LocalDate lastMovementDate;
        private Integer principal;

        private TermBuilder() {
        }

        public TermBuilder id(String id) {
            this.id = id;
            return this;
        }

        public TermBuilder siren(Integer siren) {
            this.siren = siren;
            return this;
        }

        public TermBuilder fonction(ExecutiveFonction fonction) {
            this.fonction = fonction;
            return this;
        }

        public TermBuilder startCode(ExecutiveMouvement startCode) {
            this.startCode = startCode;
            return this;
        }

        public TermBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public TermBuilder endCode(ExecutiveMouvement endCode) {
            this.endCode = endCode;
            return this;
        }

        public TermBuilder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public TermBuilder lastMovementCode(ExecutiveMouvement lastMovementCode) {
            this.lastMovementCode = lastMovementCode;
            return this;
        }

        public TermBuilder lastMovementDate(LocalDate lastMovementDate) {
            this.lastMovementDate = lastMovementDate;
            return this;
        }

        public TermBuilder principal(Integer principal) {
            this.principal = principal;
            return this;
        }

        public Term build() {
            return new Term(this);
        }
    }
}

