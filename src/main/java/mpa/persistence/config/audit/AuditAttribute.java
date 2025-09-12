package mpa.persistence.config.audit;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PACKAGE)
public class AuditAttribute {

    private boolean auditing = true;

    private TrackingStrategy trackingStrategy = TrackingStrategy.ALL_COLUMNS;

}
