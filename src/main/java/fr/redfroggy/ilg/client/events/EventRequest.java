package fr.redfroggy.ilg.client.events;

import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.SearchRequest;
import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class EventRequest {

    private final PageRequest page;

    private final Sorting sort;

    private final FiltersRequest filters;

    public EventRequest(EventRequestBuilder builder) {
        this.page = builder.page;
        this.sort = builder.sort;
        this.filters = builder.filters;
    }

    public static EventRequestBuilder builder() {
        return new EventRequestBuilder();
    }

    public PageRequest getPage() {
        return page;
    }

    public Sorting getSort() {
        return sort;
    }

    public FiltersRequest getFilters() {
        return filters;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (page != null) {
            queryParams.putAll(page.toQueryParams());
        }
        if (sort != null) {
            queryParams.putAll(sort.toQueryParams());
        }
        if (filters != null) {
            queryParams.putAll(filters.toQueryParams());
        }
        return queryParams;
    }

    public static final class EventRequestBuilder {
        private PageRequest page;
        private Sorting sort;
        private FiltersRequest filters;
        private SearchRequest searchRequest;

        private EventRequestBuilder() {
        }

        public EventRequestBuilder page(PageRequest page) {
            this.page = page;
            return this;
        }

        public EventRequestBuilder sort(Sorting sort) {
            this.sort = sort;
            return this;
        }

        public EventRequestBuilder filters(FiltersRequest filters) {
            this.filters = filters;
            return this;
        }
        public EventRequest build() {
            return new EventRequest(this);
        }
    }
}
