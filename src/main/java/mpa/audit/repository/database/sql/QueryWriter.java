package mpa.audit.repository.database.sql;

public interface QueryWriter extends QueryResultParser {

    void write(QueryStructure queryStructure, Class<?> entityClass);

}