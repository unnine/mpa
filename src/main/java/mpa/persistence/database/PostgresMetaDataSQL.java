package mpa.persistence.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgresMetaDataSQL implements MetaDataSQL {

    private final String sql;


    public PostgresMetaDataSQL() {
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

    private static String createSQL() {
        return new StringBuilder()
                .append(" SELECT ")
                .append("   TABLE_NAME, ")
                .append("   COLUMN_NAME, ")
                .append("   COL_DESCRIPTION((TABLE_SCHEMA||'.'||TABLE_NAME)::REGCLASS::OID, ORDINAL_POSITION) AS COMMENTS")
                .append(" FROM information_schema.columns ")
                .append(" WHERE table_schema = (SELECT current_schema()) ")
                .toString();
    }

}
