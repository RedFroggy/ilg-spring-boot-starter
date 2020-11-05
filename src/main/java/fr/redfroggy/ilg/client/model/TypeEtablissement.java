package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

/**
 * Type of Site
 */
public enum TypeEtablissement {
    NON_SPECIFIE("Non spécifié"),

    SIEGE_SOCIAL("Siège social"),

    PRINCIPAL("Principal"),

    SECONDAIRE("Secondaire"),

    DOMICILE("Domicile");

    private final String value;

    TypeEtablissement(String value) {
        this.value = value;
    }

    @JsonCreator
    public static TypeEtablissement fromValue(String value) {
        try {
            return TypeEtablissement.valueOf(value.toUpperCase(Locale.US));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
