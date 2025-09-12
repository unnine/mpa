package mpa.persistence.entity.schema;

import lombok.Builder;
import mpa.util.StringUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

@Builder
public class MetaTableImpl implements MetaTable {

    private final String name;

    private final String alias = StringUtil.random();

    private final Map<String, MetaColumn> columns = new HashMap<>();


    public String getName() {
        return name;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public String addAlias(String s) {
        if (StringUtil.isEmpty(alias)) {
            return s;
        }
        return alias + "." + s;
    }

    @Override
    public MetaColumn getColumn(String columnName) {
        if (existsColumn(columnName)) {
            return columns.get(columnName);
        }
        return null;
    }

    @Override
    public boolean existsColumn(String columnName) {
        return columns.containsKey(columnName);
    }

    public MetaTableImpl(String name) {
        this.name = name;
    }

    public void addColumn(MetaColumn metaColumn) {
        this.columns.put(metaColumn.getName(), metaColumn);
    }

    @Override
    public Iterator<MetaColumn> iterator() {
        return columns.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super MetaColumn> action) {
        columns.values().forEach(action);
    }

    @Override
    public Spliterator<MetaColumn> spliterator() {
        return columns.values().spliterator();
    }
}
