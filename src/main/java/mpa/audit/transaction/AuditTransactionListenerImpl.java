package mpa.audit.transaction;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.context.AuditTracker;
import mpa.audit.transaction.event.AuditCommitEvent;
import mpa.audit.transaction.event.AuditEventPublisher;

import java.util.List;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class AuditTransactionListenerImpl implements AuditTransactionListener {

    private static final ThreadLocal<List<AuditTrail>> audits = new ThreadLocal<>();

    private final AuditTracker tracker;
    private final AuditEventPublisher eventPublisher;


    @Override
    public void beforeCommit(boolean readOnly) {
        pullCompletionAuditTrails();
        publish(auditTrails -> eventPublisher.publishCommitEvent(AuditCommitEvent.BEFORE, auditTrails));
    }

    @Override
    public void afterCommit() {
        publish(auditTrails -> eventPublisher.publishCommitEvent(AuditCommitEvent.AFTER, auditTrails));
    }

    @Override
    public void beforeCompletion() {
        /**
         * spring 레거시 버전의 경우, 이 메서드는 필수 구현 메서드입니다.
         * 회사 내 프로젝트 중 10년 전 버전도 존재하기 때문에 이 메서드는 내용이 없더라도 삭제해서는 안됩니다.
         */
    }

    @Override
    public void afterCompletion(int status) {
        clear();
    }

    private void pullCompletionAuditTrails() {
        List<AuditTrail> auditTrails = tracker.flush();
        audits.set(auditTrails);
    }

    private void publish(Consumer<List<AuditTrail>> consumer) {
        try {
            if (!AuditTransactionSynchronizationManager.isCurrentTransactionActive()) {
                return;
            }

            consumer.accept(audits.get());

        } catch (Exception e) {
            clear();
            throw e;
        }
    }

    private void clear() {
        audits.remove();
        tracker.endTracking();
        AuditTransactionSynchronizationManager.releaseResources();
    }
}