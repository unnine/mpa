package mpa;

import lombok.RequiredArgsConstructor;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.event.CompositePersistenceMutationsEventListener;
import mpa.persistence.event.PersistenceMutationsAdvice;
import mpa.persistence.event.PersistenceMutationsPointCutFactory;
import mpa.persistence.holder.RuntimeThreadScope;
import mpa.persistence.holder.ScopeAware;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

@RequiredArgsConstructor
public class PersistenceDependencyFactory extends AbstractDependencyFactory {

    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;


    /**
     * global dependency
     */
    private ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }

    private RuntimeThreadScope runtimeThreadScope() {
        return globalDependencyFactory.runtimeThreadScope();
    }

    private EntityCache entityCache() {
        return globalDependencyFactory.entityCache();
    }


    /**
     * aspect
     */
    Advisor persistenceMutationsEventAdvisor() {
        Pointcut pointcut = new PersistenceMutationsPointCutFactory().create(null);
        PersistenceMutationsAdvice advice = new PersistenceMutationsAdvice(
                persistenceMutationsEventListener(),
                scopeAware(),
                runtimeThreadScope(),
                entityCache()
        );
        return new DefaultPointcutAdvisor(pointcut, advice);
    }


    /**
     * event
     */
    CompositePersistenceMutationsEventListener persistenceMutationsEventListener() {
        return getInstance(CompositePersistenceMutationsEventListener.class, CompositePersistenceMutationsEventListener::new);
    }

}
