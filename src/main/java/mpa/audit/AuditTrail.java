package mpa.audit;

import mpa.audit.config.scope.ScopeInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.repository.database.schema.Data;

import java.time.LocalDateTime;
import java.util.Map;

public interface AuditTrail {

    ScopeInfo scope();

    EventType event();

    CommandType command();

    String label();

    String tableName();

    Object[] parameters();

    Map<String, String> idParameter();

    Data originData();

    Data updatedData();

    LocalDateTime updatedTime();

    Class<?> entity();
}