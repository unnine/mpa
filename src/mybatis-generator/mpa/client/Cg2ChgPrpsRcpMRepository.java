package mpa.client;

import java.util.List;
import mpa.Cg2ChgPrpsRcp;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgPrpsRcpMRepository extends Cg2ChgPrpsRcpMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgPrpsRcp> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}