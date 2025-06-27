package mpa.persistence.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface MetaDataSQL {

    ResultSet execute(PreparedStatement statement) throws SQLException;

}
