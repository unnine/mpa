package mpa.audit.repository.schema;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public interface Data extends Iterable<Row> {

    void addRow(Row row);

    void forEach(BiConsumer<Row, Integer> rowBinder);

    boolean isEmpty();

    int size();

    Row getRow(int index);

    void addAdditionalColumn(String key, Column value);

    Map<String, Set<Column>> getAdditionalColumns();

}
