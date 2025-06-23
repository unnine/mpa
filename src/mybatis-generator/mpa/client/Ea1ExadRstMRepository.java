package mpa.client;

import java.util.List;
import mpa.Ea1ExadRst;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ea1ExadRstMRepository extends Ea1ExadRstMapper, MybatisPersistenceAssistantRepository {
    default List<Ea1ExadRst> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}