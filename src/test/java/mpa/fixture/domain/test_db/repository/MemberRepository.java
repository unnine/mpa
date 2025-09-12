package mpa.fixture.domain.test_db.repository;

import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.Member;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

import java.util.List;

@TEST_DB
@Mapper
public interface MemberRepository extends MemberMapper {
    default List<Member> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}