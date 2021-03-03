package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.Pagination;

import java.util.List;

/**
 * Alerts
 */
@JsonDeserialize(builder = Alerts.AlertsBuilder.class)
public class Alerts extends Pagination {

    private final String id;

    private final List<Alert> alertes;

    private Alerts(AlertsBuilder builder) {
        super(builder);
        this.id = builder.id;
        this.alertes = builder.alertes;
    }

    /**
     * Get Id
     *
     * @return id
     **/
    public String getId() {
        return id;
    }

    /**
     * Get alerts
     *
     * @return alerts
     **/
    public List<Alert> getAlertes() {
        return alertes;
    }


    public static AlertsBuilder builder() {
        return new AlertsBuilder();
    }


    @JsonPOJOBuilder(withPrefix = "")
    public static final class AlertsBuilder extends PaginationBuilder<AlertsBuilder> {
        private String id;
        private List<Alert> alertes;

        private AlertsBuilder() {
            super();
        }

        public AlertsBuilder id(String id) {
            this.id = id;
            return this;
        }

        public AlertsBuilder alertes(List<Alert> alertes) {
            this.alertes = alertes;
            return this;
        }

        public Alerts build() {
            return new Alerts(this);
        }
    }
}
