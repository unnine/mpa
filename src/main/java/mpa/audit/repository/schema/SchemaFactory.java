package mpa.audit.repository.schema;

public class SchemaFactory {

    public static Data createData() {
        return DataImpl.ofDefault();
    }

    public static Row createRow() {
        return RowImpl.ofDefault();
    }

    public static ColumnImpl createColumn(String name, String data, Comment comment) {
        return ColumnImpl.of(name, data, comment);
    }

    public static ColumnImpl createAdditionalColumn(String name, String additionalName, String data, Comment comment) {
        return ColumnImpl.ofAdditional(name, additionalName, data, comment);
    }

    public static Comment createComment(String tableName, String columName, String comment) {
        return CommentImpl.of(tableName, columName, comment);
    }

}
