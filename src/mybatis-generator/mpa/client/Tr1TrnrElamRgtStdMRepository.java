package mpa.client;

import java.util.List;
import mpa.Tr1TrnrElamRgtStd;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Tr1TrnrElamRgtStdMRepository extends Tr1TrnrElamRgtStdMapper, MybatisPersistenceAssistantRepository {
    default List<Tr1TrnrElamRgtStd> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}