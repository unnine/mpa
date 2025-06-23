package mpa.audit_old.repository.database.schema;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CommentImpl implements Comment {

    @EqualsAndHashCode.Include
    private final String tableName;

    @EqualsAndHashCode.Include
    private final String columName;

    private final String value;


    private CommentImpl(String tableName, String columName, String value) {
        this.tableName = tableName;
        this.columName = columName;
        this.value = value;
    }

    public static CommentImpl ofDefault() {
        return new CommentImpl(null, null, null);
    }

    public static CommentImpl of(String tableName, String columName, String value) {
        return new CommentImpl(tableName, columName, value);
    }


    @Override
    public String tableName() {
        return tableName;
    }

    @Override
    public String columnName() {
        return columName;
    }

    @Override
    public String value() {
        return value;
    }
}
