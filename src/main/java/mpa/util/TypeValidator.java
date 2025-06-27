package mpa.util;

import org.springframework.util.ClassUtils;

public class TypeValidator {

    public static boolean isInteger(Object v) {
        return v == Integer.class || v == int.class;
    }

    public static boolean isPrimitive(Object v) {
        return ClassUtils.isPrimitiveOrWrapper(v.getClass());
    }

}