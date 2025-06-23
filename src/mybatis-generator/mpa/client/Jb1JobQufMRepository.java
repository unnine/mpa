package mpa.client;

import java.util.List;
import mpa.Jb1JobQuf;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Jb1JobQufMRepository extends Jb1JobQufMapper, MybatisPersistenceAssistantRepository {
    default List<Jb1JobQuf> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}