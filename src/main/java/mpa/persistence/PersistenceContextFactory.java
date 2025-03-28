package mpa.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenceContextFactory implements PersistenceContext {

    private final Map<String, MybatisRepository<?, ?>> repositories = new HashMap<>();

    private final RepositoryLoader repositoryLoader;


    public PersistenceContextFactory(RepositoryLoader repositoryLoader) {
        this.repositoryLoader = repositoryLoader;

        loadRepositories();
    }


    private void loadRepositories() {
        List<MybatisRepository> mybatisRepositories = repositoryLoader.loadAll();

        for (MybatisRepository repository : mybatisRepositories) {
            repositories.put(repository.getClass().getName(), repository);
        }
    }
}
