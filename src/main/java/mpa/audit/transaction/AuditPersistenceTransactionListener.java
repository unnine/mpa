package mpa.audit.transaction;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.context.AuditTracker;
import mpa.audit.transaction.event.AuditCommitEvent;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.persistence.transaction.PersistenceTransactionListener;
import mpa.persistence.transaction.PersistenceTransactionSynchronizationManager;

import java.util.List;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class AuditPersistenceTransactionListener implements PersistenceTransactionListener {

    private static final ThreadLocal<List<AuditTrail>> audits = new ThreadLocal<>();

    private final AuditTracker tracker;
    private final AuditEventPublisher eventPublisher;


    private void pullCompletionAuditTrails() {
        List<AuditTrail> auditTrails = tracker.flush();
        audits.set(auditTrails);
    }

    @Override
    public void beforeCommit(boolean readOnly) {
        pullCompletionAuditTrails();
        publish(auditTrails -> eventPublisher.publishCommitEvent(AuditCommitEvent.BEFORE, auditTrails));
    }

    @Override
    public void afterCommit() {
        publish(auditTrails -> eventPublisher.publishCommitEvent(AuditCommitEvent.AFTER, auditTrails));
    }

    private void publish(Consumer<List<AuditTrail>> consumer) {
        try {
            if (!PersistenceTransactionSynchronizationManager.isCurrentTransactionActive()) {
                return;
            }

            List<AuditTrail> auditTrails = audits.get();
            if (auditTrails == null || auditTrails.isEmpty()) {
                return;
            }

            consumer.accept(auditTrails);

        } catch (Exception e) {
            clear();
            throw e;
        }
    }

    @Override
    public void afterCompletion(int status) {
        clear();
    }

    private void clear() {
        audits.remove();
        tracker.endTracking();
    }
}