package mpa.audit.repository.dataaccess.sql.argument;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scope;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.event.MutationArgument;
import mpa.util.ClassUtil;
import mpa.util.Log;

import java.lang.reflect.Field;
import java.util.Arrays;

@RequiredArgsConstructor
public class SinglePrimitiveMutationArgumentsParser implements MutationArgumentsParser {

    private final Scope scope;


    @Override
    public Argument parse(EntityDefinition entityDefinition, MutationArgument mutationArgument) {
        Field idField = getIdField(entityDefinition);
        String name = convertCase(idField.getName());
        Object argument = mutationArgument.instance();

        return Argument.builder(argument)
                .addId(name, String.valueOf(argument))
                .build();
    }

    private boolean isId(Field f) {
        return f.isAnnotationPresent(EntityAnnotations.IDENTIFY);
    }

    private Field getIdField(EntityDefinition entityDefinition) {
        return Arrays.stream(ClassUtil.getDeclaredFields(entityDefinition.getEntityClass()))
                .filter(this::isId)
                .findAny()
                .orElseThrow(() -> new NullPointerException(Log.format("not found id field in entity. " + entityDefinition.getEntityClass().getName())));
    }

    private String convertCase(String s) {
        return scope.getDataSourceAware().getCaseConversionStrategy().convert(s);
    }
}
