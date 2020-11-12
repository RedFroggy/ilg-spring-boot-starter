package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.ContactProjection;
import fr.redfroggy.ilg.client.company.ContactProjection2;

/**
 * Contact
 */
@JsonDeserialize(builder = Contact.ContactBuilder.class)
public class Contact implements ContactProjection, ContactProjection2 {

    private final String type;

    private final String phone;

    private final String fax;

    private final String email;

    private final String webSite;

    private Contact(ContactBuilder builder) {
        this.type = builder.type;
        this.phone = builder.phone;
        this.fax = builder.fax;
        this.email = builder.email;
        this.webSite = builder.webSite;
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    /**
     * Type of contact info
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Phone number
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Fax number
     *
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Homepage
     *
     * @return webSite
     */
    public String getWebSite() {
        return webSite;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class ContactBuilder {
        private String type;
        private String phone;
        private String fax;
        private String email;
        private String webSite;

        private ContactBuilder() {
        }

        public ContactBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ContactBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder webSite(String webSite) {
            this.webSite = webSite;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}

