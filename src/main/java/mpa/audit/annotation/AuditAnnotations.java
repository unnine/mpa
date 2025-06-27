package mpa.audit.annotation;

import mpa.persistence.entity.annotation.EntityAnnotations;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;

public class AuditAnnotations {

    public static final Class<AuditEntityJoin> ENTITY_JOIN = AuditEntityJoin.class;

    public static final Class<AuditJoin> JOIN = AuditJoin.class;

    public static final Class<AuditJoinDefinition> JOIN_DEFINITION = AuditJoinDefinition.class;

    public static final Class<AuditJoinDefinitions> JOIN_DEFINITIONS = AuditJoinDefinitions.class;

    public static final Class<AuditIgnore> AUDIT_IGNORE = AuditIgnore.class;


    public static AuditEntityJoin getEntityJoin(Class<?> entityClass) {
        assertHasAnnotation(entityClass, EntityAnnotations.ENTITY);
        return AnnotationUtils.findAnnotation(entityClass, ENTITY_JOIN);
    }

    public static boolean hasEntityJoin(Class<?> entityClass) {
        assertHasAnnotation(entityClass, EntityAnnotations.ENTITY);
        return entityClass.isAnnotationPresent(ENTITY_JOIN);
    }

    private static void assertHasAnnotation(Class<?> entityClass, Class<? extends Annotation> annotationClass) {
        if (entityClass == null) {
            throw new AnnotationConfigurationException("class not exists");
        }
        if (AnnotationUtils.findAnnotation(entityClass, annotationClass) == null) {
            throw new AnnotationConfigurationException("class has not '" + annotationClass.getSimpleName() + "' annotation. " + entityClass.getName());
        }
    }
}
