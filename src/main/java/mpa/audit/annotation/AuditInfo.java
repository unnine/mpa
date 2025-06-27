package mpa.audit.annotation;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.config.type.CommandType;
import mpa.audit.holder.AuditScope;
import mpa.audit.repository.dataaccess.sql.argument.Argument;

@Getter
@Builder
@RequiredArgsConstructor
public class AuditInfo {

    private final AuditScope scope;

    private final CommandType commandType;

    private final Class<?> target;

    private final String tableName;

    private final Argument argument;

    private final String label;

}