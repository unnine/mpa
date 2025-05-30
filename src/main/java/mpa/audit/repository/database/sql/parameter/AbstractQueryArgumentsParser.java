package mpa.audit.repository.database.sql.parameter;

import mpa.annotation.MPAAnnotations;
import mpa.audit.annotation.AuditAnnotations;
import mpa.util.ClassUtil;

import java.lang.reflect.Field;

public abstract class AbstractQueryArgumentsParser implements QueryArgumentsParser {

    protected boolean isId(Field f) {
        return f.isAnnotationPresent(MPAAnnotations.IDENTIFY);
    }

    protected String getValueByFieldName(Object o, String fieldName) {
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
