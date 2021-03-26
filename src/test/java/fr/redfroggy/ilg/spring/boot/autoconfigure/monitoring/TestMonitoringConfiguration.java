package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;


import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.GenericApplicationContext;

@TestConfiguration
public class TestMonitoringConfiguration {


    /**
     * Workaround to mock ApplicationEventPublisher
     * @param gac
     * @return
     */
    @Bean
    @Primary
    GenericApplicationContext genericApplicationContext(final GenericApplicationContext gac) {
        return Mockito.spy(gac);
    }
}
