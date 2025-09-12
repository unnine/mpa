package mpa.context;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.event.CompositePersistenceMutationsEventListener;
import mpa.persistence.event.CompositePersistenceTransactionListener;
import mpa.persistence.event.PersistenceMutationsTransactionAdvice;
import mpa.persistence.event.PersistenceMutationsPointCutFactory;
import mpa.persistence.holder.AnnotationMutationsContextAdvice;
import mpa.persistence.holder.MutationsAnnotationHolder;
import mpa.persistence.holder.MutationsAnnotationPointCutFactory;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

@RequiredArgsConstructor
public class PersistenceDependencyFactory extends ScopableDependencyFactory {

    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;


    /**
     * global dependency
     */
    private Scopable<EntityCache> entityCache() {
        return globalDependencyFactory.entityCache();
    }

    @Override
    protected ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }


    /**
     * aspect
     */
    MutationsAnnotationHolder mutationsHolder() {
        return getInstance(MutationsAnnotationHolder.class, MutationsAnnotationHolder::new);
    }

    Advisor mutationsAnnotationsAdvisor() {
        Pointcut pointcut = new MutationsAnnotationPointCutFactory().create();
        AnnotationMutationsContextAdvice advice = new AnnotationMutationsContextAdvice(mutationsHolder());
        return new DefaultPointcutAdvisor(pointcut, advice);
    }

    Advisor persistenceMutationsTranctionEventAdvisor() {
        Pointcut pointcut = new PersistenceMutationsPointCutFactory().create();
        PersistenceMutationsTransactionAdvice advice = new PersistenceMutationsTransactionAdvice(
                scopeAware(),
                mutationsHolder(),
                entityCache(),
                persistenceTransactionListener(),
                persistenceMutationsEventListener()

        );
        return new DefaultPointcutAdvisor(pointcut, advice);
    }


    /**
     * event
     */
    public CompositePersistenceTransactionListener persistenceTransactionListener() {
        return getInstance(CompositePersistenceTransactionListener.class, CompositePersistenceTransactionListener::new);
    }


    public CompositePersistenceMutationsEventListener persistenceMutationsEventListener() {
        return getInstance(CompositePersistenceMutationsEventListener.class, CompositePersistenceMutationsEventListener::new);
    }

}
