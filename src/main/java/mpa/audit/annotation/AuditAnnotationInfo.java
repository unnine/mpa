package mpa.audit.annotation;

import mpa.annotation.MPAAnnotations;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.config.type.CommandType;

public class AuditAnnotationInfo {

    private final String tableName;

    private final Class<?> target;

    private final String label;

    private final CommandType commandType;


    public AuditAnnotationInfo(Class<?> target, String label) {
        this.tableName = MPAAnnotations.getTableName(target);
        this.target = target;
        this.label = label;
        this.commandType = CommandType.UNKNOWN;
    }

    public AuditAnnotationInfo(Class<?> target, String label, CommandType commandType) {
        this.tableName = MPAAnnotations.getTableName(target);
        this.target = target;
        this.label = label;
        this.commandType = commandType;
    }


    public String getTableName() {
        return tableName;
    }

    public Class<?> getTarget() {
        return target;
    }

    public String getLabel() {
        return label;
    }

    public CommandType getCommandType() {
        return commandType;
    }
}