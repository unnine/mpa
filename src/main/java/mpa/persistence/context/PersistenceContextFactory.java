package mpa.persistence.context;

import mpa.holder.ApplicationContextAware;
import mpa.persistence.MybatisRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenceContextFactory implements PersistenceContext {

    private final ApplicationContextAware applicationContextAware;

    private final Map<String, MybatisRepository<?, ?>> repositories = new HashMap<>();


    public PersistenceContextFactory(ApplicationContextAware applicationContextAware) {
        this.applicationContextAware = applicationContextAware;
    }


    @Override
    @SuppressWarnings("rawtypes")
    public void loadRepositories() {
        List<MybatisRepository> mybatisRepositories = applicationContextAware.getBeansOf(MybatisRepository.class);

        for (MybatisRepository repository : mybatisRepositories) {
            repositories.put(repository.getClass().getName(), repository);
        }
    }
}
