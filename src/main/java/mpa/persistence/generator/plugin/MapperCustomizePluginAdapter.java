package mpa.persistence.generator.plugin;

import org.mybatis.generator.api.PluginAdapter;

public abstract class MapperCustomizePluginAdapter extends PluginAdapter {

    protected static class MapperMethodName {
        protected final static String SELECT_MANY_BASIC = "findAll";
        protected final static String SELECT_MANY = "findAll";

        protected final static String SELECT_ONE_BASIC = "findOne";
        protected final static String SELECT_ONE = "findOne";
        protected final static String SELECT_BY_PRIMARY_KEY = "findById";

        protected final static String INSERT_BY_PROVIDER = "insert";
        protected final static String INSERT = "insert";

        protected final static String UPDATE = "update";
        protected final static String UPDATE_BY_PRIMARY_KEY = "update";

        protected final static String DELETE = "delete";
        protected final static String DELETE_BY_PRIMARY_KEY = "delete";

        protected final static String COUNT = "count";
    }
}
