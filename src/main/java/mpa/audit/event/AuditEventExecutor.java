package mpa.audit.event;

import java.util.Collection;

public interface AuditEventExecutor {

    void addEntity(Object entity);

    void addEntities(Collection<Object> entities);

    void addId(Object id, Class<?> entityClass);

    void execute();


    interface Builder {

        Builder defaultScope();

        Builder scope(String scopeName);

        Builder label(String label);

        AuditEventExecutor build();

    }

}