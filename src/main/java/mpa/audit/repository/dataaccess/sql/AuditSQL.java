package mpa.audit.repository.dataaccess.sql;

import mpa.audit.repository.dataaccess.schema.ColumnImpl;
import mpa.audit.repository.dataaccess.sql.argument.Argument;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface AuditSQL {

    void generateQuery();

    ResultSet execute(PreparedStatement statement, Argument argument) throws SQLException;

    boolean parseableColumn(ResultSet resultSet, int columnIndex) throws SQLException;

    ColumnImpl getColumn(ResultSet resultSet, int columnIndex) throws SQLException;

}