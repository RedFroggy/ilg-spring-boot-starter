package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Event
 */
@JsonDeserialize(builder = Event.EventBuilder.class)
public class Event {

    private final String adId;

    private final String source;

    private final String origine;

    private final Integer eventCode;

    private final String categorie;

    private final LocalDate dateParution;

    private final LocalDate dateEffet;

    private final String role;

    private final String impact;

    private final String raisonSociale;

    private Event(EventBuilder builder) {
        this.adId = builder.adId;
        this.source = builder.source;
        this.origine = builder.origine;
        this.eventCode = builder.eventCode;
        this.categorie = builder.categorie;
        this.dateParution = builder.dateParution;
        this.dateEffet = builder.dateEffet;
        this.role = builder.role;
        this.impact = builder.impact;
        this.raisonSociale = builder.raisonSociale;
    }

    public static EventBuilder builder() {
        return new EventBuilder();
    }

    /**
     * Ad Unique Identifier
     *
     * @return adId
     */
    @ApiModelProperty(example = "1A10015", value = "Ad Unique Identifier")
    public String getAdId() {
        return adId;
    }

    /**
     * Source of the Information
     *
     * @return source
     */
    @ApiModelProperty(example = "JAL", value = "Source of the Information")
    public String getSource() {
        return source;
    }

    /**
     * Source of the Information
     *
     * @return origine
     */
    @ApiModelProperty(example = "JAL", value = "Source of the Information")
    public String getOrigine() {
        return origine;
    }

    /**
     * Event code
     *
     * @return eventCode
     */
    @ApiModelProperty(example = "1100", value = "Event code")
    public Integer getEventCode() {
        return eventCode;
    }

    /**
     * Event in human readable text
     *
     * @return categorie
     */
    @ApiModelProperty(example = "Création d'entreprise", value = "Event in human readable text")
    public String getCategorie() {
        return categorie;
    }

    /**
     * Date when the information was published
     *
     * @return dateParution
     */
    @ApiModelProperty(value = "Date when the information was published")
    public LocalDate getDateParution() {
        return dateParution;
    }

    /**
     * Date when the change has happened or will happen
     *
     * @return dateEffet
     */
    @ApiModelProperty(value = "Date when the change has happened or will happen")
    public LocalDate getDateEffet() {
        return dateEffet;
    }

    /**
     * Role of the company regarding the information
     *
     * @return role
     */
    @ApiModelProperty(value = "Role of the company regarding the information")
    public String getRole() {
        return role;
    }

    /**
     * Get impact
     *
     * @return impact
     */
    @ApiModelProperty(value = "")
    public String getImpact() {
        return impact;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class EventBuilder {

        private String adId;
        private String source;
        private String origine;
        private Integer eventCode;
        private String categorie;
        private LocalDate dateParution;
        private LocalDate dateEffet;
        private String role;
        private String impact;
        private String raisonSociale;

        private EventBuilder() {
        }

        public EventBuilder adId(String adId) {
            this.adId = adId;
            return this;
        }

        public EventBuilder source(String source) {
            this.source = source;
            return this;
        }

        public EventBuilder origine(String origine) {
            this.origine = origine;
            return this;
        }

        public EventBuilder eventCode(Integer eventCode) {
            this.eventCode = eventCode;
            return this;
        }

        public EventBuilder categorie(String categorie) {
            this.categorie = categorie;
            return this;
        }

        public EventBuilder dateParution(LocalDate dateParution) {
            this.dateParution = dateParution;
            return this;
        }

        public EventBuilder dateEffet(LocalDate dateEffet) {
            this.dateEffet = dateEffet;
            return this;
        }

        public EventBuilder role(String role) {
            this.role = role;
            return this;
        }

        public EventBuilder impact(String impact) {
            this.impact = impact;
            return this;
        }

        public EventBuilder raisonSociale(String raisonSociale) {
            this.raisonSociale = raisonSociale;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }
}

