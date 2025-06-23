package mpa.client;

import java.util.List;
import mpa.Ea1ExadRstMismts;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ea1ExadRstMismtsMRepository extends Ea1ExadRstMismtsMapper, MybatisPersistenceAssistantRepository {
    default List<Ea1ExadRstMismts> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}