package mpa.client;

import java.util.List;
import mpa.Cp2CapaVlam;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cp2CapaVlamMRepository extends Cp2CapaVlamMapper, MybatisPersistenceAssistantRepository {
    default List<Cp2CapaVlam> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}