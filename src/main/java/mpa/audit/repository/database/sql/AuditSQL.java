package mpa.audit.repository.database.sql;

import mpa.audit.repository.database.schema.ColumnImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface AuditSQL extends SQL {

    void generateQuery();

    boolean parseableColumn(ResultSet resultSet, int columnIndex) throws SQLException;

    ColumnImpl getColumn(ResultSet resultSet, int columnIndex) throws SQLException;

}