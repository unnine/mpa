package mpa.audit_old.repository.database.schema;

import java.util.*;
import java.util.function.Consumer;

public class MetaData implements Iterable<MetaTable> {

    private final Map<String, MetaTable> metaTables = new HashMap<>();


    public boolean existsTable(String tableName) {
        return metaTables.containsKey(tableName);
    }

    public void addTable(MetaTable metaTable) {
        this.metaTables.put(metaTable.getName(), metaTable);
    }

    public MetaTable getTable(String tableName) {
        if (existsTable(tableName)) {
            return metaTables.get(tableName);
        }
        return null;
    }

    public Map<String, MetaTable> getTables() {
        return Collections.unmodifiableMap(metaTables);
    }

    @Override
    public Iterator<MetaTable> iterator() {
        return metaTables.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super MetaTable> action) {
        metaTables.values().forEach(action);
    }

    @Override
    public Spliterator<MetaTable> spliterator() {
        return metaTables.values().spliterator();
    }
}
