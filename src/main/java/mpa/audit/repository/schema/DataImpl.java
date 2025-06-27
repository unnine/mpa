package mpa.audit.repository.schema;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DataImpl implements Data {

    @EqualsAndHashCode.Include
    private final List<Row> rows;

    private final Map<String, Set<Column>> additionalColumn = new HashMap<>();


    private DataImpl(List<Row> rows) {
        this.rows = rows;
    }

    public static DataImpl ofDefault() {
        return new DataImpl(new ArrayList<>());
    }


    @Override
    public void addRow(Row row) {
        rows.add(row);
    }

    @Override
    public void forEach(BiConsumer<Row, Integer> rowBinder) {
        for (int i = 0; i < rows.size(); i++) {
            rowBinder.accept(rows.get(i), i);
        }
    }

    @Override
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(rows);
    }

    @Override
    public int size() {
        return rows.size();
    }

    @Override
    public Row getRow(int index) {
        if (rows.size() <= index) {
            return SchemaFactory.createRow();
        }
        return rows.get(index);
    }

    @Override
    public Iterator<Row> iterator() {
        return rows.iterator();
    }

    @Override
    public void forEach(Consumer<? super Row> action) {
        rows.forEach(action);
    }

    @Override
    public Spliterator<Row> spliterator() {
        return rows.spliterator();
    }

    @Override
    public void addAdditionalColumn(String key, Column column) {
        this.additionalColumn.putIfAbsent(key, new HashSet<>());
        Set<Column> columns = this.additionalColumn.get(key);
        columns.add(column);
    }

    public Map<String, Set<Column>> getAdditionalColumns() {
        return Collections.unmodifiableMap(additionalColumn);
    }
}
