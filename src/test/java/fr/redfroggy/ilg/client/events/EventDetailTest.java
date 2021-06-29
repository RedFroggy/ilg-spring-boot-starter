package fr.redfroggy.ilg.client.events;


import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;

public class EventDetailTest {

    @Test
    public void shouldGetEventDetailFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(ilg503207896EventDetailJson(),
                ilg503207896EventDetail(), EventDetail.class, EventDetailProjection.class);
    }

    public static String ilg503207896EventDetailJson() {
        return UnitTestUtils.getJsonFromContractFile("/events/FR-503207896-eventDetail.json");
    }

    public static EventDetail ilg503207896EventDetail() {
        return EventDetail.builder()
                .annonceInfo(buildAnnonceInfo())
                .personnes(buildPersonnes())
                .evenements(new Evenements(Collections.singletonList(Evenement.builder()
                        .codeEvenement(6365)
                        .labelEvenement("Cotation Banque de France : 3")
                        .codeEvenementInsee("SU")
                        .dateDecision(LocalDate.of(2020, Month.OCTOBER, 8))
                        .build())))
                .acteursCession(new ActeursCession(Collections.emptyList()))
                .acteursContentieux(buildActeursContentieux())
                .etablissementsCession(new EtablissementsCession(Collections.emptyList()))
                .actes(null)
                .build();

    }

    public static EventDetail ilg503207896EventDetailIntTest() {
        return EventDetail.builder()
                .annonceInfo(buildAnnonceInfo())
                .personnes(buildPersonnes())
                .evenements(new Evenements(Collections.singletonList(Evenement.builder()
                        .codeEvenement(6365)
                        .labelEvenement("Cotation Banque de France : 3")
                        .dateDecision(null)
                        .build())))
                .acteursCession(new ActeursCession(Collections.emptyList()))
                .acteursContentieux(buildActeursContentieux())
                .etablissementsCession(new EtablissementsCession(Collections.emptyList()))
                .actes(null)
                .build();

    }

    public static AnnonceInfo buildAnnonceInfo() {
        return AnnonceInfo.builder()
                .adID("6000574496")
                .origine("Infolegale Registre des Paiements et des Contentieux")
                .dateParution(LocalDate.of(2020, Month.OCTOBER, 8))
                .texte("Le 08/10/2020. Nature : Cotation Banque de France : 3. Sollicitées : INFOLEGALE (siren : " +
                        "503207896). La capacité de l’entreprise à honorer ses engagements financiers est jugée forte" +
                        " par la Banque de France.\nLa situation financière est satisfaisante et la capacité de " +
                        "résistance de l’entreprise aux évolutions défavorables de son environnement ou à la " +
                        "survenance d’événements particuliers est élevée.")
                .build();
    }

    public static ActeursContentieux buildActeursContentieux() {
        IdentiteActeur identite = IdentiteActeur.builder()
                .nom("INFOLEGALE")
                .nic("00021")
                .siret("50320789600021")
                .siren("503207896")
                .enseigne("INFOLEGALE ET MARKETING")
                .codeFormeJuridique("5710")
                .labelFormeJuridique("Société par actions simplifiée (SAS)")
                .capital(BigDecimal.valueOf(758846).setScale(2))
                .adresse(Adresse.builder()
                    .rue("20 BD EUGENE DERUELLE")
                    .codePostal("69003")
                    .ville("LYON 3EME")
                    .departement("69")
                    .labelPays("FRANCE")
                    .build())
                .build();

        Role typeActeur = new Role("DF", "Sollicité");

        return new ActeursContentieux(Collections.singletonList(new ActeurContentieux(identite, typeActeur, null)));
    }

    public static Personnes buildPersonnes() {
        Etablissement etablissement = Etablissement.builder()
                .typeEtablissement(TypeEtablissement.SIEGE_SOCIAL)
                .enseigne("INFOLEGALE ET MARKETING")
                .naf("8291Z")
                .adresse(Adresse.builder()
                        .rue("20 BD EUGENE DERUELLE")
                        .codePostal("69003")
                        .ville("LYON 3EME")
                        .departement("69")
                        .labelPays("FRANCE")
                        .adresseTexte("20 BD EUGENE DERUELLE 69003 LYON 3EME")
                        .build())
                .build();

        Identite identite = Identite.builder()
                .nom("INFOLEGALE")
                .siren("503207896")
                .codeFormeJuridique("5710")
                .labelFormeJuridique("Société par actions simplifiée (SAS)")
                .capital(BigDecimal.valueOf(758846).setScale(2))
                .dateCreation(LocalDate.of(2008, Month.MARCH, 15))
                .etablissements(new Etablissements(Collections.singletonList(etablissement)))
                .build();

        return new Personnes(Collections.singletonList(new Personne(identite, null, null)));
    }
}
