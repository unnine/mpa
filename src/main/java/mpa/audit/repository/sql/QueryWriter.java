package mpa.audit.repository.sql;

public interface QueryWriter extends QueryResultParser {

    void write(QueryStructure queryStructure, Class<?> entityClass);

}