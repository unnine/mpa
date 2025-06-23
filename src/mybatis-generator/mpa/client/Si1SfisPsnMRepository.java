package mpa.client;

import java.util.List;
import mpa.Si1SfisPsn;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Si1SfisPsnMRepository extends Si1SfisPsnMapper, MybatisPersistenceAssistantRepository {
    default List<Si1SfisPsn> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}