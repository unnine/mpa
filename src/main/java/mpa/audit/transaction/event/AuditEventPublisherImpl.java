package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RequiredArgsConstructor
public class AuditEventPublisherImpl implements AuditEventPublisher {

    private final AuditEventListener eventListener;


    @Override
    public void publishCommitEvent(AuditCommitEvent event, List<AuditTrail> auditTrails) {
        if (CollectionUtils.isEmpty(auditTrails)) {
            return;
        }
        if (event == AuditCommitEvent.BEFORE) {
            publishBeforeCommit(auditTrails);
            return;
        }
        if (event == AuditCommitEvent.AFTER) {
            publishAfterCommit(auditTrails);
            return;
        }
        if (event == AuditCommitEvent.MANUALLY) {
            publishManuallyCommit(auditTrails);
            return;
        }
    }

    private void publishBeforeCommit(List<AuditTrail> auditTrails) {
        eventListener.beforeCommit(auditTrails);
    }

    private void publishAfterCommit(List<AuditTrail> auditTrails) {
        eventListener.afterCommit(auditTrails);
    }

    private void publishManuallyCommit(List<AuditTrail> auditTrails) {
        eventListener.manuallyCommit(auditTrails);
    }
}