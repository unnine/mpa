package mpa.audit.config.entity;

public interface EntityAuditConfigurer<T> {

    void join(AuditJoinContext<T> context);

}
