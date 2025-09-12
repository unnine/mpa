package mpa.context;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.DataSourceAware;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.util.ClassUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;

import java.util.List;

@RequiredArgsConstructor
public class RepositoryBeanRegister {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;


    public void registerMapperBeans() {
        scopeAware.forEach(this::registerScopeBeans);
    }

    private void registerScopeBeans(Scope scope) {
        List<Class<?>> mappers = ClassUtil.findClassesWithAnnotation(scope.getName(), Mapper.class);

        for (Class<?> mapperClass : mappers) {
            DataSourceAware dataSourceAware = scope.getDataSourceAware();
            SqlSessionFactory sqlSessionFactory = dataSourceAware.getSqlSessionFactory();

            String beanName = scope.getName() + mapperClass.getSimpleName();
            MapperFactoryBean<?> bean = createMapperFactoryBean(mapperClass, sqlSessionFactory);

            registerMapperFactoryBean(beanName, bean);
        }
    }

    private MapperFactoryBean<?> createMapperFactoryBean(Class<?> mapperClass, SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<?> factoryBean = new MapperFactoryBean<>(mapperClass);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }

    private void registerMapperFactoryBean(String beanName, MapperFactoryBean<?> bean) {
        contextAware.registerBean(beanName, MapperFactoryBean.class, bean);
    }

}
