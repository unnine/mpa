package mpa.audit_old;

import lombok.Builder;
import mpa.audit_old.config.scope.ScopeInfo;
import mpa.audit_old.config.type.CommandType;
import mpa.audit_old.config.type.EventType;
import mpa.audit_old.repository.database.schema.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
public class AuditTrailImpl implements AuditTrail {

    private final ScopeInfo scope;
    private final EventType event;
    private final CommandType command;
    private final String label;
    private final String tableName;
    private final Object[] parameters;
    private final Map<String, String> idParameter;
    private final Data originData;
    private final Data updatedData;
    private final LocalDateTime updatedTime;
    private final Class<?> entity;


    @Override
    public ScopeInfo scope() {
        return scope;
    }

    @Override
    public EventType event() {
        return event;
    }

    @Override
    public CommandType command() {
        return command;
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public String tableName() {
        return tableName;
    }

    @Override
    public Object[] parameters() {
        return parameters;
    }

    @Override
    public Map<String, String> idParameter() {
        return idParameter;
    }

    @Override
    public Data originData() {
        return originData;
    }

    @Override
    public Data updatedData() {
        return updatedData;
    }

    @Override
    public LocalDateTime updatedTime() {
        return updatedTime;
    }

    @Override
    public Class<?> entity() {
        return entity;
    }
}