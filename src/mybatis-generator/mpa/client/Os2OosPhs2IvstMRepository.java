package mpa.client;

import java.util.List;
import mpa.Os2OosPhs2Ivst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosPhs2IvstMRepository extends Os2OosPhs2IvstMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosPhs2Ivst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}