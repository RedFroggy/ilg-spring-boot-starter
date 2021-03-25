package fr.redfroggy.ilg.client.monitoring;

import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class PageableRequest {

    private final PageRequest page;

    private final MonitoringSorting sort;

    protected PageableRequest(PageRequest page, MonitoringSorting sort) {
        Assert.notNull(page, "Cannot build pageable without page");
        this.page = page;
        this.sort = sort;
    }

    public static PageableRequest of(int page, int number) {
        return PageableRequest.of(page, number, null);
    }

    public static PageableRequest of(int page, int number, MonitoringSorting sort) {
        return new PageableRequest(PageRequest.of(page, number), sort);
    }

    public static PageableRequest of(int page, int size, String sort, Sorting.Direction direction) {
        return of(page, size, MonitoringSorting.by(sort, direction));
    }

    public PageRequest getPage() {
        return page;
    }

    public MonitoringSorting getSort() {
        return sort;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.putAll(getPage().toQueryParams());
        if (getSort() != null) {
            queryParams.putAll(getSort().toQueryParams());
        }
        return queryParams;
    }

    public PageableRequest next() {
        return PageableRequest.of(getPage().getPage()+1, getPage().getNumber(), this.getSort());
    }

    public PageableRequest previous() {
        return this.getPage().getPage() == 1 ? this : PageableRequest.of(getPage().getPage() - 1, getPage().getNumber(), this.getSort());
    }

    public PageableRequest first() {
        return PageableRequest.of(1, getPage().getNumber(), this.getSort());
    }

}
