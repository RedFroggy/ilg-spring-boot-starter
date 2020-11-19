package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;


@JsonDeserialize(builder = SiteSearchRequest.SiteSearchRequestBuilder.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SiteSearchRequest {

    private final Integer limit;
    private final String name;
    private final String street;
    private final String zipCode;
    private final String city;
    private final String phone;
    private final String companyRegistrationNumber;
    private final String registrationNumber;

    public SiteSearchRequest(SiteSearchRequestBuilder builder) {
        this.limit = builder.limit;
        this.name = builder.name;
        this.street = builder.street;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
        this.phone = builder.phone;
        this.companyRegistrationNumber = builder.companyRegistrationNumber;
        this.registrationNumber = builder.registrationNumber;
    }

    public static SiteSearchRequestBuilder builder() {
        return new SiteSearchRequestBuilder();
    }

    public Integer getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class SiteSearchRequestBuilder {
        private Integer limit;
        private String name;
        private String street;
        private String zipCode;
        private String city;
        private String phone;
        private String companyRegistrationNumber;
        private String registrationNumber;

        private SiteSearchRequestBuilder() {
        }

        /**
         * Set limit
         *
         * @param limit                     Limit search result (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set name
         *
         * @param name Company/Site name (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set street
         *
         * @param street                    Company/Site street name (Only available in France) (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Set zipCode
         *
         * @param zipCode                   Company/Site address zip code (Only available in France) (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Set city
         * @param city Company/Site city (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Set phone
         *
         * @param phone Company/Site street phone number (Only available in France) (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * set companyRegistrationNumber
         *
         * @param companyRegistrationNumber Company registration number (Only available in France) (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder companyRegistrationNumber(String companyRegistrationNumber) {
            this.companyRegistrationNumber = companyRegistrationNumber;
            return this;
        }

        /**
         * Set registrationNumber
         *
         * @param registrationNumber Site registration number (optional)
         * @return builder
         */
        public SiteSearchRequestBuilder registrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public SiteSearchRequest build() {
            return new SiteSearchRequest(this);
        }
    }
}
