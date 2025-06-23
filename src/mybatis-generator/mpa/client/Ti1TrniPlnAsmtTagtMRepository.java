package mpa.client;

import java.util.List;
import mpa.Ti1TrniPlnAsmtTagt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Ti1TrniPlnAsmtTagtMRepository extends Ti1TrniPlnAsmtTagtMapper, MybatisPersistenceAssistantRepository {
    default List<Ti1TrniPlnAsmtTagt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}