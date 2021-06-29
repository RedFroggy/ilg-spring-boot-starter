package fr.redfroggy.ilg.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

class LocalDatePreventFormatExceptionDeserializerTest {

    @Mock
    private DeserializationContext context;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldDeserializeWhenDateStringIsValid() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("\"2018-05-06\"");
        jsonParser.nextToken();
        LocalDate localDate = LocalDatePreventFormatExceptionDeserializer.INSTANCE.deserialize(jsonParser, context);

        assertThat(localDate).isEqualTo("2018-05-06");
    }

    @Test
    public void shouldDeserializeWithFormatterWhenDateStringIsValid() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("\"2018-05-06\"");
        jsonParser.nextToken();
        LocalDatePreventFormatExceptionDeserializer deserializer =
                new LocalDatePreventFormatExceptionDeserializer(DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDate = deserializer.deserialize(jsonParser, context);

        assertThat(localDate).isEqualTo("2018-05-06");
    }

    @Test
    public void shouldBeNullWhenDateStringIsNotValid() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("\"08\"");
        jsonParser.nextToken();
        LocalDate localDate = LocalDatePreventFormatExceptionDeserializer.INSTANCE.deserialize(jsonParser, context);

        assertThat(localDate).isNull();
    }

    @Test
    public void shouldDeserializeWhenDateWithOffsetIsValid() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("\"2011-12-03+01:00\"");
        jsonParser.nextToken();
        LocalDatePreventFormatExceptionDeserializer deserializer
                = LocalDatePreventFormatExceptionDeserializer.INSTANCE.withDateFormat(DateTimeFormatter.ISO_OFFSET_DATE);
        LocalDate localDate = deserializer.deserialize(jsonParser, context);

        assertThat(localDate).isEqualTo("2011-12-03");
    }

    @Test
    public void shouldBeNullWhenDateIsIntegerWithoutLenient() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("19000");
        jsonParser.nextToken();
        LocalDatePreventFormatExceptionDeserializer deserializer
                = LocalDatePreventFormatExceptionDeserializer.INSTANCE.withLeniency(false);
        LocalDate localDate = deserializer.deserialize(jsonParser, context);

        assertThat(localDate).isNull();
    }

    @Test
    public void shouldDeserializeWhenDateIsIntegerWithIntShape() throws Exception {
        JsonParser jsonParser = new ObjectMapper().getFactory().createParser("19000");
        jsonParser.nextToken();
        LocalDatePreventFormatExceptionDeserializer deserializer
                = LocalDatePreventFormatExceptionDeserializer.INSTANCE
                .withLeniency(false)
                .withShape(JsonFormat.Shape.NUMBER_INT);
        LocalDate localDate = deserializer.deserialize(jsonParser, context);

        assertThat(localDate).isEqualTo("2022-01-08");
    }
}