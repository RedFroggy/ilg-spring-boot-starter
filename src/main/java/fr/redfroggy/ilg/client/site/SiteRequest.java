package fr.redfroggy.ilg.client.site;

import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.SearchRequest;
import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class SiteRequest {

    private final PageRequest page;

    private final Sorting sort;

    private final FiltersRequest filters;

    private final SearchRequest searchRequest;

    public SiteRequest(SiteRequestBuilder builder) {
        this.page = builder.page;
        this.sort = builder.sort;
        this.filters = builder.filters;
        this.searchRequest = builder.searchRequest;
    }

    public static SiteRequestBuilder builder() {
        return new SiteRequestBuilder();
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

    public SearchRequest getSearchRequest() {
        return searchRequest;
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
        if (searchRequest != null) {
            queryParams.putAll(searchRequest.toQueryParams());
        }
        return queryParams;
    }

    public static final class SiteRequestBuilder {
        private PageRequest page;
        private Sorting sort;
        private FiltersRequest filters;
        private SearchRequest searchRequest;

        private SiteRequestBuilder() {
        }

        public SiteRequestBuilder page(PageRequest page) {
            this.page = page;
            return this;
        }

        public SiteRequestBuilder sort(Sorting sort) {
            this.sort = sort;
            return this;
        }

        public SiteRequestBuilder filters(FiltersRequest filters) {
            this.filters = filters;
            return this;
        }

        public SiteRequestBuilder search(SearchRequest searchRequest) {
            this.searchRequest = searchRequest;
            return this;
        }

        public SiteRequest build() {
            return new SiteRequest(this);
        }
    }
}
