package mpa.persistence;

import java.util.List;

public interface RepositoryLoader {

    List<MybatisRepository> loadAll();

}
