package mpa.client;

import java.util.List;
import mpa.Jb1JobHis;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Jb1JobHisMRepository extends Jb1JobHisMapper, MybatisPersistenceAssistantRepository {
    default List<Jb1JobHis> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}