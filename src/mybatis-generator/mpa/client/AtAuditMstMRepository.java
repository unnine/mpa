package mpa.client;

import java.util.List;
import mpa.AtAuditMst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface AtAuditMstMRepository extends AtAuditMstMapper, MybatisPersistenceAssistantRepository {
    default List<AtAuditMst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}