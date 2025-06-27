package mpa.audit;

import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.holder.ScopeInfo;
import mpa.audit.repository.dataaccess.schema.Data;

import java.time.LocalDateTime;
import java.util.Map;

public interface AuditTrail {

    ScopeInfo scope();

    EventType event();

    CommandType command();

    String label();

    String tableName();

    Object argument();

    Map<String, String> idArgument();

    Data originData();

    Data updatedData();

    LocalDateTime updatedTime();

}