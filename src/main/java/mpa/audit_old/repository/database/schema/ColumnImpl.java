package mpa.audit_old.repository.database.schema;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ColumnImpl implements Column {

    @EqualsAndHashCode.Include
    private final String name;

    @EqualsAndHashCode.Include
    private final String additionalName;

    @EqualsAndHashCode.Include
    private final String value;

    @EqualsAndHashCode.Include
    private final Comment comment;

    private boolean isOrigin = true;

    private boolean isAdditional = false;

    private Column origin;


    private ColumnImpl(String name, String additionalName, String value, Comment comment) {
        this.name = getOrDefault(name, "");
        this.additionalName = getOrDefault(additionalName, "");
        this.value = getOrDefault(value, "");
        this.comment = getOrDefault(comment, CommentImpl.ofDefault());
    }

    private static Column empty() {
        return new ColumnImpl(null, null, null, null);
    }

    public static ColumnImpl of(String name, String value, Comment comment) {
        return new ColumnImpl(name, name, value, comment);
    }

    public static ColumnImpl ofAdditional(String name, String additionalName, String value, Comment comment) {
        return new ColumnImpl(name, additionalName, value, comment);
    }


    @Override
    public String name() {
        return name;
    }

    public String additionalName() {
        return additionalName;
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
    public Column origin() {
        if (origin == null) {
            return ColumnImpl.empty();
        }
        return origin;
    }

    public void setOrigin(Column origin) {
        if (origin == null) {
            return;
        }
        this.origin = origin;
        this.isOrigin = false;
    }

    @Override
    public boolean isOrigin() {
        return isOrigin;
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

    public void toAdditional() {
        this.isAdditional = true;
    }

    @Override
    public boolean isAdditional() {
        return isAdditional;
    }
}