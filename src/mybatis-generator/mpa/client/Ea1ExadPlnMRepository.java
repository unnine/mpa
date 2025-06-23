package mpa.client;

import java.util.List;
import mpa.Ea1ExadPln;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ea1ExadPlnMRepository extends Ea1ExadPlnMapper, MybatisPersistenceAssistantRepository {
    default List<Ea1ExadPln> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}