package mpa.client;

import java.util.List;
import mpa.QmModlCpnt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface QmModlCpntMRepository extends QmModlCpntMapper, MybatisPersistenceAssistantRepository {
    default List<QmModlCpnt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}