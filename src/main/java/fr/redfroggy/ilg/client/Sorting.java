package fr.redfroggy.ilg.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import java.util.Locale;
import java.util.Optional;

public class Sorting {

    private final String column;
    private final Direction order;

    public Sorting(@JsonProperty("column") String column, @JsonProperty("order") String order) {
        this.column = column;
        this.order = Direction.fromString(order);
    }

    private Sorting(String column, Direction order) {
        this.column = column;
        this.order = order;
    }

    public String getColumn() {
        return column;
    }

    public Direction getOrder() {
        return order;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (column != null) {
            queryParams.add("column", column);
        }
        if (order != null) {
            queryParams.add("order", order.name().toLowerCase());
        }
        return queryParams;
    }

    /**
     * Creates a new {@link Sorting}.
     *
     * @param column Column name in JSONPath format (start with '$.') for sorting
     * @param order Sorting order, 'asc' or 'desc' (optional)
     * @return sorting
     */
    public static Sorting by(String column, Direction order) {
        Assert.hasText(column, "Cannot build sorting without column");
        return new Sorting(column, order);
    }

    /**
     * Creates a new {@link Sorting}.
     *
     * @param column Column name in JSONPath format (start with '$.') for sorting (optional)
     * @return sorting
     */
    public static Sorting by(String column) {
        return by(column, null);
    }

    /**
     * Enumeration for sort directions.
     *
     */
    public enum Direction {

        ASC, DESC;

        /**
         * Returns whether the direction is ascending.
         *
         * @return is ascending
         */
        public boolean isAscending() {
            return this.equals(ASC);
        }

        /**
         * Returns whether the direction is descending.
         *
         * @return is descending
         */
        public boolean isDescending() {
            return this.equals(DESC);
        }

        /**
         * Returns the {@link Direction} enum for the given {@link String} value.
         *
         * @param value value of enum
         * @throws IllegalArgumentException in case the given value cannot be parsed into an enum value.
         * @return direction
         */
        public static Direction fromString(String value) {
            if (ObjectUtils.isEmpty(value)){
                return null;
            }
            try {
                return Direction.valueOf(value.toUpperCase(Locale.US));
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format(
                        "Invalid value '%s' for orders given! Has to be either 'desc' or 'asc' (case insensitive).", value), e);
            }
        }

        /**
         * Returns the {@link Direction} enum for the given {@link String} or null if it cannot be parsed into an enum
         * value.
         *
         * @param value value of enum
         * @return optional direction
         */
        public static Optional<Direction> fromOptionalString(String value) {

            try {
                return Optional.of(fromString(value));
            } catch (IllegalArgumentException e) {
                return Optional.empty();
            }
        }
    }
}
