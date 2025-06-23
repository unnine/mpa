package mpa.client;

import java.util.List;
import mpa.Ri1RiskPln;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ri1RiskPlnMRepository extends Ri1RiskPlnMapper, MybatisPersistenceAssistantRepository {
    default List<Ri1RiskPln> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}