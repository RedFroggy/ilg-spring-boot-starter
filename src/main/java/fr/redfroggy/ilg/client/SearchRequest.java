package fr.redfroggy.ilg.client;

import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchRequest {

    private final String search;
    private final List<String> in;

    private SearchRequest(String search, List<String> in) {
        Assert.hasText(search, "Cannot build search request without search terms");
        this.search = search;
        this.in = in;
    }

    public String getSearch() {
        return search;
    }

    public List<String> getIn() {
        return in;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("search", search);

        if (!ObjectUtils.isEmpty(in)) {
            in.forEach(in -> queryParams.add("in", in));
        }
        return queryParams;
    }

    /**
     *
     * @param search Terms to match (optional)
     * @param in Execute match against columns (example : '$.registrationId') (optional, default to new
     *           ArrayList&lt;&gt;())
     * @return search request
     */
    public static SearchRequest of(String search, List<String> in) {
        return new SearchRequest(search, in);
    }

    /**
     *
     * @param search Terms to match (optional)
     * @param in Execute match against columns (example : '$.registrationId') (optional, default to new
     *           ArrayList&lt;&gt;())
     * @return search request
     */
    public static SearchRequest of(String search, String... in) {
        return of(search, Arrays.asList(in));
    }

    /**
     *
     * @param search Terms to match (optional)
     * @return search request
     */
    public static SearchRequest of(String search) {
        return new SearchRequest(search, Collections.emptyList());
    }
}
