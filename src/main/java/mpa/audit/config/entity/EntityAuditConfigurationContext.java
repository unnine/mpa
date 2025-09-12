package mpa.audit.config.entity;

import mpa.util.ClassUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EntityAuditConfigurationContext {

    private final Map<String, AuditJoinContext<?>> joinContextByEntity = new HashMap<>();


    @SuppressWarnings("rawtypes, unchecked")
    public void apply(EntityAuditConfigurer<?> configurer) {
        Class<?> entityClass = getEntityClass(configurer);
        String entityClassName = entityClass.getName();

        joinContextByEntity.putIfAbsent(entityClassName, new AuditJoinContext<>(entityClass));
        AuditJoinContext joinContext = joinContextByEntity.get(entityClassName);
        configurer.join(joinContext);
    }

    private Class<?> getEntityClass(EntityAuditConfigurer<?> configurer) {
        return ClassUtil.getImplementsGenericTypeByTypeName(configurer.getClass(), EntityAuditConfigurer.class.getTypeName());
    }

    public Optional<AuditJoinContext<?>> getJoinContext(Class<?> entityClass) {
        String entityClassName = entityClass.getName();

        if (joinContextByEntity.containsKey(entityClassName)) {
            AuditJoinContext<?> joinContext = joinContextByEntity.get(entityClassName);
            return Optional.of(joinContext);
        }
        return Optional.empty();
    }

}
