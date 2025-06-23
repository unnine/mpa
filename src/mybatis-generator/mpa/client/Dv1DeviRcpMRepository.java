package mpa.client;

import java.util.List;
import mpa.Dv1DeviRcp;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Dv1DeviRcpMRepository extends Dv1DeviRcpMapper, MybatisPersistenceAssistantRepository {
    default List<Dv1DeviRcp> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}