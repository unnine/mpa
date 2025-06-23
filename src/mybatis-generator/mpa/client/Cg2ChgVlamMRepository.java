package mpa.client;

import java.util.List;
import mpa.Cg2ChgVlam;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgVlamMRepository extends Cg2ChgVlamMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgVlam> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}