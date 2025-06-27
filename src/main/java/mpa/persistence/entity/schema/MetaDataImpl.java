package mpa.persistence.entity.schema;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MetaDataImpl implements MetaData {

    private final Map<String, MetaTable> metaTables = new HashMap<>();


    @Override
    public boolean existsTable(String tableName) {
        return metaTables.containsKey(tableName);
    }

    @Override
    public void addTable(MetaTable metaTable) {
        this.metaTables.put(metaTable.getName(), metaTable);
    }

    @Override
    public MetaTable getTable(String tableName) {
        if (existsTable(tableName)) {
            return metaTables.get(tableName);
        }
        return null;
    }

    @Override
    public Map<String, MetaTable> getTables() {
        return Collections.unmodifiableMap(metaTables);
    }

    @Override
    public Iterator<MetaTable> iterator() {
        return metaTables.values().iterator();
    }
}
