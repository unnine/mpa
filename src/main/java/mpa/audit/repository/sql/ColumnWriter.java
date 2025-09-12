package mpa.audit.repository.sql;

import mpa.audit.repository.sql.join.Join;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ColumnWriter {

    void write(QueryStructure queryStructure, Class<?> entityClass, Join join);

    boolean supports(ResultSet resultSet, int columnIndex) throws SQLException;

    QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException;

}
