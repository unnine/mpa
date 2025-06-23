package mpa.client;

import java.util.List;
import mpa.Ri1RiskPlnOrg;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ri1RiskPlnOrgMRepository extends Ri1RiskPlnOrgMapper, MybatisPersistenceAssistantRepository {
    default List<Ri1RiskPlnOrg> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}