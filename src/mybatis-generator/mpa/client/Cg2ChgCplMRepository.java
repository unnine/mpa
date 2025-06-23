package mpa.client;

import java.util.List;
import mpa.Cg2ChgCpl;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgCplMRepository extends Cg2ChgCplMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgCpl> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}