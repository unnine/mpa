package mpa.client;

import java.util.List;
import mpa.Cg2ChgImamChkl;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Cg2ChgImamChklMRepository extends Cg2ChgImamChklMapper, MybatisPersistenceAssistantRepository {
    default List<Cg2ChgImamChkl> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}