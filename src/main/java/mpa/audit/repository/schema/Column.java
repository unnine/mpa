package mpa.audit.repository.schema;

public interface Column {

    boolean isAdditional();

    String name();

    String value();

    Comment comment();

    boolean equalsData(Column column);

}