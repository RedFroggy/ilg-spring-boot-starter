package fr.redfroggy.ilg.client;

import static org.junit.Assume.*;

import org.junit.Before;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

public abstract class ApiClientIntTest {
    @Before
    public void ping() throws IOException {
        assumeFalse("No ILG_URL define, no int tests run", ObjectUtils.isEmpty(System.getenv("ILG_URL")));
    }
}
