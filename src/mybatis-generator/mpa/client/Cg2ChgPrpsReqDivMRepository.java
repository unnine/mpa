package mpa.client;

import java.util.List;
import mpa.Cg2ChgPrpsReqDiv;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgPrpsReqDivMRepository extends Cg2ChgPrpsReqDivMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgPrpsReqDiv> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}