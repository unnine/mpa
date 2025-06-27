package mpa.audit.context;

import lombok.Getter;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.EventType;
import mpa.audit.repository.dataaccess.sql.argument.Argument;
import mpa.audit.repository.dataaccess.sql.argument.IdArgument;
import mpa.persistence.entity.EntityDefinition;

import java.util.StringJoiner;

@Getter
public class Snapshot {

    private final EventType eventType;
    private final AuditInfo auditInfo;
    private final EntityDefinition entityDefinition;

    private String key;


    private Snapshot(EventType eventType, AuditInfo auditInfo, EntityDefinition entityDefinition) {
        this.eventType = eventType;
        this.auditInfo = auditInfo;
        this.entityDefinition = entityDefinition;
        this.key = generateAuditKey();
    }

    public static Snapshot ofTransaction(AuditInfo auditInfo, EntityDefinition entityDefinition) {
        return new Snapshot(EventType.TRANSACTION, auditInfo, entityDefinition);
    }

    public static Snapshot ofManually(AuditInfo auditInfo, EntityDefinition entityDefinition) {
        return new Snapshot(EventType.MANUALLY, auditInfo, entityDefinition);
    }


    public void refreshKey() {
        this.key = generateAuditKey();
    }

    private String generateAuditKey() {
        String separator = "$";
        StringJoiner keySuffix = new StringJoiner(separator);

        IdArgument idArgument = auditInfo.getArgument().getId();

        for (Argument.Entry entry : idArgument) {
            keySuffix.add(entry.getName()).add("=").add(entry.getValue());
        }
        return entityDefinition.getTableName() + separator + keySuffix;
    }
}
