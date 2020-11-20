package fr.redfroggy.ilg.client.search;

import java.math.BigDecimal;

public class CompanySearchRequestParam {

    private final String vatNumber;

    private final String simpleSearch;

    private final BigDecimal eirl;

    private final Integer siege;

    private final Integer actif;

    private final String societeNom;

    private final String societeNaf;

    private final String societeCodePostal;

    private final String societeNumVoie;

    private final String societeRue;

    private final String societeVille;

    private final String societeRegion;

    private final String societeDepartement;

    private CompanySearchRequestParam(CompanySearchRequestBuilder builder) {
        this.vatNumber = builder.vatNumber;
        this.simpleSearch = builder.simpleSearch;
        this.eirl = builder.eirl;
        this.siege = builder.siege;
        this.actif = builder.actif;
        this.societeNom = builder.societeNom;
        this.societeNaf = builder.societeNaf;
        this.societeCodePostal = builder.societeCodePostal;
        this.societeNumVoie = builder.societeNumVoie;
        this.societeRue = builder.societeRue;
        this.societeVille = builder.societeVille;
        this.societeRegion = builder.societeRegion;
        this.societeDepartement = builder.societeDepartement;
    }

    /**
     * VAT number (international use only)
     * @return vat number
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * General search, can only be used alone
     * @return simple search
     */
    public String getSimpleSearch() {
        return simpleSearch;
    }

    /**
     * Only search against individual limited companies
     * @return eirl
     */
    public BigDecimal getEirl() {
        return eirl;
    }

    /**
     * Company is headquarter, values=[1, 0]}
     * @return is headquarter
     */
    public Integer getSiege() {
        return siege;
    }

    /**
     * Company is active, values=[1, 0]}
     * @return is active
     */
    public Integer getActif() {
        return actif;
    }

    /**
     * Company name
     * @return name
     */
    public String getSocieteNom() {
        return societeNom;
    }

    /**
     * Company activity code
     * @return activity code
     */
    public String getSocieteNaf() {
        return societeNaf;
    }

    /**
     * Company postal code
     * @return postal code
     */
    public String getSocieteCodePostal() {
        return societeCodePostal;
    }

    /**
     * Company number in street
     * @return number in street
     */
    public String getSocieteNumVoie() {
        return societeNumVoie;
    }

    /**
     * Company street
     * @return street
     */
    public String getSocieteRue() {
        return societeRue;
    }

    /**
     * Company city
     * @return city
     */
    public String getSocieteVille() {
        return societeVille;
    }

    /**
     * Company region
     * @return region
     */
    public String getSocieteRegion() {
        return societeRegion;
    }

    /**
     * Company departement
     * @return departement
     */
    public String getSocieteDepartement() {
        return societeDepartement;
    }

    public static CompanySearchRequestBuilder builder() {
        return new CompanySearchRequestBuilder();
    }

    public static final class CompanySearchRequestBuilder {
        private String vatNumber;
        private String simpleSearch;
        private BigDecimal eirl;
        private Integer siege;
        private Integer actif;
        private String societeNom;
        private String societeNaf;
        private String societeCodePostal;
        private String societeNumVoie;
        private String societeRue;
        private String societeVille;
        private String societeRegion;
        private String societeDepartement;

        private CompanySearchRequestBuilder() {
        }

        public CompanySearchRequestBuilder vatNumber(String vatNumber) {
            this.vatNumber = vatNumber;
            return this;
        }

        public CompanySearchRequestBuilder simpleSearch(String simpleSearch) {
            this.simpleSearch = simpleSearch;
            return this;
        }

        public CompanySearchRequestBuilder eirl(BigDecimal eirl) {
            this.eirl = eirl;
            return this;
        }

        public CompanySearchRequestBuilder siege(Integer siege) {
            this.siege = siege;
            return this;
        }

        public CompanySearchRequestBuilder actif(Integer actif) {
            this.actif = actif;
            return this;
        }

        public CompanySearchRequestBuilder societeNom(String societeNom) {
            this.societeNom = societeNom;
            return this;
        }

        public CompanySearchRequestBuilder societeNaf(String societeNaf) {
            this.societeNaf = societeNaf;
            return this;
        }

        public CompanySearchRequestBuilder societeCodePostal(String societeCodePostal) {
            this.societeCodePostal = societeCodePostal;
            return this;
        }

        public CompanySearchRequestBuilder societeNumVoie(String societeNumVoie) {
            this.societeNumVoie = societeNumVoie;
            return this;
        }

        public CompanySearchRequestBuilder societeRue(String societeRue) {
            this.societeRue = societeRue;
            return this;
        }

        public CompanySearchRequestBuilder societeVille(String societeVille) {
            this.societeVille = societeVille;
            return this;
        }

        public CompanySearchRequestBuilder societeRegion(String societeRegion) {
            this.societeRegion = societeRegion;
            return this;
        }

        public CompanySearchRequestBuilder societeDepartement(String societeDepartement) {
            this.societeDepartement = societeDepartement;
            return this;
        }

        public CompanySearchRequestParam build() {
            return new CompanySearchRequestParam(this);
        }
    }
}
