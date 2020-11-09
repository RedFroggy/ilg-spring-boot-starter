package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

/**
 * Executive title
 */
public enum Civilite {
    STE("Ste"),

    DR("Dr"),

    M("M"),

    MME("Mme"),

    MLLE("Mlle"),

    ME("Me");

    private final String value;

    Civilite(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Civilite fromValue(String value) {
        try {
            return Civilite.valueOf(value.toUpperCase(Locale.US));
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
