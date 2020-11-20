package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.AddressProjection;
import fr.redfroggy.ilg.client.company.AddressProjection11;
import fr.redfroggy.ilg.client.executive.AddressProjection5;
import fr.redfroggy.ilg.client.kyc.AddressProjection6;
import fr.redfroggy.ilg.client.relation.AddressProjection9;
import fr.redfroggy.ilg.client.search.AddressProjection13;
import fr.redfroggy.ilg.client.search.AddressProjection14;
import fr.redfroggy.ilg.client.site.AddressProjection17;
import fr.redfroggy.ilg.client.site.AddressProjection2;
import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@JsonDeserialize(builder = Address.AddressBuilder.class)
public class Address implements AddressProjection, AddressProjection2,
        AddressProjection6,
        AddressProjection5, AddressProjection9,
        AddressProjection11, AddressProjection13,
        AddressProjection14, AddressProjection17 {
    private final String country;

    private final String countryCode;

    private final String street;

    private final Street streetDetail;

    private final String street2;

    private final String postalBoxNumber;

    private final String region;

    private final String deptName;

    private final String postalCode;

    private final String locality;

    private final PostalAddressMailFormat mailFormatted;

    public Address(AddressBuilder builder) {
        this.country = builder.country;
        this.countryCode = builder.countryCode;
        this.street = builder.street;
        this.streetDetail = builder.streetDetail;
        this.street2 = builder.street2;
        this.postalBoxNumber = builder.postalBoxNumber;
        this.region = builder.region;
        this.deptName = builder.deptName;
        this.postalCode = builder.postalCode;
        this.locality = builder.locality;
        this.mailFormatted = builder.mailFormatted;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    /**
     * Country name
     *
     * @return country
     */
    @Override
    @ApiModelProperty(example = "France", value = "Country name")
    public String getCountry() {
        return country;
    }

    /**
     * Country code (ISO 3166-2)
     *
     * @return countryCode
     */
    @Override
    @ApiModelProperty(example = "FR", value = "Country code (ISO 3166-2)")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Street address
     *
     * @return street
     */
    @Override
    @ApiModelProperty(example = "1 rue Michel Vaillant", value = "Street address")
    public String getStreet() {
        return street;
    }

    /**
     * Get streetDetail
     *
     * @return streetDetail
     */
    @Override
    @ApiModelProperty(value = "")
    public Street getStreetDetail() {
        return streetDetail;
    }

    /**
     * Street address 2
     *
     * @return street2
     */
    @Override
    @ApiModelProperty(example = "Enco de Botte", value = "Street address 2")
    public String getStreet2() {
        return street2;
    }

    /**
     * Postal Box number
     *
     * @return postalBoxNumber
     */
    @Override
    @ApiModelProperty(example = "BP 001", value = "Postal Box number")
    public String getPostalBoxNumber() {
        return postalBoxNumber;
    }

    /**
     * Region name
     *
     * @return region
     */
    @Override
    @ApiModelProperty(example = "Île-de-France", value = "Region name")
    public String getRegion() {
        return region;
    }

    /**
     * Department name
     *
     * @return deptName
     */
    @Override
    @ApiModelProperty(example = "Paris", value = "Department name")
    public String getDeptName() {
        return deptName;
    }

    /**
     * Postal Code
     *
     * @return postalCode
     */
    @Override
    @ApiModelProperty(example = "75000", value = "Postal Code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * City
     *
     * @return locality
     */
    @Override
    @ApiModelProperty(example = "Paris", value = "City")
    public String getLocality() {
        return locality;
    }

    /**
     * Get mailFormatted
     *
     * @return mailFormatted
     */
    @ApiModelProperty(value = "")
    public PostalAddressMailFormat getMailFormatted() {
        return mailFormatted;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class AddressBuilder {
        private String country;
        private String countryCode;
        private String street;
        private Street streetDetail;
        private String street2;
        private String postalBoxNumber;
        private String region;
        private String deptName;
        private String postalCode;
        private String locality;
        private PostalAddressMailFormat mailFormatted;

        private AddressBuilder() {
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public AddressBuilder street(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder streetDetail(Street streetDetail) {
            this.streetDetail = streetDetail;
            return this;
        }

        public AddressBuilder street2(String street2) {
            this.street2 = street2;
            return this;
        }

        public AddressBuilder postalBoxNumber(String postalBoxNumber) {
            this.postalBoxNumber = postalBoxNumber;
            return this;
        }

        public AddressBuilder region(String region) {
            this.region = region;
            return this;
        }

        public AddressBuilder deptName(String deptName) {
            this.deptName = deptName;
            return this;
        }

        public AddressBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder locality(String locality) {
            this.locality = locality;
            return this;
        }

        public AddressBuilder mailFormatted(PostalAddressMailFormat mailFormatted) {
            this.mailFormatted = mailFormatted;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}

