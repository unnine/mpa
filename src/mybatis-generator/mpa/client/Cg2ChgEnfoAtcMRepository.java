package mpa.client;

import java.util.List;
import mpa.Cg2ChgEnfoAtc;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgEnfoAtcMRepository extends Cg2ChgEnfoAtcMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgEnfoAtc> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}