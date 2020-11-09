package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

/**
 * EventDetail
 */
@JsonDeserialize(builder = EventDetail.EventDetailBuilder.class)
public class EventDetail {

    private final AnnonceInfo annonceInfo;

    private final Personnes personnes;

    private final Evenements evenements;

    private final ActeursCession acteursCession;

    private final ActeursContentieux acteursContentieux;

    private final EtablissementsCession etablissementsCession;

    private final Actes actes;

    private EventDetail(EventDetailBuilder builder) {
        this.annonceInfo = builder.annonceInfo;
        this.personnes = builder.personnes;
        this.evenements = builder.evenements;
        this.acteursCession = builder.acteursCession;
        this.acteursContentieux = builder.acteursContentieux;
        this.etablissementsCession = builder.etablissementsCession;
        this.actes = builder.actes;
    }

    public static EventDetailBuilder builder() {
        return new EventDetailBuilder();
    }

    /**
     * Get annonceInfo
     *
     * @return annonceInfo
     */
    @ApiModelProperty(value = "")
    public AnnonceInfo getAnnonceInfo() {
        return annonceInfo;
    }

    public Personnes getPersonnes() {
        return personnes;
    }

    public Evenements getEvenements() {
        return evenements;
    }

    public ActeursCession getActeursCession() {
        return acteursCession;
    }

    public ActeursContentieux getActeursContentieux() {
        return acteursContentieux;
    }

    public EtablissementsCession getEtablissementsCession() {
        return etablissementsCession;
    }

    public Actes getActes() {
        return actes;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class EventDetailBuilder {
        private AnnonceInfo annonceInfo;
        private Personnes personnes;
        private Evenements evenements;
        private ActeursCession acteursCession;
        private ActeursContentieux acteursContentieux;
        private EtablissementsCession etablissementsCession;
        private Actes actes;

        private EventDetailBuilder() {
        }

        public static EventDetailBuilder anEventDetail() {
            return new EventDetailBuilder();
        }

        public EventDetailBuilder annonceInfo(AnnonceInfo annonceInfo) {
            this.annonceInfo = annonceInfo;
            return this;
        }

        public EventDetailBuilder personnes(Personnes personnes) {
            this.personnes = personnes;
            return this;
        }

        public EventDetailBuilder evenements(Evenements evenements) {
            this.evenements = evenements;
            return this;
        }

        public EventDetailBuilder acteursCession(ActeursCession acteursCession) {
            this.acteursCession = acteursCession;
            return this;
        }

        public EventDetailBuilder acteursContentieux(ActeursContentieux acteursContentieux) {
            this.acteursContentieux = acteursContentieux;
            return this;
        }

        public EventDetailBuilder etablissementsCession(EtablissementsCession etablissementsCession) {
            this.etablissementsCession = etablissementsCession;
            return this;
        }

        public EventDetailBuilder actes(Actes actes) {
            this.actes = actes;
            return this;
        }

        public EventDetail build() {
            return new EventDetail(this);
        }
    }
}

