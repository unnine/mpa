package mpa.audit.repository.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryResultParser {

    boolean supports(ResultSet resultSet, int columnIndex) throws SQLException;

    QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException;

}