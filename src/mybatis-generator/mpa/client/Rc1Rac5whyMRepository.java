package mpa.client;

import java.util.List;
import mpa.Rc1Rac5why;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Rc1Rac5whyMRepository extends Rc1Rac5whyMapper, MybatisPersistenceAssistantRepository {
    default List<Rc1Rac5why> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}