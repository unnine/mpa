package mpa.client;

import java.util.List;
import mpa.Ti1AnuTrniDtlCtt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ti1AnuTrniDtlCttMRepository extends Ti1AnuTrniDtlCttMapper, MybatisPersistenceAssistantRepository {
    default List<Ti1AnuTrniDtlCtt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}