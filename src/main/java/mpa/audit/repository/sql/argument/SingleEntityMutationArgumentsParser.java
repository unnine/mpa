package mpa.audit.repository.sql.argument;

import lombok.RequiredArgsConstructor;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.event.MutationArgument;
import mpa.persistence.context.Scope;
import mpa.util.ClassUtil;

import java.lang.reflect.Field;


@RequiredArgsConstructor
public class SingleEntityMutationArgumentsParser implements MutationArgumentsParser {

    private final Scope scope;


    @Override
    public Argument parse(EntityDefinition entityDefinition, MutationArgument mutationArgument) {
        Field[] fields = ClassUtil.getDeclaredFields(mutationArgument.getType());
        return makeArgument(mutationArgument, fields);
    }

    private Argument makeArgument(MutationArgument mutationArgument, Field[] entityFields) {
        Object originArgument = mutationArgument.instance();
        Argument.Builder argumentBuilder = Argument.builder(originArgument);
        String name, value;

        for (Field entityField : entityFields) {
            if (isId(entityField)) {
                name = convertCase(entityField.getName());
                value = getValueByFieldName(originArgument, entityField.getName());
                argumentBuilder.addId(name, value);
            }
        }
        return argumentBuilder.build();
    }

    private boolean isId(Field f) {
        return f.isAnnotationPresent(EntityAnnotations.IDENTIFY);
    }

    private String convertCase(String s) {
        CaseConversionStrategy caseConversionStrategy = scope.getDataSourceAware().getCaseConversionStrategy();
        return caseConversionStrategy.convert(s);
    }

    private String getValueByFieldName(Object o, String fieldName) {
        Field field = getFieldByName(o, fieldName);
        if (field == null) {
            return null;
        }
        return getValueAsString(field, o);
    }

    private String getValueAsString(Field f, Object o) {
        try {
            f.setAccessible(true);
            Object value = f.get(o);

            if (value == null) {
                return null;
            }
            return String.valueOf(value);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Field getFieldByName(Object o, String name) {
        Field[] fields = ClassUtil.getDeclaredFields(o.getClass());
        for (Field f : fields) {
            if (f.getName().equals(name)) {
                return f;
            }
        }
        return null;
    }
}
