package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.site.StreetProjection16;
import fr.redfroggy.ilg.client.site.StreetProjection2;

import java.util.HashMap;
import java.util.Map;

/**
 * Street
 */
public class Street implements StreetProjection2, StreetProjection16 {

    private final String number;

    private final String repetition;

    private final String streetType;

    private final String streetName;

    /**
     * Jackson constructor can be used if json street is empty list as []
     *
     * @param input empty list or Map
     */
    @JsonCreator
    public Street(Object input) {
        Map<String, String> mapInput = input instanceof Map ? (Map) input : new HashMap<>();

        this.number = mapInput.get("number");
        this.repetition = mapInput.get("repetition");
        this.streetType = mapInput.get("streetType");
        this.streetName = mapInput.get("streetName");
    }

    public Street(String number,
                  String repetition,
                  String streetType,
                  String streetName) {
        this.number = number;
        this.repetition = repetition;
        this.streetType = streetType;
        this.streetName = streetName;
    }

    /**
     * Street number
     *
     * @return number
     */

    public String getNumber() {
        return number;
    }

    /**
     * Street number repetition
     *
     * @return repetition
     */

    public String getRepetition() {
        return repetition;
    }

    /**
     * Street Type
     *
     * @return streetType
     */

    public String getStreetType() {
        return streetType;
    }

    /**
     * Street name
     *
     * @return streetName
     */

    public String getStreetName() {
        return streetName;
    }
}

