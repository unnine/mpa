package mpa.audit.repository.database.sql;

import mpa.audit.repository.database.sql.parameter.Parameter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleMetaDataSQL implements MetaDataSQL {

    private final String sql;


    public OracleMetaDataSQL() {
        this.sql = createSQL();
    }


    @Override
    public ResultSet execute(PreparedStatement statement, Parameter parameter) throws SQLException {
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
                .append("   COMMENTS ")
                .append(" FROM USER_COL_COMMENTS ")
                .append(" UNION ALL ")
                .append(" SELECT ")
                .append("   S.SYNONYM_NAME AS TABLE_NAME, ")
                .append("   C.COLUMN_NAME  AS COLUMN_NAME, ")
                .append("   C.COMMENTS     AS COMMENTS ")
                .append(" FROM USER_SYNONYMS S ")
                .append(" JOIN ALL_COL_COMMENTS C ON S.TABLE_OWNER = C.OWNER AND S.TABLE_NAME = C.TABLE_NAME ")
                .toString();
    }

}
