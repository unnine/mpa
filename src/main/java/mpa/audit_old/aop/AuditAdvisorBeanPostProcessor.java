package mpa.audit_old.aop;

import mpa.annotation.MPAAnnotations;
import mpa.audit_old.annotation.AuditAnnotations;
import mpa.audit_old.config.holder.AuditScopeAware;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class AuditAdvisorBeanPostProcessor implements BeanPostProcessor {

    private final Map<AuditScopeAware, Advisor> advisorMap;


    public AuditAdvisorBeanPostProcessor(Map<AuditScopeAware, Advisor> advisorMap) {
        this.advisorMap = advisorMap;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        try {
            Class<?> beanClass = getClassOf(bean);

            if (isEntity(beanClass) || isAuditTrailListener(beanClass)) {
                return bean;
            }

            if (hasAuditAnnotation(beanClass)) {
                Optional<Advisor> optionalAdvisor = getAdvisorOf(beanClass);

                if(optionalAdvisor.isPresent()) {
                    return createAdvisorProxy(bean, optionalAdvisor.get());
                }
            }
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("rawtypes")
    private Object createAdvisorProxy(Object o, Advisor advisor) throws Exception {
        Object target = o;

        if (isMapper(o)) {
            MapperFactoryBean mapperFactoryBean = (MapperFactoryBean) o;
            target = mapperFactoryBean.getObject();
            Objects.requireNonNull(target);
        }

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(target);

        return proxyFactory.getProxy();
    }

    private Class<?> getClassOf(Object o) throws ClassNotFoundException {
        if (isMapper(o)) {
            return getClassFromMybatisWrapper(o);
        }
        return o.getClass();
    }

    private boolean isMapper(Object o) {
        return o instanceof MapperFactoryBean;
    }

    @SuppressWarnings("rawtypes")
    private Class<?> getClassFromMybatisWrapper(Object o) throws ClassNotFoundException {
        MapperFactoryBean bean1 = (MapperFactoryBean) o;
        Class<?> mapperInterface = bean1.getMapperInterface();
        return Class.forName(mapperInterface.getName());
    }

    private Optional<Advisor> getAdvisorOf(Class<?> clazz) {
        AuditScopeAware scopeAware;
        String[] basePackages;

        for (Map.Entry<AuditScopeAware, Advisor> entry : advisorMap.entrySet()) {
            scopeAware = entry.getKey();
            basePackages = scopeAware.basePackages();

            if (belongToTargetPackage(basePackages, clazz)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }

    private boolean belongToTargetPackage(String[] packages, Class<?> clazz) {
        String name = clazz.getName();

        // base package 가 지정되어 있지 않으면 audit 대상 클래스로 간주합니다.
        if (packages == null) {
            return true;
        }
        for (String basePackage : packages) {
            if (name.contains(basePackage)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEntity(Class<?> beanClass) {
        return beanClass.isAnnotationPresent(MPAAnnotations.ENTITY);
    }

    private boolean isAuditTrailListener(Class<?> beanClass) {
        return beanClass.isAnnotationPresent(AuditAnnotations.AUDIT_TRAIL_LISTENER);
    }

    private boolean hasAuditAnnotation(Class<?> beanClass) {
        Method[] methods = beanClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditAnnotations.AUDIT)) {
                return true;
            }
        }
        return false;
    }
}