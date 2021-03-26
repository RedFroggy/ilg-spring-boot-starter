package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;


import fr.redfroggy.ilg.client.monitoring.MonitoringApi;
import fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring.eventtype.AlertEventTypeFactories;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MonitoringAlertProperties.class)
@ConditionalOnProperty(prefix = "ilg.monitoring-alert", name = "enabled", havingValue = "true")
class MonitoringAlertConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public MonitoringAlertPublisher monitoringAlertPublisher(ApplicationEventPublisher publisher){
        return new ApplicationMonitoringAlertPublisher(publisher);
    }

    @ConditionalOnMissingBean
    @Bean
    public MonitoringAlertScheduler monitoringAlertScheduler(
            MonitoringAlertProperties properties,
            MonitoringApi monitoringClient,
            AlertEventTypeFactories alertEventTypeFactories,
            MonitoringAlertPublisher publisher) {
        return new MonitoringAlertScheduler(properties, monitoringClient, alertEventTypeFactories, publisher);
    }
}
