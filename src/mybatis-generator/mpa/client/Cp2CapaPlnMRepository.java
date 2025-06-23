package mpa.client;

import java.util.List;
import mpa.Cp2CapaPln;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cp2CapaPlnMRepository extends Cp2CapaPlnMapper, MybatisPersistenceAssistantRepository {
    default List<Cp2CapaPln> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}