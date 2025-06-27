package mpa.util;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class ClassUtil {

    public static Field[] getDeclaredFields(Class<?> o) {
        if (Enhancer.isEnhanced(o)) {
            return o.getSuperclass().getDeclaredFields();
        }
        return o.getDeclaredFields();
    }

    public static Class<?> getImplementsGenericTypeByTypeName(Class<?> clazz, String typeName) {
        Type[] types = Arrays.stream(clazz.getGenericInterfaces())
                .filter(type -> type.getTypeName().startsWith(typeName))
                .map(type -> (ParameterizedType) type)
                .map(ParameterizedType::getActualTypeArguments)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Not found implements generic type '" + typeName + "' of '" + clazz.getName() + "'"));
        return (Class<?>) types[0];
    }

}
