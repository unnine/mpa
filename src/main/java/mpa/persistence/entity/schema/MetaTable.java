package mpa.persistence.entity.schema;

public interface MetaTable extends Iterable<MetaColumn> {

    String getName();

    String getAlias();

    String addAlias(String s);

    MetaColumn getColumn(String columnName);

    void addColumn(MetaColumn metaColumn);

    boolean existsColumn(String columnName);

}
