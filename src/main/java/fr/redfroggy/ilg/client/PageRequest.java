package fr.redfroggy.ilg.client;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class PageRequest {

    private final Integer page;

    private final Integer number;

    private PageRequest(Integer page, Integer number) {
        this.page = page;
        this.number = number;
    }

    /**
     * Creates a new {@link PageRequest}.
     *
     * @param page zero-based page index.
     * @param number the size of the page to be returned.
     * @return page request
     */
    public static PageRequest of(int page, int number) {
        return new PageRequest(page, number);
    }

    /**
     * Creates a new {@link PageRequest}.
     *
     * @param page zero-based page index.
     * @return page request
     */
    public static PageRequest ofPage(int page) {
        return new PageRequest(page, null);
    }

    /**
     * Creates a new {@link PageRequest}.
     *
     * @param number the size of the page to be returned.
     * @return page request
     */
    public static PageRequest ofNumber(int number) {
        return new PageRequest(null, number);
    }

    public Integer getPage() {
        return page;
    }

    public Integer getNumber() {
        return number;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (page != null) {
            queryParams.add("page", String.valueOf(page));
        }
        if (number != null) {
            queryParams.add("number", String.valueOf(number));
        }
        return queryParams;
    }
}
