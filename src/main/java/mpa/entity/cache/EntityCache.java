package mpa.entity.cache;

import mpa.entity.EntityDefinition;

public interface EntityCache extends Iterable<EntityDefinition> {

    boolean existsByTableName(String tableName);

    EntityDefinition getByTableName(String tableName);

    void clear();

    void add(EntityDefinition entityDefinition);

}
