package mpa;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.RuntimeThreadAttribute;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.event.ContextPersistenceMutationsEventListener;
import mpa.persistence.event.ContextPersistenceTransactionListener;
import mpa.persistence.event.PersistenceMutationsAdvice;
import mpa.persistence.event.PersistenceMutationsPointCutFactory;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

@RequiredArgsConstructor
public class PersistenceDependencyFactory extends ScopableDependencyFactory {

    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;


    /**
     * global dependency
     */
    private ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }

    private RuntimeThreadAttribute runtimeThreadScope() {
        return globalDependencyFactory.runtimeThreadAttribute();
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
                scopeAware(),
                entityCache(),
                runtimeThreadScope(),
                persistenceTransactionListener(),
                persistenceMutationsEventListener()

        );
        return new DefaultPointcutAdvisor(pointcut, advice);
    }


    /**
     * event
     */
    ContextPersistenceTransactionListener persistenceTransactionListener() {
        return getInstance(ContextPersistenceTransactionListener.class, ContextPersistenceTransactionListener::new);
    }


    ContextPersistenceMutationsEventListener persistenceMutationsEventListener() {
        return getInstance(ContextPersistenceMutationsEventListener.class, ContextPersistenceMutationsEventListener::new);
    }

}
