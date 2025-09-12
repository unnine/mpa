package mpa.audit.repository.schema;

public class SchemaFactory {

    public static Data createData() {
        return DataImpl.ofDefault();
    }

    public static Row createRow() {
        return RowImpl.ofDefault();
    }

    public static ColumnImpl createColumn(boolean additional, String name, String data, Comment comment) {
        return ColumnImpl.of(additional, name, data, comment);
    }

    public static Comment createComment(String tableName, String columName, String comment) {
        return CommentImpl.of(tableName, columName, comment);
    }

}
