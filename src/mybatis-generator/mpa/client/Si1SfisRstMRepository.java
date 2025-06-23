package mpa.client;

import java.util.List;
import mpa.Si1SfisRst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Si1SfisRstMRepository extends Si1SfisRstMapper, MybatisPersistenceAssistantRepository {
    default List<Si1SfisRst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}