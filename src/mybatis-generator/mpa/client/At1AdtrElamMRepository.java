package mpa.client;

import java.util.List;
import mpa.At1AdtrElam;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface At1AdtrElamMRepository extends At1AdtrElamMapper, MybatisPersistenceAssistantRepository {
    default List<At1AdtrElam> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}