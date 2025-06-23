package mpa.client;

import java.util.List;
import mpa.Ri1RiskRst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ri1RiskRstMRepository extends Ri1RiskRstMapper, MybatisPersistenceAssistantRepository {
    default List<Ri1RiskRst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}