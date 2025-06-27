package mpa.persistence.entity;

public interface EntityCache extends Iterable<EntityDefinition> {

    boolean existsByTableName(String tableName);

    EntityDefinition getByTableName(String tableName);

    void clear();

    void add(EntityDefinition entityDefinition);

}
