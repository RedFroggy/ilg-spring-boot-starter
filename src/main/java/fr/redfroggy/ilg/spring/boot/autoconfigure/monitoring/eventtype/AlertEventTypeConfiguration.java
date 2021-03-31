package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype;


import fr.redfroggy.ilg.client.events.EventsApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
@ConditionalOnProperty(prefix = "ilg.monitoring-alert", name = "enabled", havingValue = "true")
class AlertEventTypeConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public AlertEventTypeFactories alertEventTypeFactories(List<AlertEventTypeFactory> factories, EventsApi eventsClient) {
        return new AlertEventTypeFactories(factories, eventsClient);
    }

    @Bean
    @ConditionalOnMissingBean(name = "registrationAlertEventTypeFactory")
    @Order(1)
    public AlertEventTypeFactory registrationAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(RegistrationAlertEventType.class, 1100, 1299);
    }

    @Bean
    @ConditionalOnMissingBean(name = "modificationAlertEventTypeFactory")
    @Order(2)
    public AlertEventTypeFactory modificationAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(ModificationAlertEventType.class, 2110, 2199);
    }

    @Bean
    @ConditionalOnMissingBean(name = "cessationAlertEventTypeFactory")
    @Order(3)
    public AlertEventTypeFactory cessationAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(CessationAlertEventType.class, 3100, 3232);
    }

    @Bean
    @ConditionalOnMissingBean(name = "transferAlertEventTypeFactory")
    @Order(4)
    public AlertEventTypeFactory transferAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(TransferAlertEventType.class, 4110, 4420);
    }

    @Bean
    @ConditionalOnMissingBean(name = "firstLegalProceedingsAlertEventTypeFactory")
    @Order(5)
    public AlertEventTypeFactory firstLegalProceedingsAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(LegalProceedingsAlertEventType.class, 5000, 5040);
    }

    @Bean
    @ConditionalOnMissingBean(name = "collectiveProceedingAlertEventTypeFactory")
    @Order(6)
    public AlertEventTypeFactory collectiveProceedingAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(CollectiveProceedingAlertEventType.class, 5110, 5921);
    }

    @Bean
    @ConditionalOnMissingBean(name = "riskAlertEventTypeFactory")
    @Order(7)
    public AlertEventTypeFactory riskAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(RiskAlertEventType.class, 6110, 6241);
    }

    @Bean
    @ConditionalOnMissingBean(name = "secondLegalProceedingsAlertEventTypeFactory")
    @Order(8)
    public AlertEventTypeFactory secondLegalProceedingsAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(LegalProceedingsAlertEventType.class, 6300, 6906);
    }

    @Bean
    @ConditionalOnMissingBean(name = "miscAlertEventTypeFactory")
    @Order(9)
    public AlertEventTypeFactory miscAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(MiscAlertEventTypeType.class, 7110, 7999);
    }

    @Bean
    @ConditionalOnMissingBean(name = "newsAlertEventTypeFactory")
    @Order(10)
    public AlertEventTypeFactory newsAlertEventTypeFactory(){
        return new SimpleAlertEventTypeFactory(NewsAlertEventType.class, 8110, 8440);
    }
}
