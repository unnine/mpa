package mpa.audit.repository.sql;

import lombok.Getter;
import lombok.Setter;
import mpa.audit.repository.schema.Column;
import mpa.audit.repository.schema.ColumnImpl;
import mpa.audit.repository.schema.SchemaFactory;

public class QueryResultColumn {

    @Getter
    @Setter
    private String sourceTableName;

    @Getter
    @Setter
    private String sourceColumName;

    @Setter
    private String tableName;

    @Setter
    private String name;

    @Getter
    @Setter
    private String additionalName;

    @Setter
    private String value;

    @Setter
    private String comment;

    private Column origin;

    private boolean additional = false;


    public void toAdditional() {
        this.additional = true;
    }

    public void setOrigin(Column origin) {
        if (origin == null) {
            return;
        }
        this.origin = origin;
    }

    public ColumnImpl toColumn() {
        ColumnImpl column = SchemaFactory.createAdditionalColumn(name, additionalName, value, SchemaFactory.createComment(tableName, name, comment));

        if (additional) {
            column.toAdditional();
        }

        if (origin != null) {
            column.setOrigin(origin);
        }

        return column;
    }

}
