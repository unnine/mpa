package mpa.client;

import java.util.List;
import mpa.Rc1RacRcs;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Rc1RacRcsMRepository extends Rc1RacRcsMapper, MybatisPersistenceAssistantRepository {
    default List<Rc1RacRcs> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}