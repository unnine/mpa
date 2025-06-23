package mpa.client;

import java.util.List;
import mpa.Cg2ChgEnfo;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgEnfoMRepository extends Cg2ChgEnfoMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgEnfo> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}