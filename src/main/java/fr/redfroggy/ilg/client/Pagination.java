package fr.redfroggy.ilg.client;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Pagination.PaginationBuilder.class)
public class Pagination {
    private final Integer start;
    private final Integer page;
    private final Integer count;
    private final Integer total;

    private Pagination(PaginationBuilder builder) {
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
    public static final class PaginationBuilder {
        private Integer start;
        private Integer page;
        private Integer count;
        private Integer total;

        private PaginationBuilder() {
        }

        public PaginationBuilder start(Integer start) {
            this.start = start;
            return this;
        }

        public PaginationBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public PaginationBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public PaginationBuilder total(Integer total) {
            this.total = total;
            return this;
        }

        public Pagination build() {
            return new Pagination(this);
        }
    }
}
