package mpa.loader;

import lombok.RequiredArgsConstructor;
import mpa.annotation.MPAAnnotations;
import mpa.audit.config.ScopedAuditConfiguration;
import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.config.type.DatabaseType;
import mpa.audit.repository.database.DataAccessRepository;
import mpa.audit.repository.database.schema.MetaData;
import mpa.audit.repository.database.schema.MetaTable;
import mpa.audit.repository.database.sql.MetaDataSQL;
import mpa.audit.repository.database.sql.PrimaryIdentifierAuditSQL;
import mpa.audit.repository.database.sql.QueryWriter;
import mpa.entity.EntityDefinition;
import mpa.entity.GeneralEntityDefinition;
import mpa.entity.cache.EntityCache;
import mpa.persistence.annotation.Entity;
import mpa.util.Log;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class RuntimeEntityLoader implements EntityLoader {

    private final AuditApplicationContextAware contextAware;
    private final ScopedAuditConfiguration configuration;
    private final AuditScopeAware scopeAware;
    private final EntityCache entityCache;
    private final DataAccessRepository dataAccessRepository;
    private final QueryWriter queryWriter;
    private final RepositoryScanner repositoryScanner;


    @Override
    public void load() {
        caching();
        generateAuditQuery();
        repositoryScanner.scan();
    }

    private void caching() {
        entityCache.clear();

        Set<EntityDefinition> entityDefinitions = loadEntityDefinitions();
        for (EntityDefinition entityDefinition : entityDefinitions) {
            if (alreadyLoadedEntity(entityDefinition.getTableName())) {
                Log.warn("there is already loaded entity. [{}]", entityDefinition.getEntityClass(), entityDefinition.getEntityClass().getName());
                continue;
            }
            entityCache.add(entityDefinition);
        }
    }

    private Set<EntityDefinition> loadEntityDefinitions() {
        Map<String, MetaTable> metaTables = getMetaTables();
        Collection<Object> entities = scanEntities();

        Set<EntityDefinition> entityDefinitions = new HashSet<>();

        for (Object entity : entities) {
            Class<?> entityClass = entity.getClass();

            if (!belongToCurrentScope(entityClass)) {
                continue;
            }

            String tableName = MPAAnnotations.getTableName(entityClass);

            if (!StringUtils.hasLength(tableName)) {
                Log.warn("there is no table name. declare the name attribute in the @Entity annotation. [{}]", entityClass.getName());
                continue;
            }
            if (!existsEntityInDatabase(metaTables, tableName)) {
                Log.warn("not exists schema in database. [{}]", tableName, entityClass.getName());
                continue;
            }

            MetaTable metaTable = metaTables.get(tableName);
            PrimaryIdentifierAuditSQL auditSQL = new PrimaryIdentifierAuditSQL(configuration, queryWriter, entityClass, metaTable.getAlias());
            EntityDefinition entityDefinition = new GeneralEntityDefinition(metaTable, entityClass, tableName, auditSQL);

            entityDefinitions.add(entityDefinition);
        }
        return entityDefinitions;
    }

    private Map<String, MetaTable> getMetaTables() {
        DatabaseType databaseType = configuration.databaseType();
        MetaDataSQL metaDataSQL = databaseType.getMetaDataSQL();
        MetaData metaData = dataAccessRepository.selectMetaData(metaDataSQL);
        return metaData.getTables();
    }

    private Collection<Object> scanEntities() {
        Map<String, Object> entities = contextAware.getBeansWithAnnotation(MPAAnnotations.ENTITY);
        return entities.values();
    }

    private boolean belongToCurrentScope(Class<?> entityClass) {
        if (!scopeAware.existsSchema()) {
            return true;
        }
        Entity entityAnnotation = MPAAnnotations.getEntity(entityClass);
        String schema = entityAnnotation.schema();

        if (schema == null || schema.isEmpty()) {
            return true;
        }
        return scopeAware.schema().equals(schema);
    }

    private boolean existsEntityInDatabase(Map<String, MetaTable> metaTables, String tableName) {
        if (metaTables.containsKey(tableName)) {
            return true;
        }
        Log.warn("not found audit entity in database. entity: {}", tableName);
        return false;
    }

    private boolean alreadyLoadedEntity(String tableName) {
        return entityCache.existsByTableName(tableName);
    }

    private void generateAuditQuery() {
        for (EntityDefinition entityDefinition : entityCache) {
            entityDefinition.getAuditSQL().generateQuery();
        }
    }

}