package fr.redfroggy.ilg.client.company;

public interface StreetProjection {
    /**
     * Street number
     * @return number
     */
    String getNumber();

    /**
     * Street number repetition
     * @return repetition
     */
    String getRepetition();

    /**
     * Street Type
     * @return streetType
     */
    String getStreetType();

    /**
     * Street name
     * @return streetName
     */
    String getStreetName();
}
