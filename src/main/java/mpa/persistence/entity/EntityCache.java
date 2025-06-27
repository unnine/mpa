package mpa.persistence.entity;

import java.util.Collection;

public interface EntityCache extends Iterable<EntityDefinition> {

    boolean existsByTableName(String tableName);

    boolean existsByEntity(Class<?> entityClass);

    EntityDefinition getByTableName(String tableName);

    EntityDefinition getByEntity(Class<?> entityClass);

    void addAll(Collection<EntityDefinition> entityDefinitions);

}
