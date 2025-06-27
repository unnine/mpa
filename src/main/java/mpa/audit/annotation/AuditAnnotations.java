package mpa.audit.annotation;

import mpa.audit.transaction.event.annotation.AfterCommit;
import mpa.audit.transaction.event.annotation.AuditTrailListener;
import mpa.audit.transaction.event.annotation.BeforeCommit;
import mpa.audit.transaction.event.annotation.ManuallyCommit;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.util.Log;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;

public class AuditAnnotations {

    public static final Class<Audit> AUDIT = Audit.class;

    public static final Class<AuditEntityJoin> ENTITY_JOIN = AuditEntityJoin.class;

    public static final Class<AuditJoin> JOIN = AuditJoin.class;

    public static final Class<AuditJoinDefinition> JOIN_DEFINITION = AuditJoinDefinition.class;

    public static final Class<AuditJoinDefinitions> JOIN_DEFINITIONS = AuditJoinDefinitions.class;

    public static final Class<AuditIgnore> AUDIT_IGNORE = AuditIgnore.class;

    public static final Class<AuditTrailListener> AUDIT_TRAIL_LISTENER = AuditTrailListener.class;

    public static final Class<BeforeCommit> AUDIT_TRAIL_LISTENER_BEFORE_COMMIT = BeforeCommit.class;

    public static final Class<AfterCommit> AUDIT_TRAIL_LISTENER_AFTER_COMMIT = AfterCommit.class;

    public static final Class<ManuallyCommit> AUDIT_TRAIL_LISTENER_MANUALLY_COMMIT = ManuallyCommit.class;


    public static AuditEntityJoin getEntityJoin(Class<?> entityClass) {
        assertHasAnnotation(entityClass, EntityAnnotations.ENTITY);
        return AnnotationUtils.findAnnotation(entityClass, ENTITY_JOIN);
    }

    public static boolean hasEntityJoin(Class<?> entityClass) {
        assertHasAnnotation(entityClass, EntityAnnotations.ENTITY);
        return entityClass.isAnnotationPresent(ENTITY_JOIN);
    }

    public static AuditTrailListener getEventListener(Class<?> entityClass) {
        assertHasAnnotation(entityClass, AUDIT_TRAIL_LISTENER);
        return AnnotationUtils.findAnnotation(entityClass, AUDIT_TRAIL_LISTENER);
    }

    private static void assertHasAnnotation(Class<?> entityClass, Class<? extends Annotation> annotationClass) {
        if (entityClass == null) {
            throw new AnnotationConfigurationException(Log.format("class not exists"));
        }
        if (!entityClass.isAnnotationPresent(annotationClass)) {
            throw new AnnotationConfigurationException(Log.format("class has not '" + annotationClass.getSimpleName() + "' annotation. [%s]", entityClass.getName()));
        }
    }
}
