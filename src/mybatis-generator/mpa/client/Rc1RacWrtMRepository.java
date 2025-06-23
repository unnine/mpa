package mpa.client;

import java.util.List;
import mpa.Rc1RacWrt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Rc1RacWrtMRepository extends Rc1RacWrtMapper, MybatisPersistenceAssistantRepository {
    default List<Rc1RacWrt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}