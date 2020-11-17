package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

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
        return Arrays.stream(TypeEtablissement.values())
                .filter(type -> type.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
