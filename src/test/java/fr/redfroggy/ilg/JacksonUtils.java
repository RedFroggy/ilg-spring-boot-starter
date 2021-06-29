/*
 * Copyright © Conformitee - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Contact: tech@conformitee.fr
 */
package fr.redfroggy.ilg;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.json.LocalDatePreventFormatExceptionDeserializer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;

/**
 * Utility class to get configured jackon serializer
 *
 */
public final class JacksonUtils {

    private JacksonUtils() {
    }

    public static ObjectMapper buildMapper() {
        return Jackson2ObjectMapperBuilder.json()
                .deserializerByType(LocalDate.class, LocalDatePreventFormatExceptionDeserializer.INSTANCE)
                .build()
                .enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
    }
}
