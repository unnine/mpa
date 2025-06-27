package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scopable;

import java.util.Collection;
import java.util.Iterator;

@RequiredArgsConstructor
public class ScopableEntityCache implements EntityCache {

    private final Scopable<EntityCache> proxy;


    private EntityCache getInstance() {
        return proxy.getInstance();
    }


    @Override
    public boolean existsByTableName(String tableName) {
        return getInstance().existsByTableName(tableName);
    }

    @Override
    public boolean existsByEntity(Class<?> entityClass) {
        return getInstance().existsByEntity(entityClass);
    }

    @Override
    public EntityDefinition getByTableName(String tableName) {
        return getInstance().getByTableName(tableName);
    }

    @Override
    public EntityDefinition getByEntity(Class<?> entityClass) {
        return getInstance().getByEntity(entityClass);
    }

    @Override
    public void addAll(Collection<EntityDefinition> entityDefinitions) {
        getInstance().addAll(entityDefinitions);
    }

    @Override
    public Iterator<EntityDefinition> iterator() {
        return getInstance().iterator();
    }
}
