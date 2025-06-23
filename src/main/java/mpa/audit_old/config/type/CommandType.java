package mpa.audit_old.config.type;

public enum CommandType {
    UNKNOWN,
    INSERT,
    UPDATE,
    DELETE,
    SOFT_DELETE,
    ;

    public boolean exists() {
        return this != UNKNOWN;
    }

    public boolean isInsert() {
        return this == INSERT;
    }

    public boolean isHardDelete() {
        return this == DELETE;
    }
}