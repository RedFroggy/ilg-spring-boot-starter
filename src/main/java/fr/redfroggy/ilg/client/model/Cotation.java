package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cotation
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Cotation {

    private final String codeIsin;

    private final String placeCotation;

    private final Object indices;

    public Cotation(@JsonProperty("codeIsin") String codeIsin,
                    @JsonProperty("placeCotation") String placeCotation,
                    @JsonProperty("indices") Object indices) {
        this.codeIsin = codeIsin;
        this.placeCotation = placeCotation;
        this.indices = indices;
    }

    /**
     * ISIN Code of a company
     *
     * @return codeIsin
     */
    public String getCodeIsin() {
        return codeIsin;
    }

    /**
     * Exchange Market
     *
     * @return placeCotation
     */
    public String getPlaceCotation() {
        return placeCotation;
    }

    /**
     * Indexes
     *
     * @return indices
     */
    public Object getIndices() {
        return indices;
    }

}

