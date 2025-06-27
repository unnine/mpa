package mpa.audit.annotation;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.config.type.CommandType;
import mpa.audit.repository.sql.argument.Argument;
import mpa.persistence.context.Scope;

@Getter
@Builder
@RequiredArgsConstructor
public class AuditInfo {

    private final Scope scope;

    private final CommandType commandType;

    private final Class<?> target;

    private final String tableName;

    private final Argument argument;

    private final String label;

}