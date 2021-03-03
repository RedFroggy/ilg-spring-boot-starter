package fr.redfroggy.ilg.client;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Pagination.PaginationBuilder.class)
public class Pagination {
    private final Integer start;
    private final Integer page;
    private final Integer count;
    private final Integer total;

    protected Pagination(PaginationBuilder builder) {
        this.start = builder.start;
        this.page = builder.page;
        this.count = builder.count;
        this.total = builder.total;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getTotal() {
        return total;
    }

    public static PaginationBuilder builder() {
        return new PaginationBuilder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class PaginationBuilder<T extends PaginationBuilder> {
        private Integer start;
        private Integer page;
        private Integer count;
        private Integer total;

        protected PaginationBuilder() {
        }

        public T start(Integer start) {
            this.start = start;
            return (T)this;
        }

        public T page(Integer page) {
            this.page = page;
            return (T)this;
        }

        public T count(Integer count) {
            this.count = count;
            return (T)this;
        }

        public T total(Integer total) {
            this.total = total;
            return (T)this;
        }

        public Pagination build() {
            return new Pagination(this);
        }
    }
}
