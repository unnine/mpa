package mpa.persistence.generator.plugin;

import mpa.persistence.event.MutationType;
import org.mybatis.generator.api.PluginAdapter;

public abstract class MapperCustomizePluginAdapter extends PluginAdapter {

    protected static class MapperMethodName {
        protected static final String SELECT_MANY_BASIC = "findAll";
        protected static final String SELECT_MANY = "findAll";

        protected static final String SELECT_ONE_BASIC = "findOne";
        protected static final String SELECT_ONE = "findOne";
        protected static final String SELECT_BY_PRIMARY_KEY = "findById";

        protected static final String INSERT_BY_PROVIDER = MutationType.INSERT.identifier();
        protected static final String INSERT = MutationType.INSERT.identifier();

        protected static final String UPDATE = MutationType.UPDATE.identifier();
        protected static final String UPDATE_BY_PRIMARY_KEY = MutationType.UPDATE.identifier();

        protected static final String DELETE = MutationType.DELETE.identifier();
        protected static final String DELETE_BY_PRIMARY_KEY = MutationType.DELETE.identifier();

        protected static final String COUNT = "count";
    }
}
