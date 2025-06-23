package mpa.client;

import java.util.List;
import mpa.At1AdtrElamAtc;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface At1AdtrElamAtcMRepository extends At1AdtrElamAtcMapper, MybatisPersistenceAssistantRepository {
    default List<At1AdtrElamAtc> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}