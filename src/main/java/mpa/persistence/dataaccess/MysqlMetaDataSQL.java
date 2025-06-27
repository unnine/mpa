package mpa.persistence.dataaccess;

import mpa.persistence.dataaccess.MetaDataSQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlMetaDataSQL implements MetaDataSQL {

    private final String sql;


    public MysqlMetaDataSQL() {
        this.sql = createSQL();
    }


    @Override
    public ResultSet execute(PreparedStatement statement) throws SQLException {
        return statement.executeQuery();
    }

    @Override
    public String toString() {
        return sql;
    }

    private String createSQL() {
        return new StringBuilder()
                .append(" SELECT ")
                .append("   TABLE_NAME, ")
                .append("   COLUMN_NAME, ")
                .append("   COLUMN_COMMENT AS COMMENTS ")
                .append(" FROM information_schema.columns ")
                .append(" WHERE table_schema = (SELECT database()) ")
                .toString();
    }
}
