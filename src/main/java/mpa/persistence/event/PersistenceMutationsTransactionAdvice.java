package mpa.persistence.event;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import mpa.persistence.annotation.Mutations;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.context.DataSourceAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.exception.InvalidAttributeStateException;
import mpa.persistence.holder.MutationsAnnotationHolder;
import mpa.persistence.transaction.PersistenceTransactionListener;
import mpa.persistence.transaction.PersistenceTransactionSynchronizationManager;
import mpa.util.ClassUtil;
import mpa.util.TypeValidator;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

@Slf4j
@RequiredArgsConstructor
public class PersistenceMutationsTransactionAdvice implements MethodInterceptor {

    private final ScopeAware scopeAware;
    private final MutationsAnnotationHolder mutationsHolder;
    private final Scopable<EntityCache> entityCache;
    private final PersistenceTransactionListener transactionListener;
    private final PersistenceMutationsEventListener mutationsEventListener;


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            transactionListener.synchronizeTransaction();

            if (isInactivatedTransaction()) {
                return invocation.proceed();
            }

            Class<?> repositoryClass = invocation.getMethod().getDeclaringClass();
            Scope scope = scopeAware.getByRepository(repositoryClass);
            MutationEvent event = createEvent(invocation, scope);
            return invoke(invocation, event);

        } catch (InvalidAttributeStateException e) {
            log.error(e.getMessage(), e);
        }
        return 0;
    }

    private boolean isInactivatedTransaction() {
        return !PersistenceTransactionSynchronizationManager.isCurrentTransactionActive();
    }

    private Object invoke(MethodInvocation invocation, MutationEvent event) throws Throwable {
        try {
            if (mutationsEventListener.ignore(event)) {
                return invocation.proceed();
            }
            mutationsEventListener.onBefore(event);
            Object result = invocation.proceed();
            mutationsEventListener.onAfter(event, isUpdated(invocation.getMethod(), result));

            return result;

        } catch (Throwable t) {
            log.error(t.getMessage(), t);
            mutationsEventListener.onThrowsException(event, t);
            throw t;

        } finally {
            mutationsEventListener.onAfterCompletion(event);
        }
    }

    private MutationEvent createEvent(MethodInvocation invocation, Scope scope) {
        String label = getMutationsLabel();
        Method method = invocation.getMethod();
        EntityDefinition entityDefinition = getEntityDefinition(scope, method.getDeclaringClass());
        MutationType mutationType = findMatchedMutationType(method);
        MutationArgument mutationArgument = getMutationsArgumentEntity(invocation.getArguments());
        return MutationEvent.builder()
                .scope(scope)
                .label(label)
                .entityDefinition(entityDefinition)
                .mutationType(mutationType)
                .argument(mutationArgument)
                .build();
    }

    private String getMutationsLabel() {
        return mutationsHolder
                .getLast()
                .map(Mutations::label)
                .orElse(null);
    }

    private EntityDefinition getEntityDefinition(Scope scope, Class<?> entityClass) {
        DataSourceAware dataSourceAware = scope.getDataSourceAware();
        CaseConversionStrategy caseConversionStrategy = dataSourceAware.getCaseConversionStrategy();
        Class<?> entityType = getEntityClass(entityClass);
        String tableName = caseConversionStrategy.convert(EntityAnnotations.getTableName(entityType));
        return entityCache.getInstance(scope).getByTableName(tableName);
    }

    private MutationType findMatchedMutationType(Method method) {
        String name = method.getName();

        for (MutationType type : MutationType.values()) {
            if (name.contains(type.identifier())) {
                return type;
            }
        }
        throw new IllegalArgumentException(method.getClass().getPackage().getName() + "." + method.getName() + " is not mutation method");
    }

    private MutationArgument getMutationsArgumentEntity(Object[] arguments) {
        if (arguments == null || arguments.length == 0) {
            return null;
        }
        return new MutationArgument(arguments[0]);
    }

    private Class<?> getEntityClass(Class<?> repositoryClass) {
        return ClassUtil.getImplementsGenericTypeByTypeName(repositoryClass, MybatisPersistenceAssistantRepository.class.getTypeName());
    }

    private boolean isUpdated(Method method, Object result) {
        Class<?> returnType = method.getReturnType();

        if (TypeValidator.isInteger(returnType)) {
            return ((Integer) result) > 0;
        }
        return true;
    }
}
