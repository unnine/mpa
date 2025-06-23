package mpa.client;

import java.util.List;
import mpa.Ri1RiskAnsRcs;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ri1RiskAnsRcsMRepository extends Ri1RiskAnsRcsMapper, MybatisPersistenceAssistantRepository {
    default List<Ri1RiskAnsRcs> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}