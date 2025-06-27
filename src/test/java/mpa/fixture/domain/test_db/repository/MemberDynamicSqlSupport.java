package mpa.fixture.domain.test_db.repository;

import java.sql.JDBCType;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class MemberDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Member member = new Member();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = member.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = member.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> email = member.email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDate> createdt = member.createdt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDate> updatedt = member.updatedt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Member extends AliasableSqlTable<Member> {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("EMAIL", JDBCType.VARCHAR);

        public final SqlColumn<LocalDate> createdt = column("CREATEDT", JDBCType.DATE);

        public final SqlColumn<LocalDate> updatedt = column("UPDATEDT", JDBCType.DATE);

        public Member() {
            super("PUBLIC.MEMBER", Member::new);
        }
    }
}