package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.holder.Scope;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RequiredArgsConstructor
public class InMemoryEntityCache implements EntityCache {

    private final Map<String, EntityDefinition> cache = new HashMap<>();

    private final Scope scope;


    @Override
    public boolean existsByTableName(String tableName) {
        return cache.containsKey(tableName);
    }

    @Override
    public boolean existsByEntity(Class<?> entityClass) {
        String tableName = getTableName(entityClass);
        return existsByTableName(tableName);
    }

    @Override
    public EntityDefinition getByTableName(String tableName) {
        if (existsByTableName(tableName)) {
            return cache.get(tableName);
        }
        return null;
    }

    @Override
    public EntityDefinition getByEntity(Class<?> entityClass) {
        String tableName = getTableName(entityClass);
        return cache.get(tableName);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public void add(EntityDefinition entityDefinition) {
        cache.put(entityDefinition.getTableName(), entityDefinition);
    }

    private String getTableName(Class<?> entityClass) {
        return convertCase(EntityAnnotations.getTableName(entityClass));
    }

    private String convertCase(String s) {
        return scope.getDataSourceAware().getCaseConversionStrategy().convert(s);
    }

    @Override
    public Iterator<EntityDefinition> iterator() {
        return cache.values().iterator();
    }

}
