package mpa.fixture.repository.audit;

import mpa.audit.transaction.event.AuditTrailListener;
import mpa.persistence.context.annotation.ScopeName;

@ScopeName("test_db")
public class AuditTestListener implements AuditTrailListener {
}
