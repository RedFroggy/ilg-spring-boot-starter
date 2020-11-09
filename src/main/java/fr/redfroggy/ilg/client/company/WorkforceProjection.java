package fr.redfroggy.ilg.client.company;

public interface WorkforceProjection {
    /**
     * Number of employee, can be 'NN' indicating that no data has been collected
     * @return value
    */
    String getValue();

    /**
     * Range of employees
     * @return range
    */
    String getRange();

    /**
     * Range minimum
     * @return rangeMin
    */
    Integer getRangeMin();

    /**
     * Range maximum
     * @return rangeMax
    */
    Integer getRangeMax();
}
