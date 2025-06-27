package mpa.audit.repository.dataaccess.sql.argument;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.event.MutationArgument;
import mpa.util.ClassUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class SinglePrimitiveMutationArgumentsParser implements MutationArgumentsParser {

    private final CaseConversionStrategy stringCaseConverter;


    @Override
    public Argument parse(MutationArgument mutationArgument) {
        Field[] fields = ClassUtil.getDeclaredFields(mutationArgument.getType());

        String getIdFieldName = getIdFieldName(fields);

        String name = stringCaseConverter.convert(getIdFieldName);
//        String value = String.valueOf(queryArguments[0]);
//
//        return Parameter.builder(queryArguments)
//                .addIdParameter(name, value)
//                .build();
        return null;
    }

    private String getIdFieldName(Field[] entityFields) {
        List<String> idFieldNames = new ArrayList<>();

        for (Field entityField : entityFields) {
            if (isId(entityField)) {
                idFieldNames.add(entityField.getName());
            }
        }

//        if (idFieldNames.size() > 1) {
//            throw new IllegalArgumentException(Log.format("audit entity '%s' has more than one @AuditId field, but only one query parameter.", entityClass.getName()));
//        }
        return idFieldNames.get(0);
    }

    private boolean isId(Field f) {
        return f.isAnnotationPresent(EntityAnnotations.IDENTIFY);
    }
}
