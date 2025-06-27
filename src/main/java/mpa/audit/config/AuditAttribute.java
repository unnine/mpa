package mpa.audit.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import mpa.audit.config.strategy.TrackingStrategy;

@Getter
@Setter(AccessLevel.PACKAGE)
public class AuditAttribute {

    private boolean auditing = true;

    private TrackingStrategy trackingStrategy = TrackingStrategy.ALL_COLUMNS;

    //    private JoinStrategy joinStrategy = new JoinStrategy();

}
