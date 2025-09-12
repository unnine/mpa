package default$.repository;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class MyLikeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MyLike myLike = new MyLike();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = myLike.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> memberId = myLike.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> count = myLike.count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MyLike extends AliasableSqlTable<MyLike> {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> memberId = column("MEMBER_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("COUNT", JDBCType.INTEGER);

        public MyLike() {
            super("PUBLIC.MY_LIKE", MyLike::new);
        }
    }
}