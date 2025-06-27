package mpa.audit.executor;

import java.util.Collection;

public interface AuditEventExecutor {

    void execute();


    interface Builder {

        Builder scope(String scopeName);

        Builder addArgument(Object argument);

        Builder addArguments(Collection<Object> arguments);

        AuditEventExecutor build();

    }

}