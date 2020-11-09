/*
 * Copyright © Conformitee - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Contact: tech@conformitee.fr
 */
package fr.redfroggy.ilg;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Utility class to get configured jackon serializer
 *
 * @author cdamon
 */
public final class JacksonUtils {

    private JacksonUtils() {
    }

    public static ObjectMapper buildMapper() {
        return new ObjectMapper()
        .registerModule(new JavaTimeModule())
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
    }
}
