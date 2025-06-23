package mpa.audit_old.repository.database.schema;

public interface MetaTable extends Iterable<MetaColumn> {

    String getName();

    String getAlias();

    MetaColumn getColumn(String columnName);

    void addColumn(MetaColumn metaColumn);

    boolean existsColumn(String columnName);

}
