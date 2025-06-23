package mpa.client;

import java.util.List;
import mpa.Cp2CapaPlnRst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cp2CapaPlnRstMRepository extends Cp2CapaPlnRstMapper, MybatisPersistenceAssistantRepository {
    default List<Cp2CapaPlnRst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}