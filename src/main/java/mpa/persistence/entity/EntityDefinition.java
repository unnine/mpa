package mpa.persistence.entity;

import mpa.persistence.entity.schema.MetaTable;

public interface EntityDefinition {

    MetaTable getMetaTable();

    Class<?> getEntityClass();

    String getTableName();

}
