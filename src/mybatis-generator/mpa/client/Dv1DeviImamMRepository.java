package mpa.client;

import java.util.List;
import mpa.Dv1DeviImam;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Dv1DeviImamMRepository extends Dv1DeviImamMapper, MybatisPersistenceAssistantRepository {
    default List<Dv1DeviImam> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}