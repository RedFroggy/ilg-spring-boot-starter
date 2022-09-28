package fr.redfroggy.ilg.spring.boot.autoconfigure.client.cache;

import java.text.ParseException;

public class ParseRunTimeException extends RuntimeException {

    public ParseRunTimeException(ParseException cause) {
        super(cause);
    }
}
