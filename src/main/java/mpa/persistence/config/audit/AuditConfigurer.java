package mpa.persistence.config.audit;

public interface AuditConfigurer {

    void off();

    AuditConfigurer trackingStrategy(TrackingStrategy trackingStrategy);

}
