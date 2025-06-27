package mpa.persistence.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import mpa.persistence.context.*;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.exception.InvalidAttributeStateException;
import mpa.persistence.transaction.PersistenceTransactionListener;
import mpa.util.ClassUtil;
import mpa.util.Log;
import mpa.util.TypeValidator;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

@RequiredArgsConstructor
public class PersistenceMutationsAdvice implements MethodInterceptor {

    private final ScopeAware scopeAware;
    private final EntityCache entityCache;
    private final RuntimeThreadAttribute runtimeThreadAttribute;
    private final PersistenceTransactionListener transactionListener;
    private final PersistenceMutationsEventListener mutationsEventListener;


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            Scope scope = scopeAware.getByEntity(invocation.getMethod().getDeclaringClass());
            transactionListener.synchronizeTransaction(scope);
            MutationEvent event = createEvent(invocation);
            return invoke(invocation, event);

        } catch (InvalidAttributeStateException e) {
            Log.error(e);
        }
        return 0;
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
            Log.error(t);
            mutationsEventListener.onThrowsException(event, t);
            throw t;

        } finally {
            mutationsEventListener.onAfterCompletion(event);
        }
    }

    private MutationEvent createEvent(MethodInvocation invocation) {
        RuntimeAttribute runtimeAttribute = runtimeThreadAttribute.get();
        Method method = invocation.getMethod();
        EntityDefinition entityDefinition = getEntityDefinition(method.getDeclaringClass(), runtimeAttribute);
        MutationType mutationType = findMatchedMutationType(method);
        MutationArgument mutationArgument = getMutationsArgumentEntity(invocation.getArguments());
        return new MutationEvent(runtimeAttribute, entityDefinition, mutationType, mutationArgument);
    }

    private EntityDefinition getEntityDefinition(Class<?> entityClass, RuntimeAttribute runtimeAttribute) {
        Scope scope = runtimeAttribute.getScope();
        DataSourceAware dataSourceAware = scope.getDataSourceAware();
        CaseConversionStrategy caseConversionStrategy = dataSourceAware.getCaseConversionStrategy();
        Class<?> entityType = getEntityClass(entityClass);
        String tableName = caseConversionStrategy.convert(EntityAnnotations.getTableName(entityType));
        return entityCache.getByTableName(tableName);
    }

    private MutationType findMatchedMutationType(Method method) {
        String name = method.getName();

        for (MutationType type : MutationType.values()) {
            if (name.contains(type.identifier())) {
                return type;
            }
        }
        throw new IllegalArgumentException(method.getClass().getPackageName() + "." + method.getName() + " is not mutation method");
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
