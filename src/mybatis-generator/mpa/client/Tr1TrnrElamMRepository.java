package mpa.client;

import java.util.List;
import mpa.Tr1TrnrElam;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Tr1TrnrElamMRepository extends Tr1TrnrElamMapper, MybatisPersistenceAssistantRepository {
    default List<Tr1TrnrElam> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}