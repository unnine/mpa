package mpa.audit.executor;

import java.util.Collection;

/**
 * 수동으로 Audit을 수행합니다.
 */
public interface AuditEventExecutor {

    void execute();


    interface Builder {

        Builder scope(String scopeName);

        Builder addArgument(Object argument);

        Builder addArguments(Collection<Object> arguments);

        AuditEventExecutor build();

    }

}