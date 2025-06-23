package mpa.client;

import java.util.List;
import mpa.SyUserDlgd;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface SyUserDlgdMRepository extends SyUserDlgdMapper, MybatisPersistenceAssistantRepository {
    default List<SyUserDlgd> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}