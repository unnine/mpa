package mpa.audit;

import lombok.Builder;
import mpa.audit.context.ScopeInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.repository.schema.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
public class BasicAuditTrail implements AuditTrail {

    private final ScopeInfo scope;
    private final EventType event;
    private final CommandType command;
    private final String label;
    private final String tableName;
    private final Object argument;
    private final Map<String, String> idArgument;
    private final Data originData;
    private final Data updatedData;
    private final LocalDateTime updatedTime;


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
    public Object argument() {
        return argument;
    }

    @Override
    public Map<String, String> idArgument() {
        return idArgument;
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

}