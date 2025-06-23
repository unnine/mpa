package mpa.client;

import java.util.List;
import mpa.SyEaprLine;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface SyEaprLineMRepository extends SyEaprLineMapper, MybatisPersistenceAssistantRepository {
    default List<SyEaprLine> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}