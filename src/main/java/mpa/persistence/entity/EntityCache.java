package mpa.persistence.entity;

public interface EntityCache extends Iterable<EntityDefinition> {

    boolean existsByTableName(String tableName);

    boolean existsByEntity(Class<?> entityClass);

    EntityDefinition getByTableName(String tableName);

    EntityDefinition getByEntity(Class<?> entityClass);

    void add(EntityDefinition entityDefinition);

    void clear();

}
