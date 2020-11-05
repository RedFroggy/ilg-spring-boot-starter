package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecondaryActivityModel
 */
public class SecondaryActivityModel extends ActivityModel {
    public SecondaryActivityModel(@JsonProperty("code") String code, @JsonProperty("label") String label) {
        super(code, label);
    }
}
