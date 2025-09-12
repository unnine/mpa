package mpa.audit.context;

import mpa.audit.AuditTrail;
import mpa.audit.BasicAuditTrail;
import mpa.persistence.config.audit.TrackingStrategy;
import mpa.audit.config.type.CommandType;
import mpa.audit.filter.ColumnsFilter;
import mpa.audit.repository.schema.Data;
import mpa.audit.repository.schema.SchemaFactory;
import mpa.audit.repository.sql.argument.Argument;
import mpa.audit.repository.sql.argument.IdArgument;

import java.time.LocalDateTime;
import java.util.Objects;

public class BasicTrackingAuditTrail implements TrackingAuditTrail {

    private final Snapshot snapshot;
    private final ColumnsFilter columnsFilter;

    private CommandType runtimeCommandType;
    private Data originData;
    private Data updatedData = SchemaFactory.createData();
    private boolean updated = false;
    private LocalDateTime updatedTime;


    public BasicTrackingAuditTrail(Snapshot snapshot, ColumnsFilter columnsFilter) {
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
    public void markingToUpdated() {
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
            markingToUpdated();
        }

        columnsFilter.filter(getTrackingStrategy(), originData, updatedData);

        if (!originData.isEmpty() && !data.isEmpty()) {
            runtimeCommandType = CommandType.UPDATE;
            return;
        }
        if (!originData.isEmpty() && data.isEmpty()) {
            runtimeCommandType = CommandType.DELETE;
            return;
        }
    }

    private TrackingStrategy getTrackingStrategy() {
        return snapshot.getAuditInfo().getScope().getAuditAttribute().getTrackingStrategy();
    }

    @Override
    public AuditTrail toAuditTrail() {
        AuditInfo auditInfo = snapshot.getAuditInfo();
        Argument argument = auditInfo.getArgument();
        IdArgument idArgument = argument.getId();

        return BasicAuditTrail.builder()
                .scope(ScopeInfo.of(auditInfo.getScope()))
                .event(snapshot.getEventType())
                .command(runtimeCommandType)
                .label(auditInfo.getLabel())
                .tableName(auditInfo.getTableName())
                .argument(argument.getOriginArgument())
                .idArgument(idArgument.asMap())
                .originData(originData)
                .updatedData(updatedData)
                .updatedTime(updatedTime)
                .build();
    }
}