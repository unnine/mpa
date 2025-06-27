package mpa.audit.repository.schema;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.*;
import java.util.function.Consumer;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RowImpl implements Row {

    @EqualsAndHashCode.Include
    private final Map<String, Column> columns;


    private RowImpl(Map<String, Column> columns) {
        this.columns = columns;
    }

    public static RowImpl ofDefault() {
        return new RowImpl(new HashMap<>());
    }

    @Override
    public void addColumn(Column column) {
        columns.put(column.name(), column);
    }

    @Override
    public Optional<Column> getColumn(String columnName) {
        return Optional.ofNullable(columns.get(columnName));
    }

    @Override
    public void removeColumns(List<String> columnNames) {
        for (String columnName : columnNames) {
            if (!existsColumn(columnName)) {
                return;
            }
            columns.remove(columnName);
        }
    }

    private boolean existsColumn(String columnName) {
        return columns.containsKey(columnName);
    }

    @Override
    public Iterator<Column> iterator() {
        return columns.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super Column> action) {
        columns.values().forEach(action);
    }

    @Override
    public Spliterator<Column> spliterator() {
        return columns.values().spliterator();
    }

}