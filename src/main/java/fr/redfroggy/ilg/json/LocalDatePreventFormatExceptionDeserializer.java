package fr.redfroggy.ilg.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePreventFormatExceptionDeserializer extends LocalDateDeserializer {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static final LocalDatePreventFormatExceptionDeserializer INSTANCE = new LocalDatePreventFormatExceptionDeserializer();

    protected LocalDatePreventFormatExceptionDeserializer() {
        super();
    }

    public LocalDatePreventFormatExceptionDeserializer(DateTimeFormatter dtf) {
        super(dtf);
    }

    /**
     * Since 2.10
     */
    public LocalDatePreventFormatExceptionDeserializer(LocalDateDeserializer base, DateTimeFormatter dtf) {
        super(base, dtf);
    }

    /**
     * Since 2.10
     */
    protected LocalDatePreventFormatExceptionDeserializer(LocalDateDeserializer base, Boolean leniency) {
        super(base, leniency);
    }

    /**
     * Since 2.11
     */
    protected LocalDatePreventFormatExceptionDeserializer(LocalDateDeserializer base, JsonFormat.Shape shape) {
        super(base, shape);
    }

    @Override
    protected LocalDatePreventFormatExceptionDeserializer withDateFormat(DateTimeFormatter dtf) {
        return new LocalDatePreventFormatExceptionDeserializer(this, dtf);
    }

    @Override
    protected LocalDatePreventFormatExceptionDeserializer withLeniency(Boolean leniency) {
        return new LocalDatePreventFormatExceptionDeserializer(this, leniency);
    }

    @Override
    protected LocalDatePreventFormatExceptionDeserializer withShape(JsonFormat.Shape shape) { return new LocalDatePreventFormatExceptionDeserializer(this, shape); }


    @Override
    public LocalDate deserialize(
            JsonParser jsonparser, DeserializationContext context)
            throws IOException {

        try {
            return super.deserialize(jsonparser, context);
        } catch (InvalidFormatException e) {
            log.error("{} on {}",e.getMessage(), jsonparser.getCurrentName());
            return null;
        }
    }
}