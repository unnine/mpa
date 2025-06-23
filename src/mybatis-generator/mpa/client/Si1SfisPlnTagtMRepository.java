package mpa.client;

import java.util.List;
import mpa.Si1SfisPlnTagt;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import org.apache.ibatis.annotations.Mapper;;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;

@Mapper
public interface Si1SfisPlnTagtMRepository extends Si1SfisPlnTagtMapper, MybatisPersistenceAssistantRepository {
    default List<Si1SfisPlnTagt> findAll() {
        return this.findAll(SelectDSLCompleter.allRows());
    }

    default long count() {
        return this.count(CountDSLCompleter.allRows());
    }
}