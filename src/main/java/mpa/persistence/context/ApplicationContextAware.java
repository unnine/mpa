package mpa.persistence.context;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ApplicationContextAware {

    private final GenericApplicationContext context;


    public ApplicationContextAware(GenericApplicationContext applicationContext) {
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

    public <T> void registerBean(String name, Class<T> beanType, T bean) {
        context.registerBean(name, beanType, () -> bean);
    }

}
