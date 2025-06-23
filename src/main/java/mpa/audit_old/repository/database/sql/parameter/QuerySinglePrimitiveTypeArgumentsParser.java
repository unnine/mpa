package mpa.audit_old.repository.database.sql.parameter;

import mpa.audit_old.config.ScopedAuditConfiguration;
import mpa.audit_old.config.strategy.StringCaseConverter;
import mpa.entity.EntityDefinition;
import mpa.util.ClassUtil;
import mpa.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class QuerySinglePrimitiveTypeArgumentsParser extends AbstractQueryArgumentsParser {

    private final StringCaseConverter stringCaseConverter;


    public QuerySinglePrimitiveTypeArgumentsParser(ScopedAuditConfiguration configuration) {
        this.stringCaseConverter = configuration.stringCaseConverter();
    }


    @Override
    public Parameter parse(EntityDefinition entityDefinition, Object[] queryArguments) {
        String getIdFieldName = getIdFieldName(entityDefinition);

        String name = stringCaseConverter.convert(getIdFieldName);
        String value = String.valueOf(queryArguments[0]);

        return Parameter.builder(queryArguments)
                .addIdParameter(name, value)
                .build();
    }

    private String getIdFieldName(EntityDefinition entityDefinition) {
        Class<?> entityClass = entityDefinition.getEntityClass();
        List<String> idFieldNames = new ArrayList<>();

        for (Field f : ClassUtil.getDeclaredFields(entityClass)) {
            if (isId(f)) {
                idFieldNames.add(f.getName());
            }
        }

        if (idFieldNames.size() > 1) {
            throw new IllegalArgumentException(Log.format("audit entity '%s' has more than one @AuditId field, but only one query parameter.", entityClass.getName()));
        }
        return idFieldNames.get(0);
    }

}
