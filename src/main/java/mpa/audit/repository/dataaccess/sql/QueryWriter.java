package mpa.audit.repository.dataaccess.sql;

public interface QueryWriter extends QueryResultParser {

    void write(QueryStructure queryStructure, Class<?> entityClass);

}