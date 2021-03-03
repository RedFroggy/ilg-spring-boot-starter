package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum AlertType {
    JURI(4),
    SCORE(8),
    JURI_SCORE(12);

    private final Integer value;

    AlertType(Integer value) {
        this.value = value;
    }

    @JsonCreator
    public static AlertType fromValue(Integer value) {
        return Arrays.stream(AlertType.values())
                .filter(type -> type.getValue() == value)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
