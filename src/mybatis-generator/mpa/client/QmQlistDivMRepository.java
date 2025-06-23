package mpa.client;

import java.util.List;
import mpa.QmQlistDiv;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface QmQlistDivMRepository extends QmQlistDivMapper, MybatisPersistenceAssistantRepository {
    default List<QmQlistDiv> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}