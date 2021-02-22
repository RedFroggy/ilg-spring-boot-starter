package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class MonitoringSorting extends Sorting {

    public MonitoringSorting(@JsonProperty("sort") String sort, @JsonProperty("order") String order) {
        super(sort, Direction.fromString(order));
    }

    private MonitoringSorting(String sort, Direction order) {
        super(sort, order);
    }

    public String getSort() {
        return getColumn();
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (getSort() != null) {
            queryParams.add("sort", getSort());
        }
        if (getOrder() != null) {
            queryParams.add("order", getOrder().name());
        }
        return queryParams;
    }

    /**
     * Creates a new {@link MonitoringSorting}.
     *
     * @param sort Column name in JSONPath format (start with '$.') for sorting
     * @param order Sorting order, 'asc' or 'desc' (optional)
     * @return sorting
     */
    public static MonitoringSorting by(String sort, Direction order) {
        Assert.hasText(sort, "Cannot build sorting without sort");
        return new MonitoringSorting(sort, order);
    }

    /**
     * Creates a new {@link MonitoringSorting}.
     *
     * @param sort Column name in JSONPath format (start with '$.') for sorting (optional)
     * @return sorting
     */
    public static MonitoringSorting by(String sort) {
        return by(sort, null);
    }
}
