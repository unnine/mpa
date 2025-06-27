package mpa.audit.config.type;

import mpa.persistence.event.MutationType;

public enum CommandType {
    UNKNOWN,
    INSERT,
    UPDATE,
    DELETE,
    ;


    public static CommandType of(MutationType mutationType) {
        switch (mutationType) {
            case INSERT:
                return CommandType.INSERT;

            case UPDATE:
                return CommandType.UPDATE;

            case DELETE:
                return CommandType.DELETE;

            default:
                return CommandType.UNKNOWN;
        }
    }

}