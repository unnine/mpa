package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import mpa.persistence.entity.schema.MetaData;
import mpa.persistence.holder.Scopable;

@RequiredArgsConstructor
public class ScopableEntityMetaDataRepository implements EntityMetaDataRepository {

    private final Scopable<EntityMetaDataRepository> proxy;


    private EntityMetaDataRepository getInstance() {
        return proxy.getInstance();
    }

    @Override
    public MetaData selectMetaData() {
        return getInstance().selectMetaData();
    }
}
