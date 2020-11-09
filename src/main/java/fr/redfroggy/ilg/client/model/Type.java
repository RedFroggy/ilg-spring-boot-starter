package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

/**
 * Whether the person is a real person (P), or a company (M)
 */
public enum Type {
    M("M"),

    P("P");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Type fromValue(String value) {
        try {
            return Type.valueOf(value.toUpperCase(Locale.US));
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
