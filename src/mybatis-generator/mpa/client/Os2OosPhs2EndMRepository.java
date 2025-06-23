package mpa.client;

import java.util.List;
import mpa.Os2OosPhs2End;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosPhs2EndMRepository extends Os2OosPhs2EndMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosPhs2End> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}