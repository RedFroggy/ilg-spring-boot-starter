package fr.redfroggy.ilg.spring.boot.autoconfigure;


import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class MethodKeyGeneratorTest {
    @Test
    public void shouldBeEquals() {
        EqualsVerifier.forClass(MethodKeyGenerator.MethodKey.class)
                .usingGetClass()
                //.suppress(Warning.SURROGATE_KEY)
                .verify();
    }
}
