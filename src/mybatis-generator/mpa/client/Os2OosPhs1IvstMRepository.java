package mpa.client;

import java.util.List;
import mpa.Os2OosPhs1Ivst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosPhs1IvstMRepository extends Os2OosPhs1IvstMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosPhs1Ivst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}