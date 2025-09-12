package default$.repository;

import default$.Member;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import qualifier.DEFAULT$;

@DEFAULT$
@Mapper
public interface MemberRepository extends MemberMapper {
    default List<Member> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}