package mpa.client;

import java.util.List;
import mpa.SyEaprInfo;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface SyEaprInfoMRepository extends SyEaprInfoMapper, MybatisPersistenceAssistantRepository {
    default List<SyEaprInfo> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}