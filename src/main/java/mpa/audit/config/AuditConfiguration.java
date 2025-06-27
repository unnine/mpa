package mpa.audit.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.TrackingStrategy;

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

    //    @Override
//    public AuditConfigure joinStrategy(JoinStrategy joinStrategy) {
//        if (joinStrategy != null) {
//            joinStrategy.validate();
//            this.joinStrategy = joinStrategy;
//        }
//        return this;
//    }
//
//    @Override
//    public JoinStrategy joinStrategy() {
//        return joinStrategy;
//    }

}
