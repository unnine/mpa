package mpa.fixture.domain.test_db.repository;

import java.util.List;

import mpa.fixture.domain.qualifier.TEST_DB;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import mpa.fixture.domain.test_db.Member;

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