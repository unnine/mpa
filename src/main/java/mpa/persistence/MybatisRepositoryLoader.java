package mpa.persistence;

import mpa.context.ApplicationContextAware;

import java.util.List;

public class MybatisRepositoryLoader implements RepositoryLoader {

    private final ApplicationContextAware applicationContextAware;


    public MybatisRepositoryLoader(ApplicationContextAware applicationContextAware) {
        this.applicationContextAware = applicationContextAware;
    }


    @Override
    public List<MybatisRepository> loadAll() {
        return applicationContextAware.getBeansOf(MybatisRepository.class);
    }
}
