package mpa.audit.repository.sql;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.repository.schema.ColumnImpl;
import mpa.audit.repository.schema.SchemaFactory;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class QueryResultColumn {

    private final boolean additional;

    private final String tableName;

    @Getter
    private final String columName;

    private final String value;

    private final String comment;


    public static QueryResultColumn of(String tableName, String columName, String value, String comment) {
        return new QueryResultColumn(
                false,
                tableName,
                columName,
                value,
                comment
        );
    }

    public static QueryResultColumn ofAdditional(String tableName, String columName, String value, String comment) {
        return new QueryResultColumn(
                true,
                tableName,
                columName,
                value,
                comment
        );
    }

    public static QueryResultColumn empty() {
        return new QueryResultColumn(false, null, null, null, null);
    }


    public boolean isEmpty() {
        return tableName == null && columName == null;
    }

    public ColumnImpl toColumn() {
        return SchemaFactory.createColumn(
                additional,
                columName,
                value,
                SchemaFactory.createComment(tableName, columName, comment)
        );
    }

}
