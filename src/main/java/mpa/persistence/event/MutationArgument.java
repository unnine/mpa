package mpa.persistence.event;

import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.util.ClassUtil;
import mpa.util.TypeValidator;

public class MutationArgument {

    private boolean invalid = false;

    private final Object argument;


    public MutationArgument(Object argument) {
        assertHasEntityAnnotation(argument);
        this.argument = argument;
    }

    private void assertHasEntityAnnotation(Object o) {
        if (TypeValidator.isPrimitive(o)) {
            return;
        }
        if (o instanceof String) {
            return;
        }
        if (ClassUtil.isAnnotationPresent(o.getClass(), EntityAnnotations.ENTITY)) {
           return;
        }
        this.invalid = true;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public boolean isPrimitive() {
        return TypeValidator.isPrimitive(argument);
    }

    public Object instance() {
        return argument;
    }

    public Class<?> getType() {
        return argument.getClass();
    }
}
