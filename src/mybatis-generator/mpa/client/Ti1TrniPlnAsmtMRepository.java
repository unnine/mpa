package mpa.client;

import java.util.List;
import mpa.Ti1TrniPlnAsmt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ti1TrniPlnAsmtMRepository extends Ti1TrniPlnAsmtMapper, MybatisPersistenceAssistantRepository {
    default List<Ti1TrniPlnAsmt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}