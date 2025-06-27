package mpa.persistence.context;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.util.CollectionUtils;

import javax.sql.DataSource;
import java.lang.annotation.Annotation;
import java.util.*;

public class ApplicationContextAware {

    private final ApplicationContext context;


    public ApplicationContextAware(ApplicationContext applicationContext) {
        this.context = applicationContext;
    }


    public <T> T getBean(Class<T> type) {
        try {
            return context.getBean(type);
        } catch (NoSuchBeanDefinitionException e) {
            return null;
        }
    }

    public <T> T getBean(String name, Class<T> type) {
        try {
            return context.getBean(name, type);
        } catch (NoSuchBeanDefinitionException e) {
            return null;
        }
    }

    public <T> Optional<List<T>> getBeansOf(Class<T> typeClass) {
        Map<String, T> beansOfType = context.getBeansOfType(typeClass);

        if (CollectionUtils.isEmpty(beansOfType)) {
            return Optional.empty();
        }
        return Optional.of(new ArrayList<>(beansOfType.values()));
    }

    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) {
        return context.getBeansWithAnnotation(annotationType);
    }

    public DataSource getDataSourceByRefName(String dataSourceRef) {
        DataSource dataSource = getBean(dataSourceRef, DataSource.class);
        Objects.requireNonNull(dataSource);
        return dataSource;
    }

}
