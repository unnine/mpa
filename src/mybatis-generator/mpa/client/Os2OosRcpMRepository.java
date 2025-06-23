package mpa.client;

import java.util.List;
import mpa.Os2OosRcp;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Os2OosRcpMRepository extends Os2OosRcpMapper, MybatisPersistenceAssistantRepository {
    default List<Os2OosRcp> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}