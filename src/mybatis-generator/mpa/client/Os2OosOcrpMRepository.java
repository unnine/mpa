package mpa.client;

import java.util.List;
import mpa.Os2OosOcrp;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosOcrpMRepository extends Os2OosOcrpMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosOcrp> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}