package mpa.client;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SpringSessionAttributesDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SpringSessionAttributes springSessionAttributes = new SpringSessionAttributes();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sessionPrimaryId = springSessionAttributes.sessionPrimaryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attributeName = springSessionAttributes.attributeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> attributeBytes = springSessionAttributes.attributeBytes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SpringSessionAttributes extends AliasableSqlTable<SpringSessionAttributes> {
        public final SqlColumn<String> sessionPrimaryId = column("SESSION_PRIMARY_ID", JDBCType.CHAR);

        public final SqlColumn<String> attributeName = column("ATTRIBUTE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> attributeBytes = column("ATTRIBUTE_BYTES", JDBCType.BLOB);

        public SpringSessionAttributes() {
            super("PHM7_1_QMS_USER.SPRING_SESSION_ATTRIBUTES", SpringSessionAttributes::new);
        }
    }
}