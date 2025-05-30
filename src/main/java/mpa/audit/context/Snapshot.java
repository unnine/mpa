package mpa.audit.context;

import lombok.Getter;
import mpa.audit.config.type.EventType;
import mpa.audit.repository.database.sql.parameter.IdParameter;
import mpa.audit.repository.database.sql.parameter.Parameter;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.entity.EntityDefinition;
import mpa.audit.annotation.AuditAnnotationInfo;

import java.util.StringJoiner;

@Getter
public class Snapshot {

    private final EventType eventType;
    private final AuditAnnotationInfo auditInfo;
    private final EntityDefinition entityDefinition;
    private final QueryArgumentsParser queryArgumentsParser;

    private String key;
    private Parameter parameter;


    private Snapshot(EventType eventType, AuditAnnotationInfo auditInfo, EntityDefinition entityDefinition, QueryArgumentsParser queryArgumentsParser, Object[] queryArguments) {
        this.eventType = eventType;
        this.auditInfo = auditInfo;
        this.entityDefinition = entityDefinition;
        this.queryArgumentsParser = queryArgumentsParser;
        this.parameter = queryArgumentsParser.parse(entityDefinition, queryArguments);
        this.key = generateAuditKey();
    }

    public static Snapshot ofTransaction(AuditAnnotationInfo auditInfo, EntityDefinition entityDefinition, QueryArgumentsParser queryArgumentsParser, Object[] queryArguments) {
        return new Snapshot(EventType.TRANSACTION, auditInfo, entityDefinition, queryArgumentsParser, queryArguments);
    }

    public static Snapshot ofManually(AuditAnnotationInfo auditInfo, EntityDefinition entityDefinition, QueryArgumentsParser queryArgumentsParser, Object[] queryArguments) {
        return new Snapshot(EventType.MANUALLY, auditInfo, entityDefinition, queryArgumentsParser, queryArguments);
    }


    public void refreshKey() {
        this.parameter = queryArgumentsParser.parse(entityDefinition, parameter.getOriginArguments());
        this.key = generateAuditKey();
    }


    private String generateAuditKey() {
        String separator = "$";
        StringJoiner keySuffix = new StringJoiner(separator);

        IdParameter idParameter = parameter.getId();

        for (Parameter.Entry entry : idParameter) {
            keySuffix.add(entry.getName()).add("=").add(entry.getValue());
        }
        return entityDefinition.getTableName() + separator + keySuffix;
    }
}
