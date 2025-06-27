package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.holder.ScopeInfo;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AuditEventPublisherImpl implements AuditEventPublisher {

    private final ScopeAware scopeAware;
    private final Scopable<ContextAuditEventListener> eventListenerScopable;


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
        publish(auditTrails, AuditEventListener::beforeCommit);
    }

    private void publishAfterCommit(List<AuditTrail> auditTrails) {
        publish(auditTrails, AuditEventListener::afterCommit);
    }

    private void publishManuallyCommit(List<AuditTrail> auditTrails) {
        publish(auditTrails, AuditEventListener::manuallyCommit);
    }

    private void publish(List<AuditTrail> auditTrails, BiConsumer<AuditEventListener, List<AuditTrail>> handler) {
        Map<ScopeInfo, List<AuditTrail>> auditTrailsByScope = auditTrails.stream().collect(Collectors.groupingBy(AuditTrail::scope));
        Scope scope;

        for (Map.Entry<ScopeInfo, List<AuditTrail>> entry : auditTrailsByScope.entrySet()) {
            scope = scopeAware.get(entry.getKey().getName());
            handler.accept(eventListenerScopable.getInstance(scope), entry.getValue());
        }
    }
}