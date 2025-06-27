package mpa.audit.repository.dataaccess.sql;

public interface SQLAuditColumn {

    String columnName();

    String originColumnName();

    String displayColumnName();

    String displayTableName();

    String value();

    String comment();

    String additionalAuditName();

    boolean isAdditional();

    boolean isJoinAddition();

}
