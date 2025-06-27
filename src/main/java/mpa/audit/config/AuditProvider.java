package mpa.audit.config;

import mpa.DependencyFactory;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.context.AuditTracker;
import mpa.audit.executor.AnnotationAuditEventExecutor;
import mpa.audit.executor.AuditEventExecutor;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.context.Scope;
import mpa.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public final class AuditProvider {

    private static final Map<Scope, DependencyFactory> factories = new HashMap<>();

    static void addFactory(Scope key, DependencyFactory dependencyFactory) {
        factories.put(key, dependencyFactory);
    }

    public static AuditEventExecutor getEventExecutor(AuditInfo auditAnnotationInfo) {
        if (factories.isEmpty()) {
            throw new NoSuchElementException(Log.format("there is not audit dependency factory."));
        }
        if (factories.size() > 1) {
            throw new IllegalStateException(Log.format("cannot be specified because there are two or more audit dependency factory."));
        }
        DependencyFactory dependencyFactory = null;
        for (DependencyFactory factory : factories.values()) {
            dependencyFactory = factory;
        }
        return createAuditEventExecutor(dependencyFactory, auditAnnotationInfo);
    }

    public static AuditEventExecutor getEventExecutor(AuditInfo auditAnnotationInfo, String auditScopeName) {
        DependencyFactory dependencyFactory = getDependencyFactory(auditScopeName);
        return createAuditEventExecutor(dependencyFactory, auditAnnotationInfo);
    }

    private static AuditEventExecutor createAuditEventExecutor(DependencyFactory dependencyFactory, AuditInfo auditAnnotationInfo) {
        return new AnnotationAuditEventExecutor(
                auditAnnotationInfo,
                dependencyFactory.getInstance(EntityCache.class),
                dependencyFactory.getInstance(AuditTracker.class),
                dependencyFactory.getInstance(AuditEventPublisher.class),
                dependencyFactory.getInstance(MutationArgumentsParser.class)
        );
    }

    private static DependencyFactory getDependencyFactory(String auditScopeName) {
        Scope scopeAware;

        for (Map.Entry<Scope, DependencyFactory> entry : factories.entrySet()) {
            scopeAware = entry.getKey();
//            if (auditScopeName.equals(scopeAware.getName())) {
//                return entry.getValue();
//            }
        }
        throw new NoSuchElementException(Log.format("there is no audit dependency factory matching the scope name. check the information in audit configuration."));
    }
}