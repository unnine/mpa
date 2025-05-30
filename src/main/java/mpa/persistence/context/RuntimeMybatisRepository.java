package mpa.persistence.context;

import mpa.persistence.MybatisRepository;
import mpa.persistence.annotation.Entity;

public class RuntimeMybatisRepository {

    private final Entity entityAnnotation;

    @SuppressWarnings("rawtypes")
    private final MybatisRepository repository;


    @SuppressWarnings("rawtypes")
    public RuntimeMybatisRepository(Entity entityAnnotation, MybatisRepository repository) {
        this.entityAnnotation = entityAnnotation;
        this.repository = repository;
    }

    public String getEntityName() {
        return entityAnnotation.name();
    }
}
