package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.PostalAddressMailFormatProjection;
import fr.redfroggy.ilg.client.site.PostalAddressMailFormatProjection2;

/**
 * PostalAddressMailFormat
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class PostalAddressMailFormat implements PostalAddressMailFormatProjection,
        PostalAddressMailFormatProjection2 {

    private final String addressL1;

    private final String addressL2;

    private final String addressL3;

    private final String addressL4;

    private final String addressL5;

    private final String addressL6;

    private final String addressL7;

    @JsonCreator
    public PostalAddressMailFormat(@JsonProperty("addressL1") String addressL1,
                                   @JsonProperty("addressL2") String addressL2,
                                   @JsonProperty("addressL3") String addressL3,
                                   @JsonProperty("addressL4") String addressL4,
                                   @JsonProperty("addressL5") String addressL5,
                                   @JsonProperty("addressL6") String addressL6,
                                   @JsonProperty("addressL7") String addressL7) {
        this.addressL1 = addressL1;
        this.addressL2 = addressL2;
        this.addressL3 = addressL3;
        this.addressL4 = addressL4;
        this.addressL5 = addressL5;
        this.addressL6 = addressL6;
        this.addressL7 = addressL7;
    }

    protected PostalAddressMailFormat(PostalAddressMailFormatBuilder builder) {
        this.addressL4 = builder.addressL4;
        this.addressL6 = builder.addressL6;
        this.addressL2 = builder.addressL2;
        this.addressL3 = builder.addressL3;
        this.addressL5 = builder.addressL5;
        this.addressL1 = builder.addressL1;
        this.addressL7 = builder.addressL7;
    }

    public static PostalAddressMailFormatBuilder builder() {
        return new PostalAddressMailFormatBuilder();
    }

    /**
     * Line 1 Mail formatted AFNOR NF Z 10-011 (Name)
     *
     * @return addressL1
     */

    public String getAddressL1() {
        return addressL1;
    }

    /**
     * Line 2 Mail formatted AFNOR NF Z 10-011 (Name complement)
     *
     * @return addressL2
     */

    public String getAddressL2() {
        return addressL2;
    }

    /**
     * Line 3 Mail formatted AFNOR NF Z 10-011 (Address Complement)
     *
     * @return addressL3
     */

    public String getAddressL3() {
        return addressL3;
    }

    /**
     * Line 4 Mail formatted AFNOR NF Z 10-011 (Address Number &amp; Street)
     *
     * @return addressL4
     */

    public String getAddressL4() {
        return addressL4;
    }

    /**
     * Line 5 Mail formatted AFNOR NF Z 10-011 (Postal Box, district)
     *
     * @return addressL5
     */

    public String getAddressL5() {
        return addressL5;
    }

    /**
     * Line 6 Mail formatted AFNOR NF Z 10-011 (Zip code &amp; city)
     *
     * @return addressL6
     */

    public String getAddressL6() {
        return addressL6;
    }

    /**
     * Line 7 Mail formatted AFNOR NF Z 10-011 (Country)
     *
     * @return addressL7
     */

    public String getAddressL7() {
        return addressL7;
    }

    public static class PostalAddressMailFormatBuilder<T extends PostalAddressMailFormatBuilder<T>> {
        private String addressL1;
        private String addressL2;
        private String addressL3;
        private String addressL4;
        private String addressL5;
        private String addressL6;
        private String addressL7;

        protected PostalAddressMailFormatBuilder() {
        }

        public T addressL1(String addressL1) {
            this.addressL1 = addressL1;
            return (T) this;
        }

        public T addressL2(String addressL2) {
            this.addressL2 = addressL2;
            return (T) this;
        }

        public T addressL3(String addressL3) {
            this.addressL3 = addressL3;
            return (T) this;
        }

        public T addressL4(String addressL4) {
            this.addressL4 = addressL4;
            return (T) this;
        }

        public T addressL5(String addressL5) {
            this.addressL5 = addressL5;
            return (T) this;
        }

        public T addressL6(String addressL6) {
            this.addressL6 = addressL6;
            return (T) this;
        }

        public T addressL7(String addressL7) {
            this.addressL7 = addressL7;
            return (T) this;
        }

        public PostalAddressMailFormat build() {
            return new PostalAddressMailFormat(this);
        }
    }
}

