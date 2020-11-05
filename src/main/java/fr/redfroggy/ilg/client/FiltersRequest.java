package fr.redfroggy.ilg.client;

import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.List;

public class FiltersRequest {

    private final List<String> filters;

    private FiltersRequest(List<String> filters) {
        Assert.notEmpty(filters,"Filters cannot by empty");
        this.filters = filters;
    }

    public List<String> getFilters() {
        return filters;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (filters != null) {
            filters.forEach(filter -> queryParams.add("filters", filter));
        }
        return queryParams;
    }

    /**
     *
     * @param filters Filter parameter in format '{JsonPath},{value}' (example: '$.eventCode,1100')
     *       (optional, default to new ArrayList&lt;&gt;())
     * @return a filters request
     */
    public static FiltersRequest of(String... filters) {
        return new FiltersRequest(Arrays.asList(filters));
    }

    /**
     *
     * @param filters Filter parameter in format '{JsonPath},{value}' (example: '$.eventCode,1100')
     *       (optional, default to new ArrayList&lt;&gt;())
     * @return a filters request
     */
    public static FiltersRequest of(List<String> filters) {
        return new FiltersRequest(filters);
    }
}
