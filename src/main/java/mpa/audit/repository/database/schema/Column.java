package mpa.audit.repository.database.schema;

public interface Column {

    String name();

    String value();

    Comment comment();

    Column origin();

    boolean isOrigin();

    boolean isAdditional();

    boolean equalsData(Column column);

}