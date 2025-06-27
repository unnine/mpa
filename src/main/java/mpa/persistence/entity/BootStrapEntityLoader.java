package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.entity.schema.MetaData;
import mpa.persistence.entity.schema.MetaTable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
@RequiredArgsConstructor
public class BootStrapEntityLoader implements EntityLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCacheScopable;
    private final Scopable<EntityMetaDataRepository> metaDataRepositoryScopable;


    @Override
    public void load() {
        scopeAware.forEach(this::caching);
    }

    private void caching(Scope scope) {
        Set<EntityDefinition> entityDefinitions = loadEntityDefinitions(scope);
        entityCacheScopable.getInstance(scope).addAll(entityDefinitions);
    }

    private Set<EntityDefinition> loadEntityDefinitions(Scope scope) {
        CaseConversionStrategy caseConversionStrategy = getCaseConversionStrategy(scope);
        Map<String, MetaTable> metaTables = getMetaTables(scope);
        Collection<Object> entities = scanEntities();

        Set<EntityDefinition> entityDefinitions = new HashSet<>();

        for (Object entity : entities) {
            Class<?> entityClass = entity.getClass();
            String tableName = caseConversionStrategy.convert(EntityAnnotations.getTableName(entityClass));

            if (!existsEntityInDatabase(metaTables, tableName)) {
                log.warn("not exists table '{}' in database. {}", tableName, entityClass.getName());
                continue;
            }

            MetaTable metaTable = metaTables.get(tableName);
            EntityDefinition entityDefinition = new EntityDefinitionImpl(metaTable, entityClass);

            entityDefinitions.add(entityDefinition);
        }
        return entityDefinitions;
    }

    private CaseConversionStrategy getCaseConversionStrategy(Scope scope) {
        return scope.getDataSourceAware().getCaseConversionStrategy();
    }

    private Map<String, MetaTable> getMetaTables(Scope scope) {
        MetaData metaData = metaDataRepositoryScopable.getInstance(scope).selectMetaData();
        return metaData.getTables();
    }

    private Collection<Object> scanEntities() {
        Map<String, Object> entities = contextAware.getBeansWithAnnotation(EntityAnnotations.ENTITY);
        return entities.values();
    }

    private boolean existsEntityInDatabase(Map<String, MetaTable> metaTables, String tableName) {
        if (metaTables.containsKey(tableName)) {
            return true;
        }
        log.warn("not found audit entity in database. entity: {}", tableName);
        return false;
    }

}