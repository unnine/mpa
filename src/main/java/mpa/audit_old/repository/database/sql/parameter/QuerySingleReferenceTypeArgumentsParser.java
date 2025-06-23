package mpa.audit_old.repository.database.sql.parameter;

import mpa.audit_old.config.ScopedAuditConfiguration;
import mpa.audit_old.config.strategy.StringCaseConverter;
import mpa.entity.EntityDefinition;
import mpa.util.ClassUtil;

import java.lang.reflect.Field;

public class QuerySingleReferenceTypeArgumentsParser extends AbstractQueryArgumentsParser {

    private final StringCaseConverter stringCaseConverter;


    public QuerySingleReferenceTypeArgumentsParser(ScopedAuditConfiguration configuration) {
        this.stringCaseConverter = configuration.stringCaseConverter();
    }


    @Override
    public Parameter parse(EntityDefinition entityDefinition, Object[] queryArguments) {
        Field[] fields = getEntityFields(entityDefinition);

        Parameter.Builder parameterBuilder = Parameter.builder(queryArguments);
        Object parameter = queryArguments[0];
        String name, value;

        for (Field entityField : fields) {
            if (isId(entityField)) {
                name = stringCaseConverter.convert(entityField.getName());
                value = getValueByFieldName(parameter, entityField.getName());
                parameterBuilder.addIdParameter(name, value);
            }
        }
        return parameterBuilder.build();
    }

    private Field[] getEntityFields(EntityDefinition entityDefinition) {
        return ClassUtil.getDeclaredFields(entityDefinition.getEntityClass());
    }
}
