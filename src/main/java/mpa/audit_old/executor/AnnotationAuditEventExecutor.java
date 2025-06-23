package mpa.audit_old.executor;

import lombok.RequiredArgsConstructor;
import mpa.audit_old.AuditTrail;
import mpa.audit_old.context.AuditTracker;
import mpa.audit_old.context.Snapshot;
import mpa.audit_old.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.entity.EntityDefinition;
import mpa.audit_old.annotation.AuditAnnotationInfo;
import mpa.audit_old.transaction.event.AuditCommitEvent;
import mpa.audit_old.transaction.event.AuditEventPublisher;
import mpa.entity.cache.EntityCache;

import java.util.List;

/**
 * <pre style="color: #0ba;">
 * - 이 클래스는 수동으로 Audit을 수행할 때 사용합니다.
 * - 파라미터에 기본키 데이터가 들어있어야 합니다.
 * </pre>
 *
 * <pre style="color: orange;">
 * - UPDATE, DELETE인 경우 기본키 데이터는 반드시 파라미터 객체에 포함되어야 합니다.
 * - INSERT의 경우, 쿼리 실행 후 파라미터 객체에 기본키 데이터가 세팅되어 있어야 합니다.
 *   (ex: mybatis selectKey)
 * </pre>
 */
@RequiredArgsConstructor
public final class AnnotationAuditEventExecutor implements AuditEventExecutor {

    private final AuditAnnotationInfo auditInfo;
    private final EntityCache entityCache;
    private final AuditTracker tracker;
    private final AuditEventPublisher eventPublisher;
    private final QueryArgumentsParser queryArgumentsParser;


    @Override
    public void put(Object... arguments) {
        if (arguments == null) {
            return;
        }

        for (Object argument : arguments) {
            Snapshot snapshot = makeSnapshot(argument);
            capture(snapshot);
        }
    }

    @Override
    public void flush() {
        List<AuditTrail> auditTrails = tracker.flush();
        eventPublisher.publishCommitEvent(AuditCommitEvent.MANUALLY, auditTrails);
    }

    private Snapshot makeSnapshot(Object... arguments) {
        String tableName = auditInfo.getTableName();
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return Snapshot.ofManually(auditInfo, entityDefinition, queryArgumentsParser, arguments);
    }

    private void capture(Snapshot snapshot) {
        tracker.capture(snapshot);
    }
}