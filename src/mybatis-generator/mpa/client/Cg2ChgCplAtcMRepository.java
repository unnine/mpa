package mpa.client;

import java.util.List;
import mpa.Cg2ChgCplAtc;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgCplAtcMRepository extends Cg2ChgCplAtcMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgCplAtc> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}