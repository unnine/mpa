package mpa.client;

import java.util.List;
import mpa.Ea1ExadEnd;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ea1ExadEndMRepository extends Ea1ExadEndMapper, MybatisPersistenceAssistantRepository {
    default List<Ea1ExadEnd> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}