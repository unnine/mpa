package mpa.client;

import java.util.List;
import mpa.Ti1TrniRst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ti1TrniRstMRepository extends Ti1TrniRstMapper, MybatisPersistenceAssistantRepository {
    default List<Ti1TrniRst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}