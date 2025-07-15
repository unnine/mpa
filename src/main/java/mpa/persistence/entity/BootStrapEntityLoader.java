package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.entity.schema.MetaData;
import mpa.persistence.entity.schema.MetaTable;
import mpa.util.Log;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class BootStrapEntityLoader implements EntityLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;
    private final EntityCache entityCache;
    private final EntityMetaDataRepository metaDataRepository;


    @Override
    public void load() {
        scopeAware.forEach(this::caching);
    }

    private void caching(Scope scope) {
        Set<EntityDefinition> entityDefinitions = loadEntityDefinitions(scope.getDataSourceAware().getCaseConversionStrategy());
        entityCache.addAll(entityDefinitions);
    }

    private Set<EntityDefinition> loadEntityDefinitions(CaseConversionStrategy caseConversionStrategy) {
        Map<String, MetaTable> metaTables = getMetaTables();
        Collection<Object> entities = scanEntities();

        Set<EntityDefinition> entityDefinitions = new HashSet<>();

        for (Object entity : entities) {
            Class<?> entityClass = entity.getClass();
            String tableName = caseConversionStrategy.convert(EntityAnnotations.getTableName(entityClass));

            if (!existsEntityInDatabase(metaTables, tableName)) {
                Log.warn("not exists schema in database. [{}]", tableName, entityClass.getName());
                continue;
            }

            MetaTable metaTable = metaTables.get(tableName);
            EntityDefinition entityDefinition = new EntityDefinitionImpl(metaTable, entityClass);

            entityDefinitions.add(entityDefinition);
        }
        return entityDefinitions;
    }

    private Map<String, MetaTable> getMetaTables() {
        MetaData metaData = metaDataRepository.selectMetaData();
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
        Log.warn("not found audit entity in database. entity: {}", tableName);
        return false;
    }

}