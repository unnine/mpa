package mpa.audit.context;

import mpa.audit.AuditTrail;
import mpa.audit.AuditTrailImpl;
import mpa.audit.config.scope.ScopeInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.filter.ColumnsFilter;
import mpa.audit.repository.database.schema.Data;
import mpa.audit.repository.database.schema.SchemaFactory;
import mpa.audit.repository.database.sql.parameter.IdParameter;
import mpa.audit.repository.database.sql.parameter.Parameter;
import mpa.audit.annotation.AuditAnnotationInfo;

import java.time.LocalDateTime;
import java.util.Objects;

public class TrackingAuditTrailImpl implements TrackingAuditTrail {

    private final ScopeInfo scope;
    private final Snapshot snapshot;
    private final ColumnsFilter columnsFilter;

    private CommandType runtimeCommandType;
    private Data originData;
    private Data updatedData = SchemaFactory.createData();
    private boolean updated = false;
    private LocalDateTime updatedTime;


    public TrackingAuditTrailImpl(ScopeInfo scope, Snapshot snapshot, ColumnsFilter columnsFilter) {
        this.scope = scope;
        this.snapshot = snapshot;
        this.columnsFilter = columnsFilter;
        this.originData = SchemaFactory.createData();
        this.runtimeCommandType = snapshot.getAuditInfo().getCommandType();
    }


    public void setOriginData(Data data) {
        if (data == null || data.isEmpty()) {
            this.runtimeCommandType = CommandType.INSERT;
            return;
        }
        this.originData = data;
    }

    @Override
    public Snapshot getSnapshot() {
        return snapshot;
    }

    @Override
    public boolean isUpdated() {
        return updated;
    }

    @Override
    public void markAsUpdated() {
        this.updatedTime = LocalDateTime.now();
    }

    @Override
    public void update(Data data) {
        if (Objects.equals(originData, data)) {
            return;
        }

        this.updated = true;
        this.updatedData = data;

        if (updatedTime == null) {
            markAsUpdated();
        }

        columnsFilter.filter(originData, updatedData);

        if (!originData.isEmpty() && !data.isEmpty()) {
            runtimeCommandType = CommandType.UPDATE;
            return;
        }
        if (!originData.isEmpty() && data.isEmpty()) {
            runtimeCommandType = CommandType.DELETE;
            return;
        }
    }

    @Override
    public AuditTrail toAuditTrail() {
        AuditAnnotationInfo auditInfo = snapshot.getAuditInfo();
        Parameter parameter = snapshot.getParameter();
        IdParameter idParameter = parameter.getId();

        return AuditTrailImpl.builder()
                .scope(scope)
                .event(snapshot.getEventType())
                .command(runtimeCommandType)
                .label(auditInfo.getLabel())
                .tableName(auditInfo.getTableName())
                .parameters(parameter.getOriginArguments())
                .idParameter(idParameter.asMap())
                .originData(originData)
                .updatedData(updatedData)
                .updatedTime(updatedTime)
                .entity(auditInfo.getTarget())
                .build();
    }
}