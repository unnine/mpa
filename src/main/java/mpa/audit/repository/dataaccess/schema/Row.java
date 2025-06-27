package mpa.audit.repository.dataaccess.schema;

import java.util.List;
import java.util.Optional;

public interface Row extends Iterable<Column> {

    void addColumn(Column column);

    Optional<Column> getColumn(String columnName);

    void removeColumns(List<String> columnNames);

}