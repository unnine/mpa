package mpa.audit.aop.invocation;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.Audit;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.context.AuditTracker;
import mpa.audit.context.Snapshot;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.entity.EntityDefinition;
import mpa.audit.annotation.AuditAnnotationInfo;
import mpa.util.TypeValidator;
import mpa.entity.cache.EntityCache;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

@RequiredArgsConstructor
public class AnnotationAuditMethodInvocation implements MethodInvocation {

    private final MethodInvocation target;
    private final EntityCache entityCache;
    private final AuditTracker tracker;
    private final QueryArgumentsParser queryArgumentsParser;


    @Override
    public Object proceed() throws Throwable {
        try {
            if (!isAuditTarget()) {
                return target.proceed();
            }
            return doAudit();

        } catch (Throwable e) {
            tracker.endTracking();
            throw e;
        }
    }

    private Object doAudit() throws Throwable {
        AuditAnnotationInfo auditInfo = getAuditInfo();

        if (notRegisteredEntity(auditInfo)) {
            return target.proceed();
        }

        Snapshot snapshot = makeSnapshot(auditInfo);

        if (notTracking(snapshot)) {
            capture(snapshot);
        }

        Object result = target.proceed();

        if (isUpdated(result)) {
            capture(snapshot);
        }
        return result;
    }

    private AuditAnnotationInfo getAuditInfo() {
        Audit auditAnnotation = getMethod().getAnnotation(AuditAnnotations.AUDIT);
        return new AuditAnnotationInfo(auditAnnotation.target(), auditAnnotation.label(), auditAnnotation.commandType());
    }

    private Snapshot makeSnapshot(AuditAnnotationInfo auditInfo) {
        String tableName = auditInfo.getTableName();
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return Snapshot.ofTransaction(auditInfo, entityDefinition, queryArgumentsParser, getArguments());
    }

    private boolean notRegisteredEntity(AuditAnnotationInfo auditInfo) {
        String tableName = auditInfo.getTableName();
        return !entityCache.existsByTableName(tableName);
    }

    private boolean notTracking(Snapshot snapshot) {
        return !tracker.isTracking(snapshot);
    }

    private void capture(Snapshot snapshot) {
        tracker.capture(snapshot);
    }

    private boolean isAuditTarget() {
        Class<?> returnType = getMethod().getReturnType();
        return TypeValidator.isInteger(returnType) || TypeValidator.isVoid(returnType);
    }

    /**
     * <div style="font-size: 10px;">
     * - 반환 타입이 숫자면
     * 1. 반환값이 1 이상이면 데이터가 변경된 것으로 판단 (성능 최적화)
     * <p>
     * - 반환 타입이 숫자가 아니면
     * 1. 일단 변경된 것으로 간주하며 이후 트랜잭션 종료 시점에 데이터를 가져와 정말 변경됐는지 체크
     * (
     * 기존에는 이 로직에서 데이터 변경 여부를 비교했으나, 로깅 및 성능 최적화 이슈로 현재는 여기서 비교하지 않음
     * <p>
     * 예를 들어, 저장 로직을 반복문으로 처리할 때 각 반복마다 데이터 호출과 audit 비교가 수행될 텐데,
     * 로그 확인에도 좋지 않고 상황에 따라 성능에 영향을 미침
     * <p>
     * 즉, 여기서 비교하지 않고 트랜잭션 종료 직전에 일괄적으로 비교하도록 처리함.
     * )
     * </div>
     */
    private boolean isUpdated(Object result) {
        Method method = getMethod();
        Class<?> returnType = method.getReturnType();

        if (TypeValidator.isInteger(returnType)) {
            return ((Integer) result) > 0;
        }
        return true;
    }

    @Override
    public Method getMethod() {
        return target.getMethod();
    }

    @Override
    public Object[] getArguments() {
        return target.getArguments();
    }

    @Override
    public Object getThis() {
        return target.getThis();
    }

    @Override
    public AccessibleObject getStaticPart() {
        return target.getStaticPart();
    }
}