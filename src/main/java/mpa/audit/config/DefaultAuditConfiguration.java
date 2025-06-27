package mpa.audit.config;

import mpa.audit.config.strategy.TrackingStrategy;
import mpa.config.AuditConfigure;

public class DefaultAuditConfiguration implements AuditConfiguration {

    private TrackingStrategy trackingStrategy = TrackingStrategy.ALL_COLUMNS;
//    private JoinStrategy joinStrategy = new JoinStrategy();


    @Override
    public AuditConfigure trackingStrategy(TrackingStrategy trackingStrategy) {
        if (trackingStrategy != null) {
            this.trackingStrategy = trackingStrategy;
        }
        return this;
    }

    @Override
    public TrackingStrategy trackingStrategy() {
        return trackingStrategy;
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
