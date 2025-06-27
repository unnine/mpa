package mpa.persistence.entity;

import mpa.persistence.entity.schema.MetaData;

public interface EntityMetaDataRepository {

    MetaData selectMetaData();

}
