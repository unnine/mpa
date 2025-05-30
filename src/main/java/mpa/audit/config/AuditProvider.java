package mpa.audit.config;

import mpa.audit.config.dependency.DependencyFactory;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.context.AuditTracker;
import mpa.audit.executor.AnnotationAuditEventExecutor;
import mpa.audit.executor.AuditEventExecutor;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.audit.annotation.AuditAnnotationInfo;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.util.Log;
import mpa.entity.cache.EntityCache;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public final class AuditProvider {

    private static final Map<AuditScopeAware, DependencyFactory> factories = new HashMap<>();

    static void addFactory(AuditScopeAware key, DependencyFactory dependencyFactory) {
        factories.put(key, dependencyFactory);
    }

    public static AuditEventExecutor getEventExecutor(AuditAnnotationInfo auditAnnotationInfo) {
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

    public static AuditEventExecutor getEventExecutor(AuditAnnotationInfo auditAnnotationInfo, String auditScopeName) {
        DependencyFactory dependencyFactory = getDependencyFactory(auditScopeName);
        return createAuditEventExecutor(dependencyFactory, auditAnnotationInfo);
    }

    private static AuditEventExecutor createAuditEventExecutor(DependencyFactory dependencyFactory, AuditAnnotationInfo auditAnnotationInfo) {
        return new AnnotationAuditEventExecutor(
                auditAnnotationInfo,
                dependencyFactory.getInstance(EntityCache.class),
                dependencyFactory.getInstance(AuditTracker.class),
                dependencyFactory.getInstance(AuditEventPublisher.class),
                dependencyFactory.getInstance(QueryArgumentsParser.class)
        );
    }

    private static DependencyFactory getDependencyFactory(String auditScopeName) {
        AuditScopeAware scopeAware;

        for (Map.Entry<AuditScopeAware, DependencyFactory> entry : factories.entrySet()) {
            scopeAware = entry.getKey();
            if (auditScopeName.equals(scopeAware.name())) {
                return entry.getValue();
            }
        }
        throw new NoSuchElementException(Log.format("there is no audit dependency factory matching the scope name. check the information in audit configuration."));
    }
}