package mpa.client;

import java.util.List;
import mpa.Os2OosPhs1IvstObv;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosPhs1IvstObvMRepository extends Os2OosPhs1IvstObvMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosPhs1IvstObv> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}