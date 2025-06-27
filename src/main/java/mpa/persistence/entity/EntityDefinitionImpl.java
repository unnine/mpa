package mpa.persistence.entity;

import lombok.Getter;
import mpa.persistence.entity.schema.MetaTable;

@Getter
public class EntityDefinitionImpl implements EntityDefinition {

    private final MetaTable metaTable;
    private final Class<?> entityClass;


    public EntityDefinitionImpl(MetaTable metaTable, Class<?> entityClass) {
        this.metaTable = metaTable;
        this.entityClass = entityClass;
    }


    @Override
    public String getTableName() {
        return metaTable.getName();
    }
}