package mpa.persistence.config.audit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuditConfiguration implements AuditConfigurer {

    private final AuditAttribute attribute;


    @Override
    public void off() {
        attribute.setAuditing(false);
    }

    @Override
    public AuditConfigurer trackingStrategy(TrackingStrategy trackingStrategy) {
        if (trackingStrategy != null) {
            attribute.setTrackingStrategy(trackingStrategy);
        }
        return this;
    }

}
