package mpa.client;

import java.util.List;
import mpa.Ti1AnuTrniDtl;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ti1AnuTrniDtlMRepository extends Ti1AnuTrniDtlMapper, MybatisPersistenceAssistantRepository {
    default List<Ti1AnuTrniDtl> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}