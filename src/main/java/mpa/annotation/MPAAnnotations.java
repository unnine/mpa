package mpa.annotation;

import mpa.persistence.annotation.Entity;
import mpa.persistence.annotation.Id;
import mpa.util.Log;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;

public class MPAAnnotations {

    public static final Class<Entity> ENTITY = Entity.class;

    public static final Class<Id> IDENTIFY = Id.class;


    public static String getTableName(Class<?> entityClass) {
        Entity entityAnnotation = getEntity(entityClass);
        return entityAnnotation.name();
    }

    public static Entity getEntity(Class<?> entityClass) {
        assertHasEntityAnnotation(entityClass);
        return AnnotationUtils.findAnnotation(entityClass, ENTITY);
    }

    private static void assertHasEntityAnnotation(Class<?> entityClass) {
        if (entityClass == null) {
            throw new AnnotationConfigurationException(Log.format("class not exists"));
        }
        if (!entityClass.isAnnotationPresent(ENTITY)) {
            throw new AnnotationConfigurationException(Log.format("class has not 'Entity' annotation. [%s]", entityClass.getName()));
        }
    }
}
