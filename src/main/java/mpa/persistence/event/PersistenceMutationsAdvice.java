package mpa.persistence.event;

import lombok.RequiredArgsConstructor;
import mpa.persistence.MybatisPersistenceAssistantRepository;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.exception.InvalidScopeStateException;
import mpa.persistence.holder.RuntimeThreadScope;
import mpa.persistence.holder.Scope;
import mpa.persistence.holder.ScopeAware;
import mpa.util.ClassUtil;
import mpa.util.Log;
import mpa.util.TypeValidator;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

@RequiredArgsConstructor
public class PersistenceMutationsAdvice implements MethodInterceptor {

    private final PersistenceMutationsEventListener listener;
    private final ScopeAware scopeAware;
    private final RuntimeThreadScope runtimeThreadScope;
    private final EntityCache entityCache;


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object result = null;

        try {
            Scope scope = scopeAware.getByEntity(invocation.getMethod().getDeclaringClass());
            MutationEvent event = createEvent(invocation, scope);

            if (!event.isInvalidState()) {
                runtimeThreadScope.set(event.getScope());
                result = invoke(invocation, event);
            }

        } catch (InvalidScopeStateException e) {
            Log.warn(e.getMessage());

        } finally {
            runtimeThreadScope.clear();
        }

        return result;
    }

    private Object invoke(MethodInvocation invocation, MutationEvent event) throws Throwable {
        try {
            if (listener.ignore(event)) {
                return invocation.proceed();
            }
            listener.onBefore(event);
            Object result = invocation.proceed();
            listener.onAfter(event, isUpdated(invocation.getMethod(), result));

            return result;

        } catch (Throwable t) {
            Log.error(t);
            listener.onThrowsException(event, t);
            throw t;

        } finally {
            listener.onCompletion(event);
        }
    }

    private MutationEvent createEvent(MethodInvocation invocation, Scope scope) {
        Method method = invocation.getMethod();
        EntityDefinition entityDefinition = getEntityDefinition(method.getDeclaringClass());
        MutationType mutationType = findMatchedMutationType(method);
        MutationArgument mutationArgument = getMutationsArgumentEntity(invocation.getArguments());
        return new MutationEvent(scope, entityDefinition, mutationType, mutationArgument);
    }

    private EntityDefinition getEntityDefinition(Class<?> entityClass) {
        Class<?> entityType = getEntityClass(entityClass);
        String tableName = EntityAnnotations.getTableName(entityType);
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
