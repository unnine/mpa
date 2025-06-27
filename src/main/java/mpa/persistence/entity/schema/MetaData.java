package mpa.persistence.entity.schema;

import java.util.Map;

public interface MetaData extends Iterable<MetaTable> {

    boolean existsTable(String tableName);

    void addTable(MetaTable metaTable);

    MetaTable getTable(String tableName);

    Map<String, MetaTable> getTables();
}
