package mpa.client;

import java.util.List;
import mpa.AtAuditDtl;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface AtAuditDtlMRepository extends AtAuditDtlMapper, MybatisPersistenceAssistantRepository {
    default List<AtAuditDtl> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}