package mpa.audit.holder;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Map;

@RequiredArgsConstructor
public final class AuditApplicationContextAware {

    private final ApplicationContext context;

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

    public <T> Map<String, T> getBeansOfType(Class<T> type) {
        return context.getBeansOfType(type);
    }

    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) {
        return context.getBeansWithAnnotation(annotationType);
    }

    public boolean existsBean(Class<?> clazz) {
        return !context.getBeansOfType(clazz).isEmpty();
    }

    private boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

}