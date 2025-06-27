package test_db.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import qualifier.TEST_DB;
import test_db.Member;

@TEST_DB
@Mapper
public interface MemberRepository extends test_db.repository.MemberMapper {
    default List<Member> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}