package mpa.audit_old;

import mpa.audit_old.config.scope.ScopeInfo;
import mpa.audit_old.config.type.CommandType;
import mpa.audit_old.config.type.EventType;
import mpa.audit_old.repository.database.schema.Data;

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