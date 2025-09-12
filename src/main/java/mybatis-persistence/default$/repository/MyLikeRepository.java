package default$.repository;

import default$.MyLike;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import qualifier.DEFAULT$;

@DEFAULT$
@Mapper
public interface MyLikeRepository extends MyLikeMapper {
    default List<MyLike> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}