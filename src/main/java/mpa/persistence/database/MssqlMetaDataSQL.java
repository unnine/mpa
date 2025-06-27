package mpa.persistence.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MssqlMetaDataSQL implements MetaDataSQL {

    private final String sql;


    public MssqlMetaDataSQL() {
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
                .append("   B.TABLE_NAME AS TABLE_NAME, ")
                .append("   B.COLUMN_NAME AS COLUMN_NAME, ")
                .append("   C.VALUE AS COMMENTS ")
                .append(" FROM sys.schemas A ")
                .append(" INNER JOIN INFORMATION_SCHEMA.COLUMNS B ON A.schema_id = SCHEMA_ID(B.TABLE_SCHEMA) ")
                .append(" LEFT OUTER JOIN SYS.EXTENDED_PROPERTIES C ON C.MAJOR_ID = OBJECT_ID(B.TABLE_NAME) AND C.MINOR_ID = B.ORDINAL_POSITION ")
                .append("UNION ALL")
                .append(" SELECT ")
                .append("   B.TABLE_NAME AS TABLE_NAME, ")
                .append("   B.COLUMN_NAME AS COLUMN_NAME, ")
                .append("   C.VALUE AS COMMENTS ")
                .append(" FROM sys.synonyms A ")
                .append(" INNER JOIN INFORMATION_SCHEMA.COLUMNS B ON A.schema_id = SCHEMA_ID(B.TABLE_SCHEMA) ")
                .append(" LEFT OUTER JOIN SYS.EXTENDED_PROPERTIES C ON C.MAJOR_ID = OBJECT_ID(B.TABLE_NAME) AND C.MINOR_ID = B.ORDINAL_POSITION ")
                .append(" WHERE B.TABLE_SCHEMA IN (SELECT PARSENAME(A.base_object_name, 2) FROM SYS.SYNONYMS) ")
                .append("   AND B.TABLE_NAME IN (SELECT PARSENAME(A.base_object_name, 1) FROM SYS.SYNONYMS) ")
                .toString();
    }

}
