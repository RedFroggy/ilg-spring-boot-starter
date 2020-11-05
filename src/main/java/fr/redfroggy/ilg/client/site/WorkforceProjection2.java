package fr.redfroggy.ilg.client.site;

public interface WorkforceProjection2 {
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
