package mpa.audit_old.repository.database.sql;

import mpa.audit_old.repository.database.sql.parameter.Parameter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface SQL {

    ResultSet execute(PreparedStatement statement, Parameter parameter) throws SQLException;

    String toString();
}
