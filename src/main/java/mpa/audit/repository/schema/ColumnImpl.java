package mpa.audit.repository.schema;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ColumnImpl implements Column {

    private final boolean additional;

    @EqualsAndHashCode.Include
    private final String name;

    @EqualsAndHashCode.Include
    private final String value;

    @EqualsAndHashCode.Include
    private final Comment comment;

    private boolean isOrigin = true;


    private ColumnImpl(boolean additional, String name, String value, Comment comment) {
        this.additional = additional;
        this.name = getOrDefault(name, "");
        this.value = getOrDefault(value, "");
        this.comment = getOrDefault(comment, CommentImpl.ofDefault());
    }

    public static ColumnImpl of(boolean additional, String name, String value, Comment comment) {
        return new ColumnImpl(additional, name, value, comment);
    }


    @Override
    public boolean isAdditional() {
        return additional;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public Comment comment() {
        return comment;
    }

    @Override
    public boolean equalsData(Column column) {
        String value = column.value();

        if (this.value == null) {
            return value == null;
        }
        return this.value.equals(value);
    }

    public <T> T getOrDefault(T value, T defaultValue) {
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

}